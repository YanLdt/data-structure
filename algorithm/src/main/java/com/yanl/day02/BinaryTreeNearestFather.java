/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-06 17:55:15
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-13 09:50:39
 * @Description: 请输入...
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * 最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，
 * 最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。
 * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * 输出: 3
 * 解释: 节点 5 和节点 1 的最近公共祖先是节点 3。
 * 
 * -------如何查找二叉树的祖先--------
 * 当 left 和 right 同时为空 ：说明 root 的左 / 右子树中都不包含 p,qp,q ，返回 null ；
 * 当 left 和 right 同时不为空 ：说明 p, qp,q 分列在 root 的 异侧 （分别在 左 / 右子树），因此 root 为最近公共祖先，返回 root ；
 * 当 left 为空 ，right 不为空 ：p,qp,q 都不在 root 的左子树中，直接返回 right 。具体可分为两种情况：
 * p,qp,q 其中一个在 root 的 右子树 中，此时 right 指向 pp（假设为 pp ）；
 * p,qp,q 两节点都在 root 的 右子树 中，此时的 right 指向 最近公共祖先节点 ；
 * 当 left 不为空 ， right 为空 ：与情况 3. 同理；
 */ 
package com.yanl.day02;

public class BinaryTreeNearestFather {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        //左右子节点都为空
        if(left == null && right == null){
            return null;
        }
        //左子节点为空
        if(left == null){
            return right;
        }
        //右子节点为空
        if(right == null){
            return left;
        }
        //均不为空
        return root;
    }
}