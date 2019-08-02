package com.qixiafei.book.headfirst.gof;

import java.util.HashSet;
import java.util.Set;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/15 20:20</P>
 * <P>UPDATE AT: 2019/3/15 20:20</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Test {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < 10000; i++) {
            set.add((int) Math.pow(i, 2));
        }
        for (int i = 1; i < 100; i++) {
            System.out.println(Math.pow(i,3));
        }
    }
}
