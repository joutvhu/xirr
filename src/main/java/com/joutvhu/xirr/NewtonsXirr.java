package com.joutvhu.xirr;

class NewtonsXirr {
    private XirrFx f;
    private XirrFx df;

    public NewtonsXirr(Transaction[] transactions) {
        double[] payments = new double[transactions.length];
        double[] days = new double[transactions.length];
        boolean positive = false;
        boolean negative = false;
        for (int i = 0; i < payments.length; i++) {
            Transaction transaction = transactions[i];
            payments[i] = transaction.getAmount();
            days[i] = transaction.getWhen();
            if (payments[i] > 0)
                positive = true;
            if (payments[i] < 0)
                negative = true;
        }
        validate(positive, negative);
        this.f = fTotalXirr(payments, days);
        this.df = dfTotalXirr(payments, days);
    }

    public NewtonsXirr(double[] payments, double[] days) {
        if (payments.length != days.length) {
            throw new XirrException("Payments and Days must have the same number of elements.");
        }
        boolean positive = false;
        boolean negative = false;
        for (double payment : payments) {
            if (payment > 0)
                positive = true;
            if (payment < 0)
                negative = true;
            if (positive && negative)
                break;
        }
        validate(positive, negative);
        this.f = fTotalXirr(payments, days);
        this.df = dfTotalXirr(payments, days);
    }

    private static void validate(boolean positive, boolean negative) {
        if (!positive && !negative) {
            throw new XirrException("Expects at least one positive cash flow and one negative cash flow.");
        }
        if (!positive) {
            throw new XirrException("Expects at least one positive cash flow.");
        }
        if (!negative) {
            throw new XirrException("Expects at least one negative cash flow.");
        }
    }

    public static XirrFx fTotalXirr(double[] payments, double[] days) {
        return x -> {
            double rate = 0.0;
            for (int i = 0; i < payments.length; i++) {
                rate += payments[i] * Math.pow((1.0 + x), ((days[0] - days[i]) / 365.0));
            }
            return rate;
        };
    }

    public static XirrFx dfTotalXirr(double[] payments, double[] days) {
        return x -> {
            double rate = 0.0;
            for (int i = 0; i < payments.length; i++) {
                rate += (1.0 / 365.0) * (days[0] - days[i]) *
                        payments[i] * Math.pow((x + 1.0), (((days[0] - days[i]) / 365.0) - 1.0));
            }
            return rate;
        };
    }

    public double next(double x) {
        return x - f.calculate(x) / df.calculate(x);
    }
}
