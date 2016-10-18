import java.util.Scanner;

/**
 * Created by thanksdanny on 18/10/2016.
 *
 * 题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 *
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer t = sc.nextInt();

        String ss = t.toString();
        char[] ch = ss.toCharArray();

        if (ch[0] == ch[4] && ch[1] == ch[3]) {
            System.out.println(t + "是回文数");
        } else {
            System.out.println("no");
        }
    }
}
