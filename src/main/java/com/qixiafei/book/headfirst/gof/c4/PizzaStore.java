package com.qixiafei.book.headfirst.gof.c4;

import com.qixiafei.book.headfirst.gof.c4.pizza.Pizza;

/**
 * <P>Description: 披萨店基类. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/11 12:03</P>
 * <P>UPDATE AT: 2019/3/11 12:03</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    protected Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

