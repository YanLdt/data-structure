package com.yanl.dp;

/**LeetCode 55-跳跃游戏
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 判断你是否能够到达最后一个位置。
 * 
 * 输入: [2,3,1,1,4]
 * 输出: true
 * 解释: 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。
 * 
 * 输入: [3,2,1,0,4]
 * 输出: false
 * 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
 * 
 * 思路：看最后一跳是否可以到达终点
 * dp[i] 表示能否从 0 跳到 i 
 * dp[i]等于i之前的所有点都能到达i
 * 初始化 dp[0] = true
 * 返回 dp[n-1]
 * 
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        if(nums.length == 0){
            return true;
        }
        int n = nums.length;
        boolean[] dp = new boolean[n];
        //初始化
        dp[0] = true;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(dp[j] == true && nums[j] + j >= i){
                    dp[i] = true;
                }
            }
        }
        return dp[n-1];
    }

    /**
     * 从后向前遍历，如果能到达当前点则更新当前点，直到遍历到最左边
     * @param nums
     * @return
     */
    public boolean canJumpV2(int[] nums){
        if(nums == null){
            return false;
        }
        int end = nums.length - 1;
        for(int i = end; i >= 0; i--){
            if(nums[i] + i >= end){
                end = i;
            }
        }
        return end == 0;
    }
}