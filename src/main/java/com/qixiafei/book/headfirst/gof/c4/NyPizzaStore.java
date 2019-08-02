package com.qixiafei.book.headfirst.gof.c4;

import com.qixiafei.book.headfirst.gof.c4.pizza.NyStyleCheesePizza;
import com.qixiafei.book.headfirst.gof.c4.pizza.NyStyleClamPizza;
import com.qixiafei.book.headfirst.gof.c4.pizza.NyStyleVeggiePizza;
import com.qixiafei.book.headfirst.gof.c4.pizza.Pizza;

/**
 * <P>Description: 纽约披萨店. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/11 13:53</P>
 * <P>UPDATE AT: 2019/3/11 13:53</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class NyPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NyStyleCheesePizza();
        } else if ("veggie".equals(type)) {
            return new NyStyleVeggiePizza();
        } else if ("clam".equals(type)) {
            return new NyStyleClamPizza();
        } else if ("pepperoni".equals(type)) {
            return new NyStyleClamPizza();
        } else
            return null;
    }
}
