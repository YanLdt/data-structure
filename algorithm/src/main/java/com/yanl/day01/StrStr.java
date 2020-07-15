package com.yanl.day01;

/**
 * @Author: YanL
 * @Time: 23:29 2020/6/22
 * @Email: imyanl.dt@gmail.com
 * @Description:
 * 给定一个  haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从 0 开始)。
 * 如果不存在，则返回  -1。
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 */

public class StrStr {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
    }


    public static int strStr(String haystack, String needle) {
        if(needle == null || needle.length() == 0){
            return 0;
        }
        int i, j;

        //i没必要到n-1; 如果剩余字符串长度小于目标字符串直接返回-1
        for(i = 0; i < haystack.length() - needle.length() + 1; i++){
            for(j = 0; j < needle.length(); j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            }

            if(needle.length() == j){
                return i;
            }
        }

        return -1;
    }
}
