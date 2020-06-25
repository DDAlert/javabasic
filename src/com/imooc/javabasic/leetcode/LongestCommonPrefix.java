package com.imooc.javabasic.leetcode;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"dsaf","ds"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        //数组为空的时候直接返回
        if (strs == null || strs.length ==0){
            return "";
        }
        //取出第0个字符串
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            //比较prefix和strs[i]
            int length = Math.min(prefix.length(),strs[i].length());
            int index = 0;
            //从下标0开始，分别对比两个字符串是否相等，不相等跳出while循环，并且返回下标，通过下标截取相同的前缀
            while (index<length && prefix.charAt(index)==strs[i].charAt(index)){
                index++;
            }
            prefix = prefix.substring(0,index);
        }
        return prefix;
    }
}
