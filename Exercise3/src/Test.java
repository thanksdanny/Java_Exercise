/**
 * Created by thanksdanny on 10/15/16.
 *
 * 题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。 
 *
 */
public class Test {
    public static void main(String[] args) {

        int thousand, ten, unit;
        int count = 0;

        for (int target = 1; target <= 1000; target++) {
            thousand = target / 100 % 10;
            ten = target / 10 % 10;
            unit = target % 10;

            if ((thousand * thousand * thousand + ten * ten * ten + unit * unit * unit) == target) {
                System.out.println(target);
                count++;
            }
        }
        System.out.println("1000以内的水仙花数字为：" + count);
    }
}
