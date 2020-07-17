package com.yanl.week197;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 给你一个由 n 个节点（下标从 0 开始）组成的无向加权图，
 * 该图由一个描述边的列表组成，其中 edges[i]= [a, b] 
 * 表示连接节点 a 和 b 的一条无向边，且该边遍历成功的概率为 succProb[i] 。
 * 指定两个节点分别作为起点 start 和终点 end ，
 * 请你找出从起点到终点成功概率最大的路径，并返回其成功概率。
 * 如果不存在从 start 到 end 的路径，请 返回 0 。
 * 只要答案与标准答案的误差不超过 1e-5 ，就会被视作正确答案。
 * 
 * 输入：n = 3, edges = [[0,1],[1,2],[0,2]], succProb = [0.5,0.5,0.2], 
 * start = 0, end = 2
 * 
 * 输出 0.25000
 * 解释：从起点到终点有两条路径，其中一条的成功概率为 0.2 ，而另一条为 0.5 * 0.5 = 0.25
 */
public class MaxProbabilityPath {
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = new int[][]{{0, 1}, {1, 2}, {0, 2}};
        double[] succProb = new double[]{0.5, 0.5, 0.2};
        int start = 0, end = 2;
        maxProbability(n, edges, succProb, start, end);
    }
    public static double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        if(n == 0){
            return 0;
        }
        double[] probs = new double[n];
        //起点为1
        probs[start] = 1;
        while(true){
            boolean flag = false;
            for(int i = 0; i < edges.length; i++){
                if(probs[edges[i][0]] * succProb[i] > probs[edges[i][1]]){
                    probs[edges[i][1]] = probs[edges[i][0]] * succProb[i];
                    flag = true;
                }
                //无向图 再反向遍历一遍
                if(probs[edges[i][1]] * succProb[i] > probs[edges[i][0]]){
                    probs[edges[i][0]] = probs[edges[i][1]] * succProb[i];
                    flag = true;
                }
            }

            if(!flag){
                break;
            }  
        } 
        return probs[end];
    }
}