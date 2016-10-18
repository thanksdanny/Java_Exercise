package com.thanksdanny.exercise15;

import java.util.Scanner;

/**
 * Created by thanksdanny on 10/15/16.
 *
 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。   
 *
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入x：");
        int x = sc.nextInt();

        System.out.println("请输入y：");
        int y = sc.nextInt();

        System.out.println("请输入z：");
        int z = sc.nextInt();

        if (x > y) {
            int tmp = x;
            x = y;
            y = tmp;
        }
        if (x > z) {
            int tmp = x;
            x = z;
            z = tmp;
        }
        if (y > z) {
            int tmp = y;
            y = z;
            z = tmp;
        }
        System.out.println("三个数由小到大排列为：" + x + " " + y + " " + z);
    }
}
