package com.yanl.day02;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-03 14:02:27
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-03 16:01:10
 * @Description: 
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 * 递归计算每个节点的左右子树是否是平衡二叉树
 * 二叉树的题多考虑递归实现
 */ 

public class BalanceBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        //判断左右子树深度相差是否小于1
        if(Math.abs(depth(root.left) - depth(root.right)) <= 1){
            //小于1则递归判断左右子树是否为平衡二叉树
            return isBalanced(root.left) && isBalanced(root.right);
        }
        return false;
        
    }
    /**
     * 获取二叉树的深度
     * @param root
     * @return
     */
    public int depth(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(depth(root.left), depth(root.right)) + 1;
        
    }
    
}