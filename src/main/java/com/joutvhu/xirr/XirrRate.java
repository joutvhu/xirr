package com.joutvhu.xirr;

class XirrRate {
    /**
     * The calculated IRR value.
     */
    double value;

    /**
     * The difference between the last two calculated values, indicating the precision of the result.
     */
    double epsilon;

    /**
     * The difference between the net present value and zero, indicating the accuracy of the xnpv.
     */
    double enpv;

    /**
     * A flag indicating whether the calculation was successfully completed within the desired precision.
     */
    boolean acceptable;

    public XirrRate(double value, double epsilon) {
        this.value = value;
        this.enpv = epsilon;
        this.epsilon = epsilon;
        this.acceptable = false;
    }

    void set(double value, double enpv, double epsilon) {
        this.value = value;
        this.enpv = enpv;
        this.epsilon = epsilon;
        this.acceptable = true;
    }

    void update(double value, double enpv, double epsilon) {
        if (!acceptable || (enpv < this.enpv))
            this.set(value, enpv, epsilon);
    }

    static XirrRate select(XirrRate oldRate, XirrRate newRate) {
        return newRate.acceptable && (oldRate == null || newRate.enpv < oldRate.enpv) ? newRate : oldRate;
    }
}
