package com.joutvhu.xirr;

public class XirrException extends RuntimeException {
    private Double accurate;
    private Double value;

    public XirrException(String message, Double accurate, Double value) {
        super(message);
        this.accurate = accurate;
        this.value = value;
    }

    public XirrException(String message) {
        super(message);
    }
}
