package com.qixiafei.book.headfirst.gof.c10.gumball;

/**
 * <P>Description: 售出糖果状态. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/13 11:50</P>
 * <P>UPDATE AT: 2019/3/13 11:50</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class SoldState implements State {

    private final GumBallMachine gumBallMachine;

    public SoldState(final GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("您已投入硬币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("正在发放糖果，不允许退款");
    }

    @Override
    public void turnCrank() {
        System.out.println("正在发放糖果，请勿重复拉动摇杆");
    }

    @Override
    public void dispense() {
        System.out.println("正在弹出糖果");
        gumBallMachine.realseBall();
        if (gumBallMachine.getCount() > 0) {
            gumBallMachine.setState(gumBallMachine.getNoQuaterState());
        } else {
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        }
    }
}
