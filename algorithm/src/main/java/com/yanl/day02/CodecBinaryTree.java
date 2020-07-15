package com.yanl.day02;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-03 16:08:43
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-03 17:56:00
 * @Description: 请输入...
 * 请实现两个函数，分别用来序列化和反序列化二叉树。
 * 使用层序遍历：利用队列
 * 前序遍历也可以，不过节点为空时要加入占位符
 */

import java.util.LinkedList;
import java.util.Queue;

public class CodecBinaryTree {

    StringBuilder res;
    int i = 0;
    public String serializePre(TreeNode root){
        res = new StringBuilder();
        serializeDFS(root);
        return res.toString();
    }

    /**
     * 递归先序遍历
     * @param root
     */
    public void serializeDFS(TreeNode root){
        if(root == null){
            res.append('#');
            return;
        }
        else{
            res.append(root.val + ',');
        }
        serializeDFS(root.left);
        serializeDFS(root.right);
    }



    public TreeNode deserializeOPre(String data){
        char[] dataArray = data.toCharArray();

        return deserializeDFS(dataArray);
    }

    public TreeNode deserializeDFS(char[] data){
        if(data[i] == '#'){
            i++;
            return null;
        }
        TreeNode cur = new TreeNode(data[i++] - ',');
        cur.left = deserializeDFS(data);
        cur.right = deserializeDFS(data);
        return cur;
    }





    /**
     * 层序遍历version
     * @param root
     * @return
     */
    // Encodes a tree to a single string.
    public String serializeLevel(TreeNode root) {
        if(root == null){
            return "[]";
        }
        StringBuilder res = new StringBuilder("[");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if(cur != null){
                res.append(cur.val + ",");
                queue.add(cur.left);
                queue.add(cur.right);
            }else{
                res.append("null,");
            }
            
        }
        res.deleteCharAt(res.length() - 1);
            res.append("]");
        return res.toString();
    }

    /**
     * 层序遍历version
     * @param data
     * @return
     */
    // Decodes your encoded data to tree.
    public TreeNode deserializeLevel(String data) {
        TreeNode root = null;
        if(data.equals("[]")){
            return null;
        }
        String[] nodes = data.substring(1, data.length() - 1).split(",");        
        Queue<TreeNode> queue = new LinkedList<>();
        root = new TreeNode(Integer.parseInt(nodes[0]));
        queue.add(root);
        int pointer = 1;
        while(!queue.isEmpty()){
            TreeNode cur = queue.poll();
            if(!nodes[pointer++].equals("null")){
                cur.left = new TreeNode(Integer.parseInt(nodes[pointer-1]));
                queue.add(cur.left);
            }
            // pointer++;
            if(!nodes[pointer++].equals("null")){
                cur.right = new TreeNode(Integer.parseInt(nodes[pointer-1]));
                queue.add(cur.right);
            }
        }
        return root;
    }
}
