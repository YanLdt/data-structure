package com.yanl.day01;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-06-22 23:48:28
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-13 11:22:55
 * @Description: 请输入...
 */ 

import java.util.ArrayList;
import java.util.List;

/**
 * @author YanL
 * @date 23:48 2020/6/22
 * @Email: imyanl.dt@gmail.com
 * @Description: 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 */


/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 * <p>
 * 子集问题使用递归、回溯还有二进制进行计算
 *
 * <p>
 * 输入: nums = [1,2,3]
 * <p>
 * 输出:
 * [
 * [3],
 * [1],
 * [2],
 * [1,2,3],
 * [1,3],
 * [2,3],
 * [1,2],
 * []
 * ]
 * @author yanl
 */
public class Subsets {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        System.out.println(backTrackSubsets(nums));
        System.out.println(recursiveSubsets(nums));

    }

    static List<List<Integer>> backTrackRes = new ArrayList<>();


    /**
     * 递归方法
     * 假设输出子集为空，每一步都向子集添加新的元素，并生成新的子集
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> recursiveSubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //首先添加一个空集
        result.add(new ArrayList<>());
        for (int num : nums) {
            //临时子集
            List<List<Integer>> tempSet = new ArrayList<>();

            for (List<Integer> cur : result) {
                tempSet.add(new ArrayList<Integer>(cur) {
					private static final long serialVersionUID = -6884268101839698618L;
				{
                    add(num);
                }});
            }
            //更新输出子集
            for (List<Integer> curr : tempSet) {
                result.add(curr);
            }
        }
        return result;
    }

    /**
     * 回溯方法
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> backTrackSubsets(int[] nums) {
        if (nums == null || nums.length == 0) {
            return backTrackRes;
        }

        List<Integer> cur = new ArrayList<>();
        backTrack(0, cur, nums);
        return backTrackRes;

    }

    /**
     * 回溯方法
     * * * 典型回溯-----
     * * * result = []
     * * * func backtrack(选择列表,路径):
     * * *     if 满足结束条件:
     * * *         result.add(路径)
     * * *         return
     * * *     for 选择 in 选择列表:
     * * *         做选择
     * * *         backtrack(选择列表,路径)
     * * *         撤销选择
     *
     * @param pos  当前位置
     * @param cur  当前子集
     * @param nums 输入数组
     */
    public static void backTrack(int pos, List<Integer> cur, int[] nums) {

        //注意------cur只是一个引用，如果不使用new会导致结果集之前添加的子集都发生变化，导致所有子集都相同
        backTrackRes.add(new ArrayList<>(cur));

        for (int i = pos; i < nums.length; i++) {
            cur.add(nums[i]);
            backTrack(i + 1, cur, nums);
            cur.remove(cur.size() - 1);
        }
    }

}
