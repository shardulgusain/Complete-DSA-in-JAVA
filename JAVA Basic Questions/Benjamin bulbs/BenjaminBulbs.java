import java.util.Scanner;

/**
 * BenjaminBulbs
 */
// All perfect squares has odd number of factors.
public class BenjaminBulbs {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int fluctuations = n;
        // Counting the even and odd number of factors
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}