/**
 * Created by thanksdanny on 10/14/16.
 *
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子总数为多少？   
 *
 * 1    1
 * 2    1
 * 3    2
 * 4    2
 * 5    2
 * 6    4
 */
public class Test {

    public static void main(String[] args){
        System.out.println("第1个月的兔子对数: 1");
        System.out.println("第2个月的兔子对数: 1");
        int f1 = 1, f2 = 1, tmp, M=24;
        for (int i = 3; i < M; i++){
            tmp = f2;
            f2 = f1 + f2;
            f1 = tmp;
            System.out.println("第" + i + "个月的兔子对数：" + f2);
        }

    }
}
