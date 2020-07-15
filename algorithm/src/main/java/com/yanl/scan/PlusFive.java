package com.yanl.scan;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-13 18:05:32
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-13 18:10:19
 * @Description: 请输入...
 * 输入的第一行为一个整数t为数据组数
 * 接下来t行 每行一组数据，
 * 每行的第一个整数为整数的个数
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PlusFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> res = new ArrayList<>();
        int lineNumber = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < lineNumber; i++){
            String[] line = sc.nextLine().split(" ");
            int n = Integer.parseInt(line[0]);
            int sum = 0;
            for(int j = 1; j <= n; i++){
                sum += Integer.parseInt(line[j]);
            }
            res.add(sum);
        }
        sc.close();
        for(int i : res){
            System.out.println(i);
        }
    }
}
