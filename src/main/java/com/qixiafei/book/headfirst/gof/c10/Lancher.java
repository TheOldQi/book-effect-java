package com.qixiafei.book.headfirst.gof.c10;

import com.qixiafei.book.headfirst.gof.c10.gumball.GumBallMachine;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/13 14:46</P>
 * <P>UPDATE AT: 2019/3/13 14:46</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Lancher {

    public static void main(String[] args) {
        GumBallMachine gumBallMachine = new GumBallMachine(10);

        for (int i = 0; i < 10; i++) {
            gumBallMachine.insertQuarter();
            gumBallMachine.trunCrank();
        }

    }
}
