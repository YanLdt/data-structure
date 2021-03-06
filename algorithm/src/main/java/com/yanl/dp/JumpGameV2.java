package com.yanl.dp;

/**
 * leetcode 45 跳跃游戏2  贪心算法
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 * 输入: [2,3,1,1,4]
 * 输出: 2
 * 解释: 跳到最后一个位置的最小跳跃数是 2。
 *      从下标为 0 跳到下标为 1 的位置，跳 1 步，然后跳 3 步到达数组的最后一个位置。
 * 
 * 假设你总是可以到达数组的最后一个位置。
 * 
 * 
 */
public class JumpGameV2 {
    public int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int reach = 0; //以当前跳跃步数所能到达的最远位置
        int nextReach = nums[0]; //当前位置所能到达的最远位置
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            nextReach = Math.max(i + nums[i], nextReach);
            if(nextReach >= nums.length - 1){
                return res + 1;
            }
            //到达了当前跳跃步数的边界，不得不跳
            if(i == reach){
                res++;
                //更新最远位置
                reach = nextReach;
            }
        }
        return res;
    }
}