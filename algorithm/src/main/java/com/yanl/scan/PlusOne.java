/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-13 16:49:14
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-13 17:32:11
 * @Description: 请输入...
 * 
 * 
 * 计算a+b
 * 输入包括两个正整数a,b(1 <= a, b <= 10^9),输入数据包括多组。
 * 输出a+b的结果
 * 在读取行的时候同时计算，把数据存储在ArrayList中，等到数据读取完全之后再打印结果集。
 */
package com.yanl.scan;

import java.util.ArrayList;
import java.util.Scanner;

public class PlusOne {

    
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         ArrayList<Integer> res = new ArrayList<>();
         while(scanner.hasNextLine()){
             String[] lines = scanner.nextLine().split(" ");
             int a = Integer.parseInt(lines[0]);
             int b = Integer.parseInt(lines[1]);
             res.add(a + b);
         }
         scanner.close();
        
         for(int i : res){
             System.out.println(i);
         }
     }

     
        // public static void main(String[] args) throws IOException {
        //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //     String line = null;
              
        //     while((line = br.readLine()) != null){
        //         int a = Integer.parseInt(line.trim().split(" ")[0]);
        //         int b = Integer.parseInt(line.trim().split(" ")[1]);
        //         System.out.println(a + b);
        //     }
        // }
    
}
