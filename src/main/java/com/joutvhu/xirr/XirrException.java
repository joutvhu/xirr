package com.joutvhu.xirr;

import lombok.Getter;

import java.text.MessageFormat;

/**
 * The XirrException class represents custom exceptions specific to the XIRR calculation process.
 * It extends the RuntimeException and provides additional context about the calculation accuracy and value.
 * This class supports various constructors to create exceptions with detailed messages and causes.
 */
@Getter
public class XirrException extends RuntimeException {
    /**
     * The accuracy of the XIRR calculation.
     */
    private final Double accurate;

    /**
     * The value of the XIRR calculation.
     */
    private final Double value;

    /**
     * Constructor to create an XirrException with accurate, value, and a message.
     *
     * @param accurate the accurate value.
     * @param value    the value.
     * @param message  the detail message.
     */
    public XirrException(Double accurate, Double value, String message) {
        super(message);
        this.accurate = accurate;
        this.value = value;
    }

    /**
     * Constructor to create an XirrException with accurate, value, a message, and additional arguments for message formatting.
     *
     * @param accurate the accurate value.
     * @param value    the value.
     * @param message  the detail message.
     * @param args     the arguments for the message format.
     */
    public XirrException(Double accurate, Double value, String message, Object... args) {
        this(accurate, value, MessageFormat.format(message, args));
    }

    /**
     * Constructor to create an XirrException with a message.
     *
     * @param message the detail message.
     */
    public XirrException(String message) {
        this(null, null, message);
    }

    /**
     * Constructor to create an XirrException with a message and cause.
     *
     * @param message the detail message.
     * @param cause   the cause.
     */
    public XirrException(String message, Throwable cause) {
        super(message, cause);
        this.accurate = null;
        this.value = null;
    }
}
