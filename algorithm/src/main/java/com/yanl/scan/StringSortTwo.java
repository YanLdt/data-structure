package com.yanl.scan;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-13 18:34:52
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-13 18:38:35
 * @Description: 请输入...
 * 多个测试用例，每个测试用例一行。
 * 每行通过空格隔开，有n个字符，n＜100
 * 
 * 对于每组测试用例，输出一行排序过的字符串，每个字符串通过空格隔开
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringSortTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> res = new ArrayList<>();
        while(sc.hasNextLine()){
            String[] line = sc.nextLine().split(" ");
            Arrays.sort(line);
            String tmp = String.join(" ", line);
            res.add(tmp);
        }
        sc.close();
        for(String s : res){
            System.out.println(s);
        }
    }
}