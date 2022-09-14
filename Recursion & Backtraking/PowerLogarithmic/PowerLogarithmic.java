import java.util.Scanner;

/**
 * PowerLinear
 */
public class PowerLogarithmic {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int num = S.nextInt();
        int power = S.nextInt();
        System.out.println(powerLog(num, power));
    }

    public static int powerLog(int x, int p) {
        if (p == 0) {
            return 1;
        }
        int power = powerLog(x, p / 2);
        if (p % 2 == 0) {
            int result = power * power;
            return result;
        } else {
            int result = power * power * x;
            return result;
        }
    }
}