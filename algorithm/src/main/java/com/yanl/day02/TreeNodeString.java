/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-03 09:47:28
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-13 10:13:45
 * @Description: ???...
 */ 
package com.yanl.day02;

public class TreeNodeString {
    String val;
    TreeNodeString left;
    TreeNodeString right;

    TreeNodeString(String v) {
        val = v;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "val: " + val;
    }
}