package com.joutvhu.xirr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XirrTest {
    @Test
    public void test1() {
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(
                new Transaction(23, "2011-07-11"),
                new Transaction(441.24, "2012-02-28"),
                new Transaction(243, "2012-05-14"),
                new Transaction(3243, "2012-11-02"),
                new Transaction(-50432.2, "2012-12-31"),
                new Transaction(15001, "2013-04-01"),
                new Transaction(-58454.1, "2013-04-30"),
                new Transaction(-250000, "2013-08-15"),
                new Transaction(-3000000, "2013-08-30"),
                new Transaction(-25.5800, "2013-10-25"),
                new Transaction(-1999, "2014-04-14"),
                new Transaction(999996, "2014-04-30"),
                new Transaction(-999996, "2014-04-30"),
                new Transaction(-500821, "2014-05-13"),
                new Transaction(-249359, "2014-09-26"),
                new Transaction(-40893, "2014-12-31"),
                new Transaction(-7421797, "2015-04-30"),
                new Transaction(-124519, "2015-06-23"),
                new Transaction(-300680, "2015-10-15"),
                new Transaction(-30520, "2015-12-31"),
                new Transaction(-14499332, "2016-05-27"),
                new Transaction(-35465, "2016-12-31"),
                new Transaction(-7005840, "2017-06-16"),
                new Transaction(-450000, "2017-09-28"),
                new Transaction(-359858, "2017-12-31"),
                new Transaction(534548, "2018-12-14"),
                new Transaction(-1013524, "2018-12-14"),
                new Transaction(-15392, "2018-12-31"),
                new Transaction(-3051107, "2019-06-28"),
                new Transaction(-2847143, "2019-09-04"),
                new Transaction(-365000, "2019-12-27"),
                new Transaction(-777.5477, "2020-06-30"),
                new Transaction(-218118, "2021-01-20"),
                new Transaction(-6301.77, "2022-02-03"),
                new Transaction(105576.87, "2022-12-31"),
                new Transaction(-20.352, "2022-12-31")
        );
        Assertions.assertTrue(Math.abs(248.9207718 - rate) < xirr.precision);
    }

    @Test
    public void test2() {
        Xirr xirr = Xirr.of(0.000001, 1000);
        double rate = xirr.xirr(
                new Transaction(-10000, "2008-01-01"),
                new Transaction(2750, "2008-03-01"),
                new Transaction(4250, "2008-11-30"),
                new Transaction(3250, "2009-02-15"),
                new Transaction(2750, "2009-04-01")
        );
        Assertions.assertTrue(Math.abs(0.35899244 - rate) < xirr.precision);
    }
}
