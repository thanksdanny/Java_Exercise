import java.util.Scanner;

/**
 * Created by thanksdanny on 18/10/2016.
 *
 * 题目：对10个数进行排序    
 *
 */
public class Test {
    public static void main(String[] args){
        System.out.println("请输入10个数字");
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0;i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]);
        }
    }
}
