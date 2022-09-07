import java.util.Scanner;

/**
 * AnyBaseAddition
 */
public class AnyBaseAddition {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int n2 = S.nextInt();
        int base = S.nextInt();
        int result = Anybaseaddition(n, n2, base);
        System.out.println(result);
    }

    public static int Anybaseaddition(int x, int y, int b) {
        int carry = 0;
        int ans = 0;
        int p = 1;
        while (x > 0 || y > 0 || carry > 0) {
            int d = x % 10;
            int d2 = y % 10;
            int sum = d + d2 + carry;
            if (sum >= b) {
                int k = sum % b;
                ans = ans + k * p;
                p = p * 10;
                carry = 1;
                x = x / 10;
                y = y / 10;
            } else {
                int k = sum;
                ans = ans + k * p;
                p = p * 10;
                carry = 0;
                x = x / 10;
                y = y / 10;
            }
        }
        return ans;
    }
}