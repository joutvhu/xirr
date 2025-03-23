package com.joutvhu.xirr;

import lombok.Getter;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

/**
 * The Transaction class represents a single financial transaction with an amount and a date.
 * It provides multiple constructors to initialize the transaction using different types of date inputs
 * including long (days since a reference date), LocalDate, Date, and String.
 */
@Getter
public class Transaction {
    private static final LocalDate DAY0 = LocalDate.of(1900, 1, 1);

    /**
     * The amount of the transaction.
     *
     * @return the amount of the transaction.
     */
    private final double amount;

    /**
     * The date of the transaction represented as the number of days since DAY0 (January 1, 1900).
     *
     * @return the date of the transaction as the number of days since DAY0.
     */
    private final long when;

    /**
     * Constructor to create a Transaction with amount and when as a long value.
     *
     * @param amount the transaction amount.
     * @param when   the number of days since DAY0.
     */
    public Transaction(double amount, long when) {
        this.amount = amount;
        this.when = when;
    }

    /**
     * Constructor to create a Transaction with amount and when as a LocalDate.
     *
     * @param amount the transaction amount.
     * @param when   the date of the transaction.
     */
    public Transaction(double amount, LocalDate when) {
        this(amount, DAYS.between(DAY0, when));
    }

    /**
     * Constructor to create a Transaction with amount and when as a Date.
     *
     * @param amount the transaction amount.
     * @param when   the date of the transaction.
     */
    public Transaction(double amount, Date when) {
        this(amount, LocalDate.from(when.toInstant().atZone(ZoneId.systemDefault())));
    }

    /**
     * Constructor to create a Transaction with amount and when as a String.
     *
     * @param amount the transaction amount.
     * @param when   the date of the transaction in ISO-8601 format (yyyy-MM-dd).
     */
    public Transaction(double amount, String when) {
        this(amount, LocalDate.parse(when));
    }
}
