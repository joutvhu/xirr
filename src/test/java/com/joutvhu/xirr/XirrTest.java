package com.joutvhu.xirr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class XirrTest {
    @Test
    public void test00() {
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(
            new Transaction(7500000, "2011-07-11"),
            new Transaction(12375001, "2012-02-28"),
            new Transaction(2625001, "2012-05-14"),
            new Transaction(375001, "2012-11-02"),
            new Transaction(-500000, "2012-12-31"),
            new Transaction(1125001, "2013-04-01"),
            new Transaction(-225001, "2013-04-30"),
            new Transaction(-250000, "2013-08-15"),
            new Transaction(-3000000, "2013-08-30"),
            new Transaction(-250000, "2013-10-25"),
            new Transaction(-1999999, "2014-04-14"),
            new Transaction(999996, "2014-04-30"),
            new Transaction(-999996, "2014-04-30"),
            new Transaction(-500001, "2014-05-13"),
            new Transaction(-249999, "2014-09-26"),
            new Transaction(-40893, "2014-12-31"),
            new Transaction(-749997, "2015-04-30"),
            new Transaction(-1249999, "2015-06-23"),
            new Transaction(-3000000, "2015-10-15"),
            new Transaction(-30520, "2015-12-31"),
            new Transaction(-14499332, "2016-05-27"),
            new Transaction(-31065, "2016-12-31"),
            new Transaction(-700000, "2017-06-16"),
            new Transaction(-450000, "2017-09-28"),
            new Transaction(-35938, "2017-12-31"),
            new Transaction(534742, "2018-12-14"),
            new Transaction(-10131000, "2018-12-14"),
            new Transaction(-15392, "2018-12-31"),
            new Transaction(-3051107, "2019-06-28"),
            new Transaction(-2860143, "2019-09-04"),
            new Transaction(-365000, "2019-12-27"),
            new Transaction(-777788, "2020-06-30"),
            new Transaction(-218118, "2021-01-20"),
            new Transaction(-633348, "2022-02-03"),
            new Transaction(1038676, "2022-12-31"),
            new Transaction(-207732, "2022-12-31")
        );
        Assertions.assertEquals(0.139126295, rate, xirr.precision);
    }

    @Test
    public void test01() {
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
        Assertions.assertEquals(248.9207718, rate, xirr.precision);
    }

    @Test
    public void test02() {
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(
            new Transaction(-10000, "2008-01-01"),
            new Transaction(2750, "2008-03-01"),
            new Transaction(4250, "2008-11-30"),
            new Transaction(3250, "2009-02-15"),
            new Transaction(2750, "2009-04-01")
        );
        Assertions.assertEquals(0.35899244, rate, xirr.precision);
    }

    @Test
    public void test03() {
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(new Transaction[]{
                new Transaction(-6565763.49, "2018-10-02"),
                new Transaction(-91577.34, "2018-10-02"),
                new Transaction(317505.63, "2023-09-30"),
                new Transaction(4428.48, "2023-09-30")
            }, 0.1
        );
        Assertions.assertEquals(-0.454557475, rate, xirr.precision);
    }

    @Test
    public void test03_0() {
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(new Transaction[]{
                new Transaction(-6565763.49, "2018-10-02"),
                new Transaction(-91577.34, "2018-10-02"),
                new Transaction(77.34, "2021-10-02"),
                new Transaction(317505.63, "2023-09-30"),
                new Transaction(4428.48, "2023-09-30")
            }, 0.1
        );
        Assertions.assertEquals(-0.454549675, rate, xirr.precision);
    }

    @Test
    public void test03_1() {
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(new Transaction[]{
                new Transaction(-6565763.49, "2018-10-02"),
                new Transaction(91577.34, "2018-10-02"),
                new Transaction(317505.63, "2023-09-30"),
                new Transaction(4428.48, "2023-09-30")
            }, 0.1
        );
        Assertions.assertEquals(-0.451504024, rate, xirr.precision);
    }

    @Test
    public void test03_2() {
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(new Transaction[]{
                new Transaction(317505.63, "2018-10-02"),
                new Transaction(4428.48, "2018-10-02"),
                new Transaction(-91577.34, "2023-09-30"),
                new Transaction(-6565763.49, "2023-09-30")
            }, 0.1
        );
        Assertions.assertEquals(0.833373749, rate, xirr.precision);
    }

    @Test
    public void test03_3() {
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(new Transaction[]{
                new Transaction(-6565763.49, "2018-10-02"),
                new Transaction(317505.63, "2023-09-30"),
                new Transaction(4428.48, "2023-09-30")
            }, 0.1
        );
        Assertions.assertEquals(-0.453043529, rate, xirr.precision);
    }

    @Test
    public void test04() {
        // computes the xirr on 1 year growth of 0%
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(
            new Transaction(-1000, "2010-01-01"),
            new Transaction(1000, "2011-01-01")
        );
        Assertions.assertEquals(0, rate, xirr.precision);
    }

    @Test
    public void test05() {
        // computes the xirr on 1 year growth of 10%
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(
            new Transaction(-1000, "2010-01-01"),
            new Transaction(1100, "2011-01-01")
        );
        Assertions.assertEquals(0.10, rate, xirr.precision);
    }

    @Test
    public void test06() {
        // computes the negative xirr on 1 year decline of 10%
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(
            new Transaction(-1000, "2010-01-01"),
            new Transaction(900, "2011-01-01")
        );
        Assertions.assertEquals(-0.10, rate, xirr.precision);
    }

    @Test
    public void test07() {
        // computes the xirr on a particular data set the same as a popular
        // spreadsheet
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(
            new Transaction(-1000, "2010-01-01"),
            new Transaction(-1000, "2010-04-01"),
            new Transaction(-1000, "2010-07-01"),
            new Transaction(-1000, "2010-10-01"),
            new Transaction(4300, "2011-01-01")
        );
        Assertions.assertEquals(0.1212676, rate, xirr.precision);
    }

    @Test
    public void test08() {
        // gets the same answer even if the transations are out of order
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(
            new Transaction(-1000, "2010-10-01"),
            new Transaction(4300, "2011-01-01"),
            new Transaction(-1000, "2010-07-01"),
            new Transaction(-1000, "2010-01-01"),
            new Transaction(-1000, "2010-04-01")
        );
        Assertions.assertEquals(0.1212676, rate, xirr.precision);
    }

    @Test
    public void test09() {
        // computes rates of return greater than 100%
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(
            new Transaction(-1000, "2010-01-01"),
            new Transaction(3000, "2011-01-01")
        );
        Assertions.assertEquals(2.00, rate, xirr.precision);
    }

    @Test
    public void test10() {
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(
            new Transaction(-1000, "2016-01-15"),
            new Transaction(-2500, "2016-02-08"),
            new Transaction(-1000, "2016-04-17"),
            new Transaction(5050, "2016-08-24")
        );
        Assertions.assertEquals(0.2504234710540838, rate, xirr.precision);
    }

    @Test
    public void test11() {
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(
            new Transaction(-10000, "2000-05-24"),
            new Transaction(3027.25, "2000-06-05"),
            new Transaction(630.68, "2001-04-09"),
            new Transaction(2018.2, "2004-02-24"),
            new Transaction(1513.62, "2005-03-18"),
            new Transaction(1765.89, "2006-02-15"),
            new Transaction(4036.33, "2007-01-10"),
            new Transaction(4036.33, "2007-11-14"),
            new Transaction(1513.62, "2008-12-17"),
            new Transaction(1513.62, "2010-01-15"),
            new Transaction(2018.16, "2011-01-14"),
            new Transaction(1513.62, "2012-02-03"),
            new Transaction(1009.08, "2013-01-18"),
            new Transaction(1513.62, "2014-01-24"),
            new Transaction(1513.62, "2015-01-30"),
            new Transaction(1765.89, "2016-01-22"),
            new Transaction(1765.89, "2017-01-20"),
            new Transaction(22421.55, "2017-06-05")
        );
        Assertions.assertEquals(0.2126861, rate, xirr.precision);
    }
}
