package com.qixiafei.book.headfirst.gof.c1;

/**
 * <P>Description: 不会飞. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/4 14:29</P>
 * <P>UPDATE AT: 2019/3/4 14:29</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("我不会飞");
    }
}
