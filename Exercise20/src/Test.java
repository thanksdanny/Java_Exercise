/**
 * Created by thanksdanny on 18/10/2016.
 *
 * 题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。 
 *
 */
public class Test {
    public static void main(String[] args) {
        int up = 2, down = 1;
        int result = up / down;
        for (int i = 0; i < 20; i ++) {
            int tmp;
            tmp = up;
            up = up + down;
            down = tmp;

            result = result + (up / down);
        }
        System.out.println(result);
    }

//    public static void main(String[] args) {
//        int x = 2, y = 1, t;
//        double sum = 0;
//        for (int i = 1; i <= 20; i++) {
//            sum = sum + (double) x / y;
//            t = y;
//            y = x;
//            x = y + t;
//        }
//        System.out.println(sum);
//    }
}
