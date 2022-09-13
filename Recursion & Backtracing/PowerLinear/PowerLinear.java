import java.util.Scanner;

/**
 * PowerLinear
 */
public class PowerLinear {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int num = S.nextInt();
        int power = S.nextInt();
        System.out.println(powerLinear(num, power));
    }

    public static int powerLinear(int x, int p) {
        if (p == 0) {
            return 1;
        }
        int powLinear = x * (powerLinear(x, p - 1));
        return powLinear;
    }
}