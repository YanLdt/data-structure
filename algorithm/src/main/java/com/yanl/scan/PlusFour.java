package com.yanl.scan;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-13 17:47:55
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-13 18:04:50
 * @Description: 请输入...
 * 输入数据包括多组。
 * 每组数据一行,每行的第一个整数为整数的个数n(1 <= n <= 100), n为0的时候结束输入。
 * 接下来n个正整数,即需要求和的每个正整数。
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PlusFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> res = new ArrayList<>();
        while(sc.hasNextLine()){
            String[] line = sc.nextLine().split(" ");
            int n = Integer.parseInt(line[0]);
            if(n == 0){
                break;
            }
            int sum = 0;
            for(int i = 1; i <= n; i++){
                sum += Integer.parseInt(line[i]);
            }
            res.add(sum);
        }
        sc.close();
        for(int i : res){
            System.out.println(i);
        }
    }
    
}