package com.thanksdanny.exercise14;

import java.util.Scanner;

/**
 * Created by thanksdanny on 10/15/16.
 *
 * 题目：输入某年某月某日，判断这一天是这一年的第几天？ 
 *
 */
public class Test {
    public static void main(String[] args) {
        int year, month, day;
        int days = 0;
        int d = 0;
        int e;

        Input fymd = new Input();

        do {
            e = 0;
            System.out.print("输入年：");
            year = fymd.input();

            System.out.print("输入月：");
            month = fymd.input();

            System.out.print("输入日：");
            day = fymd.input();

            if (year < 0 || month < 0 || month > 12 || day < 0 || day > 31) {
                System.out.println("输入错误");
                e = 1;
            }
        }

        while (e == 1);
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;

                break;

                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;

                case 2:
                    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
            }
            d += days;
        }
        System.out.println(year + "-" + month + "-" + day + "是这年的第" + (d + day) + "天。");
    }
}

class Input {
    public int input() {
        int value = 0;
        Scanner sc = new Scanner(System.in);
        value = sc.nextInt();

        return value;
    }
}