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
     * A flag indicating whether the calculation was successfully completed within the desired precision.
     */
    boolean acceptable;

    public XirrRate(double value, double epsilon) {
        this.value = value;
        this.epsilon = epsilon;
        this.acceptable = false;
    }

    void set(double value, double epsilon) {
        this.value = value;
        this.epsilon = epsilon;
        this.acceptable = true;
    }

    void update(double value, double epsilon) {
        if (!acceptable || epsilon < this.epsilon) {
            this.value = value;
            this.epsilon = epsilon;
            this.acceptable = true;
        }
    }

    static XirrRate select(XirrRate oldRate, XirrRate newRate) {
        return newRate.acceptable && (oldRate == null || newRate.epsilon < oldRate.epsilon) ? newRate : oldRate;
    }
}
