package com.qixiafei.book.headfirst.gof.c3.starbuck.coffee;

import com.qixiafei.book.headfirst.gof.c3.starbuck.Beverage;

/**
 * <P>Description: 综合咖啡. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/11 9:58</P>
 * <P>UPDATE AT: 2019/3/11 9:58</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
