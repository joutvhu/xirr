package com.joutvhu.xirr;

import java.text.MessageFormat;

public class Xirr {
    public final double precision;
    public final double tries;
    public final double validate;

    private Xirr() {
        precision = 0.000_001;
        tries = 500;
        validate = 0.1;
    }

    private Xirr(double precision, double tries) {
        if (precision <= 0)
            throw new XirrException("The precision must be greater than 0.");
        if (tries <= 0)
            throw new XirrException("The tries must be greater than 0.");
        this.precision = precision;
        this.tries = tries;
        this.validate = 0.1;
    }

    private Xirr(double precision, double tries, double validate) {
        if (precision <= 0)
            throw new XirrException("The precision must be greater than 0.");
        if (tries <= 0)
            throw new XirrException("The tries must be greater than 0.");
        if (validate < 0)
            throw new XirrException("The validate must be greater than or equal with 0.");
        this.precision = precision;
        this.tries = tries;
        this.validate = validate;
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
        return xirr(newtonsXirr, 0.1);
    }

    public double xirr(Transaction[] transactions, double guess) {
        NewtonsXirr newtonsXirr = new NewtonsXirr(transactions);
        return xirr(newtonsXirr, guess);
    }

    public double xirr(double[] values, long[] days) {
        return xirr(values, days, 0.1);
    }

    public double xirr(double[] values, long[] days, double guess) {
        NewtonsXirr newtonsXirr = new NewtonsXirr(values, days);
        return xirr(newtonsXirr, guess);
    }

    public double xirr(NewtonsXirr newtonsXirr, double guess) {
        try {
            return xirr(newtonsXirr, guess, 0);
        } catch (XirrException.ValueException e) {
            try {
                return xirr(newtonsXirr, guess, -1);
            } catch (Exception ex) {
                throw e.toXirrException();
            }
        }
    }

    public double xirr(NewtonsXirr newtonsXirr, double guess, int d0Index) {
        double x0 = guess;
        double err = 1e+100;

        for (int i = 0; err > precision; i++) {
            if (i >= tries) {
                String message = MessageFormat.format("Not accurate enough after {0} tries, rate: {1}, error: {2}", i, x0, err);
                throw new XirrException(message, x0, err);
            }
            double x1 = newtonsXirr.next(x0, d0Index);
            err = Math.abs(x1 - x0);
            x0 = x1;
        }

        if (validate > 0) {
            double dif = newtonsXirr.xnpv(x0, d0Index);
            if (Math.abs(dif) > validate) {
                String message = MessageFormat.format("The result {0} are not accurate enough, Xnpv: {1}", x0, dif);
                throw new XirrException(message, x0, dif);
            }
        }
        return x0;
    }
}
