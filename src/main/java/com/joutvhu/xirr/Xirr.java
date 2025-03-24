package com.joutvhu.xirr;

/**
 * The Xirr class provides methods to calculate the Internal Rate of Return (IRR)
 * for a schedule of cash flows that is not necessarily periodic. It uses Newton's method
 * for the calculation and supports different ways to provide the cash flows, such as arrays
 * of transactions, values, and days.
 */
public class Xirr {
    /**
     * The default guess rate used for IRR calculation.
     */
    private static final double DEFAULT_GUESS = 0.1;

    /**
     * The default number of iterations to try for finding the IRR.
     */
    private static final double DEFAULT_TRIES = 100;

    /**
     * The default precision for the IRR calculation.
     */
    private static final double DEFAULT_PRECISION = 1e-6;

    /**
     * The precision for the IRR calculation.
     */
    public final double precision;

    /**
     * The number of iterations to try for finding the IRR.
     */
    public final double tries;

    /**
     * Default constructor initializing precision and tries with default values.
     */
    protected Xirr() {
        precision = DEFAULT_PRECISION;
        tries = DEFAULT_TRIES;
    }

    /**
     * Constructor with custom precision and tries.
     *
     * @param precision the precision value.
     * @param tries     the number of tries.
     * @throws XirrException if precision or tries are less than or equal to 0.
     */
    protected Xirr(double precision, double tries) {
        if (precision <= 0)
            throw new XirrException("The precision must be greater than 0.");
        if (tries <= 0)
            throw new XirrException("The tries must be greater than 0.");
        this.precision = precision;
        this.tries = tries;
    }

    /**
     * Creates an instance of Xirr with default settings.
     *
     * @return a new instance of Xirr.
     */
    public static Xirr instance() {
        return new Xirr();
    }

    /**
     * Creates an instance of Xirr with specified precision and tries.
     *
     * @param precision the precision value.
     * @param tries     the number of tries.
     * @return a new instance of Xirr.
     */
    public static Xirr of(double precision, double tries) {
        return new Xirr(precision, tries);
    }

    /**
     * Calculates the XIRR for the given transactions.
     *
     * @param transactions array of transactions.
     * @return the calculated XIRR.
     */
    public double xirr(Transaction... transactions) {
        NewtonsXirr newtonsXirr = new NewtonsXirr(transactions);
        return xirr(newtonsXirr);
    }

    /**
     * Calculates the XIRR for the given transactions with an initial guess.
     *
     * @param guess        the initial guess value.
     * @param transactions array of transactions.
     * @return the calculated XIRR.
     */
    public double xirr(double guess, Transaction... transactions) {
        NewtonsXirr newtonsXirr = new NewtonsXirr(transactions);
        return xirr(newtonsXirr, guess);
    }

    /**
     * Calculates the XIRR for the given transactions with an initial guess.
     *
     * @param transactions array of transactions.
     * @param guess        the initial guess value.
     * @return the calculated XIRR.
     */
    public double xirr(Transaction[] transactions, double guess) {
        NewtonsXirr newtonsXirr = new NewtonsXirr(transactions);
        return xirr(newtonsXirr, guess);
    }

    /**
     * Calculates the XIRR for the given values and days.
     *
     * @param values array of values.
     * @param days   array of days.
     * @return the calculated XIRR.
     */
    public double xirr(double[] values, long[] days) {
        NewtonsXirr newtonsXirr = new NewtonsXirr(values, days);
        return xirr(newtonsXirr);
    }

    /**
     * Calculates the XIRR for the given values and days with an initial guess.
     *
     * @param values array of values.
     * @param days   array of days.
     * @param guess  the initial guess value.
     * @return the calculated XIRR.
     */
    public double xirr(double[] values, long[] days, double guess) {
        NewtonsXirr newtonsXirr = new NewtonsXirr(values, days);
        return xirr(newtonsXirr, guess);
    }

    /**
     * Calculates the XIRR using Newton's method with default guess.
     *
     * @param newtonsXirr the Newton's XIRR instance.
     * @return the calculated XIRR.
     */
    public double xirr(NewtonsXirr newtonsXirr) {
        return xirr(newtonsXirr, DEFAULT_GUESS);
    }

    /**
     * Calculates the XIRR using Newton's method with a specified guess.
     *
     * @param newtonsXirr the Newton's XIRR instance.
     * @param guess       the initial guess value.
     * @return the calculated XIRR.
     * @throws XirrException if the guess is invalid or the result is not accurate enough.
     */
    public double xirr(NewtonsXirr newtonsXirr, double guess) {
        if (guess <= -1)
            throw new XirrException("Invalid guess rate");

        XirrRate result = null;
        XirrException ex = null;
        for (int i = 0; i < 200; i++) {
            try {
                if (i > 0)
                    guess = -0.99 + (i - 1) * 0.01;
                XirrRate newResult = calculate(newtonsXirr, guess);
                if (newResult.epsilon < precision) {
                    result = newResult;
                    break;
                }
                result = XirrRate.select(result, newResult);
            } catch (XirrException e) {
                ex = e;
            }
        }

        if (result != null) {
            if (!result.acceptable)
                throw new XirrException(result.value, result.epsilon, "The result rate {0} are not accurate enough", result.value);
            return result.value;
        } else {
            if (ex != null)
                throw ex;
            throw new XirrException("Unable to find result rate");
        }
    }

    /**
     * Performs the Newton-Raphson iteration to calculate the XIRR.
     *
     * @param newtonsXirr the Newton's XIRR instance.
     * @param guess       the initial guess value.
     * @return the result rate.
     * @throws XirrException if unable to find a valid result rate.
     */
    private XirrRate calculate(NewtonsXirr newtonsXirr, double guess) {
        double x0 = guess;
        XirrRate result = new XirrRate(x0, 1e+100);
        for (int i = 0; i < tries; i++) {
            double x1 = newtonsXirr.next(x0);
            double edf = Math.abs(newtonsXirr.amount());
            double erx = Math.abs(x1 - x0);
            double err = Math.max(erx, edf);
            x0 = x1;
            if (err < precision) {
                result.set(x0, err);
                break;
            } else if ((erx < precision) || (edf < precision)) {
                result.update(x0, err);
            }
        }
        if (Double.isNaN(x0) || Double.isInfinite(x0)) {
            throw new XirrException("Unable to find result rate, invalid result");
        }
        return result;
    }

    public double xnpv(double guess, Transaction... transactions) {
        NewtonsXirr newtonsXirr = new NewtonsXirr(transactions);
        return xnpv(guess, newtonsXirr);
    }

    public double xnpv(double guess, double[] values, long[] days) {
        NewtonsXirr newtonsXirr = new NewtonsXirr(values, days);
        return xnpv(guess, newtonsXirr);
    }

    public double xnpv(double guess, NewtonsXirr newtonsXirr) {
        return newtonsXirr.xnpv(guess);
    }
}
