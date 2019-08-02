package com.qixiafei.book.headfirst.gof.c11;

import java.util.Arrays;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   齐霞飞 </P>
 * <P>CREATE AT: 2019/3/13 18:52</P>
 * <P>UPDATE AT: 2019/3/13 18:52</P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public class Trest2 {

    int size = 1 << 15;
    int[] map = new int[size];
    int length = (1 << 15) - 1;
    int index;

    public int[] twoSum(int[] nums, int target) {
        System.out.println(Arrays.toString(nums) + " target:" + target);
        for (int i = 0; i < nums.length; i++) {
            index = nums[i] & length; //

            if (map[index] != 0) {
                return new int[]{map[index] - 1, i};
            } else {
                map[(target - index) & length] = i + 1;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Trest2 test = new Trest2();

        int[] ints = test.twoSum(new int[]{2 << 12 - 1, 2 << 13 - 1}, 2 << 14 - 1);
        System.out.println(Arrays.toString(ints));
    }
}
