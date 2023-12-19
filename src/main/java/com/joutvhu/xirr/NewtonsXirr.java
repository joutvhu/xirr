package com.joutvhu.xirr;

public class NewtonsXirr {
    private double[] values;
    private long[] days;

    public NewtonsXirr(Transaction[] transactions) {
        this.values = new double[transactions.length];
        this.days = new long[transactions.length];
        for (int i = 0; i < values.length; i++) {
            Transaction transaction = transactions[i];
            values[i] = transaction.getAmount();
            days[i] = transaction.getWhen();
        }
        validate();
    }

    public NewtonsXirr(double[] values, long[] days) {
        if (values.length != days.length)
            throw new XirrException("Values and Days must be the same length.");
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

    private double pow(double value, long days) {
        if (value == 0) {
            return 0;
        } else if (days == 0) {
            return 1;
        } else if (value < 0) {
            // Ex: (-5)^(50/365) = (-1)^(50/365) * (5)^(50/365)
            //                   = ((-1)^(1/365))^(50) * (5)^(50/365)
            //                   = (-1)^(50) * (5)^(50/365)
            double v = Math.pow(Math.abs(value), days / 365.0);
            return Math.abs(days) % 2 == 0 ? v : -1 * v;
        } else {
            return Math.pow(value, days / 365.0);
        }
    }

    public double next(double x) {
        return next(days[0], x);
    }

    public double next(double x, int index) {
        if (index < 0) index = days.length + index;
        return next(days[index], x);
    }

    public double next(long d0, double x) {
        double fr = 0.0;
        double dfr = 0.0;
        double r = 1.0 + x;
        if (r == 0)
            return x;
        for (int i = 0; i < values.length; i++) {
            long d = d0 - days[i];
            double p = d / 365.0;
            double v = values[i] * pow(r, d);
            fr += v;
            dfr += p * v;
        }
        if (!Double.isFinite(fr))
            throw new XirrException.ValueException("Function value overflow");
        if (!Double.isFinite(dfr))
            throw new XirrException.ValueException("Derivative value overflow");
        if (dfr == 0.0)
            throw new XirrException.ValueException("Derivative value is zero");
        return x - r * fr / dfr;
    }
}
