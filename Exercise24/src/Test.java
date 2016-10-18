import java.util.Scanner;

/**
 * Created by thanksdanny on 18/10/2016.
 *
 * 题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。 
 *
 */
public class Test {
    public static void main(String[] args) {
        System.out.print("输入一个五位数：");
        Scanner sc = new Scanner(System.in);
        Long target = sc.nextLong();

        if (target > 1000000 || target < 0) {
            System.out.println("输入不合规范");
        }
        String ss = Long.toString(target);
        char[] ch = ss.toCharArray();

        int j = ch.length;
        System.out.println(target + "的位数为" + j);

        for (int i = j - 1; i >= 0; i--){
            System.out.println(ch[i]);
        }

    }
}
