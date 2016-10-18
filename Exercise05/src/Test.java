import java.util.Scanner;

/**
 * Created by thanksdanny on 10/15/16.
 *
 * 题目：利用条件运算符的嵌套来完成此题：
 *
 * 学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 */
public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入学生成绩：");

        int score = s.nextInt();
//
//        if (score >= 90) {
//            System.out.println("A");
//        } else if (score < 90 && score >= 60) {
//            System.out.println("B");
//        } else if (score < 60) {
//            System.out.println("C");
//        }
        char grade;
        grade = score >= 90 ? 'A' : score >= 60 ? 'B' : 'C';

        System.out.println("等级为： " + grade);
    }
}
