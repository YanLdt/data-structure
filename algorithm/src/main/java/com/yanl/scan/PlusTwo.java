/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-13 17:06:43
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-13 17:47:31
 * @Description: 请输入...
 * 
 * 输入第一行包括一个数据组数t(1 <= t <= 100)
 * 接下来每行包括两个正整数a,b(1 <= a, b <= 10^9)
 * 
 * 输出a+b的结果
 */ 
package com.yanl.scan;

import java.util.ArrayList;
import java.util.Scanner;

public class PlusTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String[] line = scanner.nextLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            res.add(a + b);
        }
        scanner.close();

        for(int i : res){
            System.out.println(i);
        }
    }
}