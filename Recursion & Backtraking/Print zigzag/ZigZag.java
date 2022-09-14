import java.util.Scanner;

/**
 * ZigZag
 */
public class ZigZag {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        pzz(n);
    }

    public static void pzz(int x) {
        if (x == 0) {
            return;
        }
        System.out.print(x);
        pzz(x - 1);
        System.out.print(x);
        pzz(x - 1);
        System.out.print(x);
    }
}