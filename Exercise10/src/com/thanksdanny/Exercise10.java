package com.thanksdanny;

/**
 * Created by thanksdanny on 10/15/16.
 *
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下
 * 求它在第10次落地时，共经过多少米？第10次反弹多高？
 *
 */
public class Exercise10 {
    public static void main(String[] args) {
        int hight = 1000;
        int way = 0;
        for (int times = 1; times <= 10; times++) {
            way = way + hight + hight / 2;
            hight = hight / 2;
            System.out.println("第"+ times +"次落地共经过" + way + "米");
            System.out.println("第"+ times +"次反弹高度为" + hight + "米");
        }

    }
}
