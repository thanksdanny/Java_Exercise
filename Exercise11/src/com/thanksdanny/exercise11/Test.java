package com.thanksdanny.exercise11;

/**
 * Created by thanksdanny on 10/15/16.
 *
 * 题目：有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？  
 *
 */
public class Test {
    public static void main(String[] args){
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int x= 1; x <= 4; x++) {
                    if (i != j && i != x && j != x) {
                        count++;
                        System.out.println(i * 100 + j * 10 + x);
                    }
                }
            }
        }
        System.out.println("一共个数为：" + count);
    }
}
