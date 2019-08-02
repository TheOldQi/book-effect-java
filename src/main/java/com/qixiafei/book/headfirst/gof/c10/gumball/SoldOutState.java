package com.qixiafei.book.headfirst.gof.c10.gumball;

/**
 * <P>Description: 售罄状态. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/13 11:51</P>
 * <P>UPDATE AT: 2019/3/13 11:51</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class SoldOutState implements State {

    private final GumBallMachine gumBallMachine;

    public SoldOutState(final GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已售罄，请勿投硬币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("已售罄，无法退还硬币");
    }

    @Override
    public void turnCrank() {
        System.out.println("已售罄，拉摇杆也没用");
    }

    @Override
    public void dispense() {
        System.out.println("已售罄，不会发放糖果");
    }
}
