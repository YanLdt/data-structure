package com.yanl.day02;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-03 15:26:31
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-03 15:44:20
 * @Description: 请输入...
 * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 * 使用递归分别求左子树和右子树的深度/
 * 使用层次遍历，设置一个标志位，每遍历一层+1
 */ 

public class DepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth + 1;
    }
    
}