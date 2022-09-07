import java.util.Scanner;

/**
 * AnyBaseSubtraction
 */
public class AnyBaseSubtraction {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n1 = S.nextInt();
        int n2 = S.nextInt();
        int base = S.nextInt();
        int result = Anybasesubtration(n1, n2, base);
        System.out.println(result);
    }

    public static int Anybasesubtration(int x, int y, int b) {

        int ans = 0;
        int p = 1;
        int borrow = 0;
        while (y > 0) {
            int d = x % 10;
            int d1 = y % 10;
            d1 = d1 - borrow;
            if (d1 >= d) {
                int subtraction = d1 - d;
                ans = ans + subtraction * p;
                borrow = 0;
                y = y / 10;
                x = x / 10;
                p = p * 10;
            } else {
                int subtraction = (d1 + b) - d;
                ans = ans + subtraction * p;
                borrow = 1;
                y = y / 10;
                x = x / 10;
                p = p * 10;
            }

        }
        return ans;
    }
}