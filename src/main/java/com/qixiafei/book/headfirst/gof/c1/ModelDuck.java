package com.qixiafei.book.headfirst.gof.c1;

/**
 * <P>Description: 模型呀. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/4 17:55</P>
 * <P>UPDATE AT: 2019/3/4 17:55</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("我是模型鸭");
    }
}
