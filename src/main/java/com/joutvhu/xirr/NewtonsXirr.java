package com.joutvhu.xirr;

/**
 * The NewtonsXirr class implements the Newton-Raphson method to calculate the
 * Internal Rate of Return (IRR) for a series of cash flows.
 * It supports initialization with an array of transactions, or arrays of values and days.
 * The class ensures the input data has at least one positive and one negative cash flow for valid IRR calculation.
 */
public class NewtonsXirr {
    /**
     * The number of days in a year used for date calculations.
     */
    private static final double DAYS_IN_YEAR = 365.0;

    /**
     * The number of transactions or cash flows.
     */
    public final int length;

    /**
     * The array of cash flow amounts.
     */
    public final double[] values;

    /**
     * The array of corresponding days for each cash flow.
     */
    public final long[] days;

    /**
     * The current calculated value for the IRR.
     */
    private double current;

    /**
     * Constructor to create a NewtonsXirr instance with an array of transactions.
     *
     * @param transactions array of Transaction objects.
     * @throws XirrException if the number of transactions is less than 2.
     */
    public NewtonsXirr(Transaction[] transactions) {
        if (transactions.length < 2)
            throw new XirrException("Invalid input data");
        this.length = transactions.length;
        this.values = new double[length];
        this.days = new long[length];
        for (int i = 0; i < length; i++) {
            Transaction transaction = transactions[i];
            values[i] = transaction.getAmount();
            days[i] = transaction.getWhen();
        }
        validate();
    }

    /**
     * Constructor to create a NewtonsXirr instance with arrays of values and days.
     *
     * @param values array of cash flow amounts.
     * @param days   array of corresponding days.
     * @throws XirrException if the lengths of values and days arrays are not the same.
     */
    public NewtonsXirr(double[] values, long[] days) {
        if (values.length != days.length)
            throw new XirrException("Values and Days must be the same length.");
        this.length = values.length;
        this.values = values;
        this.days = days;
        validate();
    }

    /**
     * Validates the provided values to ensure there is at least one positive and one negative cash flow.
     *
     * @throws XirrException if the validation fails.
     */
    private void validate() {
        boolean positive = false;
        boolean negative = false;
        for (double value : values) {
            if (value > 0)
                positive = true;
            if (value < 0)
                negative = true;
            if (positive && negative)
                break;
        }
        if (!positive && !negative)
            throw new XirrException("Expects at least one positive cash flow and one negative cash flow.");
        if (!positive)
            throw new XirrException("Expects at least one positive cash flow.");
        if (!negative)
            throw new XirrException("Expects at least one negative cash flow.");
    }

    /**
     * Checks if the provided value is invalid (NaN or Infinite).
     *
     * @param value the value to check.
     * @return true if the value is invalid, false otherwise.
     */
    public boolean isInvalid(double value) {
        return Double.isNaN(value) || Double.isInfinite(value);
    }

    /**
     * Calculates the next rate using the Newton-Raphson method with the provided guess rate.
     *
     * @param x the guess rate.
     * @return the new rate.
     */
    public double next(double x) {
        return next(days[0], x);
    }

    /**
     * Calculates the next rate using the Newton-Raphson method with the provided guess rate and 0th payment date.
     *
     * @param d0 the 0th payment date.
     * @param x  the guess rate.
     * @return the new rate.
     * @throws XirrException if the calculated XIRR value or its derivative is invalid.
     */
    public double next(long d0, double x) {
        //  r   := R+1
        //  E_i := (D_i-D_0) / 365
        //
        //             n    V_i
        //  f(R)  = SUM   -------
        //            i=0  r^E_i
        //
        //             n   -E_i * V_i       n   -E_i * V_i     1       n   -E_i * V_i
        //  f'(R) = SUM   ------------ = SUM   ------------ = --- * SUM   ------------
        //            i=0  r^(E_i + 1)     i=0  r^E_i * r      r      i=0  r^E_i
        //
        //                  n    V_i                 n
        //               SUM   -------            SUM   V_i * r^(-E_i)
        //  f(R)           i=0  r^E_i               i=0
        //  ----- = r * ------------------ = r * -------------------------------
        //  f'(R)           n  -E_i * V_i            n
        //               SUM   -----------        SUM   (-E_i) * V_i * r^(-E_i)
        //                 i=0  r^E_i               i=0
        double fr = 0.0;
        double dfr = 0.0;
        double r = 1.0 + x;
        if (r == 0)
            return x;
        for (int i = 0; i < length; i++) {
            double e = (d0 - days[i]) / DAYS_IN_YEAR; // -E_i
            double v = values[i] * Math.pow(r, e); // V_i * r^(-E_i)
            fr += v;
            dfr += e * v;
        }
        if (dfr == 0.0)
            throw new XirrException("The xirr derivative value is zero");
        current = fr;
        return x - r * fr / dfr;
    }

    /**
     * Returns the amount for the current interest rate.
     *
     * @return the current amount.
     */
    public double amount() {
        return current;
    }

    public double xnpv(double x) {
        return xnpv(days[0], x);
    }

    public double xnpv(long d0, double x) {
        double fr = 0.0;
        double r = 1.0 + x;
        for (int i = 0; i < length; i++) {
            double e = (days[i] - d0) / DAYS_IN_YEAR;
            double v = values[i] / Math.pow(r, e);
            fr += v;
        }
        return fr;
    }
}
