package com.yanl.day02;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-03 11:19:14
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-13 10:11:44
 * @Description: 请输入...
 */ 
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-03 11:19:14
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-03 11:40:49
 * @Description: BST:平衡搜索二叉树，左子节点小于根节点小于右子节点，中序遍历为递增序列
 * 
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。

    本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。=====分治法
    =======以中间元素作为根节点，元素左边的升序序列构建左子树，右边的升序序列构建右子树即可得到结果==========
 */

public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {

        return dfs(nums, 0, nums.length - 1);
    }

    /**
     * 递归构建左右子树
     * @param nums 有序序列
     * @param start 左边界
     * @param end 右边界
     * @return 
     */
    private static TreeNode dfs(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = dfs(nums, start, mid - 1);
        root.right = dfs(nums, mid + 1, end);

        return root;
    }
}