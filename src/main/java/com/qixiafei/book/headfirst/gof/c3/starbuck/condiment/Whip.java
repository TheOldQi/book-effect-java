package com.qixiafei.book.headfirst.gof.c3.starbuck.condiment;

import com.qixiafei.book.headfirst.gof.c3.starbuck.Beverage;
import com.qixiafei.book.headfirst.gof.c3.starbuck.CondimentDecorator;

/**
 * <P>Description: 加奶泡. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/11 10:26</P>
 * <P>UPDATE AT: 2019/3/11 10:26</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .1 + beverage.cost();
    }
}
