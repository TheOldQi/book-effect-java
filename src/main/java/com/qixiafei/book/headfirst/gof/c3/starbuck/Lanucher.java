package com.qixiafei.book.headfirst.gof.c3.starbuck;

import com.qixiafei.book.headfirst.gof.c3.starbuck.coffee.DeepRoasting;
import com.qixiafei.book.headfirst.gof.c3.starbuck.coffee.Espresso;
import com.qixiafei.book.headfirst.gof.c3.starbuck.coffee.HouseBlend;
import com.qixiafei.book.headfirst.gof.c3.starbuck.condiment.Mocha;
import com.qixiafei.book.headfirst.gof.c3.starbuck.condiment.Soy;
import com.qixiafei.book.headfirst.gof.c3.starbuck.condiment.Whip;

/**
 * <P>Description: 测试入口. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/11 10:30</P>
 * <P>UPDATE AT: 2019/3/11 10:30</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Lanucher {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DeepRoasting();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());


    }
}
