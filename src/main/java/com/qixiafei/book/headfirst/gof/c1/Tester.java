package com.qixiafei.book.headfirst.gof.c1;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/4 17:56</P>
 * <P>UPDATE AT: 2019/3/4 17:56</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Tester {


    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.performanceFly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performanceFly();
    }
}
