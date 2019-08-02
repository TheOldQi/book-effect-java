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
public class Trest {

    public int[] twoSum(int[] nums, int target) {
        final int length = nums.length;
        final Item[] assistNums = new Item[length];
        for (int i = 0; i < length; i++) {
            Item item = new Item();
            item.setVal(nums[i]);
            item.setLocation(i);
            assistNums[i] = item;
        }

        Arrays.sort(assistNums);

        for (int i = 0, len = nums.length; i < len; i++) {
            Item item = assistNums[i];
            Item targetItem = new Item();
            targetItem.setVal(target - item.getVal());
            int j = Arrays.binarySearch(assistNums, targetItem);
            if (j > -1 && item.getLocation() != assistNums[j].getLocation()) {
                return new int[]{item.getLocation(), assistNums[j].getLocation()};
            }

        }
        return null;
    }

    public static class Item implements Comparable<Item> {
        private int val;
        private int location;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public int getLocation() {
            return location;
        }

        public void setLocation(int location) {
            this.location = location;
        }


        @Override
        public int compareTo(Item o) {
            return this.val - o.getVal();
        }
    }

    public static void main(String[] args) {
        Trest test = new Trest();
        test.twoSum(new int[]{1, 2, 1, 23, 14, 5, 123, 5, 122}, 5);
    }
}
