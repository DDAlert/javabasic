package com.imooc.javabasic.leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] index = {12,2,3,4,5};
        int[] sum = twoSum(index, 8);
        System.out.println(Arrays.toString(sum));
    }

    public static int[] twoSum(int[] nums,int target){
        int[] index = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])){
                index[0] = hashMap.get(nums[i]);
                index[1] = i;
            }
            hashMap.put(target-nums[i],i);
        }
        return index;
    }
}
