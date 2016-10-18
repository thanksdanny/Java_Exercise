/**
 * Created by thanksdanny on 18/10/2016.
 */
public class Test {
    public static void main(String[] args) {
        boolean b = false;
        for (int i = 3; i < 100; i+= 2) {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                } else {
                    b = true;
                }
            }
            if (b == true) {
                System.out.println(i + " ");
            }
        }
    }
}
