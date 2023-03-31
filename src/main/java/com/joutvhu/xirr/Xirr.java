package com.joutvhu.xirr;

import java.text.MessageFormat;

public class Xirr {
    private final double accurate;
    private final double tries;

    private Xirr() {
        accurate = 0.000001;
        tries = 100;
    }

    private Xirr(double accurate, double tries) {
        if (accurate <= 0)
            throw new XirrException("The accurate must be greater than 0.");
        if (tries <= 0)
            throw new XirrException("The tries must be greater than 0.");
        this.accurate = accurate;
        this.tries = tries;
    }

    public static Xirr instance() {
        return new Xirr();
    }

    public static Xirr of(double accurate, double tries) {
        return new Xirr(accurate, tries);
    }

    public double getAccurate() {
        return accurate;
    }

    public double getTries() {
        return tries;
    }

    public double xirr(Transaction... transactions) {
        NewtonsXirr newtonsXirr = new NewtonsXirr(transactions);
        return xirr(newtonsXirr, 0.1);
    }

    public double xirr(Transaction[] transactions, double guess) {
        NewtonsXirr newtonsXirr = new NewtonsXirr(transactions);
        return xirr(newtonsXirr, guess);
    }

    public double xirr(double[] values, double[] days) {
        return xirr(values, days, 0.1);
    }

    public double xirr(double[] values, double[] days, double guess) {
        NewtonsXirr newtonsXirr = new NewtonsXirr(values, days);
        return xirr(newtonsXirr, guess);
    }

    public double xirr(NewtonsXirr newtonsXirr, double guess) {
        double x0 = guess;
        double err = 1e+100;

        for (int i = 0; err > accurate; i++) {
            if (i >= tries) {
                String message = MessageFormat.format("Not accurate enough after {0} tries, rate: {1}, error: {2}", i, x0, err);
                throw new XirrException(message, x0, err);
            }
            double x1 = newtonsXirr.next(x0);
            err = Math.abs(x1 - x0);
            x0 = x1;
        }

        return x0;
    }
}
