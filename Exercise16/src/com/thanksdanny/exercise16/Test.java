package com.thanksdanny.exercise16;

/**
 * Created by thanksdanny on 18/10/2016.
 *
 * 题目：输出9*9口诀。
 *
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                int result = i * j;
//                System.out.println(result);
                System.out.print(i + " * " + j + " = " + i * j + " ");
            }
            System.out.println(" ");
        }
    }
}
