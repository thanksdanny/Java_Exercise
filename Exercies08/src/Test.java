import java.util.Scanner;

/**
 * Created by thanksdanny on 10/15/16.
 *
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
 * 例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。    
 *
 */
public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("输入循环相加的次数：");
        int count = sc.nextInt();
        System.out.print("再输入循环的数字：");
        int num = sc.nextInt();

        int sum = 0;
        int b = 0;

        for (int i = 0; i < count; i++) {
            /*
                5个2
                sum = 2
                sum = sum + 2 * 10        22
                sum = sum + 2 * 10 ^ 2   222
                sum = sum + 2 * 10 ^ 3
             */
            b = b + num;
            sum = sum + b;
            num = num * 10;

            System.out.println(sum);
        }
    }

}
