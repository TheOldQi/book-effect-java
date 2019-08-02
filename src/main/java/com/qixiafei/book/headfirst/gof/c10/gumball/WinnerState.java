package com.qixiafei.book.headfirst.gof.c10.gumball;

/**
 * <P>Description: 幸运儿状态. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/13 14:41</P>
 * <P>UPDATE AT: 2019/3/13 14:41</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class WinnerState implements State {

    private GumBallMachine gumBallMachine;

    public WinnerState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("幸运儿状态不能投硬币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("幸运儿状态不能退硬币");

    }

    @Override
    public void turnCrank() {
        System.out.println("幸运儿状态不能拉杆");
    }

    @Override
    public void dispense() {
        System.out.println("恭喜您成为幸运儿！");
        gumBallMachine.realseBall();
        if (gumBallMachine.getCount() > 0) {
            gumBallMachine.realseBall();
        }
        if (gumBallMachine.getCount() == 0) {
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        }

    }
}
