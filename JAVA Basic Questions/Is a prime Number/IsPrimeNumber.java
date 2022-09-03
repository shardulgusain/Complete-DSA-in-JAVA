import java.util.Scanner;
public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int t = S.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = S.nextInt();
            int count = 0;

            for (int j = 2; j * j <= n; j++) {
                if (n % j == 0) {
                    System.out.println("number is not prime");
                    count++;
                    break;
                }
            }
            if (count != 1) {
                System.out.println("prime");
            }
        }
    }
}
