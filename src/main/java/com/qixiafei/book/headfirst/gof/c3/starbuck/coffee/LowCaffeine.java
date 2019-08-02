package com.qixiafei.book.headfirst.gof.c3.starbuck.coffee;

import com.qixiafei.book.headfirst.gof.c3.starbuck.Beverage;

/**
 * <P>Description: 低咖啡因咖啡. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/11 10:01</P>
 * <P>UPDATE AT: 2019/3/11 10:01</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class LowCaffeine extends Beverage {

    public LowCaffeine() {
        description = "Low Caffeine Coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
