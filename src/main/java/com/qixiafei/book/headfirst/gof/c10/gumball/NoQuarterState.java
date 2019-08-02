package com.qixiafei.book.headfirst.gof.c10.gumball;

/**
 * <P>Description: 未投入硬币的初始状态. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/13 11:46</P>
 * <P>UPDATE AT: 2019/3/13 11:46</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class NoQuarterState implements State {

    private final GumBallMachine ballMachine;

    public NoQuarterState(final GumBallMachine ballMachine) {
        this.ballMachine = ballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投入硬币，可以拉动摇杆");
        ballMachine.setState(ballMachine.getHasQuaterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("请先投入硬币再退硬币");
    }

    @Override
    public void turnCrank() {
        System.out.println("请先投入硬币再拉摇杆");
    }

    @Override
    public void dispense() {
        System.out.println("未投入硬币不可能发放糖果");
    }
}
