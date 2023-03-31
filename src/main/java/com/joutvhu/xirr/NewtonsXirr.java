package com.joutvhu.xirr;

class NewtonsXirr {
    private XirrFx f;
    private XirrFx df;

    public NewtonsXirr(Transaction[] transactions) {
        double[] payments = new double[transactions.length];
        double[] days = new double[transactions.length];
        for (int i = 0; i < payments.length; i++) {
            Transaction transaction = transactions[i];
            payments[i] = transaction.getAmount();
            days[i] = transaction.getWhen();
        }
        this.f = fTotalXirr(payments, days);
        this.df = dfTotalXirr(payments, days);
    }

    public NewtonsXirr(double[] payments, double[] days) {
        this.f = fTotalXirr(payments, days);
        this.df = dfTotalXirr(payments, days);
    }

    private static XirrFx composeFunctions(XirrFx f1, XirrFx f2) {
        return x -> f1.calculate(x) + f2.calculate(x);
    }

    private static XirrFx fXirr(double p, double dt, double dt0) {
        return x -> p * Math.pow((1.0 + x), ((dt0 - dt) / 365.0));
    }

    private static XirrFx dfXirr(double p, double dt, double dt0) {
        return x -> (1.0 / 365.0) * (dt0 - dt) * p * Math.pow((x + 1.0), (((dt0 - dt) / 365.0) - 1.0));
    }

    public static XirrFx fTotalXirr(double[] payments, double[] days) {
        XirrFx resf = x -> 0.0;

        for (int i = 0; i < payments.length; i++) {
            resf = composeFunctions(resf, fXirr(payments[i], days[i], days[0]));
        }

        return resf;
    }

    public static XirrFx dfTotalXirr(double[] payments, double[] days) {
        XirrFx resf = x -> 0.0;

        for (int i = 0; i < payments.length; i++) {
            resf = composeFunctions(resf, dfXirr(payments[i], days[i], days[0]));
        }

        return resf;
    }

    public double next(double x) {
        return x - f.calculate(x) / df.calculate(x);
    }
}
