package com.qixiafei.book.headfirst.gof.c3.starbuck.condiment;

import com.qixiafei.book.headfirst.gof.c3.starbuck.Beverage;
import com.qixiafei.book.headfirst.gof.c3.starbuck.CondimentDecorator;

/**
 * <P>Description: 加豆浆. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/11 10:24</P>
 * <P>UPDATE AT: 2019/3/11 10:24</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
