package com.joutvhu.xirr;

public class XirrException extends RuntimeException {
    private Double accurate;
    private Double value;

    public Double getAccurate() {
        return accurate;
    }

    public Double getValue() {
        return value;
    }

    public XirrException(String message, Double accurate, Double value) {
        super(message);
        this.accurate = accurate;
        this.value = value;
    }

    public XirrException(String message) {
        super(message);
    }

    public XirrException(String message, Throwable cause) {
        super(message, cause);
    }

    static class ValueException extends RuntimeException {
        ValueException(String message) {
            super(message);
        }

        public XirrException toXirrException() {
            return new XirrException(getMessage(), this);
        }
    }
}
