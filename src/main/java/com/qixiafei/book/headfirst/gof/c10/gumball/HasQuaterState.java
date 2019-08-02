package com.qixiafei.book.headfirst.gof.c10.gumball;

import java.util.Random;

/**
 * <P>Description: 已投入硬币状态. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/13 11:48</P>
 * <P>UPDATE AT: 2019/3/13 11:48</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class HasQuaterState implements State {

    private final GumBallMachine ballMachine;
    private static final Random random = new Random();

    public HasQuaterState(final GumBallMachine ballMachine) {
        this.ballMachine = ballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("您已经投过硬币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("硬币弹出成功");
        ballMachine.setState(ballMachine.getNoQuaterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("摇杆拉动成功");
        ballMachine.setState(ballMachine.getSoldState());
        int i = random.nextInt(10);
        if (i == 0 && ballMachine.getCount() > 1) {
            ballMachine.setState(ballMachine.getWinnerState());
        } else {
            ballMachine.setState(ballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("投入硬币状态不会发放糖果");
    }
}
