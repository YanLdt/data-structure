
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-02 17:35:52
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-03 10:49:58
 * @Description:  3,9,#,#,20,15,7
 */
package com.yanl.day02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeBFS {

    private static int count = 0;

    public static TreeNodeString createTree(String[] str){
        TreeNodeString root = null;
        if(count >= str.length || str[count++].equals("#")){
            root = null;
        }else{
            root = new TreeNodeString(str[count - 1]);
            root.left = createTree(str);
            root.right = createTree(str);
        }
        return root;
    }

    /**
     * 二叉树的层序遍历----使用队列记录每一层的节点个数
     * @param root
     * @return
     */
    public static List<List<String>> bfs(TreeNodeString root){
        if(root == null){
            return new ArrayList<>();
        }
        List<List<String>> res = new ArrayList<>();
        Queue<TreeNodeString> queue = new LinkedList<TreeNodeString>();
        queue.add(root);
        while(!queue.isEmpty()){
            //记录上一层有多少元素，遍历当前层，再添加下一层
            int levelLength = queue.size();
            List<String> tmp = new ArrayList<>();
            while(levelLength > 0){
                TreeNodeString cur = queue.poll();
                tmp.add(cur.val);
                if(cur.left != null){
                    queue.add(cur.left);
                }
                if(cur.right != null){
                    queue.add(cur.right);
                }
                levelLength--;
            }
            res.add(tmp);
        }
        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String[] str = sc.nextLine().split(",");
            TreeNodeString root = createTree(str);
            System.out.println(bfs(root));
        }
        sc.close();
    }

}
