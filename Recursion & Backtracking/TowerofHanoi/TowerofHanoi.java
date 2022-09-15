import java.util.Scanner;

/**
 * TowerofHanoi
 */
public class TowerofHanoi {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int t = S.nextInt();
        int t1 = S.nextInt();
        int t2 = S.nextInt();
        toh(n, t, t1, t2);

    }

    public static void toh(int a, int x, int y, int z) {
        if (a == 0) {
            return;
        }
        toh(a - 1, x, z, y);
        System.out.println(a + "[" + x + " -> " + y + "]");
        toh(a - 1, z, y, x);
    }

}