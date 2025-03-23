package com.joutvhu.xirr;

import lombok.Getter;

import java.text.MessageFormat;

@Getter
public class XirrException extends RuntimeException {
    private Double accurate;
    private Double value;

    public XirrException(Double accurate, Double value, String message) {
        super(message);
        this.accurate = accurate;
        this.value = value;
    }

    public XirrException(Double accurate, Double value, String message, Object ...args) {
        super(MessageFormat.format(message, args));
        this.accurate = accurate;
        this.value = value;
    }

    public XirrException(String message) {
        super(message);
    }

    public XirrException(String message, Throwable cause) {
        super(message, cause);
    }
}
