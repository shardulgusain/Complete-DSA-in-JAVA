import java.util.Scanner;

public class PrimetillN {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int low = S.nextInt();
        int high = S.nextInt();
        for (int i = low; i < high; i++) {
            int count = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
