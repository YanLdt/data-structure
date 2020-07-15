/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-13 17:36:42
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-13 17:47:42
 * @Description: 请输入...
 * 输入包括两个正整数a,b(1 <= a, b <= 10^9),输入数据有多组, 如果输入为0 0则结束输入
 * 输出a+b的结果
 */
package com.yanl.scan;

import java.util.ArrayList;
import java.util.Scanner;

public class PlusThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        ArrayList<Integer> res = new ArrayList<>();
        while(scanner.hasNextLine()){
            String[] line = scanner.nextLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            if(a == 0 && b == 0){
                break;
            }
            res.add(a+b);
        }

        scanner.close();
        for(int i : res){
            System.out.println(i);
        }
    }
}