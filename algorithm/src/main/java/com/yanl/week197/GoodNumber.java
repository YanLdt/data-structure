/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-14 16:10:32
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-14 16:18:57
 * @Description: 请输入...
 * 给你一个整数数组 nums 。
 * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 
 * 返回好数对的数目。
 */ 
package com.yanl.week197;

public class GoodNumber {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}