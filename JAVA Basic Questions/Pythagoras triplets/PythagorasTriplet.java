import java.util.Scanner;

/**
 * PythagorasTriplet
 */
public class PythagorasTriplet {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n1 = S.nextInt();
        int n2 = S.nextInt();
        int n3 = S.nextInt();

        int max = n1;
        if (n2 > n1 && n2 > n3) {
            max = n2;
        }
        if (n3 > n1) {
            max = n3;
        }
        if (max == n1) {
            boolean ans = (n2 * n2) + (n3 * n3) == (n1 * n1);
            System.out.println(ans);
        } else if (max == n2) {
            boolean ans = (n1 * n1) + (n3 * n3) == (n2 * n2);
            System.out.println(ans);
        } else {
            boolean ans = (n2 * n2) + (n1 * n1) == (n3 * n3);
            System.out.println(ans);
        }
    }
}