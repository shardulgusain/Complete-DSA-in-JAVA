import java.util.Scanner;

/**
 * AnybasetoAny
 */
public class AnybasetoAny {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int num = S.nextInt();
        int b1 = S.nextInt();
        int b2 = S.nextInt();
        int ans1 = AnybasetoDecimal(num, b1);
        System.out.println(ans1);
        int result = DecimaltoAnyBase(ans1, b2);
        System.out.println(result);
    }

    public static int AnybasetoDecimal(int x, int y) {
        int count = 0;
        int newnum = 0;
        while (x != 0) {
            int digit = x % 10;
            newnum = newnum + digit * (int) Math.pow(y, count);
            count++;
            x = x / 10;
        }

        return newnum;
    }

    public static int DecimaltoAnyBase(int x, int y) {
        int count = 0;
        int newnum = 0;
        while (x != 0) {
            int digit = x % y;
            newnum = newnum + digit * (int) Math.pow(10, count);
            count++;
            x = x / y;
        }

        return newnum;
    }
}