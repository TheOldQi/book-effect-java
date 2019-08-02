package com.qixiafei.book.headfirst.gof.c10.gumball;

/**
 * <P>Description: 状态，封装改变状态的行为. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/13 11:42</P>
 * <P>UPDATE AT: 2019/3/13 11:42</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public interface State {

    /**
     * 投入硬币.
     */
    void insertQuarter();

    /**
     * 退回硬币.
     */
    void ejectQuarter();

    /**
     * 拉动摇杆.
     */
    void turnCrank();

    /**
     * 发放糖果.
     */
    void dispense();
}
