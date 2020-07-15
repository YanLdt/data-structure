package com.yanl.week197;
/*
 * @Author: YanL
 * @Email: imyanl.dt@gmail.com
 * @Date: 2020-07-14 16:19:12
 * @LastModifiedBy: YanL
 * @LastEditTime: 2020-07-14 16:19:53
 * @Description: 请输入...
 * 
 * 给你一个二进制字符串 s（仅由 '0' 和 '1' 组成的字符串）。
 * 返回所有字符都为 1 的子字符串的数目。
 * 由于答案可能很大，请你将它对 10^9 + 7 取模后返回。
 */ 

public class StringWithOne {
    public int numSub(String s) {
        int oneCount = 0;
        long res = 0;
        int mod = (int)Math.pow(10, 9) + 7;
        for(char c : s.toCharArray()){
            if(c == '1'){
                oneCount++;
            }else if(oneCount > 0){
                res += (long)oneCount * (oneCount + 1) / 2;
                if(res > mod){
                    res = res % mod;
                }
                oneCount = 0;
            }
        }
        res += (long)oneCount * (oneCount + 1) / 2;
        res = res % mod;
        return (int)res;
    }
}
