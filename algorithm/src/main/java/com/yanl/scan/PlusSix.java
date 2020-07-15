package com.yanl.scan;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-13 18:13:08
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-13 18:16:23
 * @Description: 请输入...
 * 输入数据有多组, 每行表示一组输入数据。
 * 每行的第一个整数为整数的个数n(1 <= n <= 100)。
 * 接下来n个正整数, 即需要求和的每个正整数。
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PlusSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> res = new ArrayList<>();
        while(sc.hasNextLine()){
            String[] line = sc.nextLine().split(" ");
            int n = Integer.parseInt(line[0]);
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