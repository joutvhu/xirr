package com.joutvhu.xirr;

public class Xirr {
    private static final double DEFAULT_GUESS = 0.1;
    private static final double DEFAULT_TRIES = 100;
    private static final double DEFAULT_PRECISION = 1e-6;

    public final double precision;
    public final double tries;

    protected Xirr() {
        precision = DEFAULT_PRECISION;
        tries = DEFAULT_TRIES;
    }

    protected Xirr(double precision, double tries) {
        if (precision <= 0)
            throw new XirrException("The precision must be greater than 0.");
        if (tries <= 0)
            throw new XirrException("The tries must be greater than 0.");
        this.precision = precision;
        this.tries = tries;
    }

    protected Xirr(double precision, double tries, double validate) {
        if (precision <= 0)
            throw new XirrException("The precision must be greater than 0.");
        if (tries <= 0)
            throw new XirrException("The tries must be greater than 0.");
        if (validate < 0)
            throw new XirrException("The validate must be greater than or equal with 0.");
        this.precision = precision;
        this.tries = tries;
    }

    public static Xirr instance() {
        return new Xirr();
    }

    public static Xirr of(double precision, double tries) {
        return new Xirr(precision, tries);
    }

    public static Xirr of(double precision, double tries, double validate) {
        return new Xirr(precision, tries, validate);
    }

    public double xirr(Transaction... transactions) {
        NewtonsXirr newtonsXirr = new NewtonsXirr(transactions);
        return xirr(newtonsXirr);
    }

    public double xirr(double guess, Transaction... transactions) {
        NewtonsXirr newtonsXirr = new NewtonsXirr(transactions);
        return xirr(newtonsXirr, guess);
    }

    public double xirr(Transaction[] transactions, double guess) {
        NewtonsXirr newtonsXirr = new NewtonsXirr(transactions);
        return xirr(newtonsXirr, guess);
    }

    public double xirr(double[] values, long[] days) {
        NewtonsXirr newtonsXirr = new NewtonsXirr(values, days);
        return xirr(newtonsXirr);
    }

    public double xirr(double[] values, long[] days, double guess) {
        NewtonsXirr newtonsXirr = new NewtonsXirr(values, days);
        return xirr(newtonsXirr, guess);
    }

    public double xirr(NewtonsXirr newtonsXirr) {
        return xirr(newtonsXirr, DEFAULT_GUESS);
    }

    @SuppressWarnings("java:S2259")
    public double xirr(NewtonsXirr newtonsXirr, double guess) {
        if (guess <= -1)
            throw new XirrException("Invalid guess rate");

        ResultRate result = null;
        XirrException ex = null;
        boolean cont = true;
        for (int i = 0; cont && i < 200; i++) {
            try {
                if (i > 0)
                    guess = -0.99 + (i - 1) * 0.01;
                result = calculate(newtonsXirr, guess);
                cont = !result.completed;
            } catch (XirrException e) {
                ex = e;
            }
        }

        if (result != null) {
            if (!result.completed)
                throw new XirrException(result.value, result.epsilon, "The result rate {0} are not accurate enough", result.value);
            return result.value;
        } else {
            throw ex;
        }
    }

    private ResultRate calculate(NewtonsXirr newtonsXirr, double guess) {
        double x0 = guess;
        double err = 1e+100;
        boolean comp = false;
        int i = 0;
        while (i < tries) {
            double x1 = newtonsXirr.next(x0);
            double dif = newtonsXirr.amount();
            err = Math.abs(x1 - x0);
            x0 = x1;
            comp = (err < precision) || (Math.abs(dif) < precision);
            if (comp)
                break;
            i++;
        }
        if (newtonsXirr.isInvalid(x0)) {
            throw new XirrException("Unable to find result rate");
        }
        return new ResultRate(x0, err, i, comp);
    }
}
