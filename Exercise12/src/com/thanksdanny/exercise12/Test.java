package com.thanksdanny.exercise12;

import java.util.Scanner;

/**
 * Created by thanksdanny on 10/15/16.
 *
 * 题目：企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可提成7.5%；
 * 20万到40万之间时，高于20万元的部分，可提成5%；
 * 40万到60万之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%
 * 高于100万元时，超过100万元的部分按1%提成
 * 从键盘输入当月利润
 *
 * 求应发放奖金总数？ 
 *
 */
public class Test {
    public static void main(String[] args) {
        System.out.print("请输入今年的利润：");
        Scanner sc = new Scanner(System.in);

        double I = sc.nextInt();
        double money = 0;

        if (I <= 100000) {
            money = I * 0.1;
        } else if (I > 100000 && I <200000) {
            money = (I - 100000) * 0.075 + 100000 * 0.1;
        } else if (I >= 200000 && I <400000) {
            money = (I - 200000) * 0.05 + 200000 * 0.1;
        }



        System.out.println("应发奖金为：" + money);
    }
}
