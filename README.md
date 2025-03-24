# Xirr

To calculate the internal rate of return for a schedule of cash flows that is not necessarily periodic.

## Installation

- If you are using Gradle just add the following dependency to your `build.gradle`.

```groovy
implementation "com.github.joutvhu:xirr:1.1.2"
```

- Or add the following dependency to your `pom.xml` if you are using Maven.

```xml
<dependency>
    <groupId>com.github.joutvhu</groupId>
    <artifactId>xirr</artifactId>
    <version>1.1.2</version>
</dependency>
```

## Using

To use the xirr function you need to create a Xirr object.

You can use the `Xirr.instance()` method to create a Xirr object.
Xirr cycles through the calculation until the result is accurate within 0.000001 percent.
If Xirr can't find a result that works after 100 tries, you'll get a `XirrException`.

You can also change the accuracy and tries using the `Xirr.of(double accurate, double tries)` method.

```java
// Xirr.instance() -> precision = 0.000001, tries = 100;
Xirr xirr = Xirr.instance();

// Xirr.of(double precision, double tries);
Xirr xirr1 = Xirr.of(0.000001, 1000);
```

The Syntax of the `xirr` function:

- `Xirr.xirr(Transaction[] transactions)`

- `Xirr.xirr(Transaction[] transactions, double guess)`

- `Xirr.xirr(double[] values, long[] days)`

- `Xirr.xirr(double[] values, long[] days, double guess)`

The arguments of the `xirr` function:

- `values`       __required__. A series of cash flows that corresponds to a schedule of payments in dates. The first payment is optional and corresponds to a cost or payment that occurs at the beginning of the investment. If the first value is a cost or payment, it must be a negative value. All succeeding payments are discounted based on a 365-day year. The series of values must contain at least one positive and one negative value.
- `days`         __required__. A schedule of payment dates that corresponds to the cash flow payments. Dates may occur in any order.
- `transactions` __required__. A series of pairs of `value` and `day`.
- `guess`        __optional__. A number that you guess is close to the result of Xirr. If omitted, guess is assumed to be 0.1 (10 percent).

```java
// rate ~ 0.35899244 ~ 35.90%
double rate = Xirr.instance().xirr(
        new Transaction(-10000,"2008-01-01"),
        new Transaction(2750,"2008-03-01"),
        new Transaction(4250,"2008-11-30"),
        new Transaction(3250,"2009-02-15"),
        new Transaction(2750,"2009-04-01")
);
```
