package com.yanl.day02;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-06-23 23:05:38
 * @Description: 7,-7,8,#,#,-3,6,#,9,#,#,#,-5,#,#
 * 使用#作为占位符，来构建二叉树
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-03 09:49:33
 * 
 */

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author: YanL
 * @Time: 23:05 2020/6/23
 * @Email: imyanl.dt@gmail.com
 * @Description:   7,-7,8,#,#,-3,6,#,9,#,#,#,-5,#,#
 */

public class BinaryTreeDFS {
    private static int count = 0;

    /**
     * 输入先序遍历字符串构建二叉树
     * 
     * @param str 读取的字符串
     * @return TreeNode 返回二叉树
     */
    public static TreeNodeString createNode(String[] str) {
        TreeNodeString root = null;
        if (count >= str.length || str[count++].equals("#")) {
            root = null;
        } else {
            root = new TreeNodeString(str[count - 1]);
            root.left = createNode(str);
            root.right = createNode(str);
        }
        return root;
    }

    /**
     * 先序遍历二叉树-----递归 中->左->右
     * 
     * @param root
     */
    public static void preOrderTraversalRecursive(TreeNodeString root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderTraversalRecursive(root.left);
        preOrderTraversalRecursive(root.right);
    }

    // while( 栈非空 || p 非空)
    // {
    // if( p 非空)
    // {

    // }
    // else
    // {

    // }
    // }

    /**
     * 先序遍历二叉树-----非递归 非递归应该要借助栈，当前节点没有左子节点时弹出
     * 
     * 
     * @param root
     */
    public static void preOrderTraversalNotRecursive(TreeNodeString root) {
        // 借助一个栈来实现遍历
        Stack<TreeNodeString> treeNodeStack = new Stack<>();
        // if(root == null){
        // return;
        // }
        // //如果当前节点不为空，直接入栈
        // treeNodeStack.push(root);
        // while(!treeNodeStack.isEmpty()){
        // //如果当前栈不为空，则弹出栈顶元素
        // TreeNode cur = treeNodeStack.pop();
        // if(cur != null){
        // //此时访问该节点并把节点右子节点和左子节点入栈----注意：先序遍历先访问左节点后访问右节点，所以最后将左节点入栈====先入后出
        // System.out.print(cur.val + " ");
        // treeNodeStack.push(cur.right);
        // treeNodeStack.push(cur.left);
        // }
        // }
        if (root != null) {
            treeNodeStack.push(root);
        }
        while (!treeNodeStack.isEmpty()) {
            TreeNodeString cur = treeNodeStack.pop();
            if (cur != null) {
                // 先压入右节点最后处理
                if (cur.right != null) {
                    treeNodeStack.push(cur.right);
                }
                // 后压入左节点
                if (cur.left != null) {
                    treeNodeStack.push(cur.left);
                }
                // 压入当前节点
                treeNodeStack.push(cur);
                // 标识当前空节点之前的已访问但还未打印
                treeNodeStack.push(null);
            } else {
                System.out.print(treeNodeStack.pop().val + " ");
            }
        }
    }

    /**
     * 递归中序遍历二叉树 左->中->右
     * 
     * @param root
     */
    public static void inOrderTraversalRecursive(TreeNodeString root) {
        if (root == null) {
            return;
        }
        inOrderTraversalRecursive(root.left);
        System.out.print(root.val + " ");
        inOrderTraversalRecursive(root.right);
    }

    /**
     * 非递归中序遍历
     * 
     * @param root
     */
    public static void inOrderTraversalNotRecursive(TreeNodeString root) {
        Stack<TreeNodeString> treeNodeStack = new Stack<>();
        // TreeNode cur = root;
        // while(cur != null || !treeNodeStack.isEmpty()){
        // //将最左边的子节点全部入栈
        // while(cur != null){
        // treeNodeStack.push(cur);
        // cur = cur.left;
        // }
        // //弹出最左子节点
        // cur = treeNodeStack.pop();
        // System.out.print(cur.val + " ");
        // //访问左子树的右子节点----->直到访问根节点之后开始遍历右子树
        // cur = cur.right;
        // }
        if (root != null) {
            treeNodeStack.push(root);
        }
        while (!treeNodeStack.isEmpty()) {
            TreeNodeString cur = treeNodeStack.pop();
            if (cur != null) {
                // 先压入右节点
                if (cur.right != null) {
                    treeNodeStack.push(cur.right);
                }
                // 再压入当前节点
                treeNodeStack.push(cur);
                // 标识已访问过但还未处理，再次访问就打印
                treeNodeStack.push(null);
                // 最后压入左节点
                if (cur.left != null) {
                    treeNodeStack.push(cur.left);
                }
            } else {
                System.out.print(treeNodeStack.pop().val + " ");
            }
        }
    }

    /**
     * 递归后序遍历二叉树 左->右->中
     * 
     * @param root
     */
    public static void postOrderTraversalRecursive(TreeNodeString root) {
        if (root == null) {
            return;
        }
        postOrderTraversalRecursive(root.left);
        postOrderTraversalRecursive(root.right);
        System.out.print(root.val + " ");

    }

    /**
     * 非递归后序遍历二叉树
     * 
     * @param root
     */
    public static void postOrderTraversalNotRecursive(TreeNodeString root) {
        Stack<TreeNodeString> treeNodeStack = new Stack<>();
        if (root != null) {
            treeNodeStack.push(root);
        }
        while (!treeNodeStack.isEmpty()) {
            TreeNodeString cur = treeNodeStack.pop();
            if (cur != null) {
                // 先压入根节点，最后处理
                treeNodeStack.push(cur);
                treeNodeStack.push(null); // 使用null标识之前节点已经访问过，但还没有打印
                if (cur.right != null) {
                    treeNodeStack.push(cur.right);
                }
                if (cur.left != null) {
                    treeNodeStack.push(cur.left);
                }
            } else {
                System.out.print(treeNodeStack.pop().val + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] str = sc.nextLine().split(",");
            TreeNodeString root = createNode(str);
            System.out.println("递归先序遍历");
            preOrderTraversalRecursive(root);
            System.out.println(" ");
            System.out.println("非递归先序遍历");
            preOrderTraversalNotRecursive(root);
            System.out.println(" ");
            System.out.println("递归中序遍历");
            inOrderTraversalRecursive(root);
            System.out.println(" ");
            System.out.println("非递归中序遍历");
            inOrderTraversalNotRecursive(root);
            System.out.println(" ");
            System.out.println("递归后序遍历");
            postOrderTraversalRecursive(root);
            System.out.println(" ");
            System.out.println("非递归后序遍历");
            postOrderTraversalNotRecursive(root);
        }
        sc.close();
    }
}
