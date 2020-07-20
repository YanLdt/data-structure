package com.yanl.dp;

/**
 * leetcode 64最小路径和
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，
 * 使得路径上的数字总和为最小。
 * 
 * 说明：每次只能向下或者向右移动一步。
 * 输入:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 * grid[i][j]表示从[i,j]到[0,0]的距离最小
 * 
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        //这边复用原来的矩阵列表
        //初始化grid[i][0]和grid[0][j]
        for(int i = 1; i < grid.length; i++){
            grid[i][0] = grid[i-1][0] + grid[i][0];
        }
        for(int i = 1; i < grid[0].length; i++){
            grid[0][i] = grid[0][i-1] + grid[0][i];
        }

        for(int i = 1; i < grid.length; i++){
            for(int j = 1; j < grid[0].length; j++){
                grid[i][j] = Math.min(grid[i-1][j], grid[i][j-1]) + grid[i][j];
            }
        }

        return grid[grid.length-1][grid[0].length-1];


        // int[] dp = new int[grid[0].length];
        // for(int i = grid.length - 1; i >= 0; i--){
        //     for(int j = grid[0].length - 1; j >= 0; j--){
        //         if(i == grid.length - 1 && j != grid[0].length - 1){
        //             dp[j] = grid[i][j] + dp[j+1];
        //         }else if(j == grid[0].length - 1 && i != grid.length - 1){
        //             dp[j] = grid[i][j] + dp[j];
        //         }else if(j != grid[0].length - 1 && i != grid.length - 1){
        //             dp[j] = grid[i][j] + Math.min(dp[j], dp[j+1]);
        //         }else{
        //             dp[j] = grid[i][j];
        //         }
        //     }
        // }
        // return dp[0];
    }
}