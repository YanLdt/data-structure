package com.yanl.day02;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-03 11:45:59
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-03 11:46:00
 * @Description: 
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
    例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
    对称说明左子树的左子节点和右子树的右子节点相等======左子树的右子节点和右子树的左子节点相等
    递归进行比较左右子树是否相等
 */ 

public class SymmetricBinaryTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return dividedJudge(root.left, root.right);
    }

    /**
     * 递归比较左右子树
     * @param left 左子树
     * @param right 右子树
     * @return
     */
    private static boolean dividedJudge(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null || right == null){
            return false;
        }
        if(left.val != right.val){
            return false;
        }
        return dividedJudge(left.left, right.right) && dividedJudge(left.right, right.left);
    }
}
