import java.util.Scanner;

/**
 * PrintIncreasig
 */
public class PrintIncreasig {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        printIncreasig(n);
    }

    public static void printIncreasig(int x) {
        if (x == 0) {
            return;
        }
        printIncreasig(x - 1);
        System.out.println(x);

    }
}