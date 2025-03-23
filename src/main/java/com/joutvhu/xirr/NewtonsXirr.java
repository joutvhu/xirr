package com.joutvhu.xirr;

public class NewtonsXirr {
    private static final double DAYS_IN_YEAR = 365.0;

    public final int length;
    public final double[] values;
    public final long[] days;

    private double currentRate;

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

    public NewtonsXirr(double[] values, long[] days) {
        if (values.length != days.length)
            throw new XirrException("Values and Days must be the same length.");
        this.length = values.length;
        this.values = values;
        this.days = days;
        validate();
    }

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

    public boolean isInvalid(double value) {
        return Double.isNaN(value) || Double.isInfinite(value);
    }

    public double next(double x) {
        return next(days[0], x);
    }

    public double next(double x, int index) {
        if (index < 0) index = length + index;
        return next(days[index], x);
    }

    /**
     *  r   := R+1
     *  E_i := (D_i-D_0) / 365
     *
     *             n    V_i
     *  f(R)  = SUM   -------
     *            i=0  r^E_i
     *
     *             n   -E_i * V_i       n   -E_i * V_i     1       n   -E_i * V_i
     *  f'(R) = SUM   ------------ = SUM   ------------ = --- * SUM   ------------
     *            i=0  r^(E_i + 1)     i=0  r^E_i * r      r      i=0  r^E_i
     *
     *                  n    V_i                 n
     *               SUM   -------            SUM   V_i * r^(-E_i)
     *  f(R)           i=0  r^E_i               i=0
     *  ----- = r * ------------------ = r * ------------------
     *  f'(R)           n  -E_i * V_i            n
     *               SUM   -----------        SUM   (-E_i) * V_i * r^(-E_i)
     *                 i=0  r^E_i               i=0
     */
    public double next(long d0, double x) {
        double fr = 0.0;
        double dfr = 0.0;
        double r = 1.0 + x;
        if (r == 0)
            return x;
        for (int i = 0; i < length; i++) {
            double p = (d0 - days[i]) / DAYS_IN_YEAR; // -E_i
            double v = values[i] * Math.pow(r, p); // V_i * r^(-E_i)
            fr += v;
            dfr += p * v;
        }
        if (isInvalid(fr))
            throw new XirrException("The xirr value is invalid");
        if (isInvalid(dfr))
            throw new XirrException("The xirr derivative value is invalid");
        if (dfr == 0.0)
            throw new XirrException("The xirr derivative value is zero");
        currentRate = fr;
        return x - r * fr / dfr;
    }

    public double rate() {
        return currentRate;
    }
}
