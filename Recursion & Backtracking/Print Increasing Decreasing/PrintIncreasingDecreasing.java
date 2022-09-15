import java.util.Scanner;

/**
 * PrintIncreasingDecreasing
 */
public class PrintIncreasingDecreasing {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int num = S.nextInt();
        printIncreasingDecreasing(num);
    }

    public static void printIncreasingDecreasing(int x) {
        if (x == 0) {
            return;
        }
        System.out.println(x);
        printIncreasingDecreasing(x - 1);
        System.out.println(x);
    }
}