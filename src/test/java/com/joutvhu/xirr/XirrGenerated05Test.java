package com.joutvhu.xirr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class XirrGenerated05Test {
    @Test
    void test1() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-19134359.48, "1987-03-14"),
            new Transaction(-178431.71, "1987-03-30"),
            new Transaction(-9103186.96, "1987-06-26"),
            new Transaction(6915636.35, "1987-09-21"),
            new Transaction(-4687302.58, "1987-10-25"),
            new Transaction(-2590667.63, "1987-11-10"),
            new Transaction(-7792665.64, "1987-12-22"),
            new Transaction(668529.95, "1988-01-30"),
            new Transaction(-2623303.73, "1988-03-23"),
            new Transaction(7331458.10, "1988-06-28"),
            new Transaction(9965604.17, "1988-08-18"),
            new Transaction(-3173109.32, "1988-11-16"),
            new Transaction(-9340677.78, "1989-01-19"),
            new Transaction(-4653267.24, "1989-01-25"),
            new Transaction(7668764.68, "1989-04-09"),
            new Transaction(6478697.25, "1989-06-17"),
            new Transaction(-5308724.35, "1989-08-03"),
            new Transaction(2367030.89, "1989-08-11"),
            new Transaction(376558.94, "1989-09-20"),
            new Transaction(3831460.20, "1989-12-19"),
            new Transaction(-8689268.63, "1990-01-10"),
            new Transaction(-9722411.61, "1990-01-17"),
            new Transaction(2297170.51, "1990-04-05"),
            new Transaction(668246.89, "1990-04-16"),
            new Transaction(1749724.82, "1990-07-16"),
            new Transaction(-5627792.91, "1990-08-05"),
            new Transaction(-3893875.24, "1990-08-20"),
            new Transaction(-9647792.02, "1990-11-30"),
            new Transaction(-8159425.54, "1991-01-16"),
            new Transaction(5340374.65, "1991-03-29"),
            new Transaction(7613301.35, "1991-04-12"),
            new Transaction(4578117.65, "1991-07-17"),
            new Transaction(-4467905.06, "1991-08-09"),
            new Transaction(6490071.28, "1991-10-17"),
            new Transaction(-6317319.00, "1991-12-24"),
            new Transaction(-7705148.26, "1992-03-03"),
            new Transaction(-6454099.77, "1992-04-16"),
            new Transaction(-6901197.01, "1992-05-02"),
            new Transaction(7014551.71, "1992-07-24"),
            new Transaction(7269274.34, "1992-09-30"),
            new Transaction(6893805.53, "1992-12-04"),
            new Transaction(-542538.27, "1993-01-09"),
            new Transaction(-1970671.24, "1993-03-10"),
            new Transaction(163422.45, "1993-05-25"),
            new Transaction(-8333363.65, "1993-07-07"),
            new Transaction(197544.88, "1993-09-28"),
            new Transaction(-8844001.41, "1993-11-21"),
            new Transaction(-9407827.22, "1993-12-24"),
            new Transaction(-5754795.80, "1994-02-16"),
            new Transaction(1771747.12, "1994-03-12"),
            new Transaction(-9897739.57, "1994-05-28"),
            new Transaction(-6891103.14, "1994-09-12"),
            new Transaction(1321258.57, "1994-11-27"),
            new Transaction(-8340004.79, "1995-03-09"),
            new Transaction(4218971.06, "1995-03-20"),
            new Transaction(9198973.73, "1995-05-09"),
            new Transaction(4337950.10, "1995-06-22"),
            new Transaction(-3630603.66, "1995-08-23"),
            new Transaction(5698208.76, "1995-10-04"),
            new Transaction(9644849.60, "1995-10-12"),
            new Transaction(-3466627.92, "1995-12-14"),
            new Transaction(1527742.53, "1996-01-27"),
            new Transaction(6498973.37, "1996-02-23"),
            new Transaction(-484158.17, "1996-06-05"),
            new Transaction(4221788.54, "1996-08-23"),
            new Transaction(5781291.22, "1996-09-15"),
            new Transaction(6689537.65, "1996-10-30"),
            new Transaction(8840499.98, "1996-12-04"),
            new Transaction(-6113144.84, "1997-03-18"),
            new Transaction(-1992415.64, "1997-03-28"),
            new Transaction(4015532.22, "1997-06-02"),
            new Transaction(794918.23, "1997-09-08"),
            new Transaction(-7912407.39, "1997-10-17"),
            new Transaction(3405745.16, "1998-01-05"),
            new Transaction(429458.38, "1998-03-31"),
            new Transaction(6122249.72, "1998-07-09"),
            new Transaction(-1311305.94, "1998-10-04"),
            new Transaction(-8218800.03, "1998-10-12"),
            new Transaction(-470957.14, "1998-10-31"),
            new Transaction(1470402.48, "1999-01-02"),
            new Transaction(-9865376.77, "1999-02-25"),
            new Transaction(7165171.05, "1999-04-02"),
            new Transaction(1294725.46, "1999-05-24"),
            new Transaction(3169678.68, "1999-07-31"),
            new Transaction(-1194074.63, "1999-08-09"),
            new Transaction(1721504.73, "1999-10-08"),
            new Transaction(7104357.49, "2000-01-03"),
            new Transaction(220498.21, "2000-04-20"),
            new Transaction(-2830285.39, "2000-06-25"),
            new Transaction(-8630705.73, "2000-10-04"),
            new Transaction(-1964125.27, "2000-11-07"),
            new Transaction(6213007.56, "2000-11-14")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.17946291970215716, rate, xirr.precision);
    }

    @Test
    void test2() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-8124122.07, "1990-01-05"),
            new Transaction(9858096.93, "1992-07-16"),
            new Transaction(1391759.41, "1993-07-09"),
            new Transaction(378662.78, "1995-07-11"),
            new Transaction(-3212662.68, "1996-04-22"),
            new Transaction(1295229.53, "1997-05-24"),
            new Transaction(9069499.82, "1998-11-18"),
            new Transaction(2352726.62, "2000-03-13"),
            new Transaction(-3509800.73, "2000-05-25"),
            new Transaction(4374151.23, "2002-01-25")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.21445143818855289, rate, xirr.precision);
    }

    @Test
    void test3() {
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(
            new Transaction(-3148503.37, "1998-11-23"),
            new Transaction(-7280981.19, "1999-04-01"),
            new Transaction(-8130337.58, "1999-06-11"),
            new Transaction(90296.31, "1999-09-09"),
            new Transaction(9750469.50, "1999-10-08"),
            new Transaction(-4798356.69, "2000-03-01"),
            new Transaction(3678619.91, "2000-07-23"),
            new Transaction(9561598.49, "2000-09-01"),
            new Transaction(2763183.25, "2000-10-25"),
            new Transaction(4505989.63, "2000-11-05"),
            new Transaction(1406720.74, "2000-12-30"),
            new Transaction(-9074034.73, "2001-03-01"),
            new Transaction(9664201.33, "2001-03-23"),
            new Transaction(4175975.46, "2001-05-01"),
            new Transaction(-1212952.30, "2001-05-27"),
            new Transaction(-8334083.96, "2001-09-14"),
            new Transaction(-9877343.66, "2002-01-26"),
            new Transaction(-7922838.64, "2002-04-17"),
            new Transaction(-1802865.45, "2002-08-21"),
            new Transaction(-6181806.99, "2002-10-20"),
            new Transaction(1544302.12, "2003-03-09"),
            new Transaction(2785087.21, "2003-03-18"),
            new Transaction(779015.73, "2003-07-22"),
            new Transaction(-2125485.04, "2003-08-05"),
            new Transaction(8041034.20, "2003-11-23"),
            new Transaction(-9210586.37, "2004-04-29"),
            new Transaction(-163641.62, "2004-09-03"),
            new Transaction(8637339.16, "2004-09-12"),
            new Transaction(-8235262.04, "2004-10-26"),
            new Transaction(1839533.73, "2005-03-11"),
            new Transaction(-2614178.38, "2005-07-22"),
            new Transaction(791011.99, "2005-11-06"),
            new Transaction(2614688.45, "2006-04-09"),
            new Transaction(3678961.92, "2006-06-21"),
            new Transaction(-402870.93, "2006-09-04"),
            new Transaction(-7399060.14, "2006-11-05"),
            new Transaction(-8552397.12, "2007-02-04"),
            new Transaction(-869678.82, "2007-02-27"),
            new Transaction(-9414404.10, "2007-07-02"),
            new Transaction(9584721.83, "2007-08-15"),
            new Transaction(-8424833.38, "2007-09-12"),
            new Transaction(2377083.03, "2007-11-16"),
            new Transaction(5738550.73, "2008-04-17"),
            new Transaction(-8555889.25, "2008-05-12"),
            new Transaction(-7831386.18, "2008-08-03"),
            new Transaction(7138351.23, "2008-09-13"),
            new Transaction(5451642.51, "2008-12-06"),
            new Transaction(-2707757.54, "2009-03-28"),
            new Transaction(2227373.87, "2009-06-26"),
            new Transaction(-7332751.93, "2009-08-16"),
            new Transaction(-4118600.95, "2009-10-30"),
            new Transaction(7572559.95, "2010-01-08"),
            new Transaction(941790.01, "2010-02-11"),
            new Transaction(4461614.81, "2010-06-23"),
            new Transaction(-1244719.04, "2010-07-27"),
            new Transaction(-6971729.82, "2010-11-26"),
            new Transaction(-2810359.42, "2011-03-10"),
            new Transaction(-8403834.61, "2011-03-11"),
            new Transaction(-1608492.39, "2011-03-27"),
            new Transaction(2973127.38, "2011-07-31"),
            new Transaction(382340.15, "2011-09-02"),
            new Transaction(-8597005.50, "2011-09-20"),
            new Transaction(9203852.84, "2011-12-10")
        );
        Assertions.assertEquals(-0.7849683073, rate, xirr.precision);
    }

    @Test
    void test4() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-8804651.40, "1987-01-27"),
            new Transaction(7729635.69, "1987-02-25"),
            new Transaction(-7207849.09, "1987-03-22"),
            new Transaction(-3887047.40, "1987-04-24"),
            new Transaction(-9423338.68, "1987-04-24"),
            new Transaction(5880140.08, "1987-05-28"),
            new Transaction(-4861395.33, "1987-07-27"),
            new Transaction(2771423.90, "1987-09-28"),
            new Transaction(6938371.85, "1987-11-16"),
            new Transaction(4437966.29, "1988-01-23"),
            new Transaction(2304375.40, "1988-02-19"),
            new Transaction(-9996881.61, "1988-04-08"),
            new Transaction(6052467.72, "1988-05-02"),
            new Transaction(-2614886.70, "1988-07-07"),
            new Transaction(-4739758.86, "1988-07-16"),
            new Transaction(6316548.25, "1988-10-16"),
            new Transaction(6179026.41, "1988-12-24"),
            new Transaction(-677791.08, "1989-01-04"),
            new Transaction(6606558.67, "1989-01-21"),
            new Transaction(-2053786.55, "1989-04-22"),
            new Transaction(4777503.32, "1989-08-10"),
            new Transaction(7087175.75, "1989-10-13"),
            new Transaction(4214747.16, "1989-12-05"),
            new Transaction(-6760927.96, "1990-03-09"),
            new Transaction(9727396.23, "1990-04-22"),
            new Transaction(-3328221.61, "1990-04-25"),
            new Transaction(-291047.23, "1990-07-30"),
            new Transaction(-9916061.43, "1990-08-12"),
            new Transaction(7242292.20, "1990-09-22"),
            new Transaction(3967640.39, "1990-11-25"),
            new Transaction(6603215.90, "1990-12-06"),
            new Transaction(1114678.46, "1991-01-11"),
            new Transaction(-9052895.53, "1991-04-25"),
            new Transaction(-9318567.25, "1991-07-01"),
            new Transaction(-6241921.42, "1991-08-12"),
            new Transaction(-8867344.51, "1991-08-24"),
            new Transaction(-6310349.62, "1991-11-06"),
            new Transaction(-1745534.71, "1992-02-18"),
            new Transaction(-9512984.67, "1992-04-03"),
            new Transaction(2780313.75, "1992-06-26"),
            new Transaction(-4373701.40, "1992-07-27"),
            new Transaction(-7957351.33, "1992-10-06"),
            new Transaction(-3089070.80, "1992-12-08"),
            new Transaction(9136243.31, "1993-02-04"),
            new Transaction(-3772054.57, "1993-02-18"),
            new Transaction(-6141866.89, "1993-03-10"),
            new Transaction(-3679195.18, "1993-06-10"),
            new Transaction(613395.59, "1993-06-19"),
            new Transaction(4712966.67, "1993-07-19"),
            new Transaction(-4021609.73, "1993-08-17"),
            new Transaction(6221268.83, "1993-11-12"),
            new Transaction(7471280.19, "1993-11-23"),
            new Transaction(187660.75, "1994-02-17"),
            new Transaction(7995727.87, "1994-03-11"),
            new Transaction(6664716.00, "1994-04-14"),
            new Transaction(-7764349.47, "1994-04-15"),
            new Transaction(-5471000.73, "1994-07-21"),
            new Transaction(-5635153.05, "1994-09-22"),
            new Transaction(549358.40, "1994-10-12"),
            new Transaction(-5373591.27, "1995-01-10"),
            new Transaction(-5026722.26, "1995-04-16"),
            new Transaction(5614418.59, "1995-05-06"),
            new Transaction(-2568595.79, "1995-06-09"),
            new Transaction(-2469770.40, "1995-06-12"),
            new Transaction(-4443020.18, "1995-07-26"),
            new Transaction(-7746863.24, "1995-09-02"),
            new Transaction(788756.12, "1995-12-09"),
            new Transaction(-768847.64, "1995-12-16"),
            new Transaction(8817748.74, "1996-01-30"),
            new Transaction(8028314.24, "1996-02-11"),
            new Transaction(-2386980.43, "1996-03-17"),
            new Transaction(4533995.77, "1996-05-07"),
            new Transaction(-8331855.31, "1996-05-31"),
            new Transaction(1358462.32, "1996-09-08"),
            new Transaction(-4092187.70, "1996-12-06"),
            new Transaction(9888810.89, "1997-01-16"),
            new Transaction(5636533.51, "1997-04-07"),
            new Transaction(-7095570.63, "1997-04-15"),
            new Transaction(1968370.41, "1997-07-22"),
            new Transaction(-2453945.65, "1997-09-08"),
            new Transaction(4873380.31, "1997-09-10"),
            new Transaction(-9877019.71, "1997-10-28"),
            new Transaction(2559149.84, "1998-01-05"),
            new Transaction(-5585296.49, "1998-02-04"),
            new Transaction(614980.82, "1998-02-15"),
            new Transaction(2049009.49, "1998-05-12"),
            new Transaction(-5667059.86, "1998-07-06"),
            new Transaction(14667240.06, "1998-10-03")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.26311903238349577, rate, xirr.precision);
    }

    @Test
    void test5() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-15907124.58, "1993-02-01"),
            new Transaction(-9627501.66, "1993-02-12"),
            new Transaction(8689518.76, "1993-06-23"),
            new Transaction(-5204048.84, "1993-08-30"),
            new Transaction(5064257.65, "1993-11-04"),
            new Transaction(-691326.97, "1994-03-18"),
            new Transaction(-7950642.05, "1994-05-30"),
            new Transaction(-4473245.61, "1994-09-06"),
            new Transaction(-4518744.68, "1994-09-25"),
            new Transaction(7754137.78, "1995-01-30"),
            new Transaction(9527973.43, "1995-05-29"),
            new Transaction(4283384.37, "1995-10-19"),
            new Transaction(-2398968.91, "1995-12-16"),
            new Transaction(1310652.08, "1996-04-05"),
            new Transaction(-933024.70, "1996-09-17"),
            new Transaction(3360711.73, "1996-12-06"),
            new Transaction(6677585.30, "1997-01-13"),
            new Transaction(4150364.37, "1997-04-30"),
            new Transaction(-1738258.91, "1997-07-28"),
            new Transaction(-8109282.79, "1997-09-04"),
            new Transaction(-6111962.91, "1998-01-31"),
            new Transaction(1320750.52, "1998-03-23"),
            new Transaction(1394932.78, "1998-04-29"),
            new Transaction(4171610.54, "1998-07-19"),
            new Transaction(2372905.51, "1998-11-05"),
            new Transaction(2488268.21, "1999-01-02"),
            new Transaction(-136500.72, "1999-04-12"),
            new Transaction(1592050.56, "1999-07-17"),
            new Transaction(-1405860.03, "1999-09-28"),
            new Transaction(-708113.72, "2000-01-01"),
            new Transaction(2335222.21, "2000-05-14"),
            new Transaction(-6892748.63, "2000-05-28"),
            new Transaction(8744336.89, "2000-08-23"),
            new Transaction(-4480109.49, "2000-10-13"),
            new Transaction(-8812252.17, "2001-02-25"),
            new Transaction(49070.77, "2001-04-16"),
            new Transaction(-3416799.57, "2001-08-19"),
            new Transaction(-3489353.70, "2002-02-07"),
            new Transaction(-5090429.54, "2002-04-30"),
            new Transaction(-4102152.80, "2002-05-19"),
            new Transaction(-1144814.36, "2002-06-26"),
            new Transaction(-4947492.16, "2002-08-22"),
            new Transaction(5505622.53, "2003-02-03"),
            new Transaction(8516814.56, "2003-06-17"),
            new Transaction(-9777103.21, "2003-08-21"),
            new Transaction(-9617341.10, "2003-12-30"),
            new Transaction(-223855.81, "2004-03-10"),
            new Transaction(925682.80, "2004-05-30"),
            new Transaction(-9434490.56, "2004-07-27"),
            new Transaction(-2226318.06, "2004-12-29"),
            new Transaction(-4949498.29, "2005-05-20"),
            new Transaction(-3836227.52, "2005-08-15"),
            new Transaction(-4769058.69, "2005-12-25"),
            new Transaction(-9971454.94, "2006-06-02"),
            new Transaction(5326264.12, "2006-10-24"),
            new Transaction(-7961116.47, "2007-04-12"),
            new Transaction(19002634.19, "2007-05-31")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.4370940225994857, rate, xirr.precision);
    }

    @Test
    void test6() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-18672309.83, "1985-07-27"),
            new Transaction(8894715.25, "1985-09-01"),
            new Transaction(-2866613.56, "1986-03-28"),
            new Transaction(9126536.09, "1986-03-29"),
            new Transaction(-4808800.00, "1986-11-27"),
            new Transaction(-1852685.58, "1987-05-19"),
            new Transaction(4808493.35, "1988-01-08"),
            new Transaction(2165230.62, "1988-09-25"),
            new Transaction(-7498186.89, "1989-07-13"),
            new Transaction(-7271205.26, "1990-01-13"),
            new Transaction(4538528.68, "1990-07-22"),
            new Transaction(-7730007.50, "1991-01-23"),
            new Transaction(-8781719.78, "1991-12-01"),
            new Transaction(7072140.01, "1992-04-09"),
            new Transaction(30024.19, "1992-08-15"),
            new Transaction(4085454.14, "1993-04-09"),
            new Transaction(-1508990.50, "1993-08-22"),
            new Transaction(5518033.72, "1994-06-01"),
            new Transaction(3909082.68, "1994-11-04"),
            new Transaction(723291.34, "1995-03-21"),
            new Transaction(-9643287.94, "1995-08-31"),
            new Transaction(-574783.99, "1996-01-26"),
            new Transaction(-1475093.81, "1996-11-18"),
            new Transaction(-765031.86, "1997-05-21"),
            new Transaction(4517317.29, "1998-06-05"),
            new Transaction(16018391.18, "1998-10-06")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-1.0615745186805726E-2, rate, xirr.precision);
    }

    @Test
    void test7() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-5399488.56, "2002-12-31"),
            new Transaction(-907457.19, "2003-01-08"),
            new Transaction(2517073.33, "2003-04-17"),
            new Transaction(1263020.57, "2003-04-21"),
            new Transaction(-9581228.42, "2003-05-05"),
            new Transaction(3507194.41, "2003-06-20"),
            new Transaction(9681162.04, "2003-10-25"),
            new Transaction(-2361946.65, "2003-12-11"),
            new Transaction(-988450.60, "2004-03-28"),
            new Transaction(-2379559.89, "2004-04-19"),
            new Transaction(1732932.79, "2004-05-24"),
            new Transaction(4425703.57, "2004-08-20"),
            new Transaction(8420022.49, "2004-09-15"),
            new Transaction(-306420.27, "2004-11-27"),
            new Transaction(6694025.19, "2004-11-27"),
            new Transaction(4149455.77, "2005-02-01"),
            new Transaction(2504006.88, "2005-04-13"),
            new Transaction(4728327.73, "2005-06-12"),
            new Transaction(-2531980.03, "2005-08-11"),
            new Transaction(5442548.84, "2005-12-11"),
            new Transaction(3755208.68, "2006-03-30"),
            new Transaction(-6604646.15, "2006-04-01"),
            new Transaction(-9303792.05, "2006-07-24"),
            new Transaction(-7804092.15, "2006-10-07"),
            new Transaction(6781914.71, "2007-02-08"),
            new Transaction(8059675.51, "2007-05-29"),
            new Transaction(5057522.96, "2007-09-05"),
            new Transaction(-7221357.95, "2007-09-13"),
            new Transaction(557124.05, "2007-11-03"),
            new Transaction(6761119.81, "2008-01-05"),
            new Transaction(-1463600.49, "2008-04-17"),
            new Transaction(-2580688.61, "2008-06-26"),
            new Transaction(7797196.27, "2008-10-21"),
            new Transaction(840432.78, "2008-12-12"),
            new Transaction(8223188.01, "2009-02-03"),
            new Transaction(-6051562.00, "2009-03-02"),
            new Transaction(-1647544.83, "2009-06-08"),
            new Transaction(-973485.25, "2009-08-31"),
            new Transaction(-3595633.01, "2009-09-11"),
            new Transaction(4248262.87, "2009-11-13"),
            new Transaction(2009981.13, "2009-11-28"),
            new Transaction(-623640.93, "2010-03-24"),
            new Transaction(6972811.58, "2010-05-30"),
            new Transaction(-4347495.83, "2010-08-04"),
            new Transaction(-1672580.36, "2010-11-17"),
            new Transaction(-1062974.86, "2010-11-25"),
            new Transaction(-5160515.38, "2011-02-25"),
            new Transaction(2061547.78, "2011-04-18"),
            new Transaction(-1323520.75, "2011-08-06"),
            new Transaction(379670.43, "2011-11-07"),
            new Transaction(-559384.34, "2012-02-18"),
            new Transaction(-919197.16, "2012-05-28"),
            new Transaction(-7733405.93, "2012-06-11"),
            new Transaction(2329319.33, "2012-09-26"),
            new Transaction(9438146.05, "2012-10-25"),
            new Transaction(9964499.30, "2013-02-19"),
            new Transaction(-9999450.95, "2013-05-21"),
            new Transaction(-2044635.51, "2013-09-02"),
            new Transaction(-3506485.51, "2013-10-15"),
            new Transaction(-750586.33, "2013-12-03"),
            new Transaction(3974105.02, "2014-03-01"),
            new Transaction(4463220.57, "2014-04-22"),
            new Transaction(2576992.89, "2014-05-16"),
            new Transaction(9213886.95, "2014-05-31"),
            new Transaction(-3901686.14, "2014-06-25"),
            new Transaction(5105728.39, "2014-07-25"),
            new Transaction(5577436.39, "2014-09-08"),
            new Transaction(-2062303.45, "2014-11-26"),
            new Transaction(2573220.29, "2014-12-06"),
            new Transaction(-7944495.96, "2015-01-20"),
            new Transaction(-4950942.51, "2015-03-13"),
            new Transaction(767650.77, "2015-06-29"),
            new Transaction(8139177.49, "2015-07-11"),
            new Transaction(-1595693.99, "2015-11-06"),
            new Transaction(5730700.67, "2016-02-02"),
            new Transaction(4068263.03, "2016-03-11"),
            new Transaction(-6519887.90, "2016-04-23"),
            new Transaction(17051299.18, "2016-04-23")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(1.4850710272789001, rate, xirr.precision);
    }

    @Test
    void test8() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-10518855.17, "1982-07-01"),
            new Transaction(-9328162.42, "1982-11-04"),
            new Transaction(-2654320.41, "1982-11-06"),
            new Transaction(6881698.00, "1983-07-27"),
            new Transaction(9858120.08, "1983-08-26"),
            new Transaction(6967536.80, "1984-02-22"),
            new Transaction(6273927.65, "1984-12-05"),
            new Transaction(-7261819.48, "1985-08-14"),
            new Transaction(2762900.62, "1985-08-17"),
            new Transaction(-9604058.83, "1985-12-15"),
            new Transaction(3643866.45, "1986-10-03"),
            new Transaction(-2959507.44, "1987-02-03"),
            new Transaction(-8091486.65, "1987-09-25"),
            new Transaction(-9524708.91, "1988-03-20"),
            new Transaction(5306838.33, "1988-09-15"),
            new Transaction(-6291664.73, "1989-01-15"),
            new Transaction(-8943259.32, "1989-04-13"),
            new Transaction(6029881.33, "1989-07-09"),
            new Transaction(-8013340.59, "1989-12-23"),
            new Transaction(-5016852.68, "1990-04-14"),
            new Transaction(4943257.86, "1990-05-19"),
            new Transaction(-5020496.15, "1991-01-13"),
            new Transaction(9607497.54, "1991-04-13"),
            new Transaction(5613289.54, "1991-09-06"),
            new Transaction(4545154.48, "1992-02-14"),
            new Transaction(5684396.81, "1992-08-22"),
            new Transaction(-2374677.43, "1993-03-19"),
            new Transaction(4082794.66, "1993-12-17"),
            new Transaction(8045119.44, "1994-10-06"),
            new Transaction(-8917229.27, "1994-11-09"),
            new Transaction(-4420158.58, "1995-02-16"),
            new Transaction(-8858731.63, "1995-11-26"),
            new Transaction(13014130.99, "1996-06-08")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.1059384426102042, rate, xirr.precision);
    }

    @Test
    void test9() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-19418607.43, "2004-06-06"),
            new Transaction(6055969.26, "2004-07-24"),
            new Transaction(-9484166.63, "2004-12-18"),
            new Transaction(5080185.46, "2005-05-18"),
            new Transaction(-7818025.26, "2005-07-06"),
            new Transaction(-1974381.11, "2005-11-29"),
            new Transaction(-1181423.67, "2006-04-16"),
            new Transaction(1359183.55, "2006-04-20"),
            new Transaction(-5174929.10, "2006-08-16"),
            new Transaction(4330496.28, "2006-09-25"),
            new Transaction(-4623625.21, "2007-02-16"),
            new Transaction(-2708470.49, "2007-03-22"),
            new Transaction(-4562475.43, "2007-03-24"),
            new Transaction(650056.58, "2007-05-08"),
            new Transaction(-2333835.03, "2007-06-20"),
            new Transaction(4357523.13, "2007-09-02"),
            new Transaction(8887820.25, "2007-10-13"),
            new Transaction(-5673968.35, "2008-02-28"),
            new Transaction(4420491.37, "2008-07-24"),
            new Transaction(-9291652.85, "2008-12-07"),
            new Transaction(-4213336.09, "2009-02-21"),
            new Transaction(4510653.03, "2009-07-14"),
            new Transaction(-6290521.15, "2009-10-19"),
            new Transaction(2317805.53, "2010-01-28"),
            new Transaction(-4743673.78, "2010-06-07"),
            new Transaction(-4978945.94, "2010-09-22"),
            new Transaction(3947640.57, "2010-12-10"),
            new Transaction(-9925249.93, "2011-04-06"),
            new Transaction(8854028.95, "2011-04-19"),
            new Transaction(4743303.58, "2011-09-14"),
            new Transaction(-5518820.04, "2011-12-17"),
            new Transaction(-6825146.42, "2011-12-23"),
            new Transaction(-3221756.14, "2012-05-16"),
            new Transaction(360119.93, "2012-10-03"),
            new Transaction(8025425.32, "2012-11-07"),
            new Transaction(2996999.01, "2012-12-13"),
            new Transaction(-219340.01, "2013-05-09"),
            new Transaction(-981515.74, "2013-07-19"),
            new Transaction(2545719.44, "2013-11-17"),
            new Transaction(-3611882.84, "2014-01-28"),
            new Transaction(6513424.03, "2014-04-19"),
            new Transaction(4198907.31, "2014-05-23"),
            new Transaction(-5699573.34, "2014-06-19"),
            new Transaction(-8867386.84, "2014-08-13"),
            new Transaction(-1452288.71, "2014-11-08"),
            new Transaction(-8632907.12, "2015-02-21"),
            new Transaction(-2384602.41, "2015-03-22"),
            new Transaction(-4065714.36, "2015-08-05"),
            new Transaction(-3601023.10, "2015-10-07"),
            new Transaction(-1884155.25, "2015-11-07"),
            new Transaction(-508773.30, "2015-11-24"),
            new Transaction(1343214.72, "2016-04-22"),
            new Transaction(-4330048.04, "2016-09-09"),
            new Transaction(-8792210.73, "2017-01-09"),
            new Transaction(-871954.32, "2017-04-15"),
            new Transaction(1726320.95, "2017-07-17"),
            new Transaction(7366797.37, "2017-10-08"),
            new Transaction(5637414.54, "2017-10-26"),
            new Transaction(6727951.06, "2017-11-19"),
            new Transaction(8279177.28, "2018-02-19"),
            new Transaction(9936574.66, "2018-04-23"),
            new Transaction(1960471.23, "2018-06-17"),
            new Transaction(9268995.79, "2018-11-08"),
            new Transaction(1533108.12, "2018-12-18"),
            new Transaction(-3626571.44, "2019-02-23"),
            new Transaction(18113300.38, "2019-03-03")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-4.0692897140979775E-2, rate, xirr.precision);
    }

    @Test
    void test10() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-13267373.42, "1992-12-20"),
            new Transaction(6191004.68, "1992-12-24"),
            new Transaction(-3439912.21, "1993-03-13"),
            new Transaction(5748827.84, "1993-06-08"),
            new Transaction(-4990922.58, "1993-09-18"),
            new Transaction(-5706005.32, "1993-12-04"),
            new Transaction(2921612.18, "1994-01-22"),
            new Transaction(6341614.77, "1994-03-18"),
            new Transaction(4609328.76, "1994-07-13"),
            new Transaction(-7802289.38, "1994-10-17"),
            new Transaction(5105060.81, "1994-12-10"),
            new Transaction(-8717723.80, "1995-01-17"),
            new Transaction(-3249661.55, "1995-03-05"),
            new Transaction(875681.39, "1995-06-03"),
            new Transaction(-2358118.20, "1995-07-21"),
            new Transaction(5486262.68, "1995-11-22"),
            new Transaction(3486843.91, "1995-12-22"),
            new Transaction(405756.15, "1996-02-06"),
            new Transaction(1155979.20, "1996-05-22"),
            new Transaction(-2739551.67, "1996-07-14"),
            new Transaction(3696752.19, "1996-10-09"),
            new Transaction(-198254.72, "1996-10-26"),
            new Transaction(7537926.99, "1996-11-13"),
            new Transaction(-5647715.85, "1997-01-30"),
            new Transaction(4678244.58, "1997-03-26"),
            new Transaction(-1372865.49, "1997-06-19"),
            new Transaction(-3427881.48, "1997-08-15"),
            new Transaction(-8488669.63, "1997-11-01"),
            new Transaction(2726837.51, "1997-11-30"),
            new Transaction(-6344501.49, "1998-03-03"),
            new Transaction(1214891.03, "1998-05-17"),
            new Transaction(2514797.60, "1998-08-18"),
            new Transaction(-8584320.84, "1998-09-27"),
            new Transaction(-5233573.21, "1998-11-15"),
            new Transaction(-5946790.43, "1998-12-16"),
            new Transaction(4723845.73, "1998-12-23"),
            new Transaction(4937529.65, "1998-12-28"),
            new Transaction(5233517.89, "1999-04-30"),
            new Transaction(-2348786.00, "1999-05-13"),
            new Transaction(-8113804.87, "1999-09-04"),
            new Transaction(8815711.88, "1999-10-24"),
            new Transaction(824277.23, "1999-12-01"),
            new Transaction(-2864993.77, "2000-01-11"),
            new Transaction(-6070522.10, "2000-01-21"),
            new Transaction(5583268.53, "2000-03-19"),
            new Transaction(-8173360.01, "2000-05-23"),
            new Transaction(-2388107.04, "2000-06-19"),
            new Transaction(-6186418.66, "2000-09-06"),
            new Transaction(-8083614.25, "2000-10-19"),
            new Transaction(1252258.75, "2001-02-11"),
            new Transaction(-2021122.91, "2001-04-05"),
            new Transaction(-1553082.08, "2001-04-22"),
            new Transaction(5546906.11, "2001-07-12"),
            new Transaction(-455800.16, "2001-08-05"),
            new Transaction(-2987068.73, "2001-10-31"),
            new Transaction(9259986.51, "2001-12-28"),
            new Transaction(5727382.89, "2002-01-28"),
            new Transaction(-5262885.15, "2002-02-02"),
            new Transaction(-6521542.00, "2002-02-13"),
            new Transaction(-3975047.64, "2002-03-22"),
            new Transaction(-2202248.16, "2002-03-23"),
            new Transaction(-818315.76, "2002-05-12"),
            new Transaction(-4782006.13, "2002-07-09"),
            new Transaction(6742898.79, "2002-07-29"),
            new Transaction(93064.18, "2002-10-18"),
            new Transaction(-6580307.13, "2002-12-25"),
            new Transaction(9455973.55, "2003-01-04"),
            new Transaction(3439091.16, "2003-01-29"),
            new Transaction(-8551537.89, "2003-04-26"),
            new Transaction(9116432.66, "2003-05-08"),
            new Transaction(-9436527.56, "2003-07-15"),
            new Transaction(-7437845.85, "2003-09-08"),
            new Transaction(-232459.99, "2003-10-30"),
            new Transaction(-4378955.21, "2004-01-12"),
            new Transaction(6050054.13, "2004-01-22"),
            new Transaction(6910655.71, "2004-01-23"),
            new Transaction(8903257.32, "2004-05-18"),
            new Transaction(386513.15, "2004-06-06"),
            new Transaction(6361457.35, "2004-09-15"),
            new Transaction(12706737.75, "2005-01-04")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.10064494805410507, rate, xirr.precision);
    }

    @Test
    void test11() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-16463003.17, "2000-04-27"),
            new Transaction(-4837206.45, "2000-12-20"),
            new Transaction(-8013337.15, "2001-05-21"),
            new Transaction(2392127.46, "2001-09-30"),
            new Transaction(8012275.54, "2002-03-09"),
            new Transaction(-1910084.15, "2002-04-17"),
            new Transaction(-2472236.76, "2002-10-29"),
            new Transaction(7310596.16, "2003-07-17"),
            new Transaction(-3590590.68, "2003-12-18"),
            new Transaction(3301520.63, "2004-08-16"),
            new Transaction(-6065736.75, "2004-08-20"),
            new Transaction(-7238707.54, "2004-09-07"),
            new Transaction(-1147234.12, "2005-01-03"),
            new Transaction(-7547589.98, "2005-03-11"),
            new Transaction(2130026.85, "2005-07-31"),
            new Transaction(4900348.60, "2005-08-09"),
            new Transaction(-3193678.84, "2006-04-10"),
            new Transaction(5015860.60, "2007-01-01"),
            new Transaction(4053809.96, "2007-03-28"),
            new Transaction(-2489837.09, "2007-07-26"),
            new Transaction(-8851959.23, "2007-11-02"),
            new Transaction(-4158852.30, "2008-05-04"),
            new Transaction(-6799311.15, "2008-08-03"),
            new Transaction(8044722.69, "2008-09-26"),
            new Transaction(-9736047.51, "2008-12-27"),
            new Transaction(1984422.16, "2009-04-08"),
            new Transaction(-6737007.94, "2009-09-24"),
            new Transaction(4886242.54, "2009-11-28"),
            new Transaction(-6869136.58, "2010-07-19"),
            new Transaction(-2396267.56, "2011-02-10"),
            new Transaction(-7160391.58, "2011-05-19"),
            new Transaction(-1885441.64, "2011-07-15"),
            new Transaction(-5601718.06, "2011-11-18"),
            new Transaction(8297292.95, "2012-01-13"),
            new Transaction(-968652.98, "2012-09-13"),
            new Transaction(1954044.06, "2013-02-13"),
            new Transaction(16610886.56, "2013-05-25")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.19703778829870794, rate, xirr.precision);
    }

    @Test
    void test12() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-8185174.89, "2004-11-19"),
            new Transaction(-4457259.09, "2005-02-26"),
            new Transaction(-6782908.65, "2005-04-29"),
            new Transaction(-3612593.39, "2005-08-22"),
            new Transaction(-7901898.23, "2005-12-04"),
            new Transaction(-1933059.86, "2006-02-10"),
            new Transaction(-9317494.17, "2006-05-23"),
            new Transaction(-6681867.73, "2006-08-08"),
            new Transaction(4972721.09, "2006-11-26"),
            new Transaction(5986232.63, "2007-01-24"),
            new Transaction(1157449.93, "2007-05-15"),
            new Transaction(3367615.57, "2007-07-11"),
            new Transaction(-211449.79, "2007-08-23"),
            new Transaction(-8312788.93, "2007-12-13"),
            new Transaction(7000536.38, "2007-12-17"),
            new Transaction(6216407.86, "2008-02-10"),
            new Transaction(-154121.50, "2008-04-17"),
            new Transaction(3202109.95, "2008-06-25"),
            new Transaction(-1477664.97, "2008-09-07"),
            new Transaction(-6671952.33, "2008-09-18"),
            new Transaction(-5589419.91, "2008-10-22"),
            new Transaction(-3861472.15, "2008-11-23"),
            new Transaction(9159368.35, "2008-12-20"),
            new Transaction(-3837216.09, "2009-01-26"),
            new Transaction(7197538.60, "2009-05-14"),
            new Transaction(-534489.41, "2009-06-12"),
            new Transaction(6344541.32, "2009-06-30"),
            new Transaction(-3842068.77, "2009-07-07"),
            new Transaction(946575.44, "2009-08-05"),
            new Transaction(6533506.45, "2009-09-21"),
            new Transaction(-7355098.50, "2010-01-04"),
            new Transaction(-8490451.80, "2010-02-12"),
            new Transaction(1249688.68, "2010-06-02"),
            new Transaction(-1646255.09, "2010-07-25"),
            new Transaction(5164423.44, "2010-10-03"),
            new Transaction(-685909.87, "2010-10-29"),
            new Transaction(-4820558.93, "2010-11-27"),
            new Transaction(-8702647.72, "2011-02-12"),
            new Transaction(5647545.72, "2011-04-13"),
            new Transaction(-9065808.08, "2011-07-09"),
            new Transaction(-6913409.40, "2011-10-06"),
            new Transaction(-5574886.67, "2011-10-14"),
            new Transaction(-7080451.59, "2011-11-15"),
            new Transaction(2624355.17, "2012-02-19"),
            new Transaction(-3898188.70, "2012-05-21"),
            new Transaction(-2602584.15, "2012-05-24"),
            new Transaction(-1134635.88, "2012-06-03"),
            new Transaction(1547539.32, "2012-09-19"),
            new Transaction(-1964179.40, "2012-10-25"),
            new Transaction(5121544.79, "2012-11-17"),
            new Transaction(4277722.94, "2013-01-13"),
            new Transaction(-6120460.17, "2013-03-08"),
            new Transaction(7460515.45, "2013-03-18"),
            new Transaction(-9326301.07, "2013-03-29"),
            new Transaction(1094888.19, "2013-07-12"),
            new Transaction(-2942860.84, "2013-08-28"),
            new Transaction(65335.55, "2013-10-17"),
            new Transaction(-3914067.51, "2014-01-22"),
            new Transaction(2606538.05, "2014-04-05"),
            new Transaction(9593447.52, "2014-07-15"),
            new Transaction(-5356186.48, "2014-08-20"),
            new Transaction(3858955.66, "2014-11-28"),
            new Transaction(7134231.22, "2014-12-12"),
            new Transaction(-2585620.33, "2015-03-09"),
            new Transaction(-4837459.24, "2015-05-16"),
            new Transaction(-2923735.31, "2015-07-28"),
            new Transaction(-9944928.20, "2015-10-02"),
            new Transaction(-5511199.74, "2015-11-22"),
            new Transaction(8628528.83, "2016-02-01"),
            new Transaction(8591468.22, "2016-05-21"),
            new Transaction(5849699.41, "2016-09-03"),
            new Transaction(7955833.88, "2016-11-27"),
            new Transaction(656558.25, "2016-12-04"),
            new Transaction(6878082.01, "2017-03-17"),
            new Transaction(6482685.59, "2017-05-01"),
            new Transaction(7210080.83, "2017-05-12"),
            new Transaction(5518337.18, "2017-06-12"),
            new Transaction(5315988.13, "2017-06-14"),
            new Transaction(-9303125.20, "2017-09-06"),
            new Transaction(-6308136.41, "2017-12-27"),
            new Transaction(-6288897.80, "2018-04-01"),
            new Transaction(-1144974.62, "2018-06-02"),
            new Transaction(4945125.70, "2018-08-30"),
            new Transaction(-8069745.52, "2018-12-03"),
            new Transaction(11975449.70, "2019-03-18")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.0887577480498737, rate, xirr.precision);
    }

    @Test
    void test13() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-3543290.43, "1999-07-13"),
            new Transaction(-4175193.99, "1999-08-01"),
            new Transaction(-2810338.38, "1999-10-14"),
            new Transaction(2119185.28, "1999-12-05"),
            new Transaction(3709886.31, "1999-12-23"),
            new Transaction(-1892760.09, "2000-01-08"),
            new Transaction(-3824279.77, "2000-04-12"),
            new Transaction(4791852.43, "2000-05-24"),
            new Transaction(-3689598.74, "2000-08-17"),
            new Transaction(5421094.95, "2000-10-17"),
            new Transaction(-8038777.82, "2001-01-24"),
            new Transaction(-8808392.55, "2001-03-12"),
            new Transaction(2906179.28, "2001-04-18"),
            new Transaction(-2743242.74, "2001-05-29"),
            new Transaction(-8730385.66, "2001-07-30"),
            new Transaction(-3314768.66, "2001-07-31"),
            new Transaction(-9050151.58, "2001-08-08"),
            new Transaction(8160743.22, "2001-08-27"),
            new Transaction(4051048.21, "2001-10-31"),
            new Transaction(2236004.95, "2001-12-08"),
            new Transaction(-9638696.84, "2001-12-21"),
            new Transaction(6710856.51, "2002-03-28"),
            new Transaction(-5718074.24, "2002-04-19"),
            new Transaction(1472299.75, "2002-07-21"),
            new Transaction(-2851320.32, "2002-08-27"),
            new Transaction(-8883250.45, "2002-11-25"),
            new Transaction(-6686819.81, "2003-01-01"),
            new Transaction(-5051334.79, "2003-03-17"),
            new Transaction(-8460686.50, "2003-06-09"),
            new Transaction(-7371884.13, "2003-08-02"),
            new Transaction(-1163378.80, "2003-10-21"),
            new Transaction(6877485.03, "2004-01-23"),
            new Transaction(-1912992.73, "2004-01-28"),
            new Transaction(9307902.39, "2004-04-06"),
            new Transaction(-738828.65, "2004-05-07"),
            new Transaction(-382662.08, "2004-08-14"),
            new Transaction(3702444.84, "2004-09-09"),
            new Transaction(-7501653.76, "2004-12-16"),
            new Transaction(6226556.58, "2005-03-11"),
            new Transaction(-3857834.97, "2005-04-04"),
            new Transaction(-2378464.09, "2005-07-14"),
            new Transaction(-3790862.33, "2005-08-06"),
            new Transaction(-3813520.33, "2005-10-13"),
            new Transaction(-4382582.66, "2005-12-13"),
            new Transaction(2485504.53, "2006-03-22"),
            new Transaction(2548115.79, "2006-03-24"),
            new Transaction(-8188956.00, "2006-05-02"),
            new Transaction(-758540.99, "2006-07-17"),
            new Transaction(-2516331.22, "2006-07-27"),
            new Transaction(2950839.85, "2006-08-05"),
            new Transaction(1527482.72, "2006-09-30"),
            new Transaction(6026510.99, "2006-12-14"),
            new Transaction(-187584.35, "2007-03-15"),
            new Transaction(7256311.30, "2007-04-02"),
            new Transaction(-9431171.58, "2007-04-24"),
            new Transaction(2220347.44, "2007-07-04"),
            new Transaction(9212996.87, "2007-09-08"),
            new Transaction(8156678.07, "2007-10-22"),
            new Transaction(5688814.58, "2008-01-25"),
            new Transaction(-7997039.93, "2008-03-21"),
            new Transaction(6831580.20, "2008-05-28"),
            new Transaction(-3406424.71, "2008-07-10"),
            new Transaction(-6592832.64, "2008-10-16"),
            new Transaction(3377928.81, "2008-12-11"),
            new Transaction(-7841041.20, "2009-01-07"),
            new Transaction(-3427396.82, "2009-04-08"),
            new Transaction(8114148.94, "2009-04-14"),
            new Transaction(7206848.49, "2009-05-25"),
            new Transaction(3398535.80, "2009-06-25"),
            new Transaction(8583419.76, "2009-08-07"),
            new Transaction(-9733692.45, "2009-10-08"),
            new Transaction(-6640986.95, "2009-10-18"),
            new Transaction(1117977.97, "2009-11-22"),
            new Transaction(4537499.57, "2010-01-10"),
            new Transaction(-3194887.98, "2010-02-01"),
            new Transaction(6948817.23, "2010-04-21"),
            new Transaction(3578560.80, "2010-05-19"),
            new Transaction(-509606.88, "2010-08-02"),
            new Transaction(2146132.80, "2010-10-16"),
            new Transaction(8463462.38, "2010-10-28"),
            new Transaction(8315874.99, "2011-01-15"),
            new Transaction(7162025.17, "2011-01-30"),
            new Transaction(257771.69, "2011-02-05"),
            new Transaction(7896765.07, "2011-02-26"),
            new Transaction(-3281466.73, "2011-05-07"),
            new Transaction(-4574839.35, "2011-06-14"),
            new Transaction(-2316777.70, "2011-06-29"),
            new Transaction(-464169.08, "2011-08-18"),
            new Transaction(-2299954.69, "2011-08-23"),
            new Transaction(-9312538.73, "2011-08-29"),
            new Transaction(3025686.76, "2011-11-08"),
            new Transaction(-1175400.36, "2012-01-06"),
            new Transaction(-4003935.49, "2012-02-28"),
            new Transaction(346924.47, "2012-04-12")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.09809466107137678, rate, xirr.precision);
    }

    @Test
    void test14() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-2848203.20, "1995-04-22"),
            new Transaction(2767503.97, "1995-05-14"),
            new Transaction(4962204.53, "1995-07-02"),
            new Transaction(348413.05, "1995-07-28"),
            new Transaction(2754320.20, "1995-10-15"),
            new Transaction(9182784.54, "1995-12-27"),
            new Transaction(7706609.35, "1996-01-14"),
            new Transaction(-6513159.43, "1996-01-28"),
            new Transaction(9244647.62, "1996-04-03"),
            new Transaction(-1236327.71, "1996-04-11"),
            new Transaction(6731762.74, "1996-05-18"),
            new Transaction(8769516.48, "1996-08-25"),
            new Transaction(2088133.60, "1996-11-28"),
            new Transaction(-5581101.57, "1997-03-14"),
            new Transaction(-6107751.50, "1997-04-17"),
            new Transaction(9861241.90, "1997-06-02"),
            new Transaction(9170623.27, "1997-06-17"),
            new Transaction(-8402655.96, "1997-07-17"),
            new Transaction(3389185.60, "1997-10-10"),
            new Transaction(2506792.87, "1997-10-27"),
            new Transaction(-7269304.50, "1997-11-20"),
            new Transaction(-2102818.02, "1998-01-09"),
            new Transaction(1815246.12, "1998-03-16"),
            new Transaction(5575726.96, "1998-04-07"),
            new Transaction(-5224796.42, "1998-05-25"),
            new Transaction(-1828032.49, "1998-06-30"),
            new Transaction(-7676968.53, "1998-08-17"),
            new Transaction(2510331.57, "1998-11-20"),
            new Transaction(4682154.83, "1998-11-24"),
            new Transaction(-9201852.73, "1999-01-22"),
            new Transaction(-8746680.61, "1999-03-01"),
            new Transaction(-2386244.54, "1999-03-07"),
            new Transaction(-6604019.93, "1999-03-12"),
            new Transaction(-7505408.22, "1999-05-14"),
            new Transaction(2138949.68, "1999-05-14"),
            new Transaction(4257107.28, "1999-05-24"),
            new Transaction(4337658.45, "1999-08-21"),
            new Transaction(-3235005.68, "1999-10-30"),
            new Transaction(-3380899.47, "2000-02-14"),
            new Transaction(-1934542.68, "2000-05-12"),
            new Transaction(-62158.31, "2000-08-23"),
            new Transaction(2224380.30, "2000-10-01"),
            new Transaction(2934018.77, "2000-12-03"),
            new Transaction(-3460068.99, "2000-12-12"),
            new Transaction(9132743.56, "2001-03-24"),
            new Transaction(7757149.24, "2001-04-07"),
            new Transaction(-2404464.95, "2001-07-04"),
            new Transaction(8518567.18, "2001-08-30"),
            new Transaction(1804745.65, "2001-10-01"),
            new Transaction(-3107996.49, "2001-10-03"),
            new Transaction(-1101079.46, "2002-01-09"),
            new Transaction(-1452476.81, "2002-01-15"),
            new Transaction(-4690764.64, "2002-03-21"),
            new Transaction(-4088012.91, "2002-03-29"),
            new Transaction(8328554.92, "2002-06-18"),
            new Transaction(1958373.32, "2002-07-14"),
            new Transaction(-6272429.01, "2002-07-28"),
            new Transaction(5367319.26, "2002-08-31"),
            new Transaction(4967602.17, "2002-09-16"),
            new Transaction(-7279647.49, "2002-09-25"),
            new Transaction(-1503936.50, "2002-10-08"),
            new Transaction(-3832820.72, "2002-11-16"),
            new Transaction(-8901776.23, "2002-12-06"),
            new Transaction(-4277822.11, "2002-12-18"),
            new Transaction(-1632424.63, "2003-01-27"),
            new Transaction(4204709.44, "2003-02-13"),
            new Transaction(-9723046.56, "2003-02-16"),
            new Transaction(5453741.80, "2003-05-21"),
            new Transaction(4661994.00, "2003-07-13"),
            new Transaction(-4281376.40, "2003-08-26"),
            new Transaction(2450843.89, "2003-11-13"),
            new Transaction(-3792630.08, "2004-01-02"),
            new Transaction(9894962.53, "2004-03-13"),
            new Transaction(-2866049.49, "2004-03-21"),
            new Transaction(77859.44, "2004-04-20"),
            new Transaction(-4747517.25, "2004-05-11"),
            new Transaction(-2911162.61, "2004-08-28"),
            new Transaction(7043287.51, "2004-10-10"),
            new Transaction(-5607456.55, "2004-12-19"),
            new Transaction(6708735.42, "2005-02-09"),
            new Transaction(-7975156.17, "2005-05-03"),
            new Transaction(1442187.68, "2005-07-31"),
            new Transaction(-3924755.95, "2005-10-30"),
            new Transaction(-9734776.75, "2006-02-16"),
            new Transaction(6960517.91, "2006-02-20"),
            new Transaction(-752952.61, "2006-04-04"),
            new Transaction(134736.61, "2006-05-11"),
            new Transaction(-6985784.61, "2006-06-03"),
            new Transaction(2815207.84, "2006-06-29"),
            new Transaction(687959.13, "2006-08-13"),
            new Transaction(18379958.35, "2006-10-11")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(3495.687089944317, rate, xirr.precision);
    }

    @Test
    void test15() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-10459215.93, "1988-11-08"),
            new Transaction(6232791.51, "1989-08-16"),
            new Transaction(194374.69, "1990-12-11"),
            new Transaction(-9028282.10, "1991-09-18"),
            new Transaction(-6196877.55, "1991-11-06"),
            new Transaction(3077881.49, "1992-08-11"),
            new Transaction(4841915.79, "1993-08-23"),
            new Transaction(9830764.23, "1993-10-26"),
            new Transaction(-5688800.59, "1995-01-24"),
            new Transaction(-4608727.42, "1996-05-30"),
            new Transaction(3675779.32, "1997-02-11"),
            new Transaction(-7323236.37, "1997-11-10"),
            new Transaction(8830028.72, "1998-10-24"),
            new Transaction(3790811.81, "2000-03-15"),
            new Transaction(-7756328.48, "2001-02-21"),
            new Transaction(6570303.05, "2001-04-24"),
            new Transaction(-6215816.33, "2001-10-03"),
            new Transaction(7678472.09, "2002-03-09"),
            new Transaction(2945496.59, "2002-03-12")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(3.4041494131088253E-3, rate, xirr.precision);
    }

    @Test
    void test16() {
        Xirr xirr = Xirr.instance();
        Assertions.assertThrows(XirrException.class, () -> xirr.xirr(
            new Transaction(-12182095.51, "1994-04-27"),
            new Transaction(-3401768.08, "1994-05-24"),
            new Transaction(986940.78, "1994-06-13"),
            new Transaction(-5256322.14, "1994-06-14"),
            new Transaction(831829.91, "1994-08-04"),
            new Transaction(-7347216.28, "1994-10-02"),
            new Transaction(-4324481.29, "1994-11-25"),
            new Transaction(-9615157.02, "1994-12-08"),
            new Transaction(-1577310.65, "1995-02-12"),
            new Transaction(5777307.79, "1995-02-28"),
            new Transaction(346410.29, "1995-04-02"),
            new Transaction(-7578002.91, "1995-06-16"),
            new Transaction(-2834304.34, "1995-09-19"),
            new Transaction(4231342.64, "1995-10-24"),
            new Transaction(-7873869.48, "1995-12-09"),
            new Transaction(114371.86, "1996-02-10"),
            new Transaction(-2710099.71, "1996-02-20"),
            new Transaction(-5902475.10, "1996-06-01"),
            new Transaction(-15991.35, "1996-09-15"),
            new Transaction(-6775721.37, "1996-10-05"),
            new Transaction(-8468503.84, "1996-10-28"),
            new Transaction(5285716.53, "1997-02-03"),
            new Transaction(662955.81, "1997-04-10"),
            new Transaction(-8205858.55, "1997-07-19"),
            new Transaction(-6855459.34, "1997-10-15"),
            new Transaction(-7230257.98, "1997-10-19"),
            new Transaction(1300440.03, "1997-12-30"),
            new Transaction(7015266.16, "1998-03-15"),
            new Transaction(6318219.81, "1998-05-09"),
            new Transaction(8808633.75, "1998-08-17"),
            new Transaction(-571236.00, "1998-11-12"),
            new Transaction(-634661.16, "1999-02-16"),
            new Transaction(-7408585.69, "1999-04-29"),
            new Transaction(-8677555.93, "1999-05-05"),
            new Transaction(-4846394.90, "1999-08-20"),
            new Transaction(686159.47, "1999-11-29"),
            new Transaction(-7044282.49, "2000-01-14"),
            new Transaction(-2667380.47, "2000-04-28"),
            new Transaction(-7911554.26, "2000-08-06"),
            new Transaction(-9476361.88, "2000-09-21"),
            new Transaction(384521.17, "2000-11-01"),
            new Transaction(4191898.53, "2001-01-08"),
            new Transaction(8195146.87, "2001-04-18"),
            new Transaction(-8237298.81, "2001-06-16"),
            new Transaction(8513950.50, "2001-07-20"),
            new Transaction(-4639847.70, "2001-09-11"),
            new Transaction(3950661.57, "2001-10-25"),
            new Transaction(-6464911.96, "2002-02-11"),
            new Transaction(-7538731.36, "2002-05-13"),
            new Transaction(-2132121.73, "2002-06-02"),
            new Transaction(8658467.35, "2002-09-10"),
            new Transaction(-2492668.02, "2002-12-09"),
            new Transaction(-5002316.00, "2003-03-05"),
            new Transaction(5213671.29, "2003-05-27"),
            new Transaction(-2181975.72, "2003-08-09"),
            new Transaction(-4369344.37, "2003-08-12"),
            new Transaction(-3955494.00, "2003-10-15"),
            new Transaction(-7328393.28, "2003-12-07"),
            new Transaction(4237077.26, "2004-02-10"),
            new Transaction(-2842468.55, "2004-04-24"),
            new Transaction(-8688414.71, "2004-08-08"),
            new Transaction(9595203.32, "2004-08-20"),
            new Transaction(8922108.12, "2004-10-04"),
            new Transaction(6638760.76, "2004-10-25"),
            new Transaction(7307097.01, "2004-12-29"),
            new Transaction(6877447.50, "2005-02-26"),
            new Transaction(-6532298.79, "2005-05-17"),
            new Transaction(-457792.99, "2005-08-24"),
            new Transaction(4497801.32, "2005-10-01"),
            new Transaction(6430365.84, "2005-11-26"),
            new Transaction(5243428.14, "2005-12-20"),
            new Transaction(-8363959.87, "2006-02-05"),
            new Transaction(1105913.91, "2006-03-26"),
            new Transaction(-1145610.81, "2006-03-26"),
            new Transaction(-7114267.57, "2006-06-11"),
            new Transaction(5113889.77, "2006-07-02"),
            new Transaction(-3189504.39, "2006-08-19"),
            new Transaction(5134655.28, "2006-08-27"),
            new Transaction(-8647625.98, "2006-09-05"),
            new Transaction(7251091.93, "2006-11-19"),
            new Transaction(-917060.78, "2007-01-12"),
            new Transaction(8777902.89, "2007-04-14"),
            new Transaction(-4977005.28, "2007-04-27"),
            new Transaction(-4500197.73, "2007-05-25"),
            new Transaction(799526.56, "2007-07-13"),
            new Transaction(-9109504.80, "2007-08-11"),
            new Transaction(-7258882.37, "2007-09-04"),
            new Transaction(-5755250.03, "2007-09-28"),
            new Transaction(9821375.72, "2007-10-25"),
            new Transaction(167404.77, "2007-12-14")
        ));
    }

    @Test
    void test17() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-13381300.73, "1992-08-21"),
            new Transaction(-3586862.14, "1992-12-06"),
            new Transaction(6504173.04, "1993-01-18"),
            new Transaction(4603504.97, "1993-03-16"),
            new Transaction(-8192193.02, "1993-05-20"),
            new Transaction(8407325.15, "1993-06-17"),
            new Transaction(5062808.13, "1993-08-13"),
            new Transaction(7798527.54, "1993-10-22"),
            new Transaction(3993108.97, "1993-11-02"),
            new Transaction(-9995605.56, "1994-01-06"),
            new Transaction(6482233.96, "1994-01-25"),
            new Transaction(-2818126.08, "1994-03-05"),
            new Transaction(4267832.52, "1994-04-14"),
            new Transaction(-3134540.70, "1994-06-30"),
            new Transaction(-9468833.85, "1994-08-14"),
            new Transaction(9001414.04, "1994-09-12"),
            new Transaction(-8539267.42, "1994-10-12"),
            new Transaction(4940433.37, "1994-11-20"),
            new Transaction(4277702.68, "1995-01-14"),
            new Transaction(-202092.97, "1995-04-17"),
            new Transaction(-7989465.95, "1995-06-09"),
            new Transaction(-5843072.83, "1995-08-07"),
            new Transaction(217627.43, "1995-08-30"),
            new Transaction(-1704105.18, "1995-10-31"),
            new Transaction(4056523.70, "1995-12-26"),
            new Transaction(9035880.92, "1996-02-07"),
            new Transaction(-4340665.71, "1996-03-20"),
            new Transaction(-3469545.17, "1996-04-24"),
            new Transaction(714328.93, "1996-06-30"),
            new Transaction(-7228525.93, "1996-09-27"),
            new Transaction(-6686038.60, "1996-10-16"),
            new Transaction(5449034.05, "1996-11-29"),
            new Transaction(-4536962.09, "1997-02-10"),
            new Transaction(1803866.52, "1997-04-21"),
            new Transaction(-1026681.79, "1997-06-24"),
            new Transaction(3435156.66, "1997-10-08"),
            new Transaction(-1315024.93, "1997-11-12"),
            new Transaction(-6041354.75, "1997-12-31"),
            new Transaction(5640381.42, "1998-03-04"),
            new Transaction(4738849.87, "1998-05-26"),
            new Transaction(7831020.54, "1998-06-27"),
            new Transaction(9631626.61, "1998-07-10"),
            new Transaction(1178644.45, "1998-07-25"),
            new Transaction(-8986849.98, "1998-08-31"),
            new Transaction(-8241684.65, "1998-12-12"),
            new Transaction(-2269903.71, "1998-12-20"),
            new Transaction(3531095.03, "1999-01-25"),
            new Transaction(3398070.82, "1999-02-15"),
            new Transaction(-3499069.14, "1999-05-28"),
            new Transaction(3075576.19, "1999-08-25"),
            new Transaction(5677006.19, "1999-10-27"),
            new Transaction(-7291594.16, "1999-12-02"),
            new Transaction(-8540879.63, "1999-12-29"),
            new Transaction(6268314.92, "2000-01-07"),
            new Transaction(5632837.95, "2000-02-17"),
            new Transaction(3471614.20, "2000-05-23"),
            new Transaction(-2206449.83, "2000-05-30"),
            new Transaction(-3506574.38, "2000-06-17"),
            new Transaction(4540822.70, "2000-10-02"),
            new Transaction(-9190285.98, "2000-10-14"),
            new Transaction(4778235.97, "2001-01-15"),
            new Transaction(-3703811.51, "2001-02-07"),
            new Transaction(7979547.09, "2001-02-16"),
            new Transaction(2137837.95, "2001-03-17"),
            new Transaction(2255121.47, "2001-05-13"),
            new Transaction(2861321.88, "2001-06-19"),
            new Transaction(-2204391.50, "2001-10-02"),
            new Transaction(7486641.72, "2001-12-07"),
            new Transaction(-2041364.42, "2001-12-13"),
            new Transaction(-6671334.32, "2002-03-16"),
            new Transaction(1624781.56, "2002-05-06"),
            new Transaction(-5691542.84, "2002-06-06"),
            new Transaction(2674519.76, "2002-07-24"),
            new Transaction(-7843608.07, "2002-11-01"),
            new Transaction(-4416341.04, "2002-11-09"),
            new Transaction(4898723.38, "2002-12-31"),
            new Transaction(-9475122.08, "2003-02-20"),
            new Transaction(9187468.58, "2003-04-07"),
            new Transaction(-119115.30, "2003-07-11"),
            new Transaction(4923571.01, "2003-09-14"),
            new Transaction(8474955.39, "2003-12-03"),
            new Transaction(-4787865.65, "2003-12-25"),
            new Transaction(1532049.31, "2004-03-28"),
            new Transaction(5780739.65, "2004-06-08"),
            new Transaction(-6792291.74, "2004-08-27"),
            new Transaction(-4359122.93, "2004-09-17"),
            new Transaction(-7387133.94, "2004-09-29"),
            new Transaction(9720223.25, "2005-01-14"),
            new Transaction(-6845682.34, "2005-02-25"),
            new Transaction(4063578.79, "2005-06-02"),
            new Transaction(6965593.31, "2005-09-16"),
            new Transaction(48186.46, "2006-01-02")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(8.834448754787444E-2, rate, xirr.precision);
    }

    @Test
    void test18() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-3308318.05, "1992-12-08"),
            new Transaction(9454420.02, "1992-12-12"),
            new Transaction(-1001863.70, "1993-02-11"),
            new Transaction(6917153.29, "1993-07-15"),
            new Transaction(-2915631.38, "1993-07-26"),
            new Transaction(-5456910.54, "1993-11-16"),
            new Transaction(-1484122.29, "1994-03-02"),
            new Transaction(-3305813.40, "1994-05-04"),
            new Transaction(8522778.48, "1994-09-18"),
            new Transaction(8949083.55, "1995-01-06"),
            new Transaction(-3472502.97, "1995-01-16"),
            new Transaction(5919745.08, "1995-04-19"),
            new Transaction(4905406.68, "1995-09-03"),
            new Transaction(-887121.44, "1995-11-10"),
            new Transaction(-2176948.96, "1996-01-27"),
            new Transaction(5954178.62, "1996-02-24"),
            new Transaction(-9957555.94, "1996-05-29"),
            new Transaction(9747412.33, "1996-10-28"),
            new Transaction(6136844.85, "1997-01-11"),
            new Transaction(-6202501.88, "1997-05-27"),
            new Transaction(1170959.59, "1997-09-16"),
            new Transaction(-1686141.75, "1997-09-20"),
            new Transaction(122804.61, "1997-10-04"),
            new Transaction(-9188381.55, "1998-03-09"),
            new Transaction(-3189100.69, "1998-05-11"),
            new Transaction(5793118.45, "1998-07-11"),
            new Transaction(7126485.13, "1998-10-11"),
            new Transaction(-380222.41, "1999-01-05"),
            new Transaction(-1333310.96, "1999-05-15"),
            new Transaction(9685764.63, "1999-09-05"),
            new Transaction(-3478253.86, "1999-10-15"),
            new Transaction(1190046.92, "1999-10-19"),
            new Transaction(9646144.98, "1999-10-22"),
            new Transaction(7353913.09, "2000-01-21"),
            new Transaction(-7410690.47, "2000-06-09"),
            new Transaction(-1803634.68, "2000-08-29"),
            new Transaction(-5648088.78, "2000-11-18"),
            new Transaction(-8291306.48, "2000-12-10"),
            new Transaction(8119875.03, "2001-03-18"),
            new Transaction(-1209368.42, "2001-06-12"),
            new Transaction(-8588296.48, "2001-07-21"),
            new Transaction(433514.88, "2001-11-22"),
            new Transaction(5859682.29, "2002-03-11"),
            new Transaction(8904404.87, "2002-04-01"),
            new Transaction(-4986407.87, "2002-05-12"),
            new Transaction(9390618.11, "2002-09-02"),
            new Transaction(1617462.99, "2002-10-19"),
            new Transaction(2751066.84, "2002-11-12"),
            new Transaction(4180158.71, "2003-03-04"),
            new Transaction(-2647033.08, "2003-04-03"),
            new Transaction(4699989.37, "2003-06-28"),
            new Transaction(-634291.52, "2003-07-08"),
            new Transaction(-1072903.25, "2003-11-11"),
            new Transaction(5416005.59, "2004-03-23"),
            new Transaction(8034309.28, "2004-07-10"),
            new Transaction(6283474.11, "2004-08-14"),
            new Transaction(6254917.55, "2004-11-14"),
            new Transaction(-3292138.39, "2005-02-13"),
            new Transaction(375396.81, "2005-02-15"),
            new Transaction(-4066949.38, "2005-02-18"),
            new Transaction(-4002577.89, "2005-03-10"),
            new Transaction(17027791.49, "2005-06-24")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(4.097523819226424E41, rate, xirr.precision);
    }

    @Test
    void test19() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-12221025.51, "1985-10-05"),
            new Transaction(307293.56, "1986-06-27"),
            new Transaction(53627.57, "1986-07-15"),
            new Transaction(35751.73, "1986-12-14"),
            new Transaction(-1433219.04, "1987-09-26"),
            new Transaction(-3990799.64, "1988-03-23"),
            new Transaction(3984451.42, "1989-04-21"),
            new Transaction(3882785.07, "1989-06-03"),
            new Transaction(-9854105.35, "1989-07-10"),
            new Transaction(-6967588.28, "1990-03-01"),
            new Transaction(6439407.01, "1991-04-12"),
            new Transaction(8543831.36, "1992-01-05"),
            new Transaction(-3376168.33, "1993-01-16"),
            new Transaction(6812709.76, "1993-06-17"),
            new Transaction(840102.09, "1993-06-27"),
            new Transaction(8182474.02, "1993-10-01"),
            new Transaction(-3373358.99, "1993-10-21"),
            new Transaction(9304485.95, "1994-10-20"),
            new Transaction(3781214.77, "1994-12-29"),
            new Transaction(8261805.56, "1995-03-18"),
            new Transaction(556036.57, "1996-02-15"),
            new Transaction(-9015452.42, "1996-11-08"),
            new Transaction(-8823394.26, "1997-02-01"),
            new Transaction(17289047.82, "1997-06-14")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(9.4053253531456021E-2, rate, xirr.precision);
    }

    @Test
    void test20() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-12578770.15, "2007-01-13"),
            new Transaction(5351362.36, "2007-04-06"),
            new Transaction(-8876919.19, "2007-08-23"),
            new Transaction(-4001553.34, "2007-11-21"),
            new Transaction(8914137.85, "2008-03-23"),
            new Transaction(-3722575.88, "2008-04-10"),
            new Transaction(9376383.77, "2008-08-04"),
            new Transaction(-8183091.66, "2008-10-11"),
            new Transaction(-6683640.49, "2009-01-28"),
            new Transaction(-9980024.62, "2009-03-31"),
            new Transaction(2461461.70, "2009-05-07"),
            new Transaction(-1205883.99, "2009-07-13"),
            new Transaction(5021819.45, "2009-07-21"),
            new Transaction(1826191.99, "2009-08-22"),
            new Transaction(5729702.53, "2009-09-19"),
            new Transaction(2709359.07, "2010-01-26"),
            new Transaction(-5466067.62, "2010-04-14"),
            new Transaction(-2852689.68, "2010-06-04"),
            new Transaction(9584834.36, "2010-07-15"),
            new Transaction(292609.20, "2010-12-02"),
            new Transaction(1871929.82, "2011-01-17"),
            new Transaction(8709603.98, "2011-05-18"),
            new Transaction(-6041966.27, "2011-07-21"),
            new Transaction(2837739.81, "2011-11-07"),
            new Transaction(-685966.99, "2011-12-16"),
            new Transaction(-4010660.39, "2012-01-07"),
            new Transaction(9161037.78, "2012-01-09"),
            new Transaction(5937724.65, "2012-01-09"),
            new Transaction(-8870249.54, "2012-03-11"),
            new Transaction(-4741912.84, "2012-07-10"),
            new Transaction(3600957.74, "2012-11-01"),
            new Transaction(9270316.93, "2013-03-10"),
            new Transaction(2181767.07, "2013-03-11"),
            new Transaction(4040060.64, "2013-05-08"),
            new Transaction(2677424.40, "2013-05-27"),
            new Transaction(2347513.51, "2013-09-10"),
            new Transaction(-4711474.31, "2013-12-18"),
            new Transaction(-1547145.84, "2014-01-14"),
            new Transaction(-8993450.53, "2014-01-24"),
            new Transaction(6006136.49, "2014-06-14"),
            new Transaction(-5732615.15, "2014-06-26"),
            new Transaction(-9577899.71, "2014-09-07"),
            new Transaction(6949216.73, "2014-09-23"),
            new Transaction(2828430.16, "2015-02-03"),
            new Transaction(1996580.45, "2015-05-16"),
            new Transaction(5104527.04, "2015-08-01"),
            new Transaction(-4309054.04, "2015-08-30"),
            new Transaction(4149997.73, "2015-12-21"),
            new Transaction(-4623819.94, "2016-03-26"),
            new Transaction(4556176.01, "2016-05-05"),
            new Transaction(-7648368.06, "2016-06-15"),
            new Transaction(-6253230.62, "2016-11-04"),
            new Transaction(-384550.88, "2017-03-28"),
            new Transaction(4921475.71, "2017-05-05"),
            new Transaction(2601048.95, "2017-05-22"),
            new Transaction(-6893653.64, "2017-08-19"),
            new Transaction(-3226498.90, "2017-09-19"),
            new Transaction(3419606.08, "2017-10-26"),
            new Transaction(3744528.37, "2017-11-02"),
            new Transaction(-3753736.97, "2018-01-10"),
            new Transaction(1775835.83, "2018-02-25"),
            new Transaction(9270148.46, "2018-05-01"),
            new Transaction(-6122925.79, "2018-05-09"),
            new Transaction(9329947.62, "2018-07-11"),
            new Transaction(8855529.92, "2018-09-14"),
            new Transaction(-4685132.23, "2018-12-18"),
            new Transaction(7913692.40, "2019-03-06"),
            new Transaction(904050.66, "2019-04-07"),
            new Transaction(5478738.45, "2019-07-16")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.13285493254661562, rate, xirr.precision);
    }

    @Test
    void test21() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-2520921.44, "1991-08-31"),
            new Transaction(1795310.55, "1991-11-15"),
            new Transaction(2447709.77, "1992-03-08"),
            new Transaction(-8021716.05, "1992-06-29"),
            new Transaction(7287246.76, "1992-07-10"),
            new Transaction(5676693.97, "1992-07-17"),
            new Transaction(5525063.99, "1992-10-20"),
            new Transaction(-537195.52, "1992-12-06"),
            new Transaction(-7517794.97, "1992-12-24"),
            new Transaction(-8333806.83, "1993-01-06"),
            new Transaction(9202030.70, "1993-03-14"),
            new Transaction(-4165620.43, "1993-05-26"),
            new Transaction(6492093.46, "1993-08-07"),
            new Transaction(-7218947.12, "1993-12-02"),
            new Transaction(-6456546.83, "1994-03-31"),
            new Transaction(5027595.58, "1994-06-02"),
            new Transaction(150036.70, "1994-08-29"),
            new Transaction(1307057.06, "1994-10-17"),
            new Transaction(382048.88, "1995-02-18"),
            new Transaction(8283271.51, "1995-04-28"),
            new Transaction(981869.67, "1995-07-12"),
            new Transaction(4143143.53, "1995-08-27"),
            new Transaction(2161179.01, "1995-08-28"),
            new Transaction(-1859271.83, "1995-09-18"),
            new Transaction(1719127.50, "1995-12-10"),
            new Transaction(4668184.93, "1996-02-11"),
            new Transaction(-8718917.85, "1996-04-01"),
            new Transaction(4221718.45, "1996-06-22"),
            new Transaction(-4486082.54, "1996-08-12"),
            new Transaction(-6607251.08, "1996-09-30"),
            new Transaction(-3919095.34, "1996-10-15"),
            new Transaction(-5079708.56, "1997-01-15"),
            new Transaction(-4095412.74, "1997-01-23"),
            new Transaction(9518002.15, "1997-04-27"),
            new Transaction(6538071.12, "1997-08-16"),
            new Transaction(-1426896.74, "1997-11-01"),
            new Transaction(1031126.85, "1997-11-09"),
            new Transaction(-4629687.16, "1998-02-10"),
            new Transaction(-1552201.02, "1998-04-27"),
            new Transaction(-5530746.04, "1998-07-21"),
            new Transaction(6386561.35, "1998-07-30"),
            new Transaction(7866738.33, "1998-07-30"),
            new Transaction(6217043.06, "1998-11-24"),
            new Transaction(-6275536.17, "1999-02-23"),
            new Transaction(-605472.51, "1999-04-22"),
            new Transaction(-8153814.01, "1999-08-13"),
            new Transaction(-8471245.27, "1999-09-06"),
            new Transaction(9340175.75, "1999-10-08"),
            new Transaction(-6273229.81, "1999-11-30"),
            new Transaction(8319816.74, "2000-03-13"),
            new Transaction(5831779.11, "2000-04-21"),
            new Transaction(5602345.40, "2000-08-18"),
            new Transaction(-7326304.07, "2000-11-19"),
            new Transaction(6503952.43, "2001-02-12"),
            new Transaction(-3562416.64, "2001-05-06"),
            new Transaction(4218153.81, "2001-05-17"),
            new Transaction(5300528.57, "2001-08-05"),
            new Transaction(2451303.41, "2001-10-02"),
            new Transaction(4169226.18, "2001-10-16"),
            new Transaction(1652914.35, "2002-01-05"),
            new Transaction(-7864818.89, "2002-02-13"),
            new Transaction(-3007187.29, "2002-04-13"),
            new Transaction(-6151344.55, "2002-06-14"),
            new Transaction(-5120542.39, "2002-09-26"),
            new Transaction(-2476786.98, "2002-11-12"),
            new Transaction(-7084748.87, "2003-02-09"),
            new Transaction(-5765659.60, "2003-02-11"),
            new Transaction(-1727768.27, "2003-03-02"),
            new Transaction(6109697.56, "2003-04-03"),
            new Transaction(5921795.00, "2003-07-20"),
            new Transaction(7161730.83, "2003-10-14"),
            new Transaction(5777979.14, "2003-10-17"),
            new Transaction(2383258.81, "2003-12-05"),
            new Transaction(-7380211.75, "2004-01-26"),
            new Transaction(-5003438.02, "2004-05-16"),
            new Transaction(-7728190.16, "2004-06-12"),
            new Transaction(369994.66, "2004-07-05"),
            new Transaction(6630883.43, "2004-08-08"),
            new Transaction(2986221.87, "2004-09-15"),
            new Transaction(4622658.06, "2005-01-02")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(6.8150403499603271, rate, xirr.precision);
    }

    @Test
    void test22() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-15249799.45, "2002-06-25"),
            new Transaction(6584707.53, "2002-08-17"),
            new Transaction(-4947562.25, "2002-10-07"),
            new Transaction(-9575428.72, "2002-11-23"),
            new Transaction(941825.64, "2003-02-28"),
            new Transaction(-529220.85, "2003-04-13"),
            new Transaction(-4220657.94, "2003-08-10"),
            new Transaction(-5762663.67, "2003-11-22"),
            new Transaction(8610147.89, "2003-12-06"),
            new Transaction(8154875.26, "2004-02-22"),
            new Transaction(3508582.73, "2004-02-24"),
            new Transaction(8837904.44, "2004-05-08"),
            new Transaction(8080218.36, "2004-05-30"),
            new Transaction(2699475.18, "2004-08-25"),
            new Transaction(-1128589.78, "2004-12-21"),
            new Transaction(-361150.92, "2005-02-03"),
            new Transaction(-2701968.90, "2005-03-04"),
            new Transaction(-5259616.58, "2005-05-10"),
            new Transaction(-3862286.50, "2005-08-22"),
            new Transaction(-1794095.13, "2005-12-03"),
            new Transaction(-8681690.06, "2006-01-02"),
            new Transaction(9077181.72, "2006-01-10"),
            new Transaction(6053748.01, "2006-04-20"),
            new Transaction(-9027698.92, "2006-06-06"),
            new Transaction(8031474.66, "2006-07-13"),
            new Transaction(-1494073.54, "2006-10-04"),
            new Transaction(1273513.19, "2006-10-04"),
            new Transaction(-2430119.76, "2006-10-14"),
            new Transaction(5734066.39, "2006-12-06"),
            new Transaction(-8940937.95, "2006-12-16"),
            new Transaction(3425068.46, "2007-02-11"),
            new Transaction(-8107064.32, "2007-04-11"),
            new Transaction(9747440.66, "2007-04-16"),
            new Transaction(5888721.09, "2007-06-28"),
            new Transaction(1024693.05, "2007-07-20"),
            new Transaction(4243108.58, "2007-09-21"),
            new Transaction(2673834.55, "2007-11-13"),
            new Transaction(9988279.72, "2008-01-09"),
            new Transaction(-9255164.51, "2008-02-19"),
            new Transaction(9005209.98, "2008-03-10"),
            new Transaction(-5027196.13, "2008-06-21"),
            new Transaction(-157670.02, "2008-07-08"),
            new Transaction(6427084.28, "2008-07-27"),
            new Transaction(1647583.39, "2008-11-03"),
            new Transaction(9661667.56, "2009-01-01"),
            new Transaction(6995546.37, "2009-04-28"),
            new Transaction(-6297611.34, "2009-07-22"),
            new Transaction(-6145769.50, "2009-09-14"),
            new Transaction(-1378767.65, "2009-12-10"),
            new Transaction(9582040.09, "2010-02-09"),
            new Transaction(7233988.19, "2010-05-03"),
            new Transaction(-3117399.57, "2010-06-18"),
            new Transaction(4468773.07, "2010-09-08"),
            new Transaction(-2985903.18, "2010-11-17"),
            new Transaction(3325633.06, "2011-01-07"),
            new Transaction(-5658118.47, "2011-03-14"),
            new Transaction(-3631110.66, "2011-06-06"),
            new Transaction(4239951.83, "2011-07-19"),
            new Transaction(-985838.76, "2011-10-09"),
            new Transaction(630673.15, "2011-12-14"),
            new Transaction(1021850.41, "2011-12-27"),
            new Transaction(-7351946.69, "2012-03-16"),
            new Transaction(7380220.56, "2012-04-02"),
            new Transaction(-7677620.58, "2012-05-05"),
            new Transaction(4915064.54, "2012-08-20"),
            new Transaction(-6418798.87, "2012-08-26"),
            new Transaction(-7764361.48, "2012-12-23"),
            new Transaction(594934.20, "2013-04-16"),
            new Transaction(8074155.62, "2013-05-10"),
            new Transaction(6409813.44, "2013-08-01"),
            new Transaction(4794961.67, "2013-11-18"),
            new Transaction(5262662.40, "2014-03-12"),
            new Transaction(-6624558.88, "2014-05-09"),
            new Transaction(9306411.26, "2014-05-17"),
            new Transaction(3130357.06, "2014-08-15"),
            new Transaction(4550610.94, "2014-10-18"),
            new Transaction(-7892624.07, "2014-11-06"),
            new Transaction(-6379030.95, "2014-12-13"),
            new Transaction(13081535.94, "2015-02-20")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.30872071385383615, rate, xirr.precision);
    }

    @Test
    void test23() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-1944734.56, "1999-03-19"),
            new Transaction(6655135.02, "2000-01-07"),
            new Transaction(4457061.71, "2000-04-12"),
            new Transaction(8880958.05, "2000-10-23"),
            new Transaction(5253293.57, "2001-01-14"),
            new Transaction(1177817.39, "2001-03-14"),
            new Transaction(-5240133.65, "2001-04-17"),
            new Transaction(-1552505.37, "2001-09-04"),
            new Transaction(4160927.10, "2002-03-27"),
            new Transaction(5775688.24, "2003-03-06"),
            new Transaction(3643810.94, "2003-08-26"),
            new Transaction(-1029169.45, "2004-07-04"),
            new Transaction(7517545.03, "2005-01-03"),
            new Transaction(507627.41, "2005-03-29"),
            new Transaction(4061794.57, "2005-06-01"),
            new Transaction(-4638197.77, "2005-08-08"),
            new Transaction(-380161.70, "2006-04-04"),
            new Transaction(9866047.73, "2007-03-02"),
            new Transaction(7573327.65, "2007-12-25"),
            new Transaction(-5700141.38, "2008-10-03"),
            new Transaction(780631.63, "2008-11-14"),
            new Transaction(-2896311.70, "2008-11-14"),
            new Transaction(-2633431.92, "2009-07-06"),
            new Transaction(4343643.14, "2009-08-03"),
            new Transaction(7535513.43, "2009-11-04"),
            new Transaction(17839813.81, "2010-02-01")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(7.6982596874237057, rate, xirr.precision);
    }

    @Test
    void test24() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-14342583.35, "1991-04-08"),
            new Transaction(-4612537.43, "1992-04-17"),
            new Transaction(-4984980.86, "1993-02-21"),
            new Transaction(-1922540.46, "1993-06-24"),
            new Transaction(-2552934.23, "1995-03-07"),
            new Transaction(7840734.28, "1996-10-02"),
            new Transaction(5147575.01, "1997-05-04"),
            new Transaction(-5851551.10, "1997-12-25"),
            new Transaction(-9314222.10, "1998-03-25"),
            new Transaction(-1767913.22, "1998-05-08"),
            new Transaction(5787559.90, "1998-08-24"),
            new Transaction(-220039.70, "1998-11-10"),
            new Transaction(1570840.25, "2000-03-28"),
            new Transaction(-8230928.43, "2001-04-23"),
            new Transaction(3542378.20, "2002-05-20"),
            new Transaction(16581953.25, "2002-08-05")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-6.3408906757831562E-2, rate, xirr.precision);
    }

    @Test
    void test25() {
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(
            new Transaction(-15966384.74, "1983-03-20"),
            new Transaction(-7475468.15, "1983-05-06"),
            new Transaction(-8907514.79, "1983-07-16"),
            new Transaction(6465261.92, "1983-09-29"),
            new Transaction(-2093648.42, "1983-11-21"),
            new Transaction(7281978.79, "1984-03-03"),
            new Transaction(-2325060.07, "1984-05-06"),
            new Transaction(3834913.94, "1984-07-16"),
            new Transaction(1909155.58, "1984-10-06"),
            new Transaction(7898312.79, "1984-10-06"),
            new Transaction(1789627.82, "1984-10-20"),
            new Transaction(8744465.49, "1985-01-13"),
            new Transaction(585796.53, "1985-03-28"),
            new Transaction(6551798.69, "1985-06-26"),
            new Transaction(5483743.40, "1985-09-01"),
            new Transaction(6461435.17, "1985-09-28"),
            new Transaction(-8474029.19, "1985-10-29"),
            new Transaction(-5934745.51, "1985-12-16"),
            new Transaction(-4955243.67, "1986-01-23"),
            new Transaction(-3214598.85, "1986-03-23"),
            new Transaction(-6022698.85, "1986-05-03"),
            new Transaction(1438653.33, "1986-06-04"),
            new Transaction(-5072988.73, "1986-09-04"),
            new Transaction(-9633814.50, "1986-10-19"),
            new Transaction(-1161583.02, "1986-12-29"),
            new Transaction(-1861511.71, "1987-02-18"),
            new Transaction(-8142025.54, "1987-04-14"),
            new Transaction(2358064.58, "1987-05-17"),
            new Transaction(4481669.60, "1987-06-24"),
            new Transaction(-1477811.74, "1987-06-24"),
            new Transaction(-2572243.59, "1987-09-25"),
            new Transaction(4286695.71, "1987-11-25"),
            new Transaction(-6888654.54, "1987-12-27"),
            new Transaction(-3961194.92, "1987-12-28"),
            new Transaction(8083311.10, "1988-03-16"),
            new Transaction(-6425323.04, "1988-06-26"),
            new Transaction(5470285.56, "1988-09-26"),
            new Transaction(7220420.53, "1988-12-15"),
            new Transaction(-9597723.32, "1989-03-06"),
            new Transaction(-3969528.95, "1989-05-14"),
            new Transaction(5666208.36, "1989-07-09"),
            new Transaction(-9768268.14, "1989-09-15"),
            new Transaction(-5729119.16, "1989-11-02"),
            new Transaction(660428.93, "1989-11-30"),
            new Transaction(-253224.96, "1989-12-21"),
            new Transaction(-8119246.56, "1990-01-22"),
            new Transaction(8427685.46, "1990-03-18"),
            new Transaction(-3289159.25, "1990-03-31"),
            new Transaction(530260.22, "1990-05-29"),
            new Transaction(-4505070.67, "1990-08-05"),
            new Transaction(-7582938.83, "1990-10-18"),
            new Transaction(7042373.07, "1990-12-21"),
            new Transaction(-2269291.76, "1991-03-04"),
            new Transaction(7690643.69, "1991-03-31"),
            new Transaction(2054482.96, "1991-07-02"),
            new Transaction(-9449616.10, "1991-07-15"),
            new Transaction(-2712320.67, "1991-07-26"),
            new Transaction(-1979650.89, "1991-07-29"),
            new Transaction(6437154.62, "1991-10-28"),
            new Transaction(-499871.45, "1992-02-06"),
            new Transaction(-6104392.51, "1992-03-27"),
            new Transaction(-6355958.76, "1992-06-07"),
            new Transaction(-845411.25, "1992-08-01"),
            new Transaction(-2850474.42, "1992-09-02"),
            new Transaction(1801602.95, "1992-11-19"),
            new Transaction(-3811911.04, "1993-01-07"),
            new Transaction(4082587.43, "1993-03-24"),
            new Transaction(-4052279.43, "1993-04-09"),
            new Transaction(-6706374.97, "1993-04-15"),
            new Transaction(-2723992.25, "1993-06-19"),
            new Transaction(-6529995.34, "1993-06-19"),
            new Transaction(-1476545.77, "1993-08-16"),
            new Transaction(-5666292.47, "1993-11-23"),
            new Transaction(7452517.11, "1994-02-17"),
            new Transaction(-4557301.13, "1994-05-09"),
            new Transaction(9440997.12, "1994-07-06"),
            new Transaction(-1521857.38, "1994-08-09"),
            new Transaction(-8487197.88, "1994-09-09"),
            new Transaction(-9512611.78, "1994-10-28"),
            new Transaction(-5521638.55, "1995-01-20"),
            new Transaction(-9167743.77, "1995-03-27"),
            new Transaction(-757386.79, "1995-05-21"),
            new Transaction(237596.14, "1995-09-01"),
            new Transaction(-4153987.88, "1995-12-11"),
            new Transaction(9770340.38, "1996-01-26"),
            new Transaction(-4730806.02, "1996-03-29"),
            new Transaction(8110990.21, "1996-05-17"),
            new Transaction(9772787.13, "1996-05-27"),
            new Transaction(-7670617.86, "1996-06-27"),
            new Transaction(-4427371.73, "1996-10-01"),
            new Transaction(-5795789.47, "1996-12-20"),
            new Transaction(-3102318.36, "1997-02-07"),
            new Transaction(1101976.42, "1997-04-25"),
            new Transaction(-1531024.80, "1997-05-25"),
            new Transaction(-3814716.43, "1997-08-20"),
            new Transaction(12599421.45, "1997-10-13")
        );
        Assertions.assertEquals(-0.5072251773, rate, xirr.precision);
    }

    @Test
    void test26() {
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(
            new Transaction(-12094692.93, "1992-03-27"),
            new Transaction(2885357.42, "1992-07-02"),
            new Transaction(-3921416.92, "1992-10-12"),
            new Transaction(-545860.30, "1993-04-11"),
            new Transaction(-2140463.53, "1993-09-22"),
            new Transaction(-5160364.59, "1994-01-16"),
            new Transaction(-8003813.47, "1994-05-19"),
            new Transaction(-6321100.30, "1994-09-07"),
            new Transaction(-2819183.22, "1995-03-09"),
            new Transaction(2010443.97, "1995-08-11"),
            new Transaction(-5358712.08, "1996-01-23"),
            new Transaction(787908.30, "1996-01-23"),
            new Transaction(-9605012.71, "1996-02-28"),
            new Transaction(-7336125.84, "1996-11-01"),
            new Transaction(-9198028.77, "1996-12-27"),
            new Transaction(5569972.30, "1997-05-02"),
            new Transaction(-8875556.70, "1997-09-08"),
            new Transaction(4539349.18, "1998-03-28"),
            new Transaction(-90807.67, "1998-06-07"),
            new Transaction(8880366.03, "1999-02-21"),
            new Transaction(-8034277.29, "1999-04-17"),
            new Transaction(-7786111.60, "1999-05-18"),
            new Transaction(6707200.50, "1999-05-18"),
            new Transaction(1160584.37, "1999-05-23"),
            new Transaction(-5687443.29, "2000-01-09"),
            new Transaction(-5220129.43, "2000-02-13"),
            new Transaction(-8866074.72, "2000-07-06"),
            new Transaction(-6711494.48, "2000-07-18"),
            new Transaction(-8965381.91, "2000-10-27"),
            new Transaction(-2855269.43, "2001-02-10"),
            new Transaction(3295072.50, "2001-05-25"),
            new Transaction(-6152502.82, "2002-01-03"),
            new Transaction(-6841762.06, "2002-01-30"),
            new Transaction(4333316.70, "2002-05-09"),
            new Transaction(4707492.70, "2002-09-28"),
            new Transaction(7827676.50, "2002-11-04"),
            new Transaction(3612220.14, "2003-06-22")
        );
        Assertions.assertEquals(-0.3951693089, rate, xirr.precision);
    }

    @Test
    void test27() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-8068467.25, "1993-12-10"),
            new Transaction(4688631.69, "1994-02-09"),
            new Transaction(-2265024.84, "1994-03-25"),
            new Transaction(564304.31, "1994-05-22"),
            new Transaction(1708739.77, "1994-07-14"),
            new Transaction(4658178.57, "1994-09-20"),
            new Transaction(-844041.05, "1994-10-21"),
            new Transaction(-8252879.89, "1994-11-08"),
            new Transaction(-3467927.69, "1995-02-21"),
            new Transaction(-4851804.57, "1995-05-12"),
            new Transaction(534198.03, "1995-05-27"),
            new Transaction(186294.76, "1995-08-09"),
            new Transaction(-2506005.64, "1995-11-07"),
            new Transaction(4964644.04, "1995-12-06"),
            new Transaction(239538.25, "1996-02-15"),
            new Transaction(3870266.93, "1996-04-28"),
            new Transaction(-6500399.47, "1996-05-27"),
            new Transaction(-146759.69, "1996-08-27"),
            new Transaction(4400883.83, "1996-12-09"),
            new Transaction(-7289964.44, "1997-03-12"),
            new Transaction(-7323607.65, "1997-04-15"),
            new Transaction(-1994635.00, "1997-05-08"),
            new Transaction(-4242037.69, "1997-06-05"),
            new Transaction(8015950.49, "1997-09-23"),
            new Transaction(3254208.64, "1997-10-24"),
            new Transaction(2073271.08, "1998-01-25"),
            new Transaction(3149463.98, "1998-04-19"),
            new Transaction(-9940581.81, "1998-06-01"),
            new Transaction(3159501.60, "1998-08-15"),
            new Transaction(5404144.85, "1998-11-13"),
            new Transaction(-9747742.94, "1999-01-08"),
            new Transaction(-2601674.73, "1999-04-13"),
            new Transaction(237875.40, "1999-07-26"),
            new Transaction(-7698266.73, "1999-09-16"),
            new Transaction(-4383732.09, "1999-10-01"),
            new Transaction(-5781031.22, "1999-12-17"),
            new Transaction(7356222.21, "2000-03-16"),
            new Transaction(7405742.63, "2000-05-21"),
            new Transaction(4311169.11, "2000-05-25"),
            new Transaction(-6321940.69, "2000-07-17"),
            new Transaction(3578031.72, "2000-10-10"),
            new Transaction(-7394213.08, "2000-12-26"),
            new Transaction(9409379.96, "2001-03-30"),
            new Transaction(-358181.55, "2001-04-29"),
            new Transaction(9407333.22, "2001-05-03"),
            new Transaction(2677054.05, "2001-06-27"),
            new Transaction(8100197.55, "2001-08-06"),
            new Transaction(-5839178.71, "2001-08-21"),
            new Transaction(-9384905.37, "2001-09-25"),
            new Transaction(-7907570.40, "2001-11-23"),
            new Transaction(6666265.01, "2001-12-06"),
            new Transaction(-9125017.74, "2002-03-23"),
            new Transaction(1019503.98, "2002-05-10"),
            new Transaction(4826957.35, "2002-07-14"),
            new Transaction(-945098.39, "2002-10-12"),
            new Transaction(-1745567.88, "2003-01-16"),
            new Transaction(-166324.57, "2003-03-12"),
            new Transaction(-3126854.40, "2003-03-25"),
            new Transaction(-6405196.39, "2003-05-28"),
            new Transaction(3570481.34, "2003-09-05"),
            new Transaction(-966250.83, "2003-12-08"),
            new Transaction(1244731.94, "2004-02-11"),
            new Transaction(8778521.35, "2004-05-07"),
            new Transaction(-8899808.23, "2004-05-21"),
            new Transaction(9227160.63, "2004-06-26"),
            new Transaction(8355419.05, "2004-09-29"),
            new Transaction(6716116.09, "2004-11-23"),
            new Transaction(-2927618.00, "2005-01-22"),
            new Transaction(1165688.09, "2005-04-23"),
            new Transaction(-1560293.02, "2005-05-27"),
            new Transaction(981933.83, "2005-05-29"),
            new Transaction(-9671359.64, "2005-06-29"),
            new Transaction(-2327882.65, "2005-08-06"),
            new Transaction(-2106309.26, "2005-11-08"),
            new Transaction(1533720.44, "2005-11-13"),
            new Transaction(8147709.15, "2006-01-16"),
            new Transaction(-832551.23, "2006-02-02"),
            new Transaction(7320458.16, "2006-02-13"),
            new Transaction(-935640.41, "2006-03-26"),
            new Transaction(-8515320.34, "2006-06-10"),
            new Transaction(2692640.31, "2006-08-05"),
            new Transaction(-5095670.31, "2006-09-20"),
            new Transaction(-8153620.26, "2006-11-05"),
            new Transaction(657920.04, "2006-11-28"),
            new Transaction(585177.03, "2006-12-01"),
            new Transaction(5278671.05, "2007-01-08"),
            new Transaction(-5375247.18, "2007-01-17"),
            new Transaction(-5685904.52, "2007-04-13"),
            new Transaction(1558595.07, "2007-06-08"),
            new Transaction(14709192.62, "2007-07-04")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.11960027533325854, rate, xirr.precision);
    }

    @Test
    void test28() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-12797137.10, "2004-03-26"),
            new Transaction(-8389383.30, "2005-05-11"),
            new Transaction(6099130.70, "2005-06-09"),
            new Transaction(-3808212.69, "2005-11-22"),
            new Transaction(-301490.55, "2006-08-02"),
            new Transaction(1977949.67, "2007-10-06"),
            new Transaction(-1512074.33, "2009-02-06"),
            new Transaction(-3057383.49, "2009-08-09"),
            new Transaction(933918.72, "2009-11-18"),
            new Transaction(427417.87, "2009-11-23"),
            new Transaction(-1534910.02, "2011-03-27"),
            new Transaction(1883693.39, "2012-03-06"),
            new Transaction(-9328604.72, "2012-03-20"),
            new Transaction(-911423.21, "2012-05-08"),
            new Transaction(-9354472.15, "2013-01-07"),
            new Transaction(8018374.79, "2014-02-08"),
            new Transaction(-1328808.42, "2015-03-24"),
            new Transaction(3239189.51, "2015-08-17"),
            new Transaction(-4255347.56, "2015-12-19"),
            new Transaction(9167633.80, "2016-06-23")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.16561756092123686, rate, xirr.precision);
    }

    @Test
    void test29() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-19412684.58, "2003-07-27"),
            new Transaction(-9790237.97, "2003-11-02"),
            new Transaction(4734746.56, "2003-11-19"),
            new Transaction(-1582621.80, "2004-02-26"),
            new Transaction(-7619109.26, "2004-05-20"),
            new Transaction(4430172.55, "2004-09-09"),
            new Transaction(6008965.81, "2004-12-18"),
            new Transaction(9646459.38, "2005-02-23"),
            new Transaction(3858853.35, "2005-03-24"),
            new Transaction(-2471340.85, "2005-05-17"),
            new Transaction(-6243974.29, "2005-05-25"),
            new Transaction(-6951645.47, "2005-09-01"),
            new Transaction(-8240910.94, "2005-10-31"),
            new Transaction(8451785.90, "2005-11-07"),
            new Transaction(8296549.06, "2006-04-03"),
            new Transaction(8563753.33, "2006-06-22"),
            new Transaction(9504073.77, "2006-08-25"),
            new Transaction(633081.92, "2006-12-25"),
            new Transaction(-3388096.23, "2007-04-16"),
            new Transaction(-2714012.96, "2007-07-06"),
            new Transaction(1205364.43, "2007-10-27"),
            new Transaction(1277832.57, "2008-03-08"),
            new Transaction(-5893754.83, "2008-06-26"),
            new Transaction(7215914.74, "2008-11-24"),
            new Transaction(-8218445.40, "2009-04-20"),
            new Transaction(-1693656.41, "2009-07-11"),
            new Transaction(-7792701.41, "2009-09-05"),
            new Transaction(-5010072.03, "2009-11-01"),
            new Transaction(-5721331.90, "2010-01-13"),
            new Transaction(-6868237.72, "2010-03-06"),
            new Transaction(9047325.37, "2010-06-07"),
            new Transaction(4370133.52, "2010-09-17"),
            new Transaction(-9138491.41, "2010-12-25"),
            new Transaction(-4668528.53, "2011-03-15"),
            new Transaction(8421426.98, "2011-07-30"),
            new Transaction(5002946.07, "2011-10-26"),
            new Transaction(9090451.52, "2012-01-19"),
            new Transaction(5061716.21, "2012-04-24"),
            new Transaction(-5205537.51, "2012-08-14"),
            new Transaction(-6429266.76, "2012-08-15"),
            new Transaction(-7785830.79, "2012-12-29"),
            new Transaction(3891091.34, "2013-02-21"),
            new Transaction(-8238267.51, "2013-05-24"),
            new Transaction(1703566.16, "2013-10-24"),
            new Transaction(8698271.58, "2014-04-07"),
            new Transaction(9011787.61, "2014-08-01"),
            new Transaction(4300433.26, "2014-09-04"),
            new Transaction(5286183.46, "2014-11-26"),
            new Transaction(-5632313.92, "2015-03-13"),
            new Transaction(9551722.07, "2015-05-05"),
            new Transaction(-4430809.88, "2015-05-24"),
            new Transaction(8090703.58, "2015-09-12"),
            new Transaction(-2792940.70, "2015-11-29"),
            new Transaction(9489091.49, "2016-04-16"),
            new Transaction(4668060.66, "2016-08-28"),
            new Transaction(3652039.70, "2016-11-07"),
            new Transaction(5277822.01, "2017-02-10"),
            new Transaction(-1604818.35, "2017-06-23"),
            new Transaction(599042.48, "2017-08-11"),
            new Transaction(16177212.60, "2017-09-25")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(9.5648220181465141E-2, rate, xirr.precision);
    }

    @Test
    void test30() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-16687328.57, "2009-01-07"),
            new Transaction(7258004.83, "2009-01-27"),
            new Transaction(-7386454.51, "2009-02-25"),
            new Transaction(4295858.76, "2009-04-09"),
            new Transaction(1002360.62, "2009-07-13"),
            new Transaction(-5931622.02, "2009-11-01"),
            new Transaction(6099899.79, "2010-01-13"),
            new Transaction(7236435.19, "2010-05-18"),
            new Transaction(-3785883.54, "2010-08-26"),
            new Transaction(-1372949.41, "2010-10-16"),
            new Transaction(2253864.26, "2011-01-21"),
            new Transaction(726911.99, "2011-05-17"),
            new Transaction(4951723.32, "2011-07-18"),
            new Transaction(9624215.59, "2011-11-01"),
            new Transaction(3062728.45, "2011-11-28"),
            new Transaction(7570799.86, "2012-03-16"),
            new Transaction(2432289.73, "2012-04-16"),
            new Transaction(-7165214.51, "2012-06-25"),
            new Transaction(-5596575.62, "2012-07-03"),
            new Transaction(-6510215.19, "2012-10-09"),
            new Transaction(-2003407.42, "2012-11-16"),
            new Transaction(-7612878.50, "2012-12-07"),
            new Transaction(4612426.00, "2012-12-12"),
            new Transaction(-3458485.51, "2013-04-04"),
            new Transaction(8932044.64, "2013-06-29"),
            new Transaction(-9247743.04, "2013-09-11"),
            new Transaction(-7328542.14, "2013-11-21"),
            new Transaction(-3632500.18, "2014-01-30"),
            new Transaction(9526519.73, "2014-03-12"),
            new Transaction(5181938.63, "2014-06-06"),
            new Transaction(2620941.73, "2014-09-10"),
            new Transaction(-8211570.75, "2014-10-03"),
            new Transaction(-5882133.84, "2014-10-17"),
            new Transaction(-672065.03, "2014-11-16"),
            new Transaction(-6001052.62, "2015-02-23"),
            new Transaction(-5972429.70, "2015-04-17"),
            new Transaction(9082054.63, "2015-04-22"),
            new Transaction(2008809.29, "2015-07-28"),
            new Transaction(6537509.36, "2015-09-14"),
            new Transaction(2881580.80, "2016-01-04"),
            new Transaction(-8544170.21, "2016-05-04"),
            new Transaction(491012.94, "2016-06-16"),
            new Transaction(-9253930.48, "2016-09-13"),
            new Transaction(9154851.12, "2016-09-30"),
            new Transaction(-7198359.37, "2016-12-14"),
            new Transaction(5392098.50, "2017-04-12"),
            new Transaction(-5677322.10, "2017-06-10"),
            new Transaction(7024218.20, "2017-07-16"),
            new Transaction(-493404.55, "2017-09-18"),
            new Transaction(-561545.85, "2017-12-03"),
            new Transaction(8983330.26, "2018-01-06"),
            new Transaction(7965811.41, "2018-02-24"),
            new Transaction(9336683.83, "2018-03-09"),
            new Transaction(-2294393.34, "2018-04-07"),
            new Transaction(-5490326.49, "2018-06-03"),
            new Transaction(-5345938.07, "2018-06-09"),
            new Transaction(1673297.47, "2018-08-09"),
            new Transaction(-5862687.29, "2018-08-21"),
            new Transaction(1349480.61, "2018-11-03"),
            new Transaction(-3840925.28, "2019-03-05"),
            new Transaction(5270350.39, "2019-05-27"),
            new Transaction(-4630429.95, "2019-07-21"),
            new Transaction(-6535502.36, "2019-10-30"),
            new Transaction(-6810522.49, "2020-02-15"),
            new Transaction(-3820996.06, "2020-04-18"),
            new Transaction(-834116.75, "2020-05-11"),
            new Transaction(-1917921.49, "2020-07-02"),
            new Transaction(-2225601.57, "2020-07-09"),
            new Transaction(1368121.21, "2020-08-19"),
            new Transaction(5995390.68, "2020-09-20"),
            new Transaction(3423900.31, "2020-11-27"),
            new Transaction(3283674.94, "2020-12-08"),
            new Transaction(-4733177.96, "2021-03-05"),
            new Transaction(-9970745.34, "2021-03-09"),
            new Transaction(7975706.37, "2021-04-18"),
            new Transaction(-3300676.29, "2021-07-18"),
            new Transaction(8447097.95, "2021-07-27"),
            new Transaction(4125543.54, "2021-10-07")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.25586123215034606, rate, xirr.precision);
    }

    @Test
    void test31() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-16207253.53, "1998-07-13"),
            new Transaction(6988790.39, "1998-11-16"),
            new Transaction(-4453494.71, "1999-01-25"),
            new Transaction(9018523.73, "1999-05-17"),
            new Transaction(-9882510.54, "1999-07-08"),
            new Transaction(1458397.24, "1999-10-25"),
            new Transaction(9638687.50, "2000-03-14"),
            new Transaction(9208572.03, "2000-03-15"),
            new Transaction(7926366.71, "2000-04-18"),
            new Transaction(-6523195.52, "2000-08-09"),
            new Transaction(5657212.45, "2000-08-12"),
            new Transaction(9392805.74, "2000-10-23"),
            new Transaction(1383261.09, "2001-02-04"),
            new Transaction(-7585613.37, "2001-05-20"),
            new Transaction(-4002818.90, "2001-06-30"),
            new Transaction(9010794.02, "2001-08-18"),
            new Transaction(7118218.71, "2001-11-01"),
            new Transaction(8706675.63, "2001-12-13"),
            new Transaction(-6462683.10, "2002-05-12"),
            new Transaction(-5362805.60, "2002-07-07"),
            new Transaction(-7883082.91, "2002-08-16"),
            new Transaction(-8488649.05, "2002-11-03"),
            new Transaction(-2706549.28, "2003-02-26"),
            new Transaction(9777176.44, "2003-06-08"),
            new Transaction(3714174.85, "2003-08-29"),
            new Transaction(-9835042.39, "2003-11-27"),
            new Transaction(1413286.23, "2004-03-08"),
            new Transaction(-6906179.58, "2004-07-24"),
            new Transaction(-8907330.30, "2004-11-28"),
            new Transaction(-1086685.65, "2005-02-14"),
            new Transaction(-5127423.45, "2005-07-16"),
            new Transaction(4784526.86, "2005-10-03"),
            new Transaction(-8230548.96, "2005-10-25"),
            new Transaction(5957214.89, "2006-03-10"),
            new Transaction(3647060.42, "2006-05-08"),
            new Transaction(7552335.59, "2006-07-14"),
            new Transaction(6993817.37, "2006-10-24"),
            new Transaction(5292577.09, "2007-02-02"),
            new Transaction(-8485999.43, "2007-02-10"),
            new Transaction(1678284.34, "2007-07-17"),
            new Transaction(780356.46, "2007-08-08"),
            new Transaction(298889.53, "2007-09-27"),
            new Transaction(-7927544.83, "2007-10-24"),
            new Transaction(-6771299.57, "2007-11-22"),
            new Transaction(744183.71, "2008-04-11"),
            new Transaction(-5901994.75, "2008-05-24"),
            new Transaction(-6029735.20, "2008-09-23"),
            new Transaction(-5056468.78, "2008-11-08"),
            new Transaction(-6109994.79, "2009-01-25"),
            new Transaction(-2224987.73, "2009-06-04"),
            new Transaction(-5829483.34, "2009-06-29"),
            new Transaction(-8744732.97, "2009-06-30"),
            new Transaction(-9209692.34, "2009-07-12"),
            new Transaction(4357171.83, "2009-12-06"),
            new Transaction(3308537.94, "2010-02-19"),
            new Transaction(7049868.93, "2010-03-16"),
            new Transaction(3643556.88, "2010-08-11"),
            new Transaction(3587097.90, "2011-01-03"),
            new Transaction(-6504144.95, "2011-03-05"),
            new Transaction(6217313.05, "2011-08-07"),
            new Transaction(-3535151.22, "2011-10-29"),
            new Transaction(3641579.79, "2012-02-20"),
            new Transaction(13577310.06, "2012-04-12")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.2266424988608646, rate, xirr.precision);
    }

    @Test
    void test32() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-712337.14, "1989-01-08"),
            new Transaction(9175085.91, "1989-04-29"),
            new Transaction(-4810671.40, "1989-07-10"),
            new Transaction(-4646571.29, "1989-10-03"),
            new Transaction(9962388.22, "1990-01-01"),
            new Transaction(-8118062.79, "1990-02-04"),
            new Transaction(-3461568.93, "1990-04-09"),
            new Transaction(-4015063.72, "1990-04-27"),
            new Transaction(-5959710.09, "1990-05-07"),
            new Transaction(288662.02, "1990-05-14"),
            new Transaction(-8332239.61, "1990-09-09"),
            new Transaction(-6008676.61, "1990-11-05"),
            new Transaction(3370830.68, "1990-12-06"),
            new Transaction(8394031.93, "1991-01-24"),
            new Transaction(7462202.19, "1991-02-25"),
            new Transaction(7746297.93, "1991-06-14"),
            new Transaction(7683588.93, "1991-09-14"),
            new Transaction(-356057.14, "1991-11-24"),
            new Transaction(144511.51, "1992-01-22"),
            new Transaction(9690252.99, "1992-04-26"),
            new Transaction(6661182.48, "1992-05-29"),
            new Transaction(7537928.34, "1992-07-26"),
            new Transaction(-8962948.38, "1992-08-04"),
            new Transaction(-3416378.88, "1992-10-09"),
            new Transaction(-8313075.88, "1992-10-09"),
            new Transaction(-6149073.04, "1993-01-29"),
            new Transaction(3282529.91, "1993-03-07"),
            new Transaction(-2145044.49, "1993-06-26"),
            new Transaction(-7567488.88, "1993-08-12"),
            new Transaction(5346461.71, "1993-09-15"),
            new Transaction(-973817.17, "1993-12-19"),
            new Transaction(-5298945.55, "1994-02-06"),
            new Transaction(3597297.02, "1994-02-24"),
            new Transaction(-6737884.83, "1994-05-25"),
            new Transaction(1177931.11, "1994-08-20"),
            new Transaction(-9451321.32, "1994-08-25"),
            new Transaction(1206398.74, "1994-11-25"),
            new Transaction(4322245.28, "1994-12-13"),
            new Transaction(4883827.26, "1995-02-21"),
            new Transaction(1300945.62, "1995-02-25"),
            new Transaction(1974538.84, "1995-05-04"),
            new Transaction(1009243.62, "1995-06-18"),
            new Transaction(1331384.21, "1995-07-02"),
            new Transaction(-7390800.28, "1995-07-16"),
            new Transaction(-835155.91, "1995-09-04"),
            new Transaction(-9300274.64, "1995-10-23"),
            new Transaction(-2748115.77, "1996-02-07"),
            new Transaction(6700052.34, "1996-02-25"),
            new Transaction(-2093708.01, "1996-04-27"),
            new Transaction(-9218011.78, "1996-05-08"),
            new Transaction(-7053480.09, "1996-05-27"),
            new Transaction(847319.16, "1996-08-27"),
            new Transaction(2971828.73, "1996-10-12"),
            new Transaction(4337970.29, "1996-12-16"),
            new Transaction(-4777672.15, "1997-04-11"),
            new Transaction(4559732.28, "1997-06-30"),
            new Transaction(1305499.80, "1997-08-17"),
            new Transaction(-9881474.04, "1997-12-09"),
            new Transaction(-2008430.59, "1998-01-08"),
            new Transaction(-2798189.56, "1998-01-08"),
            new Transaction(6342088.50, "1998-02-04"),
            new Transaction(8951536.26, "1998-03-11"),
            new Transaction(8801870.56, "1998-03-20"),
            new Transaction(-4914303.30, "1998-05-16"),
            new Transaction(7842166.77, "1998-07-14"),
            new Transaction(-1954666.93, "1998-10-14"),
            new Transaction(-5731105.26, "1998-12-02"),
            new Transaction(-6319217.73, "1999-03-17"),
            new Transaction(1314431.05, "1999-07-03"),
            new Transaction(1647748.30, "1999-09-30"),
            new Transaction(-6793939.89, "1999-12-20"),
            new Transaction(1123637.01, "2000-01-04"),
            new Transaction(-3788137.40, "2000-04-03"),
            new Transaction(-1886681.64, "2000-05-27"),
            new Transaction(2055675.06, "2000-07-11"),
            new Transaction(209755.13, "2000-10-03"),
            new Transaction(-9945529.26, "2000-10-24"),
            new Transaction(-513223.40, "2001-02-16"),
            new Transaction(8500989.63, "2001-06-06"),
            new Transaction(-7491474.57, "2001-06-20"),
            new Transaction(-6334441.87, "2001-08-24"),
            new Transaction(-7717282.54, "2001-10-13"),
            new Transaction(-8796669.91, "2001-11-01"),
            new Transaction(8995021.90, "2002-01-05")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(2.7611604532175344, rate, xirr.precision);
    }

    @Test
    void test33() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-19319578.87, "1985-08-28"),
            new Transaction(554939.43, "1986-01-13"),
            new Transaction(-4654006.10, "1986-04-11"),
            new Transaction(-1426220.73, "1986-06-23"),
            new Transaction(4045888.87, "1986-07-06"),
            new Transaction(-2135402.60, "1986-11-14"),
            new Transaction(-788325.31, "1987-01-18"),
            new Transaction(-9435365.83, "1987-05-13"),
            new Transaction(-490876.09, "1987-09-12"),
            new Transaction(-3562794.51, "1987-11-26"),
            new Transaction(6868402.89, "1988-02-03"),
            new Transaction(412773.85, "1988-05-13"),
            new Transaction(-5144200.25, "1988-08-20"),
            new Transaction(-7182567.57, "1988-12-17"),
            new Transaction(8323158.59, "1989-02-19"),
            new Transaction(-4850036.49, "1989-06-30"),
            new Transaction(-3570744.86, "1989-07-16"),
            new Transaction(-5159042.98, "1989-11-20"),
            new Transaction(-1190295.65, "1990-02-16"),
            new Transaction(-1605225.76, "1990-05-15"),
            new Transaction(277659.74, "1990-05-28"),
            new Transaction(-9565761.15, "1990-08-07"),
            new Transaction(4972172.13, "1990-11-03"),
            new Transaction(-7072089.70, "1990-11-10"),
            new Transaction(2338012.44, "1991-02-28"),
            new Transaction(-3119503.24, "1991-04-08"),
            new Transaction(3984189.04, "1991-08-16"),
            new Transaction(-5046906.52, "1992-01-03"),
            new Transaction(2204318.64, "1992-03-30"),
            new Transaction(9435213.56, "1992-03-30"),
            new Transaction(3109156.35, "1992-08-10"),
            new Transaction(-3307834.89, "1992-10-29"),
            new Transaction(3395330.93, "1993-03-19"),
            new Transaction(-5023920.79, "1993-05-20"),
            new Transaction(5180146.88, "1993-09-27"),
            new Transaction(-4747447.68, "1993-12-24"),
            new Transaction(8562906.89, "1994-04-23"),
            new Transaction(-4351086.85, "1994-05-30"),
            new Transaction(5886460.28, "1994-10-02"),
            new Transaction(-6643971.60, "1995-01-10"),
            new Transaction(-7185324.18, "1995-04-02"),
            new Transaction(2092666.85, "1995-07-05"),
            new Transaction(8057998.66, "1995-11-11"),
            new Transaction(-3074318.59, "1996-03-22"),
            new Transaction(-9881637.62, "1996-06-18"),
            new Transaction(5398242.38, "1996-07-16"),
            new Transaction(5083385.38, "1996-09-03"),
            new Transaction(-9676436.95, "1997-01-10"),
            new Transaction(-7436527.59, "1997-03-08"),
            new Transaction(971346.62, "1997-07-11"),
            new Transaction(-4628986.82, "1997-11-28"),
            new Transaction(-7473093.51, "1997-11-29"),
            new Transaction(-7341587.27, "1997-12-16"),
            new Transaction(2488539.10, "1998-01-28"),
            new Transaction(8269405.61, "1998-03-31"),
            new Transaction(-6665505.83, "1998-08-18"),
            new Transaction(7709898.23, "1998-10-25"),
            new Transaction(499500.08, "1999-02-27"),
            new Transaction(-1844596.35, "1999-06-28"),
            new Transaction(-5792304.99, "1999-07-27"),
            new Transaction(-2907586.41, "1999-11-03"),
            new Transaction(-5009275.13, "2000-03-06"),
            new Transaction(5737856.28, "2000-06-10"),
            new Transaction(-7115305.91, "2000-08-25"),
            new Transaction(-3756226.15, "2001-01-12"),
            new Transaction(-4214222.27, "2001-01-23"),
            new Transaction(6783873.89, "2001-03-24"),
            new Transaction(-1514989.61, "2001-08-08"),
            new Transaction(-2195942.42, "2001-12-20"),
            new Transaction(17514527.08, "2002-02-09")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.2683031264566783, rate, xirr.precision);
    }

    @Test
    void test34() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-18485843.13, "1996-10-03"),
            new Transaction(1859387.09, "1997-02-01"),
            new Transaction(3566888.68, "1997-04-27"),
            new Transaction(-2532784.98, "1997-05-01"),
            new Transaction(716954.24, "1997-07-25"),
            new Transaction(-7487073.10, "1997-08-28"),
            new Transaction(-8703614.81, "1997-10-19"),
            new Transaction(-2945267.12, "1997-11-05"),
            new Transaction(7567227.29, "1998-01-14"),
            new Transaction(167216.32, "1998-05-14"),
            new Transaction(-2258242.34, "1998-07-01"),
            new Transaction(7230008.84, "1998-07-31"),
            new Transaction(5537629.87, "1998-09-10"),
            new Transaction(2096474.43, "1998-10-10"),
            new Transaction(-1168654.39, "1998-11-06"),
            new Transaction(-3199134.94, "1999-01-27"),
            new Transaction(7844691.48, "1999-04-17"),
            new Transaction(-1074239.75, "1999-07-06"),
            new Transaction(-5546375.21, "1999-10-27"),
            new Transaction(-5013267.23, "1999-12-26"),
            new Transaction(-3886297.22, "2000-03-26"),
            new Transaction(-3355102.19, "2000-04-25"),
            new Transaction(-9567561.50, "2000-06-30"),
            new Transaction(3997508.07, "2000-10-15"),
            new Transaction(2292010.92, "2000-10-30"),
            new Transaction(3763172.17, "2001-02-16"),
            new Transaction(-3323393.37, "2001-03-11"),
            new Transaction(766783.22, "2001-07-03"),
            new Transaction(-2216707.14, "2001-08-07"),
            new Transaction(-2730264.82, "2001-11-16"),
            new Transaction(-4328233.83, "2001-12-10"),
            new Transaction(-7723678.40, "2002-01-01"),
            new Transaction(4922894.17, "2002-04-16"),
            new Transaction(-4264177.37, "2002-06-27"),
            new Transaction(-5018037.71, "2002-07-09"),
            new Transaction(-4610593.69, "2002-09-30"),
            new Transaction(-426542.03, "2002-11-23"),
            new Transaction(-8553858.22, "2003-02-21"),
            new Transaction(-1317403.68, "2003-05-11"),
            new Transaction(-1139517.64, "2003-08-07"),
            new Transaction(7169710.69, "2003-09-01"),
            new Transaction(-6084179.79, "2003-12-18"),
            new Transaction(4956015.68, "2004-01-09"),
            new Transaction(-3689992.79, "2004-02-04"),
            new Transaction(4141994.78, "2004-03-22"),
            new Transaction(1601288.88, "2004-04-05"),
            new Transaction(2382907.18, "2004-07-06"),
            new Transaction(-5111957.69, "2004-07-26"),
            new Transaction(9121363.98, "2004-10-09"),
            new Transaction(2435863.25, "2004-12-03"),
            new Transaction(-6086399.79, "2005-01-07"),
            new Transaction(-6086073.20, "2005-02-17"),
            new Transaction(-5923445.71, "2005-05-27"),
            new Transaction(3421636.05, "2005-08-20"),
            new Transaction(5923772.94, "2005-08-29"),
            new Transaction(-8641900.19, "2005-10-30"),
            new Transaction(-9613952.38, "2005-11-06"),
            new Transaction(1652808.61, "2006-02-05"),
            new Transaction(-6170107.99, "2006-04-11"),
            new Transaction(-3450947.57, "2006-07-19"),
            new Transaction(4678597.81, "2006-10-26"),
            new Transaction(-5228891.57, "2006-12-18"),
            new Transaction(-671567.60, "2007-02-07"),
            new Transaction(-6408333.43, "2007-04-08"),
            new Transaction(4887835.22, "2007-05-08"),
            new Transaction(-9819946.49, "2007-06-18"),
            new Transaction(-2392051.60, "2007-09-13"),
            new Transaction(-1942946.10, "2007-10-21"),
            new Transaction(-234171.86, "2007-11-10"),
            new Transaction(-6957252.03, "2008-01-28"),
            new Transaction(-8642308.15, "2008-02-02"),
            new Transaction(-189826.25, "2008-03-29"),
            new Transaction(7283159.80, "2008-03-29"),
            new Transaction(-8003169.14, "2008-05-09"),
            new Transaction(8715866.37, "2008-07-28"),
            new Transaction(2783292.78, "2008-11-08"),
            new Transaction(8274927.59, "2009-01-05"),
            new Transaction(1978989.58, "2009-01-14"),
            new Transaction(4800486.26, "2009-05-15"),
            new Transaction(1654505.54, "2009-08-17"),
            new Transaction(14278786.12, "2009-09-12")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.2198494606407331, rate, xirr.precision);
    }

    @Test
    void test35() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-4019572.75, "1986-03-22"),
            new Transaction(4649413.50, "1986-05-02"),
            new Transaction(-8111033.27, "1986-10-22"),
            new Transaction(784821.25, "1987-02-10"),
            new Transaction(-1584527.91, "1987-04-01"),
            new Transaction(-8592662.32, "1987-06-15"),
            new Transaction(3654154.88, "1987-07-08"),
            new Transaction(8455876.90, "1987-12-01"),
            new Transaction(-2980332.37, "1988-05-26"),
            new Transaction(-1045126.66, "1988-07-12"),
            new Transaction(-9611409.80, "1989-03-16"),
            new Transaction(-9675139.70, "1989-05-25"),
            new Transaction(-939774.65, "1989-10-03"),
            new Transaction(3594812.59, "1990-01-23"),
            new Transaction(-5098959.72, "1990-08-22"),
            new Transaction(-4989398.27, "1991-03-12"),
            new Transaction(8044391.78, "1991-10-02"),
            new Transaction(6906752.47, "1992-04-19"),
            new Transaction(3029373.67, "1992-05-10"),
            new Transaction(-567471.76, "1992-11-22"),
            new Transaction(6061101.81, "1993-07-12"),
            new Transaction(6241166.91, "1993-08-15"),
            new Transaction(-2599730.96, "1993-11-13"),
            new Transaction(9149041.15, "1994-02-05"),
            new Transaction(-4961373.05, "1994-09-17"),
            new Transaction(-8256401.17, "1994-09-29"),
            new Transaction(4538163.00, "1994-11-09"),
            new Transaction(6057685.53, "1994-11-09"),
            new Transaction(1406199.41, "1995-04-10"),
            new Transaction(-4622041.29, "1995-08-23"),
            new Transaction(-9858744.19, "1996-02-24"),
            new Transaction(470134.29, "1996-03-20"),
            new Transaction(8144897.52, "1996-03-23"),
            new Transaction(5483204.86, "1996-10-28"),
            new Transaction(-5153462.85, "1997-06-30"),
            new Transaction(-7719940.99, "1997-08-12"),
            new Transaction(-1242352.99, "1997-08-26"),
            new Transaction(6231355.45, "1997-11-19"),
            new Transaction(5800606.23, "1998-04-11"),
            new Transaction(2819021.53, "1998-07-04")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-6.9466680288314835E-4, rate, xirr.precision);
    }

    @Test
    void test36() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-6707355.62, "1989-08-22"),
            new Transaction(-4592935.92, "1990-01-27"),
            new Transaction(-8418086.67, "1990-06-29"),
            new Transaction(-7583601.01, "1990-08-09"),
            new Transaction(-7824262.89, "1990-10-01"),
            new Transaction(5532845.35, "1990-11-28"),
            new Transaction(-2977631.81, "1990-12-29"),
            new Transaction(4823361.84, "1991-03-18"),
            new Transaction(6450838.27, "1991-08-01"),
            new Transaction(-722234.71, "1991-10-14"),
            new Transaction(142414.80, "1992-03-28"),
            new Transaction(-1169936.36, "1992-08-20"),
            new Transaction(2072792.55, "1993-01-21"),
            new Transaction(1091614.31, "1993-02-21"),
            new Transaction(-9366229.08, "1993-04-17"),
            new Transaction(2278788.25, "1993-07-18"),
            new Transaction(652640.07, "1993-07-20"),
            new Transaction(7764443.37, "1994-01-11"),
            new Transaction(-2909239.20, "1994-01-29"),
            new Transaction(8684759.72, "1994-05-06"),
            new Transaction(-1090530.05, "1994-05-21"),
            new Transaction(-3049870.65, "1994-09-11"),
            new Transaction(-3998245.40, "1994-12-22"),
            new Transaction(-5923927.39, "1995-05-01"),
            new Transaction(-4811079.03, "1995-06-18"),
            new Transaction(-7442489.24, "1995-10-07"),
            new Transaction(-7322645.34, "1996-03-20"),
            new Transaction(1538121.77, "1996-07-25"),
            new Transaction(1135482.14, "1996-11-18"),
            new Transaction(2665506.98, "1997-02-18"),
            new Transaction(-7027416.82, "1997-04-06"),
            new Transaction(-113116.82, "1997-04-10"),
            new Transaction(5535217.93, "1997-04-24"),
            new Transaction(6822902.27, "1997-08-25"),
            new Transaction(-6374057.63, "1997-11-30"),
            new Transaction(-5974745.52, "1997-12-03"),
            new Transaction(-6692647.18, "1998-01-23"),
            new Transaction(363345.34, "1998-06-01"),
            new Transaction(-9793479.71, "1998-08-10"),
            new Transaction(9400338.60, "1998-09-20"),
            new Transaction(4282172.97, "1999-02-08"),
            new Transaction(-1296978.40, "1999-02-16"),
            new Transaction(7925408.82, "1999-08-01"),
            new Transaction(8970580.60, "1999-08-24"),
            new Transaction(8176802.37, "1999-11-04"),
            new Transaction(-3507420.28, "2000-04-22"),
            new Transaction(1476583.00, "2000-05-01"),
            new Transaction(6301986.34, "2000-10-07"),
            new Transaction(833215.37, "2001-01-04"),
            new Transaction(-2149769.28, "2001-04-08"),
            new Transaction(-1885287.97, "2001-09-18"),
            new Transaction(8234380.90, "2001-10-11"),
            new Transaction(-7929002.81, "2002-03-14"),
            new Transaction(-902131.21, "2002-08-06"),
            new Transaction(5113513.49, "2002-09-03"),
            new Transaction(1984470.42, "2003-02-17")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.07081951581456097, rate, xirr.precision);
    }

    @Test
    void test37() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-4212398.72, "1986-01-04"),
            new Transaction(-2274834.82, "1986-06-05"),
            new Transaction(7478271.58, "1986-11-22"),
            new Transaction(-6334715.63, "1987-01-15"),
            new Transaction(7609176.34, "1987-02-23"),
            new Transaction(-9782409.22, "1987-08-17"),
            new Transaction(-9871704.80, "1988-02-28"),
            new Transaction(6729295.27, "1988-08-23"),
            new Transaction(1738791.67, "1988-11-02"),
            new Transaction(9137927.65, "1989-04-16"),
            new Transaction(-2299990.49, "1989-08-06"),
            new Transaction(-9280954.12, "1990-02-02"),
            new Transaction(-9112678.72, "1990-05-25"),
            new Transaction(5231210.88, "1990-06-13"),
            new Transaction(-2332297.60, "1990-12-12"),
            new Transaction(-6082602.27, "1991-06-18"),
            new Transaction(-9558595.83, "1991-09-09"),
            new Transaction(7840802.28, "1991-10-25"),
            new Transaction(-5500963.48, "1992-01-28"),
            new Transaction(4281833.29, "1992-05-15"),
            new Transaction(-2201722.70, "1992-07-10"),
            new Transaction(-2177161.73, "1992-08-12"),
            new Transaction(-8516541.13, "1993-01-25"),
            new Transaction(9295928.34, "1993-02-11"),
            new Transaction(-5633543.25, "1993-05-17"),
            new Transaction(-2043832.98, "1993-05-19"),
            new Transaction(4901647.09, "1993-06-07"),
            new Transaction(839917.34, "1993-12-18"),
            new Transaction(6320794.70, "1994-02-18"),
            new Transaction(-9095659.79, "1994-03-14"),
            new Transaction(-1734396.78, "1994-04-14"),
            new Transaction(-9420065.23, "1994-05-17"),
            new Transaction(-1945147.38, "1994-08-17"),
            new Transaction(7379623.51, "1995-01-31"),
            new Transaction(2553571.92, "1995-07-22"),
            new Transaction(-3009159.32, "1996-01-27"),
            new Transaction(7343006.44, "1996-06-11"),
            new Transaction(-5306322.77, "1996-06-20"),
            new Transaction(-2567332.85, "1997-01-03"),
            new Transaction(-9519677.75, "1997-05-09"),
            new Transaction(-9846051.71, "1997-09-06"),
            new Transaction(-3912541.97, "1998-02-06"),
            new Transaction(-7428579.60, "1998-06-05"),
            new Transaction(6072861.52, "1998-08-12"),
            new Transaction(9836675.22, "1999-01-04"),
            new Transaction(8722168.65, "1999-06-10"),
            new Transaction(5589930.04, "1999-08-16")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.20576562712586846, rate, xirr.precision);
    }

    @Test
    void test38() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-1491198.62, "2005-09-28"),
            new Transaction(-1591913.44, "2005-12-14"),
            new Transaction(-5061255.43, "2006-03-27"),
            new Transaction(-1645135.41, "2006-05-18"),
            new Transaction(-5558756.75, "2006-06-17"),
            new Transaction(5743316.03, "2006-09-08"),
            new Transaction(-5391772.21, "2006-09-24"),
            new Transaction(9913579.09, "2006-12-23"),
            new Transaction(2302756.75, "2007-01-30"),
            new Transaction(-5583690.32, "2007-02-21"),
            new Transaction(8374402.53, "2007-06-06"),
            new Transaction(-1663910.73, "2007-06-26"),
            new Transaction(-8773232.80, "2007-07-04"),
            new Transaction(-4082992.23, "2007-09-27"),
            new Transaction(-1331034.79, "2007-12-23"),
            new Transaction(-7664487.81, "2008-03-13"),
            new Transaction(9562010.80, "2008-07-05"),
            new Transaction(2722352.83, "2008-10-17"),
            new Transaction(-8561388.34, "2009-01-24"),
            new Transaction(-8183046.04, "2009-04-28"),
            new Transaction(-8236058.47, "2009-07-26"),
            new Transaction(4793889.81, "2009-10-24"),
            new Transaction(8551986.00, "2010-01-24"),
            new Transaction(833019.94, "2010-03-31"),
            new Transaction(-6422730.88, "2010-07-11"),
            new Transaction(4634820.04, "2010-11-13"),
            new Transaction(-2094113.80, "2011-03-03"),
            new Transaction(7500562.10, "2011-04-07"),
            new Transaction(-1542460.62, "2011-07-02"),
            new Transaction(7707652.99, "2011-08-30"),
            new Transaction(-2338100.33, "2011-09-17"),
            new Transaction(-3519182.85, "2011-11-25"),
            new Transaction(-1960036.19, "2011-11-29"),
            new Transaction(1977868.20, "2012-03-29"),
            new Transaction(1274049.52, "2012-04-06"),
            new Transaction(9005460.63, "2012-06-20"),
            new Transaction(1631798.62, "2012-09-02"),
            new Transaction(9590768.17, "2012-12-17"),
            new Transaction(4835332.41, "2013-01-02"),
            new Transaction(9724075.99, "2013-02-13"),
            new Transaction(-872465.52, "2013-06-17"),
            new Transaction(-8502946.27, "2013-09-20"),
            new Transaction(8260529.40, "2014-01-08"),
            new Transaction(-6960265.37, "2014-03-16"),
            new Transaction(4721677.36, "2014-06-03"),
            new Transaction(-6672601.51, "2014-08-08"),
            new Transaction(6762651.11, "2014-10-15"),
            new Transaction(-4496952.33, "2015-02-10"),
            new Transaction(359194.69, "2015-06-09"),
            new Transaction(4708364.04, "2015-07-08"),
            new Transaction(-2766499.46, "2015-10-31"),
            new Transaction(-6969401.52, "2015-12-16"),
            new Transaction(885725.31, "2016-03-14"),
            new Transaction(1091291.15, "2016-06-06"),
            new Transaction(6442313.21, "2016-07-22"),
            new Transaction(-4449727.23, "2016-10-21"),
            new Transaction(8090333.94, "2016-12-07"),
            new Transaction(2766655.42, "2016-12-26"),
            new Transaction(-5355557.08, "2017-01-05"),
            new Transaction(4615888.80, "2017-03-20"),
            new Transaction(-1756043.41, "2017-07-02"),
            new Transaction(1599953.13, "2017-07-05"),
            new Transaction(-4567237.11, "2017-08-02"),
            new Transaction(-6340116.36, "2017-08-17"),
            new Transaction(-4116364.52, "2017-12-15"),
            new Transaction(3534198.29, "2018-03-31"),
            new Transaction(8451650.67, "2018-05-30"),
            new Transaction(2797684.16, "2018-08-05"),
            new Transaction(-7999406.24, "2018-09-28"),
            new Transaction(6329705.25, "2018-10-01"),
            new Transaction(-5489337.67, "2018-10-08"),
            new Transaction(1812800.54, "2018-10-12"),
            new Transaction(9598223.91, "2018-12-19"),
            new Transaction(-2363214.67, "2019-02-16"),
            new Transaction(-9789735.57, "2019-03-08"),
            new Transaction(-6234164.76, "2019-05-04"),
            new Transaction(6615236.39, "2019-08-21"),
            new Transaction(2348843.75, "2019-12-03")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(8.7071540951728824E-2, rate, xirr.precision);
    }

    @Test
    void test39() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-9405432.12, "1990-06-04"),
            new Transaction(-9447529.02, "1990-08-14"),
            new Transaction(-9505032.43, "1990-10-03"),
            new Transaction(-7547833.25, "1990-11-08"),
            new Transaction(8440756.94, "1991-02-28"),
            new Transaction(9625615.34, "1991-05-12"),
            new Transaction(-4842708.06, "1991-08-03"),
            new Transaction(883098.02, "1991-11-10"),
            new Transaction(8853373.33, "1992-01-13"),
            new Transaction(3129429.92, "1992-02-18"),
            new Transaction(-9189200.92, "1992-04-05"),
            new Transaction(-1555451.32, "1992-04-08"),
            new Transaction(-5657972.20, "1992-04-28"),
            new Transaction(7821293.76, "1992-06-29"),
            new Transaction(-9606517.73, "1992-08-31"),
            new Transaction(4755266.30, "1992-10-29"),
            new Transaction(-3581547.47, "1993-02-13"),
            new Transaction(-4843001.65, "1993-05-31"),
            new Transaction(7790283.07, "1993-06-19"),
            new Transaction(-932452.18, "1993-08-29"),
            new Transaction(3232326.72, "1993-11-27"),
            new Transaction(-3831149.08, "1994-01-21"),
            new Transaction(-5736253.02, "1994-03-05"),
            new Transaction(-101013.99, "1994-06-12"),
            new Transaction(8600396.88, "1994-08-03"),
            new Transaction(3634715.73, "1994-08-05"),
            new Transaction(4802033.02, "1994-10-23"),
            new Transaction(1459637.64, "1994-10-29"),
            new Transaction(2471845.79, "1994-11-30"),
            new Transaction(8005686.92, "1994-12-06"),
            new Transaction(9224041.19, "1995-01-14"),
            new Transaction(-2936898.35, "1995-01-28"),
            new Transaction(3055129.48, "1995-04-30"),
            new Transaction(9892325.85, "1995-06-21"),
            new Transaction(885961.65, "1995-07-24"),
            new Transaction(-9424297.24, "1995-10-10"),
            new Transaction(2073899.14, "1996-01-05"),
            new Transaction(-6227945.26, "1996-04-02"),
            new Transaction(-9988022.10, "1996-07-05"),
            new Transaction(5092903.19, "1996-09-19"),
            new Transaction(778472.24, "1996-11-30"),
            new Transaction(6827855.39, "1996-12-29"),
            new Transaction(-550400.46, "1997-04-21"),
            new Transaction(6794330.90, "1997-05-20"),
            new Transaction(9710985.16, "1997-06-21"),
            new Transaction(3515471.78, "1997-10-04"),
            new Transaction(-451609.85, "1998-01-03"),
            new Transaction(5030192.48, "1998-01-16"),
            new Transaction(9773889.42, "1998-03-01"),
            new Transaction(9137709.61, "1998-03-27"),
            new Transaction(-1460383.13, "1998-05-16"),
            new Transaction(-3902819.88, "1998-07-19"),
            new Transaction(1808418.92, "1998-07-22"),
            new Transaction(6825744.61, "1998-09-21"),
            new Transaction(4285521.87, "1998-10-22"),
            new Transaction(4193396.96, "1998-11-09"),
            new Transaction(6140583.12, "1998-12-07"),
            new Transaction(-4029359.60, "1999-02-11"),
            new Transaction(522771.48, "1999-04-13"),
            new Transaction(1127755.57, "1999-07-03"),
            new Transaction(-1629913.51, "1999-08-13"),
            new Transaction(1723758.31, "1999-09-24"),
            new Transaction(5037665.81, "1999-11-16"),
            new Transaction(-5488487.58, "2000-01-17"),
            new Transaction(1033117.09, "2000-01-18"),
            new Transaction(-9362010.70, "2000-03-28"),
            new Transaction(4421537.07, "2000-06-07"),
            new Transaction(-9283786.46, "2000-06-11"),
            new Transaction(2419271.34, "2000-07-26"),
            new Transaction(4587560.39, "2000-09-13"),
            new Transaction(-2048611.64, "2000-12-21"),
            new Transaction(5915527.00, "2001-02-10"),
            new Transaction(-2641977.84, "2001-05-02"),
            new Transaction(-6516915.72, "2001-05-14"),
            new Transaction(2355676.54, "2001-08-25"),
            new Transaction(599760.47, "2001-11-30"),
            new Transaction(-4830993.94, "2002-01-27"),
            new Transaction(-4070189.19, "2002-05-07"),
            new Transaction(-1592724.88, "2002-08-16"),
            new Transaction(7130968.64, "2002-11-05"),
            new Transaction(1761487.42, "2002-11-13"),
            new Transaction(-6141861.46, "2002-12-04"),
            new Transaction(8784889.36, "2003-01-19"),
            new Transaction(8464029.91, "2003-03-09"),
            new Transaction(474324.27, "2003-04-27"),
            new Transaction(2633756.18, "2003-06-01"),
            new Transaction(624461.57, "2003-06-06"),
            new Transaction(1463343.12, "2003-07-12")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.23154521584510809, rate, xirr.precision);
    }

    @Test
    void test40() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-511454.47, "1990-02-04"),
            new Transaction(3726004.37, "1991-05-06"),
            new Transaction(-8587257.47, "1992-12-04"),
            new Transaction(7413824.90, "1993-09-05"),
            new Transaction(-9964244.01, "1996-05-13"),
            new Transaction(-156092.75, "1997-11-04"),
            new Transaction(-3727334.35, "1999-04-17"),
            new Transaction(-5438559.16, "2000-12-26"),
            new Transaction(8662365.50, "2002-12-15"),
            new Transaction(9175963.26, "2002-12-24")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(8.1528991460800178E-3, rate, xirr.precision);
    }

    @Test
    void test41() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-12360466.04, "2006-08-19"),
            new Transaction(-6202690.25, "2007-02-10"),
            new Transaction(-4408729.01, "2007-07-31"),
            new Transaction(5446967.63, "2007-11-25"),
            new Transaction(-98133.90, "2007-12-22"),
            new Transaction(2641261.50, "2008-07-05"),
            new Transaction(1025963.02, "2008-09-27"),
            new Transaction(-949902.48, "2009-10-06"),
            new Transaction(-4990269.95, "2009-12-04"),
            new Transaction(1292872.47, "2010-10-19"),
            new Transaction(-5688668.27, "2010-12-30"),
            new Transaction(-9325389.69, "2011-03-08"),
            new Transaction(9876704.50, "2012-02-19"),
            new Transaction(6319525.60, "2012-03-03"),
            new Transaction(-3049561.28, "2012-12-21"),
            new Transaction(9397034.58, "2013-05-02"),
            new Transaction(9665940.93, "2013-11-03"),
            new Transaction(5014948.83, "2014-08-26"),
            new Transaction(-9941112.80, "2015-07-13"),
            new Transaction(-6745121.59, "2016-06-10"),
            new Transaction(5089270.31, "2016-09-24"),
            new Transaction(8846436.50, "2017-01-09"),
            new Transaction(-6278026.45, "2017-01-17"),
            new Transaction(2109583.00, "2017-08-13"),
            new Transaction(-2204048.08, "2018-06-03"),
            new Transaction(3157278.29, "2018-12-06")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-1.7004452645778656E-2, rate, xirr.precision);
    }

    @Test
    void test42() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-9222690.40, "1995-01-30"),
            new Transaction(9982077.54, "1995-09-16"),
            new Transaction(4756362.32, "1996-05-02"),
            new Transaction(-4962679.36, "1996-11-12"),
            new Transaction(-8714232.02, "1997-04-23"),
            new Transaction(-316319.47, "1997-11-02"),
            new Transaction(5261874.81, "1998-09-23"),
            new Transaction(9658380.38, "1999-01-26"),
            new Transaction(3724365.73, "1999-06-01"),
            new Transaction(276359.80, "1999-12-26"),
            new Transaction(8776966.34, "2000-11-07"),
            new Transaction(4870873.58, "2001-01-21"),
            new Transaction(159086.29, "2001-08-12"),
            new Transaction(-575687.04, "2002-03-08"),
            new Transaction(-966051.03, "2002-12-23"),
            new Transaction(7612744.44, "2003-10-11"),
            new Transaction(-9222962.50, "2004-07-06"),
            new Transaction(7868098.92, "2004-07-23"),
            new Transaction(-4655527.31, "2005-06-02"),
            new Transaction(9055112.93, "2005-06-29"),
            new Transaction(-5971397.46, "2006-01-23"),
            new Transaction(-9999540.46, "2006-07-25"),
            new Transaction(-6764773.14, "2006-11-14"),
            new Transaction(-1973452.80, "2007-06-21"),
            new Transaction(-2884894.18, "2007-12-25"),
            new Transaction(8761842.02, "2008-10-10"),
            new Transaction(-7175659.94, "2009-06-18"),
            new Transaction(-5465634.79, "2009-12-05"),
            new Transaction(-9460244.96, "2010-06-19"),
            new Transaction(15453556.56, "2010-11-28")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.53238244652748123, rate, xirr.precision);
    }

    @Test
    void test43() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-5994901.50, "1984-02-16"),
            new Transaction(-8881889.89, "1984-08-17"),
            new Transaction(-9755078.36, "1984-12-19"),
            new Transaction(9940204.81, "1985-06-25"),
            new Transaction(-9331877.99, "1985-09-06"),
            new Transaction(8843109.33, "1985-09-28"),
            new Transaction(5928028.48, "1985-12-15"),
            new Transaction(-5591066.64, "1986-02-28"),
            new Transaction(-4957883.54, "1986-06-27"),
            new Transaction(1453457.66, "1986-10-10"),
            new Transaction(-4069046.28, "1987-02-06"),
            new Transaction(6552632.48, "1987-08-03"),
            new Transaction(9927835.85, "1987-08-07"),
            new Transaction(2961848.61, "1987-08-09"),
            new Transaction(8851487.67, "1987-10-19"),
            new Transaction(1175561.69, "1987-11-28"),
            new Transaction(-8535960.50, "1988-01-07"),
            new Transaction(612095.96, "1988-02-17"),
            new Transaction(-6857287.19, "1988-08-22"),
            new Transaction(-5935496.42, "1988-10-13"),
            new Transaction(5107642.46, "1989-01-12"),
            new Transaction(8096325.14, "1989-06-19"),
            new Transaction(5519758.27, "1989-08-18"),
            new Transaction(-2574484.48, "1989-11-10"),
            new Transaction(6311226.46, "1990-04-04"),
            new Transaction(-9311452.24, "1990-05-19"),
            new Transaction(9967744.57, "1990-11-29"),
            new Transaction(-1106780.03, "1991-01-20"),
            new Transaction(5682372.41, "1991-01-24"),
            new Transaction(1176023.54, "1991-03-18"),
            new Transaction(-6006463.01, "1991-06-15"),
            new Transaction(1330951.63, "1991-07-24"),
            new Transaction(9528375.43, "1991-09-08"),
            new Transaction(-4653766.74, "1991-12-19"),
            new Transaction(7450307.98, "1992-01-29"),
            new Transaction(1802984.97, "1992-08-21"),
            new Transaction(-5270236.33, "1992-08-21"),
            new Transaction(963840.49, "1993-01-11"),
            new Transaction(-4012594.50, "1993-02-08"),
            new Transaction(9438932.62, "1993-09-01"),
            new Transaction(3553542.48, "1994-03-11"),
            new Transaction(-2408268.38, "1994-08-23"),
            new Transaction(5581605.77, "1994-12-09"),
            new Transaction(-7551980.85, "1995-03-21"),
            new Transaction(1454938.25, "1995-09-13"),
            new Transaction(-132879.86, "1996-02-25"),
            new Transaction(-6765303.93, "1996-06-16"),
            new Transaction(3731463.73, "1997-01-02")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.17473947405815124, rate, xirr.precision);
    }

    @Test
    void test44() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-16246997.69, "1984-03-24"),
            new Transaction(283806.58, "1985-01-16"),
            new Transaction(7186196.25, "1985-08-08"),
            new Transaction(510120.80, "1986-03-05"),
            new Transaction(-1084170.08, "1987-04-22"),
            new Transaction(411401.49, "1988-03-22"),
            new Transaction(5645122.28, "1989-01-15"),
            new Transaction(8768150.22, "1989-06-07"),
            new Transaction(4425154.04, "1989-12-08"),
            new Transaction(-6816925.49, "1990-09-30"),
            new Transaction(-7230377.60, "1991-10-30"),
            new Transaction(-3947440.61, "1991-11-09"),
            new Transaction(-6838031.84, "1993-01-16"),
            new Transaction(2506830.07, "1993-04-21"),
            new Transaction(7643768.13, "1994-07-07"),
            new Transaction(2237435.64, "1995-09-26"),
            new Transaction(-2176420.07, "1996-08-21"),
            new Transaction(6492859.75, "1997-03-18"),
            new Transaction(6841283.08, "1997-05-10"),
            new Transaction(-3881311.89, "1997-10-07"),
            new Transaction(-6660342.84, "1998-10-28"),
            new Transaction(4859118.41, "1999-07-24")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(2.9837831854820248E-2, rate, xirr.precision);
    }

    @Test
    void test45() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-12417055.02, "1999-01-16"),
            new Transaction(-7377554.63, "1999-02-19"),
            new Transaction(-3011194.86, "1999-05-31"),
            new Transaction(9737960.39, "1999-10-05"),
            new Transaction(5265587.55, "2000-02-24"),
            new Transaction(7968924.32, "2000-06-26"),
            new Transaction(-7269993.70, "2001-02-02"),
            new Transaction(-3766622.90, "2002-02-28"),
            new Transaction(984885.52, "2002-06-11"),
            new Transaction(6679040.44, "2003-08-09"),
            new Transaction(3710710.20, "2004-11-10"),
            new Transaction(-9305507.11, "2006-01-22"),
            new Transaction(-4789890.41, "2006-03-05"),
            new Transaction(-8291039.05, "2006-11-28"),
            new Transaction(7765914.97, "2007-02-14"),
            new Transaction(-4427755.86, "2007-08-18"),
            new Transaction(7541709.25, "2008-06-06"),
            new Transaction(13491815.87, "2009-08-20")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(2.2714415192604066E-2, rate, xirr.precision);
    }

    @Test
    void test46() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-9723344.02, "1993-07-02"),
            new Transaction(5560555.90, "1993-09-19"),
            new Transaction(3318434.86, "1993-10-07"),
            new Transaction(-3356095.45, "1994-01-01"),
            new Transaction(-8170452.51, "1994-04-22"),
            new Transaction(-9207455.89, "1994-04-25"),
            new Transaction(-657253.58, "1994-08-23"),
            new Transaction(-9521386.82, "1994-12-14"),
            new Transaction(-8931883.28, "1995-04-02"),
            new Transaction(-1284898.23, "1995-10-05"),
            new Transaction(267667.43, "1995-11-15"),
            new Transaction(-1549743.92, "1996-03-16"),
            new Transaction(171927.26, "1996-06-02"),
            new Transaction(-1559598.41, "1996-11-21"),
            new Transaction(7725148.14, "1997-02-17"),
            new Transaction(-9563526.02, "1997-06-05"),
            new Transaction(6038720.11, "1997-06-06"),
            new Transaction(-8510215.26, "1997-11-15"),
            new Transaction(-7700469.14, "1997-12-17"),
            new Transaction(8683870.44, "1998-04-27"),
            new Transaction(2056456.27, "1998-06-03"),
            new Transaction(5452510.56, "1998-11-27"),
            new Transaction(-2377487.99, "1999-05-16"),
            new Transaction(6137263.49, "1999-07-12"),
            new Transaction(-8773114.27, "1999-12-31"),
            new Transaction(2162571.48, "2000-05-06"),
            new Transaction(-2492063.34, "2000-05-26"),
            new Transaction(-235534.82, "2000-09-25"),
            new Transaction(-4282823.12, "2001-03-30"),
            new Transaction(-7276255.69, "2001-05-17"),
            new Transaction(-4844542.02, "2001-09-22"),
            new Transaction(-4015636.90, "2002-02-13"),
            new Transaction(-6807693.33, "2002-02-26"),
            new Transaction(-3606200.50, "2002-06-18"),
            new Transaction(-530997.34, "2002-11-02"),
            new Transaction(4979806.48, "2003-05-09"),
            new Transaction(-3322515.93, "2003-06-20"),
            new Transaction(-1171521.60, "2003-07-12"),
            new Transaction(-6016568.08, "2003-08-18"),
            new Transaction(-5552829.47, "2003-11-27"),
            new Transaction(-6365674.21, "2004-04-03"),
            new Transaction(9731457.26, "2004-09-04"),
            new Transaction(9629741.86, "2004-12-04"),
            new Transaction(-3359184.89, "2004-12-18"),
            new Transaction(1844418.23, "2005-05-21"),
            new Transaction(1077168.11, "2005-06-06"),
            new Transaction(4890911.74, "2005-07-01"),
            new Transaction(7146794.93, "2005-09-17"),
            new Transaction(445750.83, "2005-10-19"),
            new Transaction(-8129965.17, "2006-04-07"),
            new Transaction(-3835789.44, "2006-04-23"),
            new Transaction(2994038.13, "2006-07-17"),
            new Transaction(12042258.67, "2006-10-02")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.17716394015551004, rate, xirr.precision);
    }

    @Test
    void test47() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-239843.28, "1996-10-06"),
            new Transaction(3329820.15, "1998-01-22"),
            new Transaction(4652348.44, "1998-09-10"),
            new Transaction(341106.06, "1999-09-29"),
            new Transaction(-1751477.18, "2000-07-25"),
            new Transaction(-185526.42, "2001-08-13"),
            new Transaction(-2104970.24, "2002-06-14"),
            new Transaction(-1076814.98, "2002-07-06"),
            new Transaction(-2043664.76, "2004-02-28"),
            new Transaction(6074387.15, "2004-03-30"),
            new Transaction(-7966819.97, "2004-12-09"),
            new Transaction(8348839.37, "2006-12-28"),
            new Transaction(17702140.92, "2008-06-28")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(8.5216027736663804, rate, xirr.precision);
    }

    @Test
    void test48() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-15586705.00, "1998-04-08"),
            new Transaction(-9944585.98, "1998-08-02"),
            new Transaction(9016272.00, "1998-11-16"),
            new Transaction(-6327626.97, "1999-01-24"),
            new Transaction(-413355.37, "1999-05-13"),
            new Transaction(-5021636.20, "1999-08-20"),
            new Transaction(4111382.32, "1999-10-11"),
            new Transaction(-9693122.15, "2000-01-07"),
            new Transaction(-6488945.29, "2000-03-10"),
            new Transaction(5178937.80, "2000-04-10"),
            new Transaction(4871419.17, "2000-06-07"),
            new Transaction(-6351967.51, "2000-07-23"),
            new Transaction(2730636.16, "2000-11-01"),
            new Transaction(-4878364.52, "2001-03-18"),
            new Transaction(2743109.46, "2001-09-04"),
            new Transaction(-3620366.95, "2002-06-01"),
            new Transaction(2059782.87, "2002-08-16"),
            new Transaction(-7237894.41, "2003-02-28"),
            new Transaction(6279025.78, "2003-09-16"),
            new Transaction(-5911496.00, "2003-11-17"),
            new Transaction(-3440594.01, "2003-12-23"),
            new Transaction(1364713.72, "2004-08-02"),
            new Transaction(7167609.36, "2004-08-12"),
            new Transaction(3297287.45, "2005-04-18"),
            new Transaction(-8986205.58, "2005-09-25"),
            new Transaction(-5367228.86, "2005-11-27"),
            new Transaction(-9263682.63, "2006-07-12"),
            new Transaction(-5092048.93, "2007-03-02"),
            new Transaction(1472526.34, "2007-11-30"),
            new Transaction(-6020410.63, "2008-03-16"),
            new Transaction(-3746908.80, "2008-11-24"),
            new Transaction(-384146.41, "2009-04-06"),
            new Transaction(1312508.48, "2009-05-09"),
            new Transaction(-3982970.05, "2009-10-23"),
            new Transaction(-6476151.63, "2010-01-02"),
            new Transaction(9139706.36, "2010-02-02")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.7695555199469613, rate, xirr.precision);
    }

    @Test
    void test49() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-11640050.04, "1986-02-28"),
            new Transaction(-1198869.70, "1986-09-04"),
            new Transaction(-9370825.90, "1987-06-17"),
            new Transaction(-9902748.53, "1987-08-25"),
            new Transaction(1557065.98, "1988-01-06"),
            new Transaction(6407187.29, "1988-05-25"),
            new Transaction(5540089.21, "1989-02-28"),
            new Transaction(-2287857.64, "1989-06-24"),
            new Transaction(-8150241.15, "1989-11-29"),
            new Transaction(-8401315.25, "1990-12-04"),
            new Transaction(-8812281.83, "1990-12-05"),
            new Transaction(9479718.82, "1991-08-27"),
            new Transaction(8930372.72, "1992-06-09"),
            new Transaction(-264913.45, "1993-02-18"),
            new Transaction(-5927107.44, "1993-11-17"),
            new Transaction(-4343109.30, "1994-03-08"),
            new Transaction(-7751650.30, "1994-07-28"),
            new Transaction(-7994415.42, "1994-09-13"),
            new Transaction(-790154.94, "1995-04-15"),
            new Transaction(-5385635.63, "1996-04-18"),
            new Transaction(-2911027.18, "1997-02-20"),
            new Transaction(-6753810.87, "1997-03-22"),
            new Transaction(-6688443.45, "1997-09-21"),
            new Transaction(2684258.90, "1997-12-23"),
            new Transaction(-8216538.02, "1998-08-11"),
            new Transaction(-7186258.17, "1999-07-22"),
            new Transaction(14720270.86, "1999-08-29")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.49415977589390636, rate, xirr.precision);
    }

    @Test
    void test50() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-8263971.29, "1993-02-25"),
            new Transaction(7406322.72, "1993-06-02"),
            new Transaction(3135896.00, "1993-08-01"),
            new Transaction(2873000.95, "1993-12-05"),
            new Transaction(3798956.22, "1994-03-12"),
            new Transaction(-1699095.17, "1994-03-19"),
            new Transaction(-1489415.18, "1994-08-04"),
            new Transaction(-5006212.78, "1994-10-10"),
            new Transaction(-1705517.31, "1994-12-04"),
            new Transaction(-4916081.85, "1995-04-22"),
            new Transaction(-8940759.74, "1995-08-23"),
            new Transaction(6540769.71, "1995-10-29"),
            new Transaction(7848184.18, "1995-11-24"),
            new Transaction(-1586754.36, "1996-01-27"),
            new Transaction(9951461.17, "1996-05-14"),
            new Transaction(1747238.43, "1996-07-24"),
            new Transaction(326548.66, "1996-10-02"),
            new Transaction(-5678177.88, "1996-10-24"),
            new Transaction(-2983208.97, "1997-03-13"),
            new Transaction(-758096.03, "1997-04-29"),
            new Transaction(7329327.66, "1997-07-08"),
            new Transaction(-8506270.14, "1997-09-13"),
            new Transaction(9556672.92, "1998-01-05"),
            new Transaction(-4370262.98, "1998-03-05"),
            new Transaction(2640746.35, "1998-06-03"),
            new Transaction(-3639843.96, "1998-07-05"),
            new Transaction(-46519.60, "1998-09-02"),
            new Transaction(3483776.19, "1998-11-07"),
            new Transaction(-6019673.78, "1998-12-21"),
            new Transaction(2269389.72, "1999-03-24"),
            new Transaction(-5759821.34, "1999-06-02"),
            new Transaction(8984158.03, "1999-07-04"),
            new Transaction(-2411905.00, "1999-07-28"),
            new Transaction(-4983138.68, "1999-08-01"),
            new Transaction(-4794901.79, "1999-10-01"),
            new Transaction(-5188069.46, "1999-12-18"),
            new Transaction(-7123787.56, "2000-05-04"),
            new Transaction(-9081899.16, "2000-06-14"),
            new Transaction(7635069.68, "2000-09-28"),
            new Transaction(-9842321.36, "2001-01-25"),
            new Transaction(5637262.91, "2001-05-09"),
            new Transaction(-8634490.64, "2001-09-26"),
            new Transaction(2032324.90, "2001-11-11"),
            new Transaction(5065069.96, "2001-11-15"),
            new Transaction(8471992.89, "2002-01-17"),
            new Transaction(-8739734.57, "2002-03-10"),
            new Transaction(840617.74, "2002-04-11"),
            new Transaction(9585611.00, "2002-08-09"),
            new Transaction(667011.83, "2002-10-17"),
            new Transaction(8132048.08, "2002-11-29"),
            new Transaction(-7601022.13, "2002-12-31"),
            new Transaction(-6607501.52, "2003-04-23"),
            new Transaction(5554671.75, "2003-08-24"),
            new Transaction(-4546137.50, "2003-09-24"),
            new Transaction(-8557287.75, "2003-10-25"),
            new Transaction(-9063923.74, "2004-02-17"),
            new Transaction(2084883.65, "2004-02-19"),
            new Transaction(-9771631.79, "2004-02-24"),
            new Transaction(-8811232.37, "2004-04-05"),
            new Transaction(1651323.31, "2004-07-07"),
            new Transaction(-5944004.40, "2004-09-15"),
            new Transaction(-4159755.77, "2004-11-26"),
            new Transaction(-3301674.58, "2005-01-10"),
            new Transaction(-1829319.17, "2005-05-06"),
            new Transaction(8863363.24, "2005-07-01"),
            new Transaction(7146972.84, "2005-09-14"),
            new Transaction(5509189.58, "2005-11-30"),
            new Transaction(-5053990.14, "2005-12-16"),
            new Transaction(-5088894.14, "2005-12-30"),
            new Transaction(13771708.48, "2006-01-17")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.8026197198532282, rate, xirr.precision);
    }

    @Test
    void test51() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-5640787.17, "1988-04-15"),
            new Transaction(978047.09, "1989-03-02"),
            new Transaction(6414119.78, "1990-01-03"),
            new Transaction(2198497.45, "1991-05-13"),
            new Transaction(3893778.80, "1991-07-18"),
            new Transaction(-8084154.20, "1992-01-11"),
            new Transaction(6574650.10, "1993-04-11"),
            new Transaction(4035020.24, "1993-08-28"),
            new Transaction(-5972294.03, "1994-11-30"),
            new Transaction(6641419.67, "1995-12-02"),
            new Transaction(-3997075.13, "1996-08-09"),
            new Transaction(-3933806.27, "1996-09-15"),
            new Transaction(-5265090.78, "1997-10-01"),
            new Transaction(5579057.38, "1998-11-19"),
            new Transaction(-664481.63, "1999-09-03"),
            new Transaction(-4536877.05, "2001-01-24"),
            new Transaction(-9323532.23, "2001-09-08"),
            new Transaction(12367102.78, "2003-01-18")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.33755542635917668, rate, xirr.precision);
    }

    @Test
    void test52() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-2467199.51, "2001-09-12"),
            new Transaction(9699790.14, "2001-12-26"),
            new Transaction(-72585.98, "2002-04-02"),
            new Transaction(6600166.16, "2002-08-15"),
            new Transaction(4827321.48, "2002-08-19"),
            new Transaction(1539256.13, "2002-12-31"),
            new Transaction(6372704.09, "2003-03-17"),
            new Transaction(2105265.87, "2003-07-02"),
            new Transaction(-7694615.93, "2003-10-01"),
            new Transaction(-2320681.89, "2003-10-05"),
            new Transaction(-9733542.85, "2003-11-22"),
            new Transaction(-6774921.53, "2004-03-15"),
            new Transaction(3087291.37, "2004-04-28"),
            new Transaction(-1490781.51, "2004-05-16"),
            new Transaction(5254485.21, "2004-07-19"),
            new Transaction(-2157431.60, "2004-08-21"),
            new Transaction(9940490.88, "2004-11-02"),
            new Transaction(9369672.65, "2005-01-10"),
            new Transaction(5488109.32, "2005-05-01"),
            new Transaction(8627640.98, "2005-08-10"),
            new Transaction(1028912.77, "2005-08-31"),
            new Transaction(-7846244.27, "2005-09-29"),
            new Transaction(-5671797.98, "2005-10-16"),
            new Transaction(-4575942.85, "2005-10-20"),
            new Transaction(313330.27, "2006-03-02"),
            new Transaction(-6334690.70, "2006-05-16"),
            new Transaction(832997.29, "2006-08-29"),
            new Transaction(5494506.24, "2006-12-08"),
            new Transaction(3407235.50, "2007-01-16"),
            new Transaction(6791285.89, "2007-04-25"),
            new Transaction(-9325720.27, "2007-07-29"),
            new Transaction(-9871086.78, "2007-08-09"),
            new Transaction(-3876396.21, "2007-12-01"),
            new Transaction(-5137634.86, "2008-03-03"),
            new Transaction(-9294662.85, "2008-06-29"),
            new Transaction(5137926.03, "2008-09-16"),
            new Transaction(-7381291.44, "2008-09-30"),
            new Transaction(-4186025.70, "2009-02-09"),
            new Transaction(3916090.53, "2009-04-27"),
            new Transaction(-4319730.63, "2009-06-15"),
            new Transaction(7714833.62, "2009-08-10"),
            new Transaction(388843.82, "2009-10-23"),
            new Transaction(5154692.61, "2010-01-05"),
            new Transaction(-9358104.96, "2010-03-14"),
            new Transaction(5683102.37, "2010-04-03"),
            new Transaction(6701235.93, "2010-04-09"),
            new Transaction(-2421765.36, "2010-05-17"),
            new Transaction(2098095.55, "2010-09-23"),
            new Transaction(-1536188.72, "2010-10-21"),
            new Transaction(3429119.08, "2010-10-28"),
            new Transaction(-8632761.08, "2010-11-20"),
            new Transaction(-3080546.13, "2010-11-22"),
            new Transaction(-9149386.40, "2011-01-12"),
            new Transaction(-8309520.98, "2011-02-26"),
            new Transaction(-3927236.11, "2011-06-16"),
            new Transaction(-3655169.38, "2011-10-01"),
            new Transaction(8347384.12, "2011-10-10"),
            new Transaction(-4116883.71, "2011-12-08"),
            new Transaction(-2925800.30, "2012-02-09"),
            new Transaction(9785735.20, "2012-04-10"),
            new Transaction(8341593.45, "2012-08-18"),
            new Transaction(-566726.12, "2012-09-23"),
            new Transaction(-2744849.80, "2012-12-21"),
            new Transaction(9441057.30, "2013-04-12"),
            new Transaction(5420654.34, "2013-04-17"),
            new Transaction(-5401431.01, "2013-06-05"),
            new Transaction(-1296177.06, "2013-09-11"),
            new Transaction(-5209835.23, "2014-01-11"),
            new Transaction(-4979632.84, "2014-05-13"),
            new Transaction(6253208.26, "2014-06-09"),
            new Transaction(8339062.31, "2014-06-12"),
            new Transaction(-9082872.74, "2014-10-15"),
            new Transaction(-4842385.93, "2014-12-08"),
            new Transaction(1429412.97, "2015-02-06")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.08078174329394144, rate, xirr.precision);
    }

    @Test
    void test53() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-5516400.55, "1982-11-17"),
            new Transaction(-7813864.41, "1982-11-28"),
            new Transaction(5315256.38, "1983-02-15"),
            new Transaction(1208782.67, "1983-04-04"),
            new Transaction(-6466510.38, "1983-05-08"),
            new Transaction(4814816.55, "1983-08-18"),
            new Transaction(-4450992.43, "1983-10-13"),
            new Transaction(-2433860.51, "1984-01-04"),
            new Transaction(7432487.27, "1984-03-10"),
            new Transaction(1873776.65, "1984-05-17"),
            new Transaction(8082287.47, "1984-08-18"),
            new Transaction(-2687368.93, "1984-10-07"),
            new Transaction(5506207.83, "1984-11-18"),
            new Transaction(-2195777.19, "1985-02-22"),
            new Transaction(-2162667.91, "1985-03-27"),
            new Transaction(-9427730.34, "1985-04-12"),
            new Transaction(-676630.53, "1985-07-13"),
            new Transaction(255265.99, "1985-09-17"),
            new Transaction(-5152848.17, "1985-10-29"),
            new Transaction(7245822.53, "1986-01-25"),
            new Transaction(4638705.23, "1986-03-28"),
            new Transaction(749294.87, "1986-04-20"),
            new Transaction(6720786.60, "1986-06-01"),
            new Transaction(2436126.68, "1986-08-29"),
            new Transaction(2320865.85, "1986-11-09"),
            new Transaction(292065.69, "1986-11-23"),
            new Transaction(996153.54, "1986-12-04"),
            new Transaction(-7165525.33, "1987-01-18"),
            new Transaction(6850527.07, "1987-04-04"),
            new Transaction(8488336.69, "1987-05-03"),
            new Transaction(1378915.62, "1987-06-09"),
            new Transaction(4870206.16, "1987-08-16"),
            new Transaction(-1940631.24, "1987-10-17"),
            new Transaction(5828247.54, "1987-12-20"),
            new Transaction(-1461288.51, "1988-02-13"),
            new Transaction(-5214930.58, "1988-05-02"),
            new Transaction(-247264.79, "1988-07-31"),
            new Transaction(7959492.33, "1988-09-28"),
            new Transaction(9910422.68, "1988-11-27"),
            new Transaction(-267700.63, "1989-02-08"),
            new Transaction(-2875613.22, "1989-03-06"),
            new Transaction(-3326435.54, "1989-05-23"),
            new Transaction(-6163841.30, "1989-07-29"),
            new Transaction(1003528.71, "1989-10-20"),
            new Transaction(-1863604.87, "1989-12-17"),
            new Transaction(-8987017.81, "1990-03-17"),
            new Transaction(1105444.23, "1990-04-29"),
            new Transaction(674435.74, "1990-07-27"),
            new Transaction(2182079.06, "1990-08-31"),
            new Transaction(1030789.26, "1990-10-01"),
            new Transaction(8134714.73, "1990-12-18"),
            new Transaction(1699963.14, "1991-01-15"),
            new Transaction(-9873568.79, "1991-03-09"),
            new Transaction(5520823.36, "1991-06-08"),
            new Transaction(-5101869.27, "1991-06-16"),
            new Transaction(7046151.27, "1991-09-20"),
            new Transaction(-8889094.69, "1991-11-24"),
            new Transaction(9802993.63, "1992-01-12"),
            new Transaction(-2053328.26, "1992-01-30"),
            new Transaction(-1182435.49, "1992-03-27"),
            new Transaction(4964322.80, "1992-04-13"),
            new Transaction(-9988915.09, "1992-07-14"),
            new Transaction(-160497.15, "1992-10-12"),
            new Transaction(-5486630.49, "1992-10-26"),
            new Transaction(-8150101.39, "1992-12-26"),
            new Transaction(3459291.33, "1993-01-24"),
            new Transaction(-8555521.98, "1993-02-20"),
            new Transaction(7241420.57, "1993-03-05"),
            new Transaction(302226.78, "1993-04-02"),
            new Transaction(5633593.05, "1993-05-12"),
            new Transaction(1495105.22, "1993-08-03"),
            new Transaction(9867376.40, "1993-10-24"),
            new Transaction(3327458.46, "1993-12-05"),
            new Transaction(-7605784.79, "1993-12-11"),
            new Transaction(6938812.08, "1993-12-17"),
            new Transaction(5782732.47, "1994-03-14"),
            new Transaction(-5990035.79, "1994-03-26"),
            new Transaction(-4151452.16, "1994-06-09"),
            new Transaction(-838495.15, "1994-08-10"),
            new Transaction(-2967098.23, "1994-11-09"),
            new Transaction(6224045.38, "1994-12-05"),
            new Transaction(-7493298.69, "1995-01-07"),
            new Transaction(-5202344.37, "1995-02-28"),
            new Transaction(1882626.55, "1995-04-12"),
            new Transaction(-2097412.72, "1995-06-17"),
            new Transaction(-9205536.88, "1995-08-15"),
            new Transaction(5176800.66, "1995-09-20"),
            new Transaction(-3424148.12, "1995-12-03"),
            new Transaction(1439038.64, "1996-01-02"),
            new Transaction(9476928.85, "1996-02-11"),
            new Transaction(-3493531.06, "1996-03-28"),
            new Transaction(6068832.38, "1996-05-01"),
            new Transaction(3707919.69, "1996-06-08"),
            new Transaction(-7052648.02, "1996-08-04"),
            new Transaction(5994061.07, "1996-09-27"),
            new Transaction(-4855933.57, "1996-11-02"),
            new Transaction(8192853.17, "1997-02-09")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.42106147408485417, rate, xirr.precision);
    }

    @Test
    void test54() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-3431171.93, "1982-06-09"),
            new Transaction(-6510510.11, "1982-11-24"),
            new Transaction(6971711.77, "1982-12-29"),
            new Transaction(-5403768.61, "1983-05-31"),
            new Transaction(9173094.58, "1983-08-28"),
            new Transaction(1841849.08, "1983-09-19"),
            new Transaction(-9558596.18, "1984-02-10"),
            new Transaction(-8002762.47, "1984-03-09"),
            new Transaction(9234537.13, "1984-06-06"),
            new Transaction(6704930.77, "1984-12-01"),
            new Transaction(2131554.72, "1985-03-26"),
            new Transaction(-4783559.76, "1985-05-17"),
            new Transaction(9607517.06, "1985-05-18"),
            new Transaction(8757559.27, "1985-09-15"),
            new Transaction(3511468.97, "1985-12-29"),
            new Transaction(-3845504.55, "1986-04-30"),
            new Transaction(1911801.97, "1986-05-07"),
            new Transaction(5196610.87, "1986-10-08"),
            new Transaction(-3369637.20, "1986-11-12"),
            new Transaction(1808735.17, "1987-01-05"),
            new Transaction(4902422.78, "1987-01-14"),
            new Transaction(6122860.96, "1987-04-14"),
            new Transaction(4533373.41, "1987-10-11"),
            new Transaction(488123.46, "1988-04-09"),
            new Transaction(4425910.03, "1988-04-15"),
            new Transaction(9745543.15, "1988-06-11"),
            new Transaction(-8525483.03, "1988-11-20"),
            new Transaction(-7396892.03, "1989-04-01"),
            new Transaction(8903346.60, "1989-09-26"),
            new Transaction(2486751.07, "1990-01-15"),
            new Transaction(-4118871.48, "1990-06-12"),
            new Transaction(-5658394.53, "1990-07-16"),
            new Transaction(-6905802.30, "1990-10-25"),
            new Transaction(-234941.42, "1990-12-05"),
            new Transaction(-4580849.54, "1991-01-31"),
            new Transaction(4509425.30, "1991-08-05"),
            new Transaction(-2378698.63, "1991-12-08"),
            new Transaction(-3667966.97, "1991-12-24"),
            new Transaction(-1366795.76, "1992-03-20"),
            new Transaction(-4992370.19, "1992-09-18"),
            new Transaction(49704.01, "1993-01-18"),
            new Transaction(9306327.82, "1993-06-10"),
            new Transaction(9859012.19, "1993-08-26"),
            new Transaction(7142750.90, "1994-03-06"),
            new Transaction(6478163.39, "1994-07-06"),
            new Transaction(-3918391.32, "1994-07-18"),
            new Transaction(-5366985.44, "1994-09-17"),
            new Transaction(-9926072.44, "1994-11-14"),
            new Transaction(-2747115.57, "1995-02-04"),
            new Transaction(6688290.55, "1995-08-01"),
            new Transaction(9992979.19, "1995-12-13")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.91696575880050668, rate, xirr.precision);
    }

    @Test
    void test55() {
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(
            new Transaction(-16845397.68, "1986-09-04"),
            new Transaction(-1945266.09, "1986-09-18"),
            new Transaction(-8248289.59, "1987-06-04"),
            new Transaction(3821397.55, "1988-02-21"),
            new Transaction(-1867887.62, "1988-12-01"),
            new Transaction(2746539.15, "1989-07-20"),
            new Transaction(9496540.23, "1990-04-14"),
            new Transaction(9617582.78, "1990-09-27"),
            new Transaction(8329773.83, "1990-12-24"),
            new Transaction(-8089487.30, "1991-09-11"),
            new Transaction(6057546.19, "1992-04-30"),
            new Transaction(9046957.39, "1992-12-12"),
            new Transaction(7740258.80, "1993-07-22"),
            new Transaction(-3473467.24, "1993-12-29"),
            new Transaction(-1865323.52, "1994-07-04"),
            new Transaction(5366904.16, "1994-11-04"),
            new Transaction(-3453180.12, "1995-07-10"),
            new Transaction(-7620455.50, "1995-07-11"),
            new Transaction(-7992020.24, "1995-11-11"),
            new Transaction(9622194.60, "1995-11-25"),
            new Transaction(-7619951.66, "1996-02-10"),
            new Transaction(3450334.65, "1996-07-15"),
            new Transaction(-3479305.18, "1996-10-26"),
            new Transaction(1534260.13, "1997-04-11"),
            new Transaction(4189728.50, "1997-10-13"),
            new Transaction(-6327547.13, "1998-07-19"),
            new Transaction(-8787884.85, "1999-03-10"),
            new Transaction(7872116.81, "1999-12-05"),
            new Transaction(-579014.51, "2000-01-21"),
            new Transaction(9711220.47, "2000-07-01"),
            new Transaction(-5980286.34, "2001-02-23"),
            new Transaction(3162887.70, "2001-10-25"),
            new Transaction(-9937254.91, "2002-04-14"),
            new Transaction(-8145474.26, "2002-08-15"),
            new Transaction(2859124.58, "2003-03-06")
        );
        Assertions.assertEquals(-0.9241928366, rate, xirr.precision);
    }

    @Test
    void test56() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-9149848.96, "2009-01-22"),
            new Transaction(-3927349.28, "2009-07-19"),
            new Transaction(-4507061.83, "2009-10-15"),
            new Transaction(-4390776.74, "2010-05-31"),
            new Transaction(2163850.96, "2010-06-04"),
            new Transaction(7784444.68, "2011-01-25"),
            new Transaction(-3513201.63, "2011-10-16"),
            new Transaction(9102852.91, "2012-04-16"),
            new Transaction(7140289.91, "2012-09-25"),
            new Transaction(6462342.10, "2013-04-24"),
            new Transaction(3832384.48, "2014-01-29"),
            new Transaction(-6870326.74, "2014-07-01"),
            new Transaction(167346.33, "2014-12-10"),
            new Transaction(3734981.94, "2014-12-13"),
            new Transaction(-3730997.26, "2015-07-04"),
            new Transaction(-6809965.33, "2016-04-27"),
            new Transaction(-5584850.36, "2017-01-30"),
            new Transaction(-3804301.21, "2017-03-04"),
            new Transaction(5993096.66, "2017-07-12"),
            new Transaction(9644153.23, "2017-09-20"),
            new Transaction(-108288.06, "2017-11-20"),
            new Transaction(20446.10, "2018-02-13"),
            new Transaction(2613003.68, "2018-02-28"),
            new Transaction(8584771.55, "2018-06-29"),
            new Transaction(-5177750.37, "2019-02-19"),
            new Transaction(-2017282.96, "2019-07-01"),
            new Transaction(7604129.81, "2020-01-28"),
            new Transaction(4456132.07, "2020-02-27"),
            new Transaction(5534050.22, "2020-08-27"),
            new Transaction(-7829587.20, "2021-04-19"),
            new Transaction(5226159.77, "2021-10-07"),
            new Transaction(2450400.63, "2022-06-20"),
            new Transaction(5815881.46, "2022-10-13")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.17670629620552061, rate, xirr.precision);
    }

    @Test
    void test57() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-18945579.58, "1989-05-24"),
            new Transaction(8865096.80, "1989-09-16"),
            new Transaction(4611278.41, "1989-09-25"),
            new Transaction(-1494761.34, "1989-11-20"),
            new Transaction(1461137.59, "1990-01-21"),
            new Transaction(-6921929.80, "1990-03-28"),
            new Transaction(-4258789.93, "1990-05-19"),
            new Transaction(-7140370.30, "1990-08-30"),
            new Transaction(926936.15, "1990-11-17"),
            new Transaction(4304943.69, "1991-01-19"),
            new Transaction(7207561.05, "1991-03-25"),
            new Transaction(5092735.47, "1991-04-01"),
            new Transaction(-8807420.14, "1991-08-01"),
            new Transaction(-2152677.30, "1991-11-18"),
            new Transaction(-8184778.48, "1992-01-08"),
            new Transaction(-6503862.50, "1992-02-27"),
            new Transaction(-739017.27, "1992-06-24"),
            new Transaction(8618753.35, "1992-09-21"),
            new Transaction(6589968.90, "1992-11-17"),
            new Transaction(3847341.04, "1993-02-14"),
            new Transaction(-8669345.87, "1993-04-09"),
            new Transaction(-4735059.73, "1993-05-20"),
            new Transaction(-8284543.29, "1993-09-14"),
            new Transaction(5008384.31, "1993-11-13"),
            new Transaction(9595065.90, "1994-01-08"),
            new Transaction(7970512.14, "1994-01-13"),
            new Transaction(-9441664.37, "1994-01-20"),
            new Transaction(5036170.34, "1994-02-17"),
            new Transaction(-3682021.24, "1994-05-31"),
            new Transaction(4753668.75, "1994-09-07"),
            new Transaction(-9395874.15, "1994-09-09"),
            new Transaction(4796294.82, "1994-10-28"),
            new Transaction(5765709.62, "1995-01-09"),
            new Transaction(821071.07, "1995-03-03"),
            new Transaction(5108160.79, "1995-05-26"),
            new Transaction(5164814.62, "1995-06-28"),
            new Transaction(-794705.65, "1995-11-03"),
            new Transaction(1127010.57, "1996-01-10"),
            new Transaction(-5953012.35, "1996-01-24"),
            new Transaction(-4621968.46, "1996-04-12"),
            new Transaction(8088123.72, "1996-05-24"),
            new Transaction(-3327422.71, "1996-07-19"),
            new Transaction(5045298.99, "1996-11-15"),
            new Transaction(2699774.86, "1997-02-22"),
            new Transaction(4525830.19, "1997-06-15"),
            new Transaction(5169567.62, "1997-09-09"),
            new Transaction(7207228.28, "1997-12-14"),
            new Transaction(4131458.04, "1998-02-09"),
            new Transaction(-5342560.14, "1998-03-23"),
            new Transaction(8770074.69, "1998-04-10"),
            new Transaction(3777785.70, "1998-06-03"),
            new Transaction(-4871076.42, "1998-08-11"),
            new Transaction(1057109.31, "1998-08-17"),
            new Transaction(2758851.67, "1998-10-12"),
            new Transaction(311964.82, "1999-01-05"),
            new Transaction(3136535.42, "1999-02-25"),
            new Transaction(-5318159.91, "1999-05-02"),
            new Transaction(-1163217.34, "1999-05-03"),
            new Transaction(-4313488.50, "1999-09-02"),
            new Transaction(2179075.56, "1999-10-18"),
            new Transaction(-3988829.49, "1999-12-14"),
            new Transaction(-5966451.95, "2000-03-30"),
            new Transaction(745345.40, "2000-05-01"),
            new Transaction(-1526601.80, "2000-05-24"),
            new Transaction(6935806.53, "2000-08-20"),
            new Transaction(359253.79, "2000-11-14"),
            new Transaction(9465094.59, "2000-11-24"),
            new Transaction(-6353853.09, "2000-11-30"),
            new Transaction(865998.05, "2001-01-08"),
            new Transaction(-5804345.33, "2001-03-31"),
            new Transaction(3129246.84, "2001-07-20"),
            new Transaction(-2314842.05, "2001-07-30"),
            new Transaction(-5814275.73, "2001-09-11"),
            new Transaction(-1563837.69, "2001-12-09"),
            new Transaction(6020257.83, "2002-02-28"),
            new Transaction(-1263134.81, "2002-05-03"),
            new Transaction(10133865.74, "2002-05-30")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.10692352652549744, rate, xirr.precision);
    }

    @Test
    void test58() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-11037938.45, "1996-03-14"),
            new Transaction(-8724660.88, "1997-11-18"),
            new Transaction(6935009.51, "1997-12-15"),
            new Transaction(876532.52, "1998-06-26"),
            new Transaction(-2753191.57, "1998-09-17"),
            new Transaction(-2622734.53, "1999-11-07"),
            new Transaction(-3933472.07, "2000-05-09"),
            new Transaction(2074153.11, "2000-06-13"),
            new Transaction(-3791879.39, "2001-05-19"),
            new Transaction(16622744.86, "2004-01-06")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-5.4523275792598726E-2, rate, xirr.precision);
    }

    @Test
    void test59() {
        Xirr xirr = Xirr.instance();
        double rate = xirr.xirr(
            new Transaction(-14463676.83, "2003-07-07"),
            new Transaction(7268860.13, "2003-10-12"),
            new Transaction(9815455.43, "2003-12-10"),
            new Transaction(-8388919.19, "2004-05-05"),
            new Transaction(-853281.87, "2004-10-19"),
            new Transaction(-1006415.88, "2005-02-21"),
            new Transaction(1666775.22, "2005-08-20"),
            new Transaction(1508116.18, "2006-02-02"),
            new Transaction(3958136.79, "2006-07-21"),
            new Transaction(4687664.59, "2006-07-27"),
            new Transaction(-471584.75, "2007-01-07"),
            new Transaction(7149940.38, "2007-08-06"),
            new Transaction(-7346277.69, "2007-09-20"),
            new Transaction(-7213365.72, "2007-10-20"),
            new Transaction(8318970.42, "2008-04-26"),
            new Transaction(1973248.11, "2008-10-22"),
            new Transaction(-2475847.55, "2009-03-31"),
            new Transaction(-8493719.12, "2009-07-30"),
            new Transaction(4665993.07, "2010-03-03"),
            new Transaction(-2789197.39, "2010-04-17"),
            new Transaction(8283534.98, "2010-10-15"),
            new Transaction(7860512.90, "2010-11-10"),
            new Transaction(-5154162.02, "2010-12-01"),
            new Transaction(2908947.59, "2011-04-07"),
            new Transaction(1956707.10, "2011-06-11"),
            new Transaction(-1564341.97, "2011-10-23"),
            new Transaction(-561331.11, "2012-03-27"),
            new Transaction(-5665304.24, "2012-06-18"),
            new Transaction(-5321347.41, "2012-07-26"),
            new Transaction(-1840314.13, "2012-08-19"),
            new Transaction(5522911.59, "2013-01-10"),
            new Transaction(-9302115.83, "2013-02-02"),
            new Transaction(-9870491.23, "2013-08-14"),
            new Transaction(-6368200.68, "2013-09-14"),
            new Transaction(-5294626.21, "2014-03-21"),
            new Transaction(-8520401.44, "2014-08-20"),
            new Transaction(6829541.90, "2015-01-23"),
            new Transaction(7173641.14, "2015-02-19"),
            new Transaction(-1171172.47, "2015-02-22"),
            new Transaction(151623.97, "2015-04-20"),
            new Transaction(421508.31, "2015-07-11"),
            new Transaction(-2472410.03, "2016-02-06"),
            new Transaction(5445026.83, "2016-05-09"),
            new Transaction(-6687646.61, "2016-07-24"),
            new Transaction(6118917.91, "2017-01-13"),
            new Transaction(653069.88, "2017-06-08")
        );
        Assertions.assertEquals(-0.36444670619675901, rate, xirr.precision);
    }

    @Test
    void test60() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-12083465.90, "1995-10-28"),
            new Transaction(-964650.42, "1996-02-08"),
            new Transaction(8729629.76, "1996-07-03"),
            new Transaction(9176142.57, "1996-09-07"),
            new Transaction(-5396668.44, "1997-06-09"),
            new Transaction(-8945042.44, "1997-10-12"),
            new Transaction(-7793431.84, "1998-05-28"),
            new Transaction(-9570044.27, "1998-11-10"),
            new Transaction(9933195.61, "1999-06-23"),
            new Transaction(-6288581.38, "1999-07-24"),
            new Transaction(9876823.29, "1999-08-27"),
            new Transaction(8076000.74, "1999-10-02"),
            new Transaction(-7778182.41, "1999-11-20"),
            new Transaction(-325171.89, "2000-03-05"),
            new Transaction(-9633769.45, "2000-05-19"),
            new Transaction(-779601.95, "2000-08-10"),
            new Transaction(5393026.11, "2001-02-11"),
            new Transaction(3926022.15, "2001-06-27"),
            new Transaction(-8046720.02, "2001-12-28"),
            new Transaction(576035.25, "2002-02-13"),
            new Transaction(-7233507.90, "2002-05-02"),
            new Transaction(548774.09, "2002-06-19"),
            new Transaction(-7923779.05, "2002-12-29"),
            new Transaction(-9212281.11, "2003-02-18"),
            new Transaction(1324699.42, "2003-08-27"),
            new Transaction(-4601509.27, "2004-05-19"),
            new Transaction(-2532464.98, "2004-07-01"),
            new Transaction(-9477909.80, "2005-02-21"),
            new Transaction(1482337.17, "2005-10-06"),
            new Transaction(255192.83, "2006-04-15"),
            new Transaction(-859900.51, "2006-07-30"),
            new Transaction(3075328.72, "2007-02-06"),
            new Transaction(4297499.71, "2007-03-01"),
            new Transaction(5749570.23, "2007-11-20"),
            new Transaction(1884555.53, "2008-05-29"),
            new Transaction(9870730.88, "2008-06-13")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.14461800179245676, rate, xirr.precision);
    }

    @Test
    void test61() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-16556124.41, "1999-10-31"),
            new Transaction(178258.02, "1999-12-20"),
            new Transaction(4600735.38, "2000-02-10"),
            new Transaction(-1225578.97, "2000-02-25"),
            new Transaction(-641737.84, "2000-05-02"),
            new Transaction(-8601158.83, "2000-08-03"),
            new Transaction(-8932647.10, "2000-09-10"),
            new Transaction(-5674363.71, "2000-10-22"),
            new Transaction(-6389743.11, "2000-12-02"),
            new Transaction(-4224899.15, "2001-02-17"),
            new Transaction(-4563615.23, "2001-02-19"),
            new Transaction(-128246.74, "2001-03-24"),
            new Transaction(-3957324.15, "2001-06-10"),
            new Transaction(-3462618.58, "2001-08-14"),
            new Transaction(-9673347.98, "2001-10-18"),
            new Transaction(-944552.14, "2001-11-30"),
            new Transaction(-9397658.38, "2001-12-09"),
            new Transaction(-2273881.39, "2002-01-18"),
            new Transaction(-407769.49, "2002-01-22"),
            new Transaction(2329891.26, "2002-04-24"),
            new Transaction(-9549367.21, "2002-06-21"),
            new Transaction(4489993.66, "2002-08-03"),
            new Transaction(2253769.28, "2002-09-24"),
            new Transaction(3789917.51, "2002-12-06"),
            new Transaction(-3571114.81, "2002-12-06"),
            new Transaction(7228965.72, "2003-02-19"),
            new Transaction(8520380.32, "2003-05-05"),
            new Transaction(1401071.25, "2003-07-11"),
            new Transaction(-1245475.64, "2003-08-08"),
            new Transaction(7450465.30, "2003-08-13"),
            new Transaction(-2214225.93, "2003-11-17"),
            new Transaction(7627614.61, "2004-02-23"),
            new Transaction(-4675238.21, "2004-04-01"),
            new Transaction(-5933662.87, "2004-04-11"),
            new Transaction(-9219711.86, "2004-06-21"),
            new Transaction(-7824720.24, "2004-08-02"),
            new Transaction(7862810.19, "2004-09-10"),
            new Transaction(-632280.08, "2004-09-16"),
            new Transaction(-2991745.25, "2004-10-08"),
            new Transaction(-8924624.21, "2004-10-17"),
            new Transaction(-2273606.49, "2004-11-11"),
            new Transaction(-8929251.04, "2005-01-31"),
            new Transaction(4822192.33, "2005-04-19"),
            new Transaction(4306960.91, "2005-05-26"),
            new Transaction(8515105.17, "2005-08-04"),
            new Transaction(-5243896.34, "2005-10-11"),
            new Transaction(-6184113.60, "2006-01-03"),
            new Transaction(-6009257.52, "2006-03-18"),
            new Transaction(-9252330.52, "2006-05-04"),
            new Transaction(574543.32, "2006-06-13"),
            new Transaction(3375563.55, "2006-09-11"),
            new Transaction(-2574064.62, "2006-12-22"),
            new Transaction(-500068.43, "2007-01-16"),
            new Transaction(8074315.10, "2007-03-26"),
            new Transaction(-9466185.49, "2007-06-30"),
            new Transaction(-7745807.97, "2007-09-10"),
            new Transaction(-3911672.70, "2007-12-09"),
            new Transaction(6350011.88, "2008-01-16"),
            new Transaction(2914968.97, "2008-04-22"),
            new Transaction(3028707.39, "2008-07-29"),
            new Transaction(6342761.47, "2008-09-25"),
            new Transaction(4420671.16, "2008-12-09"),
            new Transaction(5532652.87, "2009-02-19"),
            new Transaction(-9332768.64, "2009-05-17"),
            new Transaction(2617214.70, "2009-08-04"),
            new Transaction(-6328718.83, "2009-09-12"),
            new Transaction(-7714578.14, "2009-10-16"),
            new Transaction(9721328.18, "2009-12-01"),
            new Transaction(-214265.73, "2010-03-10"),
            new Transaction(8560280.01, "2010-04-03"),
            new Transaction(-7293592.17, "2010-05-22"),
            new Transaction(8102104.79, "2010-08-12"),
            new Transaction(3729107.27, "2010-10-28"),
            new Transaction(1032359.14, "2011-02-02"),
            new Transaction(-6559979.90, "2011-04-10"),
            new Transaction(3524917.05, "2011-07-10"),
            new Transaction(-3338953.32, "2011-09-01"),
            new Transaction(-3374221.04, "2011-09-14"),
            new Transaction(-9383173.33, "2011-11-09"),
            new Transaction(-8275660.40, "2011-12-19"),
            new Transaction(5928925.67, "2012-02-06"),
            new Transaction(-5305692.92, "2012-05-14"),
            new Transaction(-521064.28, "2012-07-09"),
            new Transaction(9177933.75, "2012-10-09"),
            new Transaction(-9234161.08, "2013-01-10"),
            new Transaction(7437812.52, "2013-02-28"),
            new Transaction(-9692117.23, "2013-05-15"),
            new Transaction(-7827849.67, "2013-08-25"),
            new Transaction(2496820.79, "2013-08-30"),
            new Transaction(-2705251.07, "2013-09-05"),
            new Transaction(-3753914.10, "2013-10-12"),
            new Transaction(-225094.25, "2013-12-11"),
            new Transaction(1434567.97, "2014-02-03"),
            new Transaction(-7890276.88, "2014-04-01"),
            new Transaction(16100240.22, "2014-07-09")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.5496905596970503, rate, xirr.precision);
    }

    @Test
    void test62() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-1825236.99, "1999-02-17"),
            new Transaction(5068069.79, "2000-02-24"),
            new Transaction(-4340908.01, "2001-05-08"),
            new Transaction(-5821691.23, "2002-08-16"),
            new Transaction(589404.55, "2003-06-12"),
            new Transaction(-2670950.85, "2004-10-23"),
            new Transaction(-1916308.19, "2005-02-05"),
            new Transaction(-8588087.44, "2005-11-10"),
            new Transaction(-5081890.86, "2006-05-14"),
            new Transaction(-75244.89, "2006-10-09"),
            new Transaction(4189915.69, "2008-01-15"),
            new Transaction(7485573.52, "2008-10-04"),
            new Transaction(-2571.13, "2009-02-07"),
            new Transaction(6451831.57, "2010-07-10"),
            new Transaction(1485474.60, "2011-04-05"),
            new Transaction(4769027.12, "2012-08-17"),
            new Transaction(1143348.69, "2013-04-03")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(6.6284507513046272E-3, rate, xirr.precision);
    }

    @Test
    void test63() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-13490073.32, "2006-10-28"),
            new Transaction(1213677.23, "2007-08-05"),
            new Transaction(7761978.08, "2008-05-15"),
            new Transaction(2847905.60, "2008-09-08"),
            new Transaction(750421.35, "2009-03-17"),
            new Transaction(-850505.04, "2009-09-29"),
            new Transaction(6350359.11, "2009-10-14"),
            new Transaction(9023894.84, "2010-07-09"),
            new Transaction(4182655.96, "2010-09-29"),
            new Transaction(9270579.53, "2011-03-29"),
            new Transaction(355408.03, "2011-09-20"),
            new Transaction(-3055082.19, "2012-02-05"),
            new Transaction(-9185374.47, "2012-10-17"),
            new Transaction(8847402.93, "2013-01-01"),
            new Transaction(-9373930.09, "2013-03-06"),
            new Transaction(7846843.49, "2013-06-20"),
            new Transaction(6367660.54, "2013-10-02"),
            new Transaction(3341971.85, "2014-06-24"),
            new Transaction(698319.69, "2014-12-23"),
            new Transaction(-8841642.99, "2015-06-22"),
            new Transaction(-1769951.74, "2015-07-02"),
            new Transaction(-72266.37, "2015-10-16"),
            new Transaction(1038055.97, "2016-05-27"),
            new Transaction(-8025930.93, "2016-05-27"),
            new Transaction(389903.05, "2016-12-05"),
            new Transaction(4560675.72, "2017-02-02"),
            new Transaction(8307396.93, "2017-06-26"),
            new Transaction(5053009.97, "2018-02-18"),
            new Transaction(-8604046.79, "2018-11-03"),
            new Transaction(2478669.64, "2019-07-24"),
            new Transaction(-2125287.51, "2019-09-20"),
            new Transaction(-6289188.21, "2019-10-05"),
            new Transaction(4784881.03, "2019-10-07"),
            new Transaction(909626.75, "2019-11-23"),
            new Transaction(4590351.42, "2020-02-16")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.45239867568016057, rate, xirr.precision);
    }

    @Test
    void test64() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-16036131.00, "2000-09-09"),
            new Transaction(5856202.74, "2000-12-16"),
            new Transaction(-2577710.02, "2001-04-03"),
            new Transaction(1958526.66, "2001-06-04"),
            new Transaction(9909889.50, "2001-09-10"),
            new Transaction(2092135.73, "2001-10-18"),
            new Transaction(-187230.43, "2001-11-27"),
            new Transaction(8527772.20, "2002-02-18"),
            new Transaction(-3667648.69, "2002-03-06"),
            new Transaction(-4700369.88, "2002-08-15"),
            new Transaction(-9157764.80, "2002-09-30"),
            new Transaction(4015674.13, "2002-12-22"),
            new Transaction(8887641.11, "2003-04-12"),
            new Transaction(2718206.48, "2003-05-25"),
            new Transaction(-3419898.38, "2003-07-20"),
            new Transaction(7988288.06, "2003-10-01"),
            new Transaction(8591196.72, "2003-10-18"),
            new Transaction(-5120866.00, "2004-04-05"),
            new Transaction(-8337953.24, "2004-09-04"),
            new Transaction(-1188679.73, "2005-02-20"),
            new Transaction(-6808131.90, "2005-07-23"),
            new Transaction(-3166351.51, "2005-11-03"),
            new Transaction(-8642192.69, "2006-04-19"),
            new Transaction(-6479804.10, "2006-04-30"),
            new Transaction(-7813773.30, "2006-09-15"),
            new Transaction(-9418824.98, "2006-11-23"),
            new Transaction(-7177367.75, "2007-05-02"),
            new Transaction(-4553642.13, "2007-07-18"),
            new Transaction(6245092.68, "2007-08-22"),
            new Transaction(4129570.09, "2007-10-06"),
            new Transaction(-3327791.41, "2008-04-01"),
            new Transaction(1374110.55, "2008-06-25"),
            new Transaction(-566282.71, "2008-12-02"),
            new Transaction(9789615.66, "2009-05-16"),
            new Transaction(-4246482.89, "2009-07-10"),
            new Transaction(3611667.23, "2009-12-13"),
            new Transaction(9568650.96, "2010-02-04"),
            new Transaction(3649801.54, "2010-07-18"),
            new Transaction(8013150.87, "2010-09-19"),
            new Transaction(-5015257.99, "2010-12-27"),
            new Transaction(-8225277.71, "2011-02-22"),
            new Transaction(-232526.71, "2011-04-19"),
            new Transaction(-2957106.83, "2011-06-19"),
            new Transaction(9845927.20, "2011-09-24"),
            new Transaction(3094043.19, "2012-01-11"),
            new Transaction(-7941025.01, "2012-01-17"),
            new Transaction(591975.66, "2012-01-25"),
            new Transaction(4682942.14, "2012-04-17"),
            new Transaction(3308022.29, "2012-04-26"),
            new Transaction(7479982.30, "2012-08-02"),
            new Transaction(7554238.48, "2012-10-26"),
            new Transaction(-8093119.85, "2013-01-18"),
            new Transaction(-5819097.98, "2013-03-07"),
            new Transaction(4427603.32, "2013-08-12"),
            new Transaction(2294078.59, "2013-10-23"),
            new Transaction(13576943.26, "2014-01-25")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(4.2045953869819644E-2, rate, xirr.precision);
    }

    @Test
    void test65() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-4510522.46, "1988-01-01"),
            new Transaction(-2300106.37, "1988-05-05"),
            new Transaction(-7971387.41, "1988-08-18"),
            new Transaction(287278.46, "1988-12-14"),
            new Transaction(-5890299.27, "1989-04-23"),
            new Transaction(-2955868.90, "1989-08-28"),
            new Transaction(5505459.85, "1989-10-23"),
            new Transaction(-360280.73, "1990-03-15"),
            new Transaction(6061894.59, "1990-05-16"),
            new Transaction(4655811.13, "1990-09-15"),
            new Transaction(-7843383.13, "1990-09-22"),
            new Transaction(4550086.56, "1990-10-28"),
            new Transaction(5346529.65, "1990-12-31"),
            new Transaction(9521212.47, "1991-04-29"),
            new Transaction(-6319699.89, "1991-06-30"),
            new Transaction(6544990.28, "1991-07-18"),
            new Transaction(6256560.87, "1991-11-22"),
            new Transaction(-7059056.21, "1992-03-23"),
            new Transaction(1109689.71, "1992-04-21"),
            new Transaction(4838735.16, "1992-07-17"),
            new Transaction(-6898409.33, "1992-12-06"),
            new Transaction(8575249.42, "1993-02-20"),
            new Transaction(-3030499.02, "1993-03-11"),
            new Transaction(-3488767.54, "1993-07-21"),
            new Transaction(9742687.03, "1993-11-03"),
            new Transaction(-1322840.50, "1994-03-21"),
            new Transaction(-1845003.93, "1994-04-30"),
            new Transaction(6976419.21, "1994-09-27"),
            new Transaction(-9907256.71, "1994-12-13"),
            new Transaction(-9937130.20, "1995-02-26"),
            new Transaction(-7886151.52, "1995-04-11"),
            new Transaction(-6415097.04, "1995-06-24"),
            new Transaction(1223520.75, "1995-08-25"),
            new Transaction(-6908586.64, "1995-09-07"),
            new Transaction(-1345600.99, "1995-10-14"),
            new Transaction(9757366.19, "1996-01-09"),
            new Transaction(1578029.71, "1996-05-06"),
            new Transaction(-3769620.06, "1996-07-04"),
            new Transaction(3095059.60, "1996-08-24"),
            new Transaction(9500430.57, "1996-09-27"),
            new Transaction(921106.43, "1996-12-07"),
            new Transaction(-7599393.66, "1997-04-10"),
            new Transaction(8024919.97, "1997-07-11"),
            new Transaction(-8180883.48, "1997-08-11"),
            new Transaction(-5256620.84, "1997-09-18"),
            new Transaction(8973256.14, "1997-12-25"),
            new Transaction(-1276559.61, "1998-03-17"),
            new Transaction(9505614.87, "1998-05-02"),
            new Transaction(-6887498.60, "1998-07-04"),
            new Transaction(-6438565.47, "1998-11-15"),
            new Transaction(4174638.78, "1999-04-06"),
            new Transaction(-5588828.64, "1999-08-09"),
            new Transaction(586884.62, "2000-01-07"),
            new Transaction(-5977181.46, "2000-05-13"),
            new Transaction(-8953746.39, "2000-08-22"),
            new Transaction(-2874157.55, "2000-11-27"),
            new Transaction(-3986728.06, "2000-12-12"),
            new Transaction(8894286.97, "2001-04-29"),
            new Transaction(1707147.89, "2001-09-06"),
            new Transaction(-9703611.73, "2001-12-15"),
            new Transaction(9598410.73, "2002-04-11"),
            new Transaction(-889724.02, "2002-05-16"),
            new Transaction(1038974.24, "2002-08-16"),
            new Transaction(7047194.67, "2003-01-10"),
            new Transaction(7350264.71, "2003-03-19"),
            new Transaction(10442723.83, "2003-04-19")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(1.2734410166740422E-2, rate, xirr.precision);
    }

    @Test
    void test66() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-5131835.48, "1984-05-19"),
            new Transaction(2782691.70, "1984-06-30"),
            new Transaction(6204471.40, "1984-08-04"),
            new Transaction(7128583.39, "1984-09-28"),
            new Transaction(3151503.10, "1984-10-28"),
            new Transaction(-7159664.13, "1985-01-15"),
            new Transaction(7456548.33, "1985-05-01"),
            new Transaction(-9980087.74, "1985-05-08"),
            new Transaction(507331.36, "1985-07-25"),
            new Transaction(-2772980.38, "1985-09-04"),
            new Transaction(-6580176.89, "1985-11-19"),
            new Transaction(3978187.36, "1985-12-08"),
            new Transaction(5849055.16, "1986-03-22"),
            new Transaction(-7433168.83, "1986-07-01"),
            new Transaction(6299311.99, "1986-07-02"),
            new Transaction(-5826487.67, "1986-07-12"),
            new Transaction(2266513.29, "1986-08-06"),
            new Transaction(-8184640.10, "1986-10-18"),
            new Transaction(5870242.00, "1986-11-07"),
            new Transaction(4839529.05, "1987-02-16"),
            new Transaction(136058.67, "1987-02-26"),
            new Transaction(-9348551.21, "1987-06-04"),
            new Transaction(-2919527.88, "1987-06-11"),
            new Transaction(-3773516.31, "1987-08-17"),
            new Transaction(8213370.88, "1987-11-11"),
            new Transaction(-6379134.76, "1987-12-03"),
            new Transaction(-5152977.63, "1988-02-06"),
            new Transaction(-5905395.76, "1988-03-26"),
            new Transaction(-175660.18, "1988-05-26"),
            new Transaction(3079055.96, "1988-07-15"),
            new Transaction(-2699984.50, "1988-09-17"),
            new Transaction(-3634991.93, "1988-12-28"),
            new Transaction(7765615.74, "1989-04-04"),
            new Transaction(8069062.84, "1989-05-03"),
            new Transaction(1641075.46, "1989-05-07"),
            new Transaction(-7172039.71, "1989-05-28"),
            new Transaction(-9147188.21, "1989-06-10"),
            new Transaction(9172228.30, "1989-08-16"),
            new Transaction(-8986234.38, "1989-11-23"),
            new Transaction(2846858.72, "1990-02-13"),
            new Transaction(-7833142.92, "1990-02-15"),
            new Transaction(6641552.40, "1990-03-09"),
            new Transaction(8638213.63, "1990-04-18"),
            new Transaction(3395122.09, "1990-05-08"),
            new Transaction(6050829.26, "1990-08-09"),
            new Transaction(8025483.37, "1990-10-13"),
            new Transaction(-4718711.17, "1990-12-27"),
            new Transaction(-6914257.79, "1991-02-13"),
            new Transaction(-7476659.61, "1991-04-28"),
            new Transaction(7423293.14, "1991-05-18"),
            new Transaction(-7926787.64, "1991-07-18"),
            new Transaction(-7329488.41, "1991-09-13"),
            new Transaction(-7754137.15, "1991-09-23"),
            new Transaction(8302274.89, "1991-11-22"),
            new Transaction(3674033.23, "1992-01-15"),
            new Transaction(2416268.98, "1992-03-20"),
            new Transaction(2877560.21, "1992-03-20"),
            new Transaction(3510380.80, "1992-05-02"),
            new Transaction(-7585641.52, "1992-08-10"),
            new Transaction(-3965258.72, "1992-10-18"),
            new Transaction(-4833631.80, "1993-01-28"),
            new Transaction(-2762623.55, "1993-04-11"),
            new Transaction(-1344676.29, "1993-07-09"),
            new Transaction(9763380.35, "1993-07-17"),
            new Transaction(-5221307.27, "1993-10-08"),
            new Transaction(-769152.76, "1993-12-26"),
            new Transaction(-9117168.20, "1994-02-27"),
            new Transaction(4271151.14, "1994-03-11"),
            new Transaction(4456409.86, "1994-06-06"),
            new Transaction(8566568.71, "1994-06-07"),
            new Transaction(-2065367.50, "1994-08-13"),
            new Transaction(-222366.66, "1994-10-28"),
            new Transaction(-3316234.01, "1994-12-27"),
            new Transaction(-2428273.38, "1995-02-08"),
            new Transaction(31746.84, "1995-03-30"),
            new Transaction(8606531.19, "1995-06-20"),
            new Transaction(3260803.60, "1995-08-06"),
            new Transaction(2262050.43, "1995-10-01"),
            new Transaction(1063013.02, "1996-01-10"),
            new Transaction(3196418.74, "1996-01-19"),
            new Transaction(8046084.25, "1996-01-31"),
            new Transaction(8486497.12, "1996-05-10"),
            new Transaction(8700584.65, "1996-07-24"),
            new Transaction(-1088136.75, "1996-10-16"),
            new Transaction(1990942.22, "1996-11-23"),
            new Transaction(-5305439.12, "1996-12-13"),
            new Transaction(-8952262.12, "1997-01-01"),
            new Transaction(4514479.48, "1997-02-08"),
            new Transaction(8784164.00, "1997-02-24"),
            new Transaction(-6630459.88, "1997-04-01"),
            new Transaction(2968818.34, "1997-05-01")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(7.0430073142051713E-2, rate, xirr.precision);
    }

    @Test
    void test67() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-18979236.03, "1997-12-23"),
            new Transaction(2548859.64, "1998-02-24"),
            new Transaction(4116825.70, "1998-05-22"),
            new Transaction(8845655.22, "1998-09-01"),
            new Transaction(-1250592.44, "1998-09-13"),
            new Transaction(1194076.95, "1998-11-19"),
            new Transaction(-679412.29, "1998-12-07"),
            new Transaction(9727753.75, "1998-12-26"),
            new Transaction(8691105.87, "1999-01-02"),
            new Transaction(7296459.91, "1999-01-20"),
            new Transaction(4272136.73, "1999-03-08"),
            new Transaction(218056.52, "1999-05-27"),
            new Transaction(187155.02, "1999-07-20"),
            new Transaction(4686271.39, "1999-09-22"),
            new Transaction(-5648395.99, "1999-11-21"),
            new Transaction(-794805.81, "1999-11-23"),
            new Transaction(-8582088.26, "1999-12-12"),
            new Transaction(2678273.98, "2000-01-04"),
            new Transaction(-3226388.22, "2000-02-02"),
            new Transaction(-341670.76, "2000-04-27"),
            new Transaction(3455133.10, "2000-05-02"),
            new Transaction(671190.47, "2000-07-04"),
            new Transaction(-4257019.00, "2000-07-10"),
            new Transaction(9892262.47, "2000-07-29"),
            new Transaction(-9260419.02, "2000-08-29"),
            new Transaction(4632454.72, "2000-12-05"),
            new Transaction(2060474.13, "2001-01-13"),
            new Transaction(-3006990.12, "2001-02-01"),
            new Transaction(2246744.52, "2001-02-24"),
            new Transaction(-8712997.25, "2001-05-02"),
            new Transaction(-2401964.25, "2001-06-10"),
            new Transaction(5804620.36, "2001-08-12"),
            new Transaction(1892774.18, "2001-09-19"),
            new Transaction(5539857.36, "2001-12-13"),
            new Transaction(4270887.01, "2002-02-22"),
            new Transaction(-1580850.43, "2002-04-27"),
            new Transaction(7624289.67, "2002-06-01"),
            new Transaction(5086681.98, "2002-06-01"),
            new Transaction(7260004.61, "2002-08-21"),
            new Transaction(8319239.37, "2002-11-18"),
            new Transaction(8446426.22, "2003-02-26"),
            new Transaction(9738332.25, "2003-04-24"),
            new Transaction(-5388085.68, "2003-07-23"),
            new Transaction(-3121923.11, "2003-10-30"),
            new Transaction(7634532.49, "2004-01-18"),
            new Transaction(7788302.91, "2004-01-19"),
            new Transaction(6200559.06, "2004-04-21"),
            new Transaction(-8059791.59, "2004-07-06"),
            new Transaction(-6576209.19, "2004-09-26"),
            new Transaction(-1336024.41, "2005-01-10"),
            new Transaction(5533673.73, "2005-02-14"),
            new Transaction(6610789.91, "2005-03-21"),
            new Transaction(2487562.87, "2005-04-13"),
            new Transaction(-3177480.27, "2005-07-19"),
            new Transaction(3024273.14, "2005-10-24"),
            new Transaction(7065556.03, "2005-12-17"),
            new Transaction(-3785782.47, "2006-01-04"),
            new Transaction(1710297.33, "2006-02-18"),
            new Transaction(-4516687.13, "2006-05-16"),
            new Transaction(8288180.46, "2006-07-04"),
            new Transaction(8358163.01, "2006-09-12"),
            new Transaction(-6485120.56, "2006-11-12"),
            new Transaction(6774299.92, "2007-01-22"),
            new Transaction(7545542.30, "2007-04-29"),
            new Transaction(7300326.21, "2007-06-22"),
            new Transaction(-4391727.70, "2007-08-14"),
            new Transaction(-4171026.39, "2007-10-30"),
            new Transaction(-9436680.84, "2007-12-11"),
            new Transaction(-5326792.86, "2007-12-24"),
            new Transaction(8108323.33, "2008-04-02"),
            new Transaction(6016690.88, "2008-04-26"),
            new Transaction(4100875.91, "2008-06-17"),
            new Transaction(-2666554.92, "2008-07-02"),
            new Transaction(-9487606.21, "2008-09-30"),
            new Transaction(-7360770.86, "2008-12-24"),
            new Transaction(363106.15, "2009-02-05"),
            new Transaction(-1200549.56, "2009-05-18"),
            new Transaction(1333906.76, "2009-08-26"),
            new Transaction(-9986179.28, "2009-09-24"),
            new Transaction(-5847130.30, "2010-01-08"),
            new Transaction(-5628495.39, "2010-04-19"),
            new Transaction(1413839.10, "2010-07-08"),
            new Transaction(-972445.54, "2010-07-24"),
            new Transaction(2795268.89, "2010-07-30"),
            new Transaction(-121470.60, "2010-09-03"),
            new Transaction(5043936.82, "2010-11-30"),
            new Transaction(6130562.86, "2011-01-10"),
            new Transaction(8497398.03, "2011-01-29"),
            new Transaction(-8580552.78, "2011-04-12"),
            new Transaction(9681606.85, "2011-07-10"),
            new Transaction(-8208418.34, "2011-08-05"),
            new Transaction(17468869.29, "2011-11-15")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(1.6939468741416932, rate, xirr.precision);
    }

    @Test
    void test68() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-8392394.41, "1987-12-11"),
            new Transaction(-7426117.53, "1988-01-14"),
            new Transaction(1922806.00, "1988-06-07"),
            new Transaction(2925437.10, "1988-08-21"),
            new Transaction(2176468.86, "1988-08-28"),
            new Transaction(-9155348.94, "1988-12-23"),
            new Transaction(6147203.69, "1989-05-05"),
            new Transaction(-5941749.23, "1989-08-05"),
            new Transaction(3971612.59, "1989-10-29"),
            new Transaction(-5032168.67, "1990-03-26"),
            new Transaction(7641584.13, "1990-05-31"),
            new Transaction(-683262.06, "1990-08-21"),
            new Transaction(-6393714.20, "1990-12-13"),
            new Transaction(-3236296.52, "1991-03-20"),
            new Transaction(-8024896.90, "1991-03-24"),
            new Transaction(3682329.92, "1991-07-04"),
            new Transaction(-3708940.75, "1991-09-19"),
            new Transaction(7278809.28, "1991-11-24"),
            new Transaction(-693228.24, "1992-03-05"),
            new Transaction(-8727234.08, "1992-07-17"),
            new Transaction(5537644.75, "1992-09-10"),
            new Transaction(-9492226.79, "1992-10-21"),
            new Transaction(-2500122.92, "1992-11-14"),
            new Transaction(-3399720.35, "1993-03-31"),
            new Transaction(2821966.53, "1993-06-13"),
            new Transaction(9863257.76, "1993-08-28"),
            new Transaction(-3362340.88, "1993-12-11"),
            new Transaction(-2449118.95, "1994-01-15"),
            new Transaction(-6861231.31, "1994-02-28"),
            new Transaction(-8805071.89, "1994-03-06"),
            new Transaction(12823.63, "1994-03-16"),
            new Transaction(455024.33, "1994-03-23"),
            new Transaction(-5886625.98, "1994-07-04"),
            new Transaction(-2383961.26, "1994-09-14"),
            new Transaction(-7619386.75, "1995-02-04"),
            new Transaction(2211750.23, "1995-06-05"),
            new Transaction(-9729836.36, "1995-07-17"),
            new Transaction(8947285.96, "1995-08-31"),
            new Transaction(-4376156.91, "1995-11-09"),
            new Transaction(76179.07, "1995-12-07"),
            new Transaction(2881989.34, "1996-04-13"),
            new Transaction(7410914.22, "1996-08-14"),
            new Transaction(-580364.44, "1996-09-05"),
            new Transaction(89297.34, "1997-02-04"),
            new Transaction(5703364.25, "1997-02-14"),
            new Transaction(5715642.30, "1997-03-07"),
            new Transaction(-5035812.90, "1997-03-15"),
            new Transaction(9938377.45, "1997-05-12"),
            new Transaction(5911787.42, "1997-07-14"),
            new Transaction(668607.74, "1997-08-08"),
            new Transaction(8327442.51, "1997-12-26"),
            new Transaction(-5062063.81, "1998-02-17"),
            new Transaction(784434.13, "1998-03-18"),
            new Transaction(9372129.43, "1998-06-04"),
            new Transaction(-7323890.35, "1998-08-05"),
            new Transaction(-8874500.90, "1998-11-12"),
            new Transaction(-3265042.59, "1999-03-03"),
            new Transaction(-4694947.32, "1999-04-17"),
            new Transaction(-999560.19, "1999-05-06"),
            new Transaction(750197.55, "1999-06-24"),
            new Transaction(9327205.39, "1999-06-26"),
            new Transaction(8713648.62, "1999-07-30"),
            new Transaction(-9014648.30, "1999-10-28"),
            new Transaction(-6521069.90, "1999-11-23"),
            new Transaction(10601890.77, "1999-12-16")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.1441917127062124, rate, xirr.precision);
    }

    @Test
    void test69() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-9425240.88, "1985-12-31"),
            new Transaction(4625552.71, "1986-04-21"),
            new Transaction(532478.01, "1986-08-03"),
            new Transaction(-8167709.97, "1987-04-13"),
            new Transaction(-9320167.31, "1987-04-28"),
            new Transaction(-5018110.19, "1987-07-25"),
            new Transaction(-1661304.53, "1987-10-07"),
            new Transaction(-30879.67, "1987-12-18"),
            new Transaction(221111.95, "1988-11-14"),
            new Transaction(-6063578.66, "1989-04-28"),
            new Transaction(-1086625.32, "1989-05-17"),
            new Transaction(5997809.93, "1989-10-20"),
            new Transaction(9290285.78, "1990-03-28"),
            new Transaction(-8375203.50, "1991-02-17"),
            new Transaction(-1847211.05, "1992-02-02"),
            new Transaction(-2023186.45, "1992-03-06"),
            new Transaction(3565837.34, "1992-07-16"),
            new Transaction(-6982545.15, "1993-04-10"),
            new Transaction(6372060.02, "1993-08-13"),
            new Transaction(-4082978.84, "1993-09-14"),
            new Transaction(7798427.79, "1993-09-24"),
            new Transaction(-9325231.74, "1994-06-09"),
            new Transaction(6846682.11, "1994-09-07"),
            new Transaction(6057702.79, "1995-05-02"),
            new Transaction(-1933809.96, "1996-04-15"),
            new Transaction(9756984.09, "1996-06-08"),
            new Transaction(5469838.10, "1996-10-13"),
            new Transaction(14092311.74, "1996-10-21")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(1.8407717347145088E-2, rate, xirr.precision);
    }

    @Test
    void test70() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-15928056.48, "1997-01-22"),
            new Transaction(7294124.13, "1997-07-21"),
            new Transaction(-1476078.50, "1997-12-26"),
            new Transaction(-5857233.83, "1998-03-30"),
            new Transaction(-4537987.42, "1998-08-17"),
            new Transaction(-57844.75, "1998-09-21"),
            new Transaction(-2880627.15, "1999-01-15"),
            new Transaction(6385892.01, "1999-09-03"),
            new Transaction(-791659.49, "1999-12-19"),
            new Transaction(8916232.62, "2000-06-02"),
            new Transaction(6676789.02, "2000-10-19"),
            new Transaction(-3564349.05, "2000-11-28"),
            new Transaction(-4038511.25, "2001-05-15"),
            new Transaction(-7714096.59, "2001-07-15"),
            new Transaction(1021411.24, "2001-12-19"),
            new Transaction(6525461.55, "2002-07-25"),
            new Transaction(-7304668.33, "2003-06-07"),
            new Transaction(2676691.00, "2003-07-01"),
            new Transaction(-2260575.14, "2004-03-21"),
            new Transaction(2254158.22, "2004-09-04"),
            new Transaction(6978073.65, "2005-02-08"),
            new Transaction(4328496.43, "2005-08-12"),
            new Transaction(4690578.65, "2005-11-16"),
            new Transaction(-8279911.62, "2006-09-16"),
            new Transaction(4351578.54, "2007-07-18"),
            new Transaction(-1340048.05, "2008-03-22"),
            new Transaction(9395616.93, "2008-11-29"),
            new Transaction(8943406.27, "2009-04-21"),
            new Transaction(-8985998.61, "2010-03-05"),
            new Transaction(5147062.45, "2010-10-27"),
            new Transaction(1290365.13, "2011-08-14")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(5.91701954603195E-2, rate, xirr.precision);
    }

    @Test
    void test71() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-18217025.31, "2003-08-20"),
            new Transaction(-3659879.74, "2003-10-31"),
            new Transaction(1561123.48, "2004-01-08"),
            new Transaction(-1989160.76, "2004-03-26"),
            new Transaction(-262825.78, "2004-09-11"),
            new Transaction(-8393255.33, "2005-02-05"),
            new Transaction(4088103.86, "2005-05-29"),
            new Transaction(-9712799.48, "2005-06-13"),
            new Transaction(9977937.67, "2005-09-28"),
            new Transaction(9883204.17, "2005-11-14"),
            new Transaction(-5557150.28, "2006-05-01"),
            new Transaction(-2116620.83, "2006-09-05"),
            new Transaction(3565429.38, "2007-01-02"),
            new Transaction(3036265.25, "2007-06-18"),
            new Transaction(-1685112.38, "2007-08-31"),
            new Transaction(-215191.36, "2007-09-24"),
            new Transaction(-6446671.82, "2007-12-27"),
            new Transaction(-4585539.20, "2008-01-15"),
            new Transaction(9218516.95, "2008-06-25"),
            new Transaction(-7863711.01, "2008-09-01"),
            new Transaction(227816.61, "2008-12-28"),
            new Transaction(-9092358.24, "2008-12-29"),
            new Transaction(8435814.72, "2009-05-10"),
            new Transaction(-4208933.58, "2009-10-18"),
            new Transaction(-235496.61, "2010-02-07"),
            new Transaction(993111.19, "2010-07-22"),
            new Transaction(-1786325.85, "2010-09-06"),
            new Transaction(4067730.77, "2010-10-06"),
            new Transaction(-611584.11, "2011-02-20"),
            new Transaction(-2149929.72, "2011-02-21"),
            new Transaction(-5564199.27, "2011-08-02"),
            new Transaction(8822743.78, "2011-09-11"),
            new Transaction(6053254.26, "2012-02-13"),
            new Transaction(3061255.41, "2012-08-02"),
            new Transaction(-7388877.41, "2012-12-03"),
            new Transaction(-1267036.81, "2013-02-16"),
            new Transaction(-2488969.59, "2013-05-04"),
            new Transaction(1976334.55, "2013-06-08"),
            new Transaction(4212777.37, "2013-10-22"),
            new Transaction(4463177.11, "2013-11-16"),
            new Transaction(12623.23, "2014-03-09"),
            new Transaction(2150268.21, "2014-07-17"),
            new Transaction(3469079.56, "2014-09-16"),
            new Transaction(1042937.74, "2015-02-20"),
            new Transaction(7366989.38, "2015-03-12"),
            new Transaction(7260712.66, "2015-06-27"),
            new Transaction(266105.00, "2015-11-20"),
            new Transaction(9986132.74, "2016-04-15"),
            new Transaction(8761273.47, "2016-07-10"),
            new Transaction(-7386775.48, "2016-07-29"),
            new Transaction(-5741406.24, "2016-11-30"),
            new Transaction(5902754.35, "2017-02-03"),
            new Transaction(-4162678.03, "2017-06-18"),
            new Transaction(5914206.44, "2017-09-07"),
            new Transaction(7034385.92, "2017-11-09"),
            new Transaction(-8297945.56, "2018-03-07"),
            new Transaction(9016024.58, "2018-04-06"),
            new Transaction(2108688.01, "2018-04-24")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(5.1315608620643632E-2, rate, xirr.precision);
    }

    @Test
    void test72() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-1538962.21, "2009-05-19"),
            new Transaction(-1229950.52, "2009-08-28"),
            new Transaction(-6707585.29, "2009-11-09"),
            new Transaction(-8053557.41, "2009-11-09"),
            new Transaction(-1536652.73, "2009-12-24"),
            new Transaction(-9731112.14, "2010-04-14"),
            new Transaction(-9095837.40, "2010-05-25"),
            new Transaction(6223454.98, "2010-09-29"),
            new Transaction(-4901865.74, "2011-02-04"),
            new Transaction(1076921.26, "2011-04-05"),
            new Transaction(3483726.57, "2011-08-12"),
            new Transaction(309080.18, "2011-11-13"),
            new Transaction(-2774157.80, "2011-12-15"),
            new Transaction(63783.38, "2012-02-10"),
            new Transaction(5869431.83, "2012-04-04"),
            new Transaction(6503817.80, "2012-08-16"),
            new Transaction(-9509198.94, "2012-09-14"),
            new Transaction(9843241.51, "2012-10-19"),
            new Transaction(-638354.55, "2012-11-17"),
            new Transaction(4964238.47, "2012-12-28"),
            new Transaction(748330.67, "2013-03-16"),
            new Transaction(137183.71, "2013-03-22"),
            new Transaction(3111497.24, "2013-06-22"),
            new Transaction(-8768504.09, "2013-08-25"),
            new Transaction(7018049.48, "2013-11-15"),
            new Transaction(2735369.79, "2013-12-20"),
            new Transaction(4792587.65, "2014-04-22"),
            new Transaction(1405497.49, "2014-06-21"),
            new Transaction(2492406.03, "2014-10-11"),
            new Transaction(6869415.00, "2014-11-07"),
            new Transaction(-8290369.23, "2015-03-05"),
            new Transaction(-9591280.71, "2015-04-22"),
            new Transaction(1619215.11, "2015-07-12"),
            new Transaction(-2371824.54, "2015-08-28"),
            new Transaction(5672754.43, "2015-08-28"),
            new Transaction(-2686154.00, "2015-12-15"),
            new Transaction(-7347131.73, "2016-04-13"),
            new Transaction(-9134601.96, "2016-04-23"),
            new Transaction(3203072.03, "2016-06-18"),
            new Transaction(-4901369.88, "2016-09-02"),
            new Transaction(-1974452.28, "2016-11-20"),
            new Transaction(-5783127.52, "2017-01-01"),
            new Transaction(2254056.70, "2017-02-11"),
            new Transaction(-9032512.74, "2017-02-11"),
            new Transaction(7851200.97, "2017-05-17"),
            new Transaction(-8099273.67, "2017-08-06"),
            new Transaction(4258918.77, "2017-11-06"),
            new Transaction(76687.65, "2017-11-18"),
            new Transaction(5124902.78, "2017-12-24"),
            new Transaction(-7294919.28, "2018-05-02"),
            new Transaction(-9122484.90, "2018-07-29"),
            new Transaction(2437483.43, "2018-08-24"),
            new Transaction(7641762.51, "2019-01-05"),
            new Transaction(7491528.20, "2019-03-25"),
            new Transaction(-9275662.12, "2019-06-03"),
            new Transaction(4876625.50, "2019-07-13"),
            new Transaction(2893440.62, "2019-11-16"),
            new Transaction(6140256.19, "2020-01-18"),
            new Transaction(8018149.11, "2020-03-03"),
            new Transaction(-5701120.77, "2020-05-03"),
            new Transaction(-4927715.25, "2020-05-18"),
            new Transaction(3206751.29, "2020-05-28"),
            new Transaction(9338890.32, "2020-09-22"),
            new Transaction(6782643.74, "2021-01-14"),
            new Transaction(-2346890.40, "2021-03-08"),
            new Transaction(-881434.59, "2021-05-29"),
            new Transaction(9706805.52, "2021-09-21"),
            new Transaction(-4146564.75, "2021-10-04"),
            new Transaction(9984358.18, "2022-02-06"),
            new Transaction(4120376.23, "2022-03-15"),
            new Transaction(-7328049.56, "2022-06-13"),
            new Transaction(9042687.98, "2022-10-16"),
            new Transaction(-213336.15, "2023-02-08"),
            new Transaction(15017191.20, "2023-04-03")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(4.4977053999900832E-2, rate, xirr.precision);
    }

    @Test
    void test73() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-12041621.16, "2002-01-11"),
            new Transaction(-9367274.43, "2002-02-18"),
            new Transaction(3026073.27, "2002-06-13"),
            new Transaction(-349503.74, "2002-08-12"),
            new Transaction(3689742.06, "2002-09-07"),
            new Transaction(-4810528.60, "2003-02-18"),
            new Transaction(5573046.06, "2003-05-05"),
            new Transaction(5180540.67, "2003-06-11"),
            new Transaction(9207719.16, "2003-08-15"),
            new Transaction(5138048.22, "2003-12-04"),
            new Transaction(-3869236.52, "2003-12-21"),
            new Transaction(-757184.58, "2004-06-02"),
            new Transaction(-4240521.79, "2004-08-24"),
            new Transaction(-3409463.91, "2004-09-22"),
            new Transaction(-4214824.97, "2004-11-18"),
            new Transaction(-8596452.06, "2005-04-28"),
            new Transaction(9475781.01, "2005-07-14"),
            new Transaction(-8602596.70, "2005-10-08"),
            new Transaction(2550743.48, "2006-03-09"),
            new Transaction(-9559340.32, "2006-07-05"),
            new Transaction(-7979808.56, "2006-10-22"),
            new Transaction(969526.32, "2006-12-06"),
            new Transaction(3110162.35, "2007-03-04"),
            new Transaction(7364691.53, "2007-08-14"),
            new Transaction(6416913.47, "2007-11-21"),
            new Transaction(5140567.37, "2007-12-17"),
            new Transaction(9264884.43, "2008-01-02"),
            new Transaction(2506653.48, "2008-06-14"),
            new Transaction(9487329.12, "2008-08-20"),
            new Transaction(9002678.79, "2008-11-22"),
            new Transaction(7730218.44, "2009-02-22"),
            new Transaction(5534318.90, "2009-06-18"),
            new Transaction(8945824.41, "2009-09-10"),
            new Transaction(-4033022.01, "2009-10-28"),
            new Transaction(8016047.02, "2010-01-01"),
            new Transaction(4709639.48, "2010-04-16"),
            new Transaction(-1036572.69, "2010-05-12"),
            new Transaction(4315729.91, "2010-08-17"),
            new Transaction(-5017536.02, "2010-10-11"),
            new Transaction(-4909769.16, "2011-03-16"),
            new Transaction(5765748.46, "2011-07-02"),
            new Transaction(-1544615.80, "2011-09-28"),
            new Transaction(4159743.76, "2011-10-22"),
            new Transaction(-9268541.12, "2012-02-10"),
            new Transaction(3802448.73, "2012-03-11"),
            new Transaction(3155244.13, "2012-05-06"),
            new Transaction(4380038.63, "2012-06-23"),
            new Transaction(-2464399.36, "2012-07-17"),
            new Transaction(-7111892.65, "2012-08-28"),
            new Transaction(-9840837.31, "2012-11-28"),
            new Transaction(6652918.16, "2013-04-07"),
            new Transaction(-465784.44, "2013-06-23"),
            new Transaction(2672661.88, "2013-09-11"),
            new Transaction(2742637.54, "2013-12-12"),
            new Transaction(1626528.94, "2014-03-21"),
            new Transaction(-2969258.02, "2014-04-11"),
            new Transaction(7613807.47, "2014-09-19"),
            new Transaction(-4618650.05, "2014-11-25"),
            new Transaction(6958389.42, "2015-02-28"),
            new Transaction(18555688.08, "2015-06-24")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.25448066592216489, rate, xirr.precision);
    }

    @Test
    void test74() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-2598430.56, "2002-04-13"),
            new Transaction(7415640.90, "2002-05-09"),
            new Transaction(7807152.78, "2002-05-13"),
            new Transaction(7675251.85, "2002-08-31"),
            new Transaction(7761186.67, "2002-11-11"),
            new Transaction(-4128338.26, "2003-02-08"),
            new Transaction(-8627246.79, "2003-03-04"),
            new Transaction(-9743926.56, "2003-06-18"),
            new Transaction(6591082.64, "2003-09-09"),
            new Transaction(-3208514.25, "2003-09-19"),
            new Transaction(-4353338.75, "2003-11-14"),
            new Transaction(-967815.01, "2004-02-13"),
            new Transaction(-2282918.50, "2004-04-13"),
            new Transaction(-9896315.33, "2004-07-24"),
            new Transaction(5363341.34, "2004-10-04"),
            new Transaction(-6730606.57, "2004-10-12"),
            new Transaction(-8377383.88, "2005-01-03"),
            new Transaction(6712870.14, "2005-01-09"),
            new Transaction(-2391341.84, "2005-02-05"),
            new Transaction(-1644707.68, "2005-04-11"),
            new Transaction(4095571.59, "2005-07-22"),
            new Transaction(-1901375.45, "2005-09-20"),
            new Transaction(-2679942.62, "2005-12-07"),
            new Transaction(-1774684.84, "2005-12-12"),
            new Transaction(-5132185.02, "2006-03-09"),
            new Transaction(7413673.40, "2006-03-23"),
            new Transaction(-2530503.53, "2006-05-07"),
            new Transaction(9348541.18, "2006-08-25"),
            new Transaction(-6564705.52, "2006-09-13"),
            new Transaction(4267105.64, "2006-10-18"),
            new Transaction(-4341161.36, "2006-10-22"),
            new Transaction(-7500294.57, "2006-11-13"),
            new Transaction(5286506.64, "2006-12-13"),
            new Transaction(-2875924.56, "2007-01-21"),
            new Transaction(173307.08, "2007-03-31"),
            new Transaction(-5238961.82, "2007-06-07"),
            new Transaction(-1396694.19, "2007-08-24"),
            new Transaction(-1064864.59, "2007-10-16"),
            new Transaction(-938072.23, "2008-02-06"),
            new Transaction(5283257.70, "2008-03-14"),
            new Transaction(9762434.08, "2008-05-24"),
            new Transaction(4410753.61, "2008-07-07"),
            new Transaction(-7574199.00, "2008-07-10"),
            new Transaction(5487919.64, "2008-09-11"),
            new Transaction(-2699488.73, "2008-12-09"),
            new Transaction(-7180499.64, "2009-01-15"),
            new Transaction(-3781651.74, "2009-01-29"),
            new Transaction(7879646.58, "2009-05-21"),
            new Transaction(-6566220.63, "2009-08-13"),
            new Transaction(-4927294.58, "2009-11-03"),
            new Transaction(5785268.56, "2009-11-06"),
            new Transaction(-6236363.27, "2009-12-13"),
            new Transaction(7642980.23, "2010-02-15"),
            new Transaction(-578435.57, "2010-02-23"),
            new Transaction(-7358551.97, "2010-05-21"),
            new Transaction(-1906919.62, "2010-08-11"),
            new Transaction(1651740.03, "2010-08-14"),
            new Transaction(-9437747.47, "2010-09-24"),
            new Transaction(4056566.50, "2011-01-14"),
            new Transaction(78489.03, "2011-03-25"),
            new Transaction(-806986.55, "2011-06-17"),
            new Transaction(5114392.88, "2011-08-05"),
            new Transaction(-4522962.63, "2011-09-30"),
            new Transaction(6140001.94, "2011-11-30"),
            new Transaction(7263134.43, "2012-01-20"),
            new Transaction(600830.77, "2012-05-04"),
            new Transaction(-5956373.55, "2012-06-19"),
            new Transaction(-6061196.59, "2012-09-28"),
            new Transaction(-6200459.20, "2013-01-10"),
            new Transaction(3676412.89, "2013-04-11"),
            new Transaction(9282529.96, "2013-04-22"),
            new Transaction(-8632223.26, "2013-07-18"),
            new Transaction(-864391.06, "2013-09-10"),
            new Transaction(-8727877.15, "2013-11-18"),
            new Transaction(6514409.16, "2014-03-12"),
            new Transaction(-3736535.35, "2014-07-01"),
            new Transaction(-7271919.48, "2014-09-06"),
            new Transaction(8829386.85, "2014-11-10"),
            new Transaction(9968912.93, "2014-11-30"),
            new Transaction(662224.86, "2015-01-02"),
            new Transaction(3033081.71, "2015-03-02"),
            new Transaction(3939763.34, "2015-05-09"),
            new Transaction(-2767704.52, "2015-07-03"),
            new Transaction(2112459.83, "2015-07-14"),
            new Transaction(5821951.14, "2015-07-27"),
            new Transaction(-5451438.59, "2015-08-09"),
            new Transaction(14888700.94, "2015-11-25")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.4774053869061837, rate, xirr.precision);
    }

    @Test
    void test75() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-14109103.65, "2001-08-04"),
            new Transaction(6910730.29, "2001-11-27"),
            new Transaction(9027732.72, "2002-03-01"),
            new Transaction(-7622580.24, "2002-07-16"),
            new Transaction(5327723.41, "2002-11-30"),
            new Transaction(-2690945.49, "2002-12-27"),
            new Transaction(6048570.47, "2003-04-14"),
            new Transaction(-8645637.05, "2003-05-03"),
            new Transaction(7305177.53, "2003-06-10"),
            new Transaction(9613860.16, "2003-06-19"),
            new Transaction(-3663776.05, "2003-08-09"),
            new Transaction(9014457.89, "2003-08-15"),
            new Transaction(-8975221.78, "2003-12-18"),
            new Transaction(-1809220.97, "2004-04-21"),
            new Transaction(-3692472.09, "2004-08-14"),
            new Transaction(-4030122.86, "2004-12-24"),
            new Transaction(-4433660.57, "2005-05-10"),
            new Transaction(-9923061.76, "2005-07-18"),
            new Transaction(4254281.03, "2005-09-26"),
            new Transaction(-3273337.59, "2005-11-13"),
            new Transaction(3103423.14, "2006-03-29"),
            new Transaction(3150391.81, "2006-04-11"),
            new Transaction(-8676494.30, "2006-05-16"),
            new Transaction(7842853.20, "2006-10-04"),
            new Transaction(289115.12, "2007-01-27"),
            new Transaction(3098872.21, "2007-02-05"),
            new Transaction(9409909.11, "2007-05-15"),
            new Transaction(-6957686.92, "2007-06-25"),
            new Transaction(-3013253.38, "2007-09-15"),
            new Transaction(-7763270.00, "2008-01-07"),
            new Transaction(2160251.73, "2008-04-20"),
            new Transaction(-7637947.05, "2008-06-07"),
            new Transaction(-9244785.19, "2008-06-22"),
            new Transaction(-7821457.95, "2008-10-18"),
            new Transaction(3048780.08, "2009-01-25"),
            new Transaction(9553831.28, "2009-02-07"),
            new Transaction(-526854.47, "2009-05-20"),
            new Transaction(-5010266.89, "2009-08-04"),
            new Transaction(728564.39, "2009-12-22"),
            new Transaction(-3084554.49, "2010-04-11"),
            new Transaction(-1251933.36, "2010-04-30"),
            new Transaction(4103376.47, "2010-05-08"),
            new Transaction(-7640770.29, "2010-05-09"),
            new Transaction(9454557.17, "2010-06-27"),
            new Transaction(-2618684.03, "2010-11-05"),
            new Transaction(-2194504.76, "2011-02-21"),
            new Transaction(3348373.23, "2011-04-05"),
            new Transaction(-3400254.10, "2011-08-19"),
            new Transaction(1766068.29, "2011-10-26"),
            new Transaction(7831261.46, "2011-12-11"),
            new Transaction(2816502.05, "2012-04-09"),
            new Transaction(-1835187.53, "2012-05-17"),
            new Transaction(-7980451.64, "2012-08-02"),
            new Transaction(975001.47, "2012-11-30"),
            new Transaction(-2063250.95, "2013-01-03"),
            new Transaction(9219248.28, "2013-03-06"),
            new Transaction(-9075516.91, "2013-06-14"),
            new Transaction(9614348.01, "2013-07-05"),
            new Transaction(-1690134.74, "2013-09-23"),
            new Transaction(8402356.02, "2013-09-28"),
            new Transaction(-2200220.68, "2013-10-02"),
            new Transaction(1250123.53, "2013-11-04"),
            new Transaction(-2176266.22, "2013-12-08"),
            new Transaction(-3983980.85, "2014-02-14"),
            new Transaction(-3984816.33, "2014-06-23"),
            new Transaction(5962905.49, "2014-08-10"),
            new Transaction(6307014.19, "2014-10-03"),
            new Transaction(-2759489.61, "2015-01-05"),
            new Transaction(15196871.34, "2015-03-15")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-6.4601749181747437E-3, rate, xirr.precision);
    }

    @Test
    void test76() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-8640874.94, "2003-04-02"),
            new Transaction(112830.53, "2003-12-25"),
            new Transaction(-5246614.04, "2004-03-14"),
            new Transaction(7723923.05, "2005-05-16"),
            new Transaction(88668.60, "2005-08-01"),
            new Transaction(2543730.98, "2005-11-09"),
            new Transaction(-3999979.16, "2006-10-15"),
            new Transaction(7701425.30, "2007-02-17"),
            new Transaction(8573671.41, "2007-08-03"),
            new Transaction(-3573138.37, "2008-04-22"),
            new Transaction(8758034.84, "2009-02-09"),
            new Transaction(-4267063.89, "2009-03-19"),
            new Transaction(2688724.35, "2009-08-04"),
            new Transaction(-382348.99, "2010-09-14"),
            new Transaction(1902214.80, "2011-02-06"),
            new Transaction(-6617592.99, "2012-02-22"),
            new Transaction(-2851610.21, "2012-10-18"),
            new Transaction(4222637.60, "2013-05-20"),
            new Transaction(7076426.17, "2013-08-06"),
            new Transaction(3994961.56, "2013-11-14"),
            new Transaction(3975158.12, "2014-01-23"),
            new Transaction(1698069.28, "2014-12-27"),
            new Transaction(19386564.68, "2015-11-12")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.27335315346717837, rate, xirr.precision);
    }

    @Test
    void test77() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-19718953.05, "1992-08-02"),
            new Transaction(-1830294.20, "1992-11-21"),
            new Transaction(5677665.10, "1993-05-26"),
            new Transaction(8806288.42, "1993-06-27"),
            new Transaction(7905895.94, "1993-07-06"),
            new Transaction(-262124.79, "1993-10-07"),
            new Transaction(-2067005.04, "1994-03-12"),
            new Transaction(-4346396.10, "1994-06-08"),
            new Transaction(-3254839.60, "1994-08-04"),
            new Transaction(951493.26, "1995-01-25"),
            new Transaction(8374575.17, "1995-02-04"),
            new Transaction(-8233432.81, "1995-02-08"),
            new Transaction(9676881.44, "1995-06-17"),
            new Transaction(-827944.02, "1995-10-05"),
            new Transaction(-5408626.33, "1996-04-12"),
            new Transaction(-7233484.76, "1996-07-27"),
            new Transaction(2136103.68, "1996-10-14"),
            new Transaction(4498540.56, "1997-01-24"),
            new Transaction(-7242008.08, "1997-03-11"),
            new Transaction(2757381.75, "1997-04-23"),
            new Transaction(3209834.16, "1997-05-02"),
            new Transaction(-8720295.22, "1997-09-10"),
            new Transaction(2964880.02, "1997-12-10"),
            new Transaction(7054003.87, "1998-05-19"),
            new Transaction(-6230708.38, "1998-09-09"),
            new Transaction(-3187699.52, "1998-12-24"),
            new Transaction(9451910.48, "1999-02-04"),
            new Transaction(-4418426.77, "1999-06-29"),
            new Transaction(-5238621.94, "1999-12-02"),
            new Transaction(-8548963.58, "2000-05-23"),
            new Transaction(5467558.36, "2000-11-12"),
            new Transaction(-2398663.89, "2001-04-22"),
            new Transaction(8493412.87, "2001-04-24"),
            new Transaction(7713445.78, "2001-08-28"),
            new Transaction(743799.18, "2001-12-20"),
            new Transaction(-1582084.58, "2002-02-08"),
            new Transaction(2816502.64, "2002-02-28"),
            new Transaction(-4276847.77, "2002-08-22"),
            new Transaction(8681919.65, "2002-10-23"),
            new Transaction(8284783.82, "2002-12-02"),
            new Transaction(9284019.89, "2003-01-07"),
            new Transaction(-2836724.12, "2003-01-11"),
            new Transaction(3158668.38, "2003-04-11"),
            new Transaction(-3269692.57, "2003-07-09"),
            new Transaction(9854419.99, "2004-01-12"),
            new Transaction(3036251.62, "2004-03-26"),
            new Transaction(6748011.39, "2004-06-17"),
            new Transaction(-7018949.44, "2004-11-16"),
            new Transaction(-9723941.44, "2005-02-17"),
            new Transaction(7835388.38, "2005-08-18"),
            new Transaction(-5098098.19, "2005-11-17"),
            new Transaction(15515857.78, "2006-04-21")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.15980965495109561, rate, xirr.precision);
    }

    @Test
    void test78() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-13799720.99, "2009-05-30"),
            new Transaction(1116515.94, "2009-10-14"),
            new Transaction(1539660.33, "2009-12-30"),
            new Transaction(-5373591.89, "2010-06-21"),
            new Transaction(7354420.14, "2010-11-15"),
            new Transaction(-2466242.29, "2011-06-13"),
            new Transaction(4848201.45, "2012-01-26"),
            new Transaction(-1228302.00, "2012-01-29"),
            new Transaction(-1753685.51, "2012-10-11"),
            new Transaction(5540149.03, "2012-12-24"),
            new Transaction(9388851.11, "2013-07-05"),
            new Transaction(1402.31, "2013-10-06"),
            new Transaction(-7894100.69, "2014-04-14"),
            new Transaction(-2943548.80, "2014-08-06"),
            new Transaction(7007644.89, "2015-03-25"),
            new Transaction(1712826.95, "2016-01-01"),
            new Transaction(-7279224.37, "2016-03-31"),
            new Transaction(7291374.43, "2016-12-15"),
            new Transaction(-6097349.39, "2017-06-14"),
            new Transaction(-3178979.20, "2017-07-16"),
            new Transaction(7617581.54, "2018-04-13"),
            new Transaction(-6075579.31, "2018-09-08"),
            new Transaction(8228977.22, "2019-06-02"),
            new Transaction(-8511849.72, "2019-11-06"),
            new Transaction(7154588.79, "2020-06-10"),
            new Transaction(2641829.74, "2021-01-25"),
            new Transaction(9489439.74, "2021-09-24"),
            new Transaction(-6683631.17, "2021-11-29"),
            new Transaction(-535104.86, "2022-05-13"),
            new Transaction(7095236.98, "2022-12-02"),
            new Transaction(-1829818.67, "2023-08-06"),
            new Transaction(7284636.19, "2023-12-03"),
            new Transaction(-4825846.55, "2024-05-30"),
            new Transaction(-1590728.00, "2024-10-11"),
            new Transaction(19163326.11, "2025-04-15")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.14387242197990419, rate, xirr.precision);
    }

    @Test
    void test79() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-12587073.54, "1989-06-13"),
            new Transaction(-2896972.04, "1990-06-12"),
            new Transaction(8586593.92, "1990-09-02"),
            new Transaction(-1705384.50, "1991-02-08"),
            new Transaction(-5775417.79, "1991-07-28"),
            new Transaction(3661345.72, "1991-10-07"),
            new Transaction(5773532.95, "1992-03-03"),
            new Transaction(-413181.52, "1992-12-03"),
            new Transaction(4622680.24, "1993-05-07"),
            new Transaction(5371745.32, "1993-08-03"),
            new Transaction(4134795.04, "1994-07-01"),
            new Transaction(9023509.89, "1995-07-15"),
            new Transaction(4820576.97, "1996-06-06"),
            new Transaction(5510680.84, "1996-11-25"),
            new Transaction(6434314.39, "1997-01-09"),
            new Transaction(-234599.53, "1997-07-31"),
            new Transaction(8068839.52, "1997-08-23"),
            new Transaction(-6341834.76, "1998-03-14"),
            new Transaction(-7406603.28, "1998-08-23"),
            new Transaction(-4871239.83, "1999-04-10"),
            new Transaction(8108920.41, "1999-05-26"),
            new Transaction(2121015.08, "1999-09-21"),
            new Transaction(3210855.51, "2000-02-16"),
            new Transaction(9761405.79, "2000-06-17")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.32587264180183406, rate, xirr.precision);
    }

    @Test
    void test80() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-7267296.01, "1998-05-03"),
            new Transaction(-7631374.37, "1998-05-26"),
            new Transaction(2011260.71, "1998-07-19"),
            new Transaction(-8229609.44, "1998-07-28"),
            new Transaction(-9940368.99, "1998-08-10"),
            new Transaction(3623964.19, "1998-08-19"),
            new Transaction(9282203.36, "1998-09-03"),
            new Transaction(-5648776.74, "1998-11-18"),
            new Transaction(6782557.03, "1999-01-22"),
            new Transaction(2383384.77, "1999-03-05"),
            new Transaction(5219544.64, "1999-07-10"),
            new Transaction(-1369274.84, "1999-08-03"),
            new Transaction(8217231.52, "1999-08-30"),
            new Transaction(5679816.39, "1999-11-11"),
            new Transaction(6310210.79, "1999-11-30"),
            new Transaction(4070981.26, "1999-12-21"),
            new Transaction(-1117738.59, "2000-03-24"),
            new Transaction(-401601.68, "2000-04-10"),
            new Transaction(-1699721.16, "2000-05-25"),
            new Transaction(-8757206.76, "2000-06-12"),
            new Transaction(7628653.47, "2000-09-24"),
            new Transaction(9632385.50, "2000-11-09"),
            new Transaction(-4019583.35, "2000-12-11"),
            new Transaction(6939738.88, "2001-04-09"),
            new Transaction(-9099103.33, "2001-07-03"),
            new Transaction(8139447.48, "2001-08-18"),
            new Transaction(9441334.24, "2001-10-30"),
            new Transaction(-908770.75, "2001-12-24"),
            new Transaction(531457.78, "2002-03-01"),
            new Transaction(-2877458.75, "2002-05-16"),
            new Transaction(1650871.02, "2002-08-20"),
            new Transaction(-4108443.08, "2002-12-08"),
            new Transaction(-2053150.49, "2003-02-03"),
            new Transaction(6592237.26, "2003-02-07"),
            new Transaction(-3567921.53, "2003-05-16"),
            new Transaction(3258058.59, "2003-06-07"),
            new Transaction(-3250119.14, "2003-09-20"),
            new Transaction(-3648757.09, "2003-11-09"),
            new Transaction(7961650.75, "2004-03-16"),
            new Transaction(-8566643.18, "2004-06-06"),
            new Transaction(-3568930.05, "2004-08-12"),
            new Transaction(4535955.59, "2004-09-16"),
            new Transaction(9936539.22, "2005-01-11"),
            new Transaction(1022990.37, "2005-02-05"),
            new Transaction(-3783145.33, "2005-02-16"),
            new Transaction(-7948474.89, "2005-05-17"),
            new Transaction(2128079.12, "2005-08-03"),
            new Transaction(9556402.49, "2005-11-27"),
            new Transaction(-4495854.77, "2006-01-22"),
            new Transaction(-8292210.27, "2006-05-04"),
            new Transaction(-37704.07, "2006-08-05"),
            new Transaction(-4178420.54, "2006-09-17"),
            new Transaction(2283499.49, "2007-01-05"),
            new Transaction(7802085.09, "2007-04-29"),
            new Transaction(-2661949.28, "2007-05-25"),
            new Transaction(7344359.47, "2007-06-12"),
            new Transaction(-4958025.21, "2007-06-28"),
            new Transaction(-5735871.63, "2007-08-22"),
            new Transaction(-6225018.74, "2007-12-20"),
            new Transaction(-5077864.91, "2008-01-01"),
            new Transaction(-38502.60, "2008-03-21"),
            new Transaction(-3524494.43, "2008-07-07"),
            new Transaction(-6550782.97, "2008-07-09"),
            new Transaction(1877077.85, "2008-08-07"),
            new Transaction(5709631.70, "2008-09-15"),
            new Transaction(-5476328.02, "2008-11-19"),
            new Transaction(-6562060.87, "2008-12-20"),
            new Transaction(-6419467.64, "2009-01-05"),
            new Transaction(4726540.86, "2009-03-13"),
            new Transaction(-4021283.51, "2009-05-21"),
            new Transaction(6695161.82, "2009-10-03"),
            new Transaction(-8401328.11, "2009-11-18"),
            new Transaction(3369871.07, "2010-03-26")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.05123628572590463, rate, xirr.precision);
    }

    @Test
    void test81() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-13060202.25, "1989-05-19"),
            new Transaction(-9382866.61, "1989-09-01"),
            new Transaction(1252533.61, "1989-09-29"),
            new Transaction(-3764653.60, "1989-10-04"),
            new Transaction(-2162649.28, "1989-10-10"),
            new Transaction(-3154608.21, "1989-11-21"),
            new Transaction(-2889094.89, "1990-03-03"),
            new Transaction(7803595.62, "1990-05-04"),
            new Transaction(-9351862.92, "1990-07-11"),
            new Transaction(-7965412.40, "1990-11-03"),
            new Transaction(-3896167.65, "1991-01-04"),
            new Transaction(-6552435.00, "1991-04-29"),
            new Transaction(-6788395.61, "1991-07-02"),
            new Transaction(2424281.11, "1991-09-03"),
            new Transaction(2855146.37, "1991-09-13"),
            new Transaction(6291432.29, "1991-11-13"),
            new Transaction(-1078380.54, "1992-02-17"),
            new Transaction(9960784.44, "1992-03-18"),
            new Transaction(9248726.16, "1992-07-02"),
            new Transaction(4359310.20, "1992-08-28"),
            new Transaction(6922355.21, "1992-10-09"),
            new Transaction(-4636864.78, "1992-11-30"),
            new Transaction(9435886.80, "1993-01-27"),
            new Transaction(-434870.91, "1993-03-18"),
            new Transaction(-6864608.95, "1993-03-18"),
            new Transaction(-4835342.89, "1993-04-29"),
            new Transaction(5966402.15, "1993-08-28"),
            new Transaction(-6201042.39, "1993-11-21"),
            new Transaction(-4740725.63, "1994-03-22"),
            new Transaction(-3674731.69, "1994-06-22"),
            new Transaction(-7785085.04, "1994-10-10"),
            new Transaction(7014196.92, "1995-01-01"),
            new Transaction(8056182.19, "1995-03-06"),
            new Transaction(-7710493.07, "1995-03-31"),
            new Transaction(1849899.88, "1995-06-24"),
            new Transaction(4127659.82, "1995-07-10"),
            new Transaction(9654800.54, "1995-09-18"),
            new Transaction(-5317388.39, "1995-11-07"),
            new Transaction(-519200.57, "1995-11-26"),
            new Transaction(-8111180.10, "1995-12-10"),
            new Transaction(1878083.89, "1996-04-07"),
            new Transaction(-11460.60, "1996-08-01"),
            new Transaction(7882495.09, "1996-10-06"),
            new Transaction(9834409.34, "1996-10-24"),
            new Transaction(-921431.86, "1997-02-22"),
            new Transaction(9044585.14, "1997-04-17"),
            new Transaction(8690476.02, "1997-07-21"),
            new Transaction(-1598034.42, "1997-08-26"),
            new Transaction(5666918.83, "1997-11-12"),
            new Transaction(3777895.69, "1997-12-06"),
            new Transaction(-4733357.89, "1998-01-04"),
            new Transaction(-5829169.00, "1998-01-22"),
            new Transaction(8240846.93, "1998-03-11"),
            new Transaction(-8188010.02, "1998-04-18"),
            new Transaction(-7350881.90, "1998-07-02"),
            new Transaction(8389302.00, "1998-09-01"),
            new Transaction(471796.34, "1998-12-12"),
            new Transaction(-5718467.72, "1999-02-09"),
            new Transaction(-535427.98, "1999-04-05"),
            new Transaction(7730333.29, "1999-05-14"),
            new Transaction(2135329.03, "1999-07-22"),
            new Transaction(-7766991.21, "1999-08-23"),
            new Transaction(-146389.50, "1999-11-11"),
            new Transaction(525522.52, "2000-02-29"),
            new Transaction(-7850284.18, "2000-05-26"),
            new Transaction(-714239.83, "2000-07-22"),
            new Transaction(-1213314.94, "2000-10-30"),
            new Transaction(6378430.72, "2000-12-15"),
            new Transaction(-5889432.10, "2001-03-19"),
            new Transaction(-4106696.74, "2001-07-13"),
            new Transaction(-1876096.20, "2001-08-02"),
            new Transaction(4756716.36, "2001-10-21"),
            new Transaction(-3124863.43, "2002-01-11"),
            new Transaction(-9510472.16, "2002-03-14"),
            new Transaction(-3414881.27, "2002-06-02"),
            new Transaction(7981925.22, "2002-08-19"),
            new Transaction(7243330.12, "2002-12-05"),
            new Transaction(-9472724.06, "2003-01-14"),
            new Transaction(6148870.48, "2003-05-14"),
            new Transaction(713802.18, "2003-05-23"),
            new Transaction(6791816.65, "2003-05-23"),
            new Transaction(4634170.40, "2003-09-06")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-1.8012073636054993E-2, rate, xirr.precision);
    }

    @Test
    void test82() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-14175896.73, "1985-07-14"),
            new Transaction(-5823464.83, "1985-12-09"),
            new Transaction(-7120774.84, "1986-04-22"),
            new Transaction(-3788060.79, "1986-06-27"),
            new Transaction(4752087.11, "1986-08-19"),
            new Transaction(-5124933.49, "1986-12-28"),
            new Transaction(5104858.56, "1987-01-25"),
            new Transaction(3802651.98, "1987-06-15"),
            new Transaction(2866697.47, "1987-06-19"),
            new Transaction(-6176930.60, "1987-07-05"),
            new Transaction(4349101.36, "1988-01-02"),
            new Transaction(-9861597.67, "1988-05-05"),
            new Transaction(521810.56, "1988-10-03"),
            new Transaction(-6170524.77, "1989-04-15"),
            new Transaction(-3300289.34, "1989-05-31"),
            new Transaction(-9289326.72, "1989-10-18"),
            new Transaction(5904028.44, "1990-03-30"),
            new Transaction(-6348713.05, "1990-06-15"),
            new Transaction(-5074149.89, "1990-10-24"),
            new Transaction(8683541.80, "1991-03-30"),
            new Transaction(-6245638.75, "1991-10-08"),
            new Transaction(-2483232.49, "1992-02-18"),
            new Transaction(-7210487.43, "1992-03-13"),
            new Transaction(83153.55, "1992-07-01"),
            new Transaction(-5557801.08, "1993-02-01"),
            new Transaction(-6802059.98, "1993-04-12"),
            new Transaction(6275256.61, "1993-08-22"),
            new Transaction(-5666242.89, "1994-01-03"),
            new Transaction(-8762429.15, "1994-07-24"),
            new Transaction(-9259753.74, "1995-01-14"),
            new Transaction(1835076.54, "1995-04-30"),
            new Transaction(6663842.75, "1995-08-11"),
            new Transaction(-2444242.38, "1996-01-25"),
            new Transaction(-9994278.93, "1996-08-20"),
            new Transaction(3505822.85, "1996-08-22"),
            new Transaction(654514.74, "1996-10-19"),
            new Transaction(7215158.65, "1997-03-22"),
            new Transaction(3081029.10, "1997-05-13"),
            new Transaction(-1187816.62, "1997-07-18"),
            new Transaction(-6118196.07, "1998-01-12"),
            new Transaction(2085183.63, "1998-07-04"),
            new Transaction(5088269.45, "1998-12-13"),
            new Transaction(-3025922.78, "1999-03-10"),
            new Transaction(-1197238.37, "1999-10-10"),
            new Transaction(8514035.65, "2000-05-11"),
            new Transaction(1591868.76, "2000-05-24")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.20525108849008403, rate, xirr.precision);
    }

    @Test
    void test83() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-2683930.05, "1987-08-06"),
            new Transaction(-851649.14, "1988-08-02"),
            new Transaction(-427142.87, "1989-05-04"),
            new Transaction(1276302.33, "1989-06-06"),
            new Transaction(8453502.71, "1989-12-22"),
            new Transaction(2556305.28, "1990-06-12"),
            new Transaction(9890850.01, "1990-12-15"),
            new Transaction(-1590555.91, "1992-01-01"),
            new Transaction(-5362821.64, "1992-11-12"),
            new Transaction(5678227.14, "1993-11-23"),
            new Transaction(-1190750.92, "1994-05-06"),
            new Transaction(9239239.87, "1995-01-02"),
            new Transaction(5968804.80, "1995-02-05"),
            new Transaction(3317455.29, "1996-03-26"),
            new Transaction(7333369.18, "1996-11-15"),
            new Transaction(92235.76, "1997-01-18"),
            new Transaction(-4721065.48, "1997-06-21"),
            new Transaction(-8304087.28, "1997-07-15"),
            new Transaction(-8757471.86, "1997-07-29"),
            new Transaction(-6316373.92, "1998-08-02"),
            new Transaction(-3755487.09, "1999-08-21"),
            new Transaction(7554649.14, "1999-11-02"),
            new Transaction(9919922.14, "2000-12-07"),
            new Transaction(19419650.61, "2001-11-10")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.99734472036361699, rate, xirr.precision);
    }

    @Test
    void test84() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-3296695.49, "1990-05-07"),
            new Transaction(9666707.11, "1991-03-12"),
            new Transaction(-2724529.06, "1991-03-24"),
            new Transaction(-5509940.86, "1991-05-12"),
            new Transaction(-6518082.35, "1991-05-23"),
            new Transaction(4127086.72, "1991-08-01"),
            new Transaction(7168890.19, "1991-08-25"),
            new Transaction(7700383.68, "1991-11-05"),
            new Transaction(9718432.87, "1992-02-26"),
            new Transaction(972033.86, "1992-12-30"),
            new Transaction(7669533.92, "1993-08-21"),
            new Transaction(9562655.40, "1994-01-16"),
            new Transaction(2032873.68, "1994-05-19"),
            new Transaction(-5739992.81, "1994-07-08"),
            new Transaction(3109251.60, "1994-09-11"),
            new Transaction(-4642174.71, "1994-11-07"),
            new Transaction(-8232794.16, "1995-04-26"),
            new Transaction(-8019879.88, "1995-11-03"),
            new Transaction(3611609.62, "1996-03-12"),
            new Transaction(-4913570.61, "1997-01-02"),
            new Transaction(1844675.68, "1997-09-23"),
            new Transaction(-2396344.44, "1998-05-12"),
            new Transaction(2179332.57, "1998-12-12"),
            new Transaction(1605080.43, "1999-05-28"),
            new Transaction(9102218.56, "1999-08-29"),
            new Transaction(-6780460.99, "1999-12-10"),
            new Transaction(-3787261.58, "2000-02-19"),
            new Transaction(-401739.19, "2000-06-27"),
            new Transaction(8359527.16, "2000-09-17"),
            new Transaction(-996329.63, "2001-03-02"),
            new Transaction(8805677.85, "2001-08-04"),
            new Transaction(1043237.74, "2001-09-08")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(2.8530205488204965, rate, xirr.precision);
    }

    @Test
    void test85() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-1664023.35, "2008-12-21"),
            new Transaction(2393317.23, "2009-04-03"),
            new Transaction(7641395.77, "2009-10-06"),
            new Transaction(-9652711.99, "2010-03-25"),
            new Transaction(372134.84, "2010-04-30"),
            new Transaction(1989248.51, "2010-07-11"),
            new Transaction(326139.12, "2010-08-09"),
            new Transaction(-6706111.22, "2011-01-20"),
            new Transaction(4724614.85, "2011-05-26"),
            new Transaction(47398.37, "2011-08-31"),
            new Transaction(-9357236.65, "2012-04-05"),
            new Transaction(-6694031.50, "2012-08-12"),
            new Transaction(-2887867.56, "2013-03-24"),
            new Transaction(1550438.17, "2013-05-04"),
            new Transaction(7005650.36, "2013-12-03"),
            new Transaction(4269795.00, "2014-05-18"),
            new Transaction(195518.54, "2014-08-11"),
            new Transaction(5324277.71, "2015-01-10"),
            new Transaction(7518521.32, "2015-03-10"),
            new Transaction(-8252512.03, "2015-06-05"),
            new Transaction(-3176489.39, "2015-10-05"),
            new Transaction(780316.96, "2016-01-21"),
            new Transaction(-3511250.43, "2016-02-03"),
            new Transaction(978495.49, "2016-03-01"),
            new Transaction(-9952710.79, "2016-03-11"),
            new Transaction(8301736.38, "2016-06-24"),
            new Transaction(38007.69, "2017-02-04"),
            new Transaction(-7565047.19, "2017-06-29"),
            new Transaction(1021805.35, "2017-11-25"),
            new Transaction(-2635467.22, "2018-01-18"),
            new Transaction(4803270.69, "2018-04-10"),
            new Transaction(-2609356.47, "2018-07-20"),
            new Transaction(6665392.17, "2018-11-25"),
            new Transaction(3269911.72, "2018-12-20"),
            new Transaction(-614740.31, "2019-07-17"),
            new Transaction(3629012.54, "2020-02-22"),
            new Transaction(-3596608.09, "2020-08-14"),
            new Transaction(1114198.29, "2020-12-03"),
            new Transaction(6917831.63, "2021-01-28"),
            new Transaction(2033734.30, "2021-07-16"),
            new Transaction(2149425.18, "2021-09-13"),
            new Transaction(8813532.79, "2022-04-26"),
            new Transaction(2882654.83, "2022-06-26"),
            new Transaction(5727278.10, "2022-08-20")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.13886898159980773, rate, xirr.precision);
    }

    @Test
    void test86() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-19996225.50, "1983-06-06"),
            new Transaction(1997989.34, "1985-09-28"),
            new Transaction(-1226912.31, "1986-05-29"),
            new Transaction(6431044.23, "1988-06-29"),
            new Transaction(-6653875.33, "1989-11-23"),
            new Transaction(5924284.65, "1992-04-07"),
            new Transaction(-4085677.94, "1994-09-02"),
            new Transaction(3890799.01, "1996-02-26"),
            new Transaction(730917.51, "1996-10-05"),
            new Transaction(1909726.82, "1997-10-27"),
            new Transaction(18254396.91, "1997-11-21")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(2.4571356177330021E-2, rate, xirr.precision);
    }

    @Test
    void test87() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-6064921.04, "2004-09-21"),
            new Transaction(5033394.77, "2005-01-06"),
            new Transaction(6350287.25, "2005-04-04"),
            new Transaction(-3213677.01, "2005-07-15"),
            new Transaction(-8510213.56, "2005-12-11"),
            new Transaction(9319748.31, "2006-01-03"),
            new Transaction(-5837310.58, "2006-04-26"),
            new Transaction(1959706.46, "2006-09-02"),
            new Transaction(8536590.14, "2006-09-20"),
            new Transaction(-3686626.71, "2006-10-01"),
            new Transaction(-8967788.28, "2007-01-06"),
            new Transaction(-9431266.52, "2007-02-09"),
            new Transaction(-2418322.10, "2007-04-01"),
            new Transaction(-3689249.71, "2007-07-17"),
            new Transaction(-3538657.58, "2007-09-19"),
            new Transaction(7176083.04, "2008-02-03"),
            new Transaction(5569363.90, "2008-05-04"),
            new Transaction(-5057834.35, "2008-07-16"),
            new Transaction(4641142.98, "2008-12-05"),
            new Transaction(-5948715.52, "2009-01-25"),
            new Transaction(-8905873.27, "2009-03-03"),
            new Transaction(5419943.91, "2009-07-27"),
            new Transaction(3499699.67, "2009-07-30"),
            new Transaction(-8437583.79, "2009-09-27"),
            new Transaction(8183643.85, "2010-02-21"),
            new Transaction(4026803.77, "2010-06-06"),
            new Transaction(5818536.63, "2010-07-30"),
            new Transaction(-2110836.42, "2010-11-05"),
            new Transaction(-5978615.66, "2011-01-20"),
            new Transaction(1036546.79, "2011-04-07"),
            new Transaction(-5727743.18, "2011-08-13"),
            new Transaction(-6493598.85, "2011-09-04"),
            new Transaction(-7569065.14, "2011-12-31"),
            new Transaction(8659344.47, "2012-04-04"),
            new Transaction(7253246.81, "2012-04-08"),
            new Transaction(-7075371.98, "2012-04-26"),
            new Transaction(518600.96, "2012-07-30"),
            new Transaction(-1413103.06, "2012-10-07"),
            new Transaction(8199347.26, "2012-10-10"),
            new Transaction(7108671.71, "2012-11-11"),
            new Transaction(9819936.34, "2013-04-04"),
            new Transaction(-3698679.16, "2013-04-27"),
            new Transaction(-331330.28, "2013-05-21"),
            new Transaction(-2742551.96, "2013-06-22"),
            new Transaction(-3427918.78, "2013-10-03"),
            new Transaction(5255476.66, "2013-11-06"),
            new Transaction(672164.59, "2013-11-11"),
            new Transaction(9967075.51, "2013-11-11"),
            new Transaction(-141263.28, "2014-01-08"),
            new Transaction(1197434.00, "2014-05-07"),
            new Transaction(-846700.34, "2014-09-12"),
            new Transaction(-6236695.10, "2014-10-19"),
            new Transaction(-5392567.31, "2014-12-14"),
            new Transaction(9085408.25, "2015-03-21"),
            new Transaction(4668477.85, "2015-07-17"),
            new Transaction(5645702.08, "2015-09-16"),
            new Transaction(-3993027.18, "2015-12-05"),
            new Transaction(-3250104.71, "2016-01-29"),
            new Transaction(-5933641.73, "2016-02-19"),
            new Transaction(5621403.92, "2016-03-29"),
            new Transaction(5957399.02, "2016-05-12"),
            new Transaction(5045142.83, "2016-06-24"),
            new Transaction(7826413.54, "2016-11-07"),
            new Transaction(-2516029.38, "2017-01-13"),
            new Transaction(-1578560.02, "2017-05-09"),
            new Transaction(1356198.93, "2017-07-17")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(9.883454442024231E-2, rate, xirr.precision);
    }

    @Test
    void test88() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-14661313.04, "1985-01-10"),
            new Transaction(7831689.57, "1985-01-25"),
            new Transaction(-7475707.51, "1985-07-24"),
            new Transaction(6726755.29, "1985-10-18"),
            new Transaction(1303516.48, "1985-11-24"),
            new Transaction(-8975875.06, "1986-05-17"),
            new Transaction(-7272531.34, "1986-08-22"),
            new Transaction(1099974.50, "1986-09-11"),
            new Transaction(7232134.68, "1986-12-27"),
            new Transaction(-8686206.69, "1987-01-16"),
            new Transaction(1627490.97, "1987-06-29"),
            new Transaction(5673153.45, "1987-09-18"),
            new Transaction(5460985.34, "1987-11-28"),
            new Transaction(4368811.01, "1988-02-12"),
            new Transaction(5083055.49, "1988-06-16"),
            new Transaction(2740294.27, "1989-01-01"),
            new Transaction(-9782708.36, "1989-01-21"),
            new Transaction(-1579887.82, "1989-04-30"),
            new Transaction(-2633172.43, "1989-07-21"),
            new Transaction(-9503362.96, "1990-02-27"),
            new Transaction(-6442899.21, "1990-03-27"),
            new Transaction(-923546.00, "1990-10-19"),
            new Transaction(-1385819.59, "1990-12-09"),
            new Transaction(1801803.63, "1991-06-02"),
            new Transaction(-8360959.98, "1991-11-14"),
            new Transaction(5041145.24, "1992-01-14"),
            new Transaction(6625027.75, "1992-02-10"),
            new Transaction(-3693835.23, "1992-07-20"),
            new Transaction(3466506.77, "1992-12-25"),
            new Transaction(-4193013.36, "1993-03-18"),
            new Transaction(-4961544.69, "1993-06-07"),
            new Transaction(1270599.16, "1993-07-29"),
            new Transaction(64413.65, "1993-08-21"),
            new Transaction(-2101898.37, "1993-08-29"),
            new Transaction(3909474.09, "1994-01-07"),
            new Transaction(-6353340.61, "1994-03-22"),
            new Transaction(3740501.49, "1994-07-24"),
            new Transaction(4926583.36, "1995-01-18"),
            new Transaction(-5001640.07, "1995-06-07"),
            new Transaction(-2380667.40, "1996-01-15"),
            new Transaction(9100935.62, "1996-05-14"),
            new Transaction(-4263515.75, "1996-08-08"),
            new Transaction(8273150.03, "1997-02-26")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.14900109041482218, rate, xirr.precision);
    }

    @Test
    void test89() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-18143772.64, "2002-05-07"),
            new Transaction(-4760146.08, "2002-09-18"),
            new Transaction(4670680.73, "2003-04-21"),
            new Transaction(-8898746.24, "2004-06-03"),
            new Transaction(9374270.19, "2004-07-20"),
            new Transaction(8046331.26, "2005-09-08"),
            new Transaction(-3366982.26, "2006-10-20"),
            new Transaction(-9827281.09, "2007-10-08"),
            new Transaction(9038037.97, "2007-11-03"),
            new Transaction(-4550686.86, "2007-12-26"),
            new Transaction(-6248214.33, "2008-07-25"),
            new Transaction(4870663.78, "2009-09-06"),
            new Transaction(942005.38, "2010-04-02"),
            new Transaction(-1329751.61, "2010-09-01"),
            new Transaction(-2963796.94, "2010-12-18"),
            new Transaction(-1570213.80, "2011-09-18"),
            new Transaction(-761712.54, "2012-04-26"),
            new Transaction(-7111783.88, "2013-05-31"),
            new Transaction(6434117.46, "2013-12-31"),
            new Transaction(-5249410.59, "2014-07-07"),
            new Transaction(-3165.43, "2014-08-03"),
            new Transaction(6049492.35, "2014-12-05"),
            new Transaction(-6664535.53, "2015-11-17"),
            new Transaction(10527749.46, "2015-12-29")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.15717311492189764, rate, xirr.precision);
    }

    @Test
    void test90() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-15930630.92, "2007-06-17"),
            new Transaction(4395504.38, "2007-09-04"),
            new Transaction(8542949.96, "2007-12-04"),
            new Transaction(-9147591.64, "2007-12-18"),
            new Transaction(6733814.60, "2008-01-26"),
            new Transaction(7942883.92, "2008-05-01"),
            new Transaction(644849.01, "2008-05-21"),
            new Transaction(-3901758.43, "2008-06-05"),
            new Transaction(7996141.80, "2008-07-19"),
            new Transaction(6525058.02, "2008-09-20"),
            new Transaction(6236543.55, "2009-01-10"),
            new Transaction(-6446483.67, "2009-01-27"),
            new Transaction(6263859.81, "2009-05-01"),
            new Transaction(-5633051.69, "2009-05-04"),
            new Transaction(1221956.91, "2009-06-15"),
            new Transaction(-2988787.55, "2009-08-09"),
            new Transaction(-6308472.06, "2009-10-07"),
            new Transaction(7929293.49, "2009-12-03"),
            new Transaction(440321.68, "2009-12-24"),
            new Transaction(6761782.33, "2010-01-25"),
            new Transaction(-1453539.91, "2010-04-08"),
            new Transaction(-7912117.78, "2010-05-01"),
            new Transaction(7058904.85, "2010-07-06"),
            new Transaction(5877417.35, "2010-09-15"),
            new Transaction(3347178.23, "2010-10-06"),
            new Transaction(6324043.65, "2010-11-14"),
            new Transaction(-7685902.21, "2010-12-11"),
            new Transaction(-2286213.21, "2011-03-22"),
            new Transaction(-5662053.25, "2011-07-11"),
            new Transaction(2072950.08, "2011-11-01"),
            new Transaction(6163268.64, "2011-12-24"),
            new Transaction(-6467638.34, "2012-01-23"),
            new Transaction(-9768737.55, "2012-05-15"),
            new Transaction(-8912040.29, "2012-07-07"),
            new Transaction(-9568449.41, "2012-08-25"),
            new Transaction(3897722.36, "2012-10-31"),
            new Transaction(3048065.05, "2012-11-24"),
            new Transaction(-6986349.62, "2012-12-03"),
            new Transaction(1608990.68, "2012-12-22"),
            new Transaction(-9704380.30, "2013-02-15"),
            new Transaction(7053943.22, "2013-06-03"),
            new Transaction(190466.65, "2013-09-15"),
            new Transaction(-4828294.17, "2013-11-02"),
            new Transaction(-8932264.00, "2014-02-02"),
            new Transaction(-9220454.23, "2014-02-28"),
            new Transaction(-1857223.94, "2014-05-25"),
            new Transaction(6617094.33, "2014-06-22"),
            new Transaction(-7388493.92, "2014-10-21"),
            new Transaction(5463830.25, "2014-12-09"),
            new Transaction(-3670360.08, "2015-04-04"),
            new Transaction(340184.84, "2015-04-08"),
            new Transaction(-521031.62, "2015-06-10"),
            new Transaction(-3481771.25, "2015-07-26"),
            new Transaction(8519249.67, "2015-11-21"),
            new Transaction(-9277834.46, "2016-02-26"),
            new Transaction(4588135.30, "2016-06-12"),
            new Transaction(-6919847.53, "2016-06-16"),
            new Transaction(-5248581.29, "2016-08-05"),
            new Transaction(-1746004.82, "2016-11-15"),
            new Transaction(6693025.19, "2017-01-19"),
            new Transaction(-5213625.58, "2017-01-22"),
            new Transaction(6388727.43, "2017-04-03"),
            new Transaction(-5689837.42, "2017-07-12"),
            new Transaction(7133726.72, "2017-08-07"),
            new Transaction(-3664316.42, "2017-09-10"),
            new Transaction(-7073783.58, "2017-10-31"),
            new Transaction(7458444.10, "2018-02-06"),
            new Transaction(6486746.33, "2018-04-20"),
            new Transaction(-4226927.05, "2018-07-29"),
            new Transaction(-9159308.67, "2018-10-31"),
            new Transaction(-5022268.99, "2018-12-31"),
            new Transaction(-5156444.14, "2019-03-10"),
            new Transaction(-1339975.10, "2019-06-29"),
            new Transaction(-4748616.53, "2019-10-24"),
            new Transaction(8326024.70, "2019-12-20"),
            new Transaction(-3355524.68, "2020-01-26"),
            new Transaction(4401548.59, "2020-04-14"),
            new Transaction(4236684.96, "2020-06-11"),
            new Transaction(-5846680.95, "2020-09-15"),
            new Transaction(5263492.65, "2020-10-01"),
            new Transaction(10807266.50, "2020-12-16")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.3434046624230518, rate, xirr.precision);
    }

    @Test
    void test91() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-7972317.27, "2002-10-07"),
            new Transaction(-4883597.51, "2002-12-01"),
            new Transaction(-4578258.38, "2003-01-08"),
            new Transaction(-6891973.64, "2003-05-10"),
            new Transaction(-5075851.58, "2003-07-29"),
            new Transaction(-8999991.40, "2003-08-25"),
            new Transaction(1546890.57, "2003-10-26"),
            new Transaction(-381722.33, "2004-02-28"),
            new Transaction(6025387.96, "2004-04-16"),
            new Transaction(9087006.34, "2004-07-01"),
            new Transaction(-455335.74, "2004-10-27"),
            new Transaction(-3453026.99, "2005-01-29"),
            new Transaction(-1754019.48, "2005-05-24"),
            new Transaction(-7779181.45, "2005-06-05"),
            new Transaction(-9091508.28, "2005-06-20"),
            new Transaction(9048703.75, "2005-09-11"),
            new Transaction(2200461.13, "2005-10-01"),
            new Transaction(6609978.37, "2005-12-23"),
            new Transaction(558617.76, "2006-01-04"),
            new Transaction(1067563.73, "2006-04-04"),
            new Transaction(-9211984.97, "2006-08-15"),
            new Transaction(-4947315.99, "2006-08-21"),
            new Transaction(2586929.36, "2006-09-16"),
            new Transaction(-1650364.10, "2007-01-10"),
            new Transaction(-4193061.14, "2007-03-30"),
            new Transaction(-3000466.10, "2007-05-20"),
            new Transaction(-4987451.05, "2007-07-21"),
            new Transaction(5245014.57, "2007-07-28"),
            new Transaction(8980580.14, "2007-09-19"),
            new Transaction(-7670142.42, "2008-02-02"),
            new Transaction(-9895748.89, "2008-02-07"),
            new Transaction(7180246.51, "2008-04-08"),
            new Transaction(8214669.60, "2008-04-19"),
            new Transaction(-1508168.34, "2008-08-18"),
            new Transaction(-4015919.84, "2008-08-19"),
            new Transaction(7082901.31, "2008-11-27"),
            new Transaction(4125853.54, "2008-12-01"),
            new Transaction(4855373.27, "2008-12-26"),
            new Transaction(5960436.63, "2009-01-14"),
            new Transaction(3847108.31, "2009-02-27"),
            new Transaction(-6720616.94, "2009-04-27"),
            new Transaction(-7977287.75, "2009-05-24"),
            new Transaction(-830593.39, "2009-08-10"),
            new Transaction(-5434882.26, "2009-10-06"),
            new Transaction(-3291812.77, "2010-01-24"),
            new Transaction(6047147.26, "2010-06-13"),
            new Transaction(55840.53, "2010-08-19"),
            new Transaction(-1362818.26, "2010-10-24"),
            new Transaction(-6124273.66, "2010-11-18"),
            new Transaction(9144057.74, "2010-11-26"),
            new Transaction(-882864.59, "2011-01-01"),
            new Transaction(-9302053.29, "2011-03-02"),
            new Transaction(-7839750.62, "2011-04-16"),
            new Transaction(-5343613.96, "2011-09-01"),
            new Transaction(-8126671.13, "2011-10-05"),
            new Transaction(-9967459.56, "2011-11-29"),
            new Transaction(-7681637.76, "2012-02-11"),
            new Transaction(9557477.20, "2012-05-06"),
            new Transaction(-3420714.09, "2012-05-30"),
            new Transaction(1703926.35, "2012-07-06"),
            new Transaction(2387017.33, "2012-10-07"),
            new Transaction(-2424143.89, "2013-01-06"),
            new Transaction(9924192.92, "2013-04-10"),
            new Transaction(-3639235.82, "2013-06-12"),
            new Transaction(-1184205.42, "2013-06-28"),
            new Transaction(-1717198.24, "2013-10-12"),
            new Transaction(4331995.35, "2013-11-28"),
            new Transaction(-2148114.42, "2014-01-11"),
            new Transaction(-1870507.52, "2014-02-17"),
            new Transaction(4296286.85, "2014-05-07"),
            new Transaction(17714164.29, "2014-07-15")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.193013483712937, rate, xirr.precision);
    }

    @Test
    void test92() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-11794768.10, "2004-08-07"),
            new Transaction(-2516942.74, "2004-10-01"),
            new Transaction(-3110526.55, "2004-12-04"),
            new Transaction(7046205.44, "2005-01-01"),
            new Transaction(-76755.97, "2005-01-11"),
            new Transaction(-3303043.45, "2005-01-11"),
            new Transaction(3557312.24, "2005-01-23"),
            new Transaction(-6241352.27, "2005-03-17"),
            new Transaction(4914647.11, "2005-06-21"),
            new Transaction(6510701.35, "2005-08-11"),
            new Transaction(-5916115.53, "2005-10-21"),
            new Transaction(8961587.07, "2006-01-12"),
            new Transaction(-1267487.51, "2006-03-22"),
            new Transaction(1573792.16, "2006-06-07"),
            new Transaction(-9985466.03, "2006-07-20"),
            new Transaction(9598614.12, "2006-09-06"),
            new Transaction(6787045.63, "2006-10-21"),
            new Transaction(9853904.55, "2006-10-24"),
            new Transaction(-5272325.72, "2006-12-23"),
            new Transaction(-1671889.72, "2007-04-03"),
            new Transaction(-6446053.83, "2007-05-08"),
            new Transaction(-5505611.75, "2007-05-19"),
            new Transaction(9285269.70, "2007-07-29"),
            new Transaction(-4795645.70, "2007-10-27"),
            new Transaction(-5986878.38, "2007-11-24"),
            new Transaction(-4159096.44, "2008-03-07"),
            new Transaction(1684509.89, "2008-04-25"),
            new Transaction(8257728.68, "2008-04-30"),
            new Transaction(-9127040.26, "2008-05-23"),
            new Transaction(9839674.68, "2008-06-28"),
            new Transaction(1895996.20, "2008-07-06"),
            new Transaction(6485865.41, "2008-08-09"),
            new Transaction(9684831.15, "2008-10-20"),
            new Transaction(7420052.84, "2008-12-24"),
            new Transaction(3702402.00, "2009-02-15"),
            new Transaction(-3218273.25, "2009-04-23"),
            new Transaction(829637.48, "2009-05-30"),
            new Transaction(-1804345.30, "2009-07-05"),
            new Transaction(-7376524.36, "2009-07-28"),
            new Transaction(-6629374.88, "2009-10-07"),
            new Transaction(690145.78, "2009-12-23"),
            new Transaction(-7245436.27, "2010-02-07"),
            new Transaction(-1000704.58, "2010-03-07"),
            new Transaction(7561294.26, "2010-04-02"),
            new Transaction(1759741.44, "2010-05-21"),
            new Transaction(-1804621.93, "2010-06-20"),
            new Transaction(-7427465.91, "2010-07-19"),
            new Transaction(178276.13, "2010-10-12"),
            new Transaction(7874845.11, "2010-10-15"),
            new Transaction(-3802011.85, "2010-10-20"),
            new Transaction(3146276.86, "2011-01-12"),
            new Transaction(-4033309.85, "2011-04-11"),
            new Transaction(-2849410.14, "2011-07-07"),
            new Transaction(1025163.30, "2011-08-22"),
            new Transaction(-7168613.13, "2011-08-29"),
            new Transaction(770916.36, "2011-10-13"),
            new Transaction(1012514.26, "2011-11-11"),
            new Transaction(2358773.34, "2011-11-29"),
            new Transaction(9155023.38, "2012-01-16"),
            new Transaction(-1894851.15, "2012-02-11"),
            new Transaction(8199346.62, "2012-04-25"),
            new Transaction(-8902370.22, "2012-07-05"),
            new Transaction(8448891.48, "2012-07-10"),
            new Transaction(-3071509.19, "2012-07-22"),
            new Transaction(3461648.44, "2012-08-31"),
            new Transaction(9380397.23, "2012-11-01"),
            new Transaction(8708194.58, "2013-01-05"),
            new Transaction(-3724894.60, "2013-02-03"),
            new Transaction(1850805.85, "2013-04-18"),
            new Transaction(5524372.60, "2013-06-22"),
            new Transaction(5202833.35, "2013-08-12"),
            new Transaction(1566965.63, "2013-09-14"),
            new Transaction(-4392145.58, "2013-10-15"),
            new Transaction(-6873678.75, "2013-11-11"),
            new Transaction(9014052.19, "2013-12-17"),
            new Transaction(6382519.14, "2014-02-26"),
            new Transaction(-5993178.32, "2014-03-19"),
            new Transaction(236660.53, "2014-04-07"),
            new Transaction(-4593943.35, "2014-05-06"),
            new Transaction(-4218967.84, "2014-07-16"),
            new Transaction(8582165.28, "2014-09-19"),
            new Transaction(3426349.99, "2014-10-01"),
            new Transaction(1350378.94, "2014-12-19"),
            new Transaction(1365230.71, "2015-01-15"),
            new Transaction(7943529.30, "2015-04-16"),
            new Transaction(-9164459.98, "2015-04-21"),
            new Transaction(3790333.81, "2015-06-14"),
            new Transaction(-1158114.16, "2015-08-02"),
            new Transaction(-5039194.79, "2015-10-25"),
            new Transaction(-5377850.41, "2015-10-28"),
            new Transaction(6400663.89, "2016-02-03"),
            new Transaction(-8960904.27, "2016-03-31"),
            new Transaction(-4223597.11, "2016-06-17"),
            new Transaction(-4657215.31, "2016-07-24"),
            new Transaction(15133102.39, "2016-10-14")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(0.42739781737327576, rate, xirr.precision);
    }

    @Test
    void test93() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-2116649.45, "1992-07-31"),
            new Transaction(7376930.26, "1993-03-21"),
            new Transaction(9633685.99, "1993-10-20"),
            new Transaction(-504523.12, "1994-04-29"),
            new Transaction(4742483.89, "1994-06-12"),
            new Transaction(2568239.50, "1994-11-15"),
            new Transaction(-1240753.56, "1995-06-27"),
            new Transaction(-3832018.00, "1995-07-18"),
            new Transaction(6472689.20, "1995-07-20"),
            new Transaction(9129862.83, "1995-08-22"),
            new Transaction(6122290.70, "1996-04-03"),
            new Transaction(-6338135.90, "1996-10-03"),
            new Transaction(4716574.63, "1996-12-28"),
            new Transaction(8648537.49, "1997-07-22"),
            new Transaction(1926896.78, "1997-10-21"),
            new Transaction(1152472.63, "1997-11-13"),
            new Transaction(4515425.72, "1998-06-21"),
            new Transaction(-8425842.25, "1998-08-06"),
            new Transaction(8818625.76, "1998-11-03"),
            new Transaction(-1920921.75, "1999-03-22"),
            new Transaction(1129866.57, "1999-07-31"),
            new Transaction(-4565540.46, "1999-10-02"),
            new Transaction(6273913.11, "2000-01-23"),
            new Transaction(-5673010.49, "2000-02-13"),
            new Transaction(-9465226.42, "2000-06-08"),
            new Transaction(5360662.69, "2000-07-15"),
            new Transaction(488721.95, "2000-12-09"),
            new Transaction(8959796.89, "2001-02-13"),
            new Transaction(8921823.23, "2001-09-16"),
            new Transaction(-7165498.36, "2002-05-04"),
            new Transaction(4733580.84, "2002-06-15"),
            new Transaction(-905092.09, "2002-07-04"),
            new Transaction(2989556.00, "2002-10-27"),
            new Transaction(8912405.79, "2003-04-20"),
            new Transaction(-7563801.24, "2003-06-16"),
            new Transaction(-4829576.26, "2003-12-15"),
            new Transaction(-4000893.75, "2004-04-21"),
            new Transaction(-5655542.81, "2004-05-07"),
            new Transaction(2296542.48, "2004-05-22"),
            new Transaction(-2230254.68, "2004-10-19"),
            new Transaction(10682554.34, "2005-06-05")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(10.373251438140871, rate, xirr.precision);
    }

    @Test
    void test94() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-7443090.40, "1983-10-15"),
            new Transaction(-6238020.54, "1983-10-27"),
            new Transaction(-2562092.09, "1984-01-29"),
            new Transaction(-7253218.46, "1984-04-27"),
            new Transaction(3062247.73, "1984-05-30"),
            new Transaction(428879.45, "1984-06-20"),
            new Transaction(7386889.24, "1984-09-03"),
            new Transaction(3280386.52, "1984-11-11"),
            new Transaction(7575318.67, "1985-01-28"),
            new Transaction(-5445921.12, "1985-05-14"),
            new Transaction(8369199.96, "1985-06-04"),
            new Transaction(3628502.35, "1985-07-23"),
            new Transaction(-2606710.37, "1985-09-27"),
            new Transaction(2613493.22, "1985-11-19"),
            new Transaction(105200.65, "1986-01-09"),
            new Transaction(7315490.53, "1986-02-06"),
            new Transaction(4897225.90, "1986-02-10"),
            new Transaction(3260720.67, "1986-03-12"),
            new Transaction(3228397.27, "1986-06-24"),
            new Transaction(5198043.58, "1986-07-02"),
            new Transaction(-522709.88, "1986-07-21"),
            new Transaction(75393.59, "1986-09-29"),
            new Transaction(-8413527.27, "1986-11-15"),
            new Transaction(-7925054.73, "1986-11-22"),
            new Transaction(9545761.83, "1987-02-21"),
            new Transaction(659477.15, "1987-05-07"),
            new Transaction(2365489.63, "1987-06-12"),
            new Transaction(-6407985.21, "1987-08-05"),
            new Transaction(2045990.42, "1987-08-20"),
            new Transaction(-9854165.20, "1987-08-29"),
            new Transaction(-7817500.12, "1987-11-27"),
            new Transaction(2926383.05, "1988-02-15"),
            new Transaction(-9685093.75, "1988-05-20"),
            new Transaction(-5834079.45, "1988-07-17"),
            new Transaction(-9649410.33, "1988-10-09"),
            new Transaction(-1732710.23, "1989-01-02"),
            new Transaction(-2916354.27, "1989-02-18"),
            new Transaction(-2847197.21, "1989-05-30"),
            new Transaction(1488682.13, "1989-06-27"),
            new Transaction(-7309902.04, "1989-08-12"),
            new Transaction(4324104.77, "1989-09-26"),
            new Transaction(-8584813.26, "1990-01-07"),
            new Transaction(1207899.51, "1990-02-14"),
            new Transaction(-7445704.72, "1990-05-03"),
            new Transaction(4186683.32, "1990-08-02"),
            new Transaction(-5101615.21, "1990-11-14"),
            new Transaction(-9003015.93, "1990-12-24"),
            new Transaction(-9152098.23, "1991-03-16"),
            new Transaction(-7559327.22, "1991-04-16"),
            new Transaction(-7467722.85, "1991-05-11"),
            new Transaction(-7998162.09, "1991-07-13"),
            new Transaction(808039.65, "1991-10-26"),
            new Transaction(3530081.34, "1991-11-26"),
            new Transaction(-4207099.71, "1992-01-30"),
            new Transaction(9399299.08, "1992-03-20"),
            new Transaction(-8095157.72, "1992-04-03"),
            new Transaction(-8304856.56, "1992-04-30"),
            new Transaction(-8720963.63, "1992-07-17"),
            new Transaction(-6580856.15, "1992-10-22"),
            new Transaction(-9484208.89, "1992-11-27"),
            new Transaction(-1467963.57, "1992-12-07"),
            new Transaction(9016179.11, "1992-12-09"),
            new Transaction(-1384423.55, "1992-12-29"),
            new Transaction(5727682.74, "1993-04-05"),
            new Transaction(9756453.38, "1993-04-12"),
            new Transaction(-234191.21, "1993-06-15"),
            new Transaction(9620334.17, "1993-06-27"),
            new Transaction(-878724.07, "1993-10-02"),
            new Transaction(3972053.87, "1994-01-06"),
            new Transaction(-6008557.94, "1994-03-15"),
            new Transaction(8313104.84, "1994-04-08"),
            new Transaction(-1405771.14, "1994-05-17"),
            new Transaction(6913676.85, "1994-07-14"),
            new Transaction(-8264124.23, "1994-10-16"),
            new Transaction(1511220.17, "1994-11-03"),
            new Transaction(-4651294.99, "1995-01-15"),
            new Transaction(2379701.04, "1995-02-04"),
            new Transaction(8731164.47, "1995-04-26"),
            new Transaction(4851320.57, "1995-04-28"),
            new Transaction(-5407080.66, "1995-06-19"),
            new Transaction(5603763.88, "1995-06-26"),
            new Transaction(3461105.75, "1995-08-27"),
            new Transaction(-5828302.01, "1995-10-12"),
            new Transaction(413596.88, "1995-12-23"),
            new Transaction(-5964239.26, "1995-12-26"),
            new Transaction(8014413.46, "1996-02-12"),
            new Transaction(-9015021.43, "1996-02-24"),
            new Transaction(1371272.39, "1996-05-21"),
            new Transaction(6708655.44, "1996-06-20"),
            new Transaction(1613982.45, "1996-06-25"),
            new Transaction(2749312.54, "1996-08-13"),
            new Transaction(4843905.31, "1996-09-03")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.20295027427707013, rate, xirr.precision);
    }

    @Test
    void test95() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-14215988.80, "1984-01-16"),
            new Transaction(-5039291.60, "1984-06-26"),
            new Transaction(-8229692.40, "1985-03-10"),
            new Transaction(8094814.19, "1985-10-16"),
            new Transaction(5044119.64, "1985-12-13"),
            new Transaction(-7690038.87, "1986-02-06"),
            new Transaction(-7666047.56, "1986-07-15"),
            new Transaction(5100517.50, "1987-02-02"),
            new Transaction(-1355531.63, "1987-06-10"),
            new Transaction(2727748.35, "1987-09-09"),
            new Transaction(-3540749.31, "1988-05-05"),
            new Transaction(5779824.29, "1988-10-08"),
            new Transaction(-9494366.57, "1989-05-01"),
            new Transaction(-5724605.72, "1989-08-13"),
            new Transaction(7071651.41, "1989-12-22"),
            new Transaction(7545259.40, "1990-01-08"),
            new Transaction(-4558692.45, "1990-04-24"),
            new Transaction(-2158102.75, "1990-06-20"),
            new Transaction(-2439054.43, "1990-10-04"),
            new Transaction(3219074.91, "1990-11-16"),
            new Transaction(8227445.48, "1991-08-05"),
            new Transaction(-5097229.13, "1992-04-10"),
            new Transaction(-7825281.59, "1992-05-20"),
            new Transaction(-3963345.51, "1992-07-23"),
            new Transaction(4377517.26, "1992-08-29"),
            new Transaction(2074861.75, "1992-10-28"),
            new Transaction(6797349.85, "1993-05-19"),
            new Transaction(3935137.25, "1993-08-13"),
            new Transaction(-3688188.70, "1993-12-01"),
            new Transaction(961185.44, "1994-06-08"),
            new Transaction(-9462118.20, "1994-10-01"),
            new Transaction(7357482.60, "1994-10-07"),
            new Transaction(2806855.01, "1994-11-25"),
            new Transaction(-7694709.38, "1995-02-08"),
            new Transaction(-7811442.96, "1995-05-12"),
            new Transaction(-1622788.37, "1995-07-31"),
            new Transaction(-672911.81, "1995-10-13"),
            new Transaction(17441488.16, "1996-04-29")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.12138006994500755, rate, xirr.precision);
    }

    @Test
    void test96() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-8927594.04, "1996-06-04"),
            new Transaction(-9374398.31, "1996-11-07"),
            new Transaction(9621368.40, "1997-02-21"),
            new Transaction(4874550.32, "1997-07-21"),
            new Transaction(-5281050.97, "1997-08-23"),
            new Transaction(6876231.59, "1997-11-14"),
            new Transaction(-9932840.37, "1997-11-27"),
            new Transaction(6752580.68, "1998-01-19"),
            new Transaction(-4137389.95, "1998-04-18"),
            new Transaction(-2683755.53, "1998-06-12"),
            new Transaction(3189274.55, "1998-08-01"),
            new Transaction(-6698998.80, "1998-12-16"),
            new Transaction(7206621.58, "1999-05-22"),
            new Transaction(-4951959.36, "1999-06-19"),
            new Transaction(-9349552.13, "1999-11-15"),
            new Transaction(-2982066.53, "2000-05-07"),
            new Transaction(-5958515.91, "2000-06-01"),
            new Transaction(2184388.86, "2000-10-04"),
            new Transaction(-7633241.26, "2000-10-13"),
            new Transaction(-4623533.20, "2001-03-02"),
            new Transaction(3157283.97, "2001-03-10"),
            new Transaction(8051297.96, "2001-05-06"),
            new Transaction(-6816655.62, "2001-09-02"),
            new Transaction(-6921642.93, "2001-12-06"),
            new Transaction(-1641105.89, "2001-12-07"),
            new Transaction(5943163.40, "2002-04-22"),
            new Transaction(-4340454.79, "2002-09-13"),
            new Transaction(-5511196.61, "2003-02-25"),
            new Transaction(-1696436.86, "2003-06-15"),
            new Transaction(3165580.68, "2003-06-20"),
            new Transaction(-2188716.74, "2003-08-28"),
            new Transaction(7956025.60, "2003-11-22"),
            new Transaction(4873886.14, "2004-01-23"),
            new Transaction(-4380415.87, "2004-05-06"),
            new Transaction(-5058394.52, "2004-10-28"),
            new Transaction(8804794.80, "2004-12-27"),
            new Transaction(-976980.38, "2005-02-05"),
            new Transaction(-9292392.79, "2005-05-09"),
            new Transaction(-3772414.12, "2005-08-19"),
            new Transaction(-2288620.65, "2006-01-03"),
            new Transaction(-9723045.85, "2006-04-25"),
            new Transaction(1652391.68, "2006-09-27"),
            new Transaction(-7674331.03, "2007-02-19"),
            new Transaction(-5526891.24, "2007-08-03"),
            new Transaction(8312995.82, "2008-01-27"),
            new Transaction(-6066027.76, "2008-03-27"),
            new Transaction(1165797.85, "2008-08-01"),
            new Transaction(-878365.07, "2008-08-05"),
            new Transaction(-724418.02, "2008-08-14"),
            new Transaction(-5353442.30, "2008-12-28"),
            new Transaction(-9506418.89, "2009-04-22"),
            new Transaction(2247295.64, "2009-07-26"),
            new Transaction(-5671623.50, "2009-07-29"),
            new Transaction(-3704978.21, "2010-01-08"),
            new Transaction(13828245.35, "2010-03-30")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.537075029234395, rate, xirr.precision);
    }

    @Test
    void test97() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-4586452.62, "1989-10-19"),
            new Transaction(-1151172.62, "1990-06-04"),
            new Transaction(6493263.81, "1991-03-13"),
            new Transaction(-8646257.39, "1991-04-10"),
            new Transaction(-8077265.90, "1991-06-20"),
            new Transaction(5935174.16, "1992-04-19"),
            new Transaction(-841450.95, "1992-10-01"),
            new Transaction(1164610.74, "1993-10-30"),
            new Transaction(837682.28, "1994-05-12"),
            new Transaction(2605905.21, "1995-07-24"),
            new Transaction(2812717.70, "1995-12-02"),
            new Transaction(3870120.69, "1996-04-23"),
            new Transaction(-5810621.59, "1996-07-13"),
            new Transaction(8370691.32, "1997-06-04"),
            new Transaction(-8079326.70, "1997-09-08"),
            new Transaction(-6392902.09, "1998-07-22"),
            new Transaction(-6519897.51, "1999-07-06"),
            new Transaction(-7296185.10, "1999-09-08"),
            new Transaction(-2614809.38, "1999-09-23"),
            new Transaction(1133122.86, "2000-12-14"),
            new Transaction(5863294.86, "2001-05-30"),
            new Transaction(19512929.15, "2001-11-24")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-1.0733372718095779E-2, rate, xirr.precision);
    }

    @Test
    void test98() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-9733687.01, "2006-09-01"),
            new Transaction(8100666.60, "2008-02-04"),
            new Transaction(-7233899.92, "2009-06-16"),
            new Transaction(-2131750.71, "2010-11-04"),
            new Transaction(-8969316.21, "2011-09-27"),
            new Transaction(-4903681.72, "2012-12-06"),
            new Transaction(-7099358.40, "2013-03-07"),
            new Transaction(-4295788.99, "2014-12-27"),
            new Transaction(8733166.11, "2016-12-04"),
            new Transaction(1084532.13, "2018-08-13"),
            new Transaction(-1717610.81, "2019-01-16"),
            new Transaction(2593592.16, "2020-05-17"),
            new Transaction(8176712.27, "2022-04-17"),
            new Transaction(19298865.44, "2022-12-01")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(5.2368909120559708E-3, rate, xirr.precision);
    }

    @Test
    void test99() {
        Xirr xirr = Xirr.instance();
        NewtonsXirr newtonsXirr = new NewtonsXirr(new Transaction[]{
            new Transaction(-8651892.43, "1992-02-11"),
            new Transaction(3967644.47, "1992-04-13"),
            new Transaction(4716752.01, "1992-04-26"),
            new Transaction(1749847.36, "1992-04-29"),
            new Transaction(7075092.16, "1992-08-08"),
            new Transaction(-9050522.84, "1992-09-03"),
            new Transaction(-5724520.47, "1992-09-21"),
            new Transaction(-1106056.60, "1992-11-10"),
            new Transaction(8339691.36, "1993-01-07"),
            new Transaction(-1609920.93, "1993-03-24"),
            new Transaction(-9586100.12, "1993-05-02"),
            new Transaction(-3042920.33, "1993-08-05"),
            new Transaction(-4483492.92, "1993-11-02"),
            new Transaction(-1796464.90, "1993-11-21"),
            new Transaction(8371065.00, "1994-01-28"),
            new Transaction(1742862.15, "1994-02-11"),
            new Transaction(-3773930.35, "1994-03-07"),
            new Transaction(-6829034.84, "1994-04-13"),
            new Transaction(9236951.00, "1994-07-08"),
            new Transaction(101511.36, "1994-08-31"),
            new Transaction(3450342.14, "1994-10-01"),
            new Transaction(3094532.97, "1994-10-24"),
            new Transaction(9411450.40, "1994-11-15"),
            new Transaction(8610070.59, "1994-12-17"),
            new Transaction(7441889.86, "1995-03-21"),
            new Transaction(-2655158.09, "1995-05-10"),
            new Transaction(-4725432.97, "1995-08-09"),
            new Transaction(8597807.91, "1995-10-20"),
            new Transaction(9832995.24, "1995-11-10"),
            new Transaction(-8554192.96, "1996-01-02"),
            new Transaction(-6066790.90, "1996-02-06"),
            new Transaction(-2851007.50, "1996-04-12"),
            new Transaction(-7333469.10, "1996-05-24"),
            new Transaction(-7449558.98, "1996-07-14"),
            new Transaction(2425492.18, "1996-09-14"),
            new Transaction(217864.39, "1996-12-21"),
            new Transaction(1068513.15, "1997-03-26"),
            new Transaction(-9461347.78, "1997-05-26"),
            new Transaction(-52805.09, "1997-07-21"),
            new Transaction(799749.21, "1997-10-16"),
            new Transaction(2754525.73, "1998-01-27"),
            new Transaction(-6772211.31, "1998-02-19"),
            new Transaction(2761211.55, "1998-04-23"),
            new Transaction(7167928.83, "1998-05-16"),
            new Transaction(5719847.78, "1998-05-26"),
            new Transaction(9632780.22, "1998-09-01"),
            new Transaction(-4029419.48, "1998-10-03"),
            new Transaction(585391.22, "1998-10-11"),
            new Transaction(663376.34, "1998-11-04"),
            new Transaction(-569522.78, "1998-11-09"),
            new Transaction(-1912241.91, "1999-01-01"),
            new Transaction(-8392810.72, "1999-02-19"),
            new Transaction(81454.65, "1999-03-02"),
            new Transaction(-9554229.47, "1999-03-22"),
            new Transaction(160551.71, "1999-06-10"),
            new Transaction(8354207.99, "1999-08-16"),
            new Transaction(6310662.90, "1999-11-19"),
            new Transaction(-677611.13, "2000-02-24"),
            new Transaction(2824128.89, "2000-03-28"),
            new Transaction(-3541391.63, "2000-04-25"),
            new Transaction(-1575180.09, "2000-07-05"),
            new Transaction(-9539462.90, "2000-07-23"),
            new Transaction(-9829228.19, "2000-10-24"),
            new Transaction(4729478.23, "2000-11-24"),
            new Transaction(-4770498.87, "2000-12-20"),
            new Transaction(-5389974.01, "2001-02-05"),
            new Transaction(-4153128.10, "2001-04-13"),
            new Transaction(7977676.13, "2001-05-15"),
            new Transaction(-2834225.78, "2001-06-04"),
            new Transaction(4001015.50, "2001-07-13"),
            new Transaction(-7555068.52, "2001-08-06"),
            new Transaction(7304196.98, "2001-09-27"),
            new Transaction(-9275326.34, "2002-01-09"),
            new Transaction(7241177.46, "2002-01-22"),
            new Transaction(5510124.54, "2002-03-31"),
            new Transaction(-3240519.31, "2002-04-13"),
            new Transaction(6633429.05, "2002-05-15"),
            new Transaction(-8236916.62, "2002-05-17"),
            new Transaction(-2847562.21, "2002-07-19"),
            new Transaction(2943880.51, "2002-07-20"),
            new Transaction(-2705006.81, "2002-07-26"),
            new Transaction(-5899204.86, "2002-09-27"),
            new Transaction(636791.80, "2002-11-10"),
            new Transaction(-331953.32, "2002-12-07"),
            new Transaction(-1148756.48, "2003-02-06"),
            new Transaction(206022.29, "2003-05-16"),
            new Transaction(-9411239.68, "2003-07-06"),
            new Transaction(5312951.17, "2003-10-16"),
            new Transaction(1651404.80, "2003-11-05"),
            new Transaction(1758862.84, "2003-12-31"),
            new Transaction(-9569568.02, "2004-03-26"),
            new Transaction(2990495.12, "2004-04-16"),
            new Transaction(7834350.44, "2004-07-30"),
            new Transaction(7200402.83, "2004-11-05"),
            new Transaction(6422942.05, "2004-12-07")
        });
        double rate = xirr.xirr(newtonsXirr);
        System.out.println("XIRR: " + rate);
        double xnpvValue = xirr.xnpv(rate, newtonsXirr);
        System.out.println("XNPV: " + xnpvValue);
        Assertions.assertEquals(0, xnpvValue, xirr.precision);
        Assertions.assertEquals(-0.15891102962195872, rate, xirr.precision);
    }

}
