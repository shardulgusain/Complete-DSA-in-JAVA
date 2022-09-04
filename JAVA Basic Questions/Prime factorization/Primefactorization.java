import java.util.Scanner;

/**
 * Prime factorization
 */
public class Primefactorization {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        for (int i = 2; i * i <= n; i++) {
            int div = i;
            while (n % div == 0) {
                n = n / div;
                System.out.println(div);
            }
        }
        if (n != 1) {
            System.out.println(n);
        }
    }
}