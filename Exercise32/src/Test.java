/**
 * Created by thanksdanny on 18/10/2016.
 *
 * 题目：取一个整数a从右端开始的4～7位。
 *
 */
public class Test {
    public static void main(String[] args){
        long a = 1234567890;
        String ss = Long.toString(a);
        char[] ch = ss.toCharArray();
        int j = ch.length;
        System.out.println(" haha :" + ch[j - 7] + ch[j - 6] + ch[j - 5]+ ch[j - 4]);
    }
}
