package com.thanksdanny.exercise18;

/**
 * Created by thanksdanny on 18/10/2016.
 *
 * 题目：两个乒乓球队进行比赛，各出三人。
 * 甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。
 * 有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比
 * 请编程序找出三队赛手的名单。  
 *
 */
public class Test {
    static char[] m = {'a', 'b', 'c'};
    static char[] n = {'x', 'y', 'z'};

    public static void main(String[] args) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i] == 'a' && n[j] == 'x') {
                    continue;
                } else if (m[i] == 'c' && m[j] == 'x') {
                    continue;
                } else if (m[i] == 'c' && m[j] == 'z') {
                    continue;
                } else {
                    System.out.println(m[i] + " vs " + n[j]);
                }
            }
        }
    }
}
