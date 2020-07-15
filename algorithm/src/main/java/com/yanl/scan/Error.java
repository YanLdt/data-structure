package com.yanl.scan;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-13 18:42:02
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-13 18:46:46
 * @Description: 请输入...
 * 输入有多组测试用例，每组空格隔开两个整数
 * 
 * 对于每组数据输出一行两个整数的和
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> res = new ArrayList<>();
        while(sc.hasNextLine()){
            String[] line = sc.nextLine().split(" ");
            //注意数据范围
            Long a = Long.parseLong(line[0]);
            Long b = Long.parseLong(line[1]);
            res.add(a+b);
        }
        sc.close();
        for(long i : res){
            System.out.println(i);
        }
    }
}