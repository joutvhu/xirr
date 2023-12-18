package com.joutvhu.xirr;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

public class Transaction {
    private static final LocalDate DAY0 = LocalDate.of(1900, 1, 1);

    private final double amount;
    private final long when;

    public Transaction(double amount, long when) {
        this.amount = amount;
        this.when = when;
    }

    public Transaction(double amount, LocalDate when) {
        this(amount, DAYS.between(DAY0, when));
    }

    public Transaction(double amount, Date when) {
        this(amount, LocalDate.from(when.toInstant().atZone(ZoneId.systemDefault())));
    }

    public Transaction(double amount, String when) {
        this(amount, LocalDate.parse(when));
    }

    public double getAmount() {
        return amount;
    }

    public long getWhen() {
        return when;
    }
}
