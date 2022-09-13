import java.util.Scanner;

/**
 * PowerLinear
 */
public class PowerLinear {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int num = S.nextInt();
        int p = S.nextInt();
        System.out.println(powerLinear(num, p));
    }

    public static int powerLinear(int x, int y) {
        if (y == 0) {
            return 1;
        }
        int result = x * powerLinear(x, y - 1);
        return result;
    }
}