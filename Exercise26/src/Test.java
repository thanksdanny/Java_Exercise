import java.util.Scanner;

/**
 * Created by thanksdanny on 18/10/2016.
 *
 * 题目：请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续   判断第二个字母。
 *
 * monday tuesday wendestday Thursday Friday sat  sun
 */
public class Test {
    public static void main(String[] args) {
        System.out.print("输入：");
        GetChar tw = new GetChar();
        char ch = tw.getChar();

        switch (ch) {
            case 'M':
                System.out.println("Monday");
                break;
            case 'W':
                System.out.println("Wednesday");
                break;
            case 'F':
                System.out.println("Friday");
                break;
            case 'T' : {
                System.out.print("请输入第二个字母：");
                char ch2 = tw.getChar();
                if (ch2 == 'U') {
                    System.out.println("Tuesday");
                } else if (ch2 == 'H') {
                    System.out.println("Thursday");
                } else {
                    System.out.println("error");
                }
            }
                break;
            default:
                System.out.println("error");
        }
    }
}

class GetChar {
    public char getChar() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = str.charAt(0);
        if (ch < 'A' || ch > 'Z') {
            System.out.println("输入错误");
            ch = getChar();
        }
        return ch;
    }
}
