import java.util.Scanner;

/**
 * Created by thanksdanny on 10/15/16.
 *
 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。  
 *
 */
public class Test {
    public static void main(String[] args) {

        // 定义字数、空格数、数字、与其他字符个数
        int character = 0;
        int digital = 0;
        int other = 0;
        int blank = 0;

        System.out.print("请输入一段字符：");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] ch = null;
        ch = s.toCharArray(); // 转换成字符数组

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= '0' && ch[i] <= '9') {
                digital ++;
            } else if ((ch[i] >= 'a' && ch[i] <= 'z') || (ch[i] >= 'a' && ch[i] <= 'c')) {
                character++;
            } else if (ch[i] == ' ') {
                blank++;
            } else {
                other++;
            }
        }

        System.out.println("数字个数    : " + digital);
        System.out.println("英文字数个数 : " + character);
        System.out.println("空格个数    :" + blank);
        System.out.println("其他字符个数 : " + other);
    }
}
