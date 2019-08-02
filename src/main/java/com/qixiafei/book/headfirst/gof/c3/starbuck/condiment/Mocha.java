package com.qixiafei.book.headfirst.gof.c3.starbuck.condiment;

import com.qixiafei.book.headfirst.gof.c3.starbuck.Beverage;
import com.qixiafei.book.headfirst.gof.c3.starbuck.CondimentDecorator;

/**
 * <P>Description: 加摩卡. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/11 10:04</P>
 * <P>UPDATE AT: 2019/3/11 10:04</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
