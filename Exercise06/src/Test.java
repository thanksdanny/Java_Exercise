import java.util.Scanner;

/**
 * Created by thanksdanny on 10/15/16.
 *
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。    
 *
 * 在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数，取得的余数作为下一轮循环的较小的数
 * 如此循环直到较小的数的值为0，返回较大的数，此数即为最大公约数，最小公倍数为两数之积除以最大公约数。
 *
 *
 */
public class Test {

    public static void main(String[] args) {
        int a, b, m;
        Scanner s = new Scanner(System.in);
        System.out.print("键入一个整数： ");
        a = s.nextInt();
        System.out.print("再输入一个整数：");
        b = s.nextInt();

        Deff cd = new Deff();
        m = cd.deff(a, b);
        int n = a * b / m;

        System.out.println("最大公约数：" + m);
        System.out.println("最小公倍数：" + n);
    }
}

class Deff {
    public int deff(int x, int y) {
        int tmp;
        if (x < y) {
            tmp = x;
            x = y;
            y = tmp;
        }
        while (y != 0) {
            if (x == y) return x;
            else {
                int k = x % y;
                x = y;
                y = k;
            }
        }
        return x;
    }
}