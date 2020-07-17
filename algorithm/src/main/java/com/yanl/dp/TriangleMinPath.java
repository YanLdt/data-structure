package com.yanl.dp;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-14 00:10:33
 * @LastModifiedBy:   
 * @LastEditTime: 2020-07-14 14:14:31
 * @Description: 请输入...
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
 * 例如，给定三角形：
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * 
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 */

import java.util.ArrayList;
import java.util.List;

public class TriangleMinPath {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null ||triangle.size() == 0){
            return 0;
        }
        //使用二维数组求解----+1可以不用初始化最后一层
        // int[][] res = new int[triangle.size() + 1][triangle.size()+1];

        // for(int i = triangle.size() - 1; i >= 0; i--){
        //     List<Integer> tmp = triangle.get(i);
        //     for(int j = 0; j < tmp.size(); j++){
        //         res[i][j] = Math.min(res[i+1][j], res[i+1][j+1]) + tmp.get(j);
        //     }
        // }

        //空间优化---使用一位数组
        int[] res = new int[triangle.size() +1];
        for(int i = triangle.size() - 1; i >= 0; i--){
            List<Integer> tmp = triangle.get(i);
            for(int j = 0; j < tmp.size(); j++){
                //这里指的是每一层的最小值
                res[j] = Math.min(res[j], res[j + 1]) + tmp.get(j);
            }
        }
        return res[0];
    }
}