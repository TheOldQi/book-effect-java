package com.qixiafei.book.headfirst.gof.c10.gumball;

/**
 * <P>Description: 糖果机. </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/13 11:42</P>
 * <P>UPDATE AT: 2019/3/13 11:42</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */

public class GumBallMachine {

    private State noQuaterState;

    private State hasQuaterState;

    private State soldState;

    private State soldOutState;

    private State winnerState;

    private State state;
    private int count = 0;

    public GumBallMachine(int count) {
        noQuaterState = new NoQuarterState(this);
        hasQuaterState = new HasQuaterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        this.count = count;
        if (count > 0) {
            state = noQuaterState;
        } else {
            state = soldOutState;
        }
    }

    /**
     * 投入硬币.
     */
    public void insertQuarter() {
        state.insertQuarter();
    }

    /**
     * 退还硬币.
     */
    public void ejectQuarter() {
        state.ejectQuarter();
    }

    /**
     * 拉动摇杆.
     */
    public void trunCrank() {
        state.turnCrank();
        state.dispense();
    }

    /**
     * 发放糖果辅助方法.
     */
    void realseBall() {
        System.out.println("一个糖果正在弹出。。。");
        if (count != 0) {
            count--;
        }
    }


    void setState(final State state) {
        this.state = state;
    }

    State getState() {
        return state;
    }

    State getNoQuaterState() {
        return noQuaterState;
    }

    State getHasQuaterState() {
        return hasQuaterState;
    }

    State getSoldState() {
        return soldState;
    }

    State getWinnerState() {
        return winnerState;
    }

    State getSoldOutState() {
        return soldOutState;
    }

    int getCount() {
        return count;
    }
}
