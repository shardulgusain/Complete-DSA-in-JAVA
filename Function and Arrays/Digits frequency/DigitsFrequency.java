import java.util.Scanner;

/**
 * DigitsFrequency
 */
public class DigitsFrequency {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int find = S.nextInt();
        int ans = count(n, find);
        System.out.println(ans);
    }

    public static int count(int x, int y) {
        int c = 0;
        while (x > 0) {
            int k = x % 10;
            if (k == y) {
                c++;
            }
            x = x / 10;
        }
        return c;
    }
}