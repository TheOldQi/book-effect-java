package com.qixiafei.book.headfirst.gof.c3.starbuck;

/**
 * <P>Description: 饮料超类. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/11 9:49</P>
 * <P>UPDATE AT: 2019/3/11 9:49</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public abstract class Beverage {

    protected String description = "unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
