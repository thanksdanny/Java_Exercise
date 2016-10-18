/**
 * Created by thanksdanny on 10/15/16.
 *
 * 题目：一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。例如6=1＋2＋3.编程     找出1000以内的所有完数。  
 *
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
//            System.out.println("Test------" + i / 2);
            int t = 0;
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    t = t + j;
                }
            }
            if (t == i) {
                System.out.println(i + " ");
            }
        }
    }
}