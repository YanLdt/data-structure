package com.yanl.scan;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-13 18:15:29
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-13 18:22:50
 * @Description: 请输入...
 * 输入数据有多组, 每行表示一组输入数据。
 * 每行不定有n个整数，空格隔开。(1 <= n <= 100)。
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PlusSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> res = new ArrayList<>();
        while(sc.hasNextLine()){
            String[] line = sc.nextLine().split(" ");
            int length = line.length;
            int sum = 0;
            for(int i = 0; i < length; i++){
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