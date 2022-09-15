import java.util.Scanner;

/**
 * PrintDecreasing
 */
public class PrintDecreasing {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        PrintDecreasing(n);

    }

    public static void PrintDecreasing(int x) {
        if (x == 0) {
            return;
        }
        System.out.println(x);
        PrintDecreasing(x - 1);

    }
}