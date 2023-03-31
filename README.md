# Xirr

To calculate the internal rate of return for a schedule of cash flows that is not necessarily periodic.

## Installation

- If you are using Gradle just add the following dependency to your `build.gradle`.

```groovy
implementation "com.github.joutvhu:xirr:1.0.0"
```

- Or add the following dependency to your `pom.xml` if you are using Maven.

```xml
<dependency>
    <groupId>com.github.joutvhu</groupId>
    <artifactId>xirr</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Using

```java
// Xirr.of(double accurate, double tries);
Xirr xirr0 = Xirr.of(0.000001, 1000);

// Xirr.instance() -> accurate = 0.000001, tries = 100;
Xirr xirr = Xirr.instance();

// rate ~ 0.35899244 ~ 35.90%
double rate = Xirr.instance().xirr(
        new Transaction(-10000,"2008-01-01"),
        new Transaction(2750,"2008-03-01"),
        new Transaction(4250,"2008-11-30"),
        new Transaction(3250,"2009-02-15"),
        new Transaction(2750,"2009-04-01")
);
```
