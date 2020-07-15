package com.yanl.scan;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-13 18:23:36
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-14 00:06:36
 * @Description: 请输入...
 * 输入有两行，第一行n
 * 第二行是n个空格隔开的字符串
 * 
 * 输出一行排序后的字符串，空格隔开，无结尾空格
 */

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String[] res = sc.nextLine().split(" ");
        sc.close();
        Arrays.sort(res);
        String out = String.join(" ", res);
        System.out.println(out);
    }
}