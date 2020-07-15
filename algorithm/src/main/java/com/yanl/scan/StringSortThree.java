package com.yanl.scan;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-13 18:38:51
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-13 18:40:10
 * @Description: 请输入...
 * 多个测试用例，每个测试用例一行。
 * 每行通过,隔开，有n个字符，n＜100
 * 
 * 对于每组用例输出一行排序后的字符串，用','隔开，无结尾空格
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringSortThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> res = new ArrayList<>();
        while(sc.hasNextLine()){
            String[] line = sc.nextLine().split(",");
            Arrays.sort(line);
            String tmp = String.join(",", line);
            res.add(tmp);
        }
        sc.close();
        for(String s : res){
            System.out.println(s);
        }
    }
}