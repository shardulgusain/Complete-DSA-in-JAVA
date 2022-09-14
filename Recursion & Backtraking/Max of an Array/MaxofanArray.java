
/**
 * MaxofanArray
 */
import java.util.*;

public class MaxofanArray {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[] arr = { 5, 7, 2, 1, 6 };
        System.out.println(maxOfArray(arr, 0));
    }

    public static int maxOfArray(int[] a, int x) {
        if (x == a.length - 1) {
            return a[x];
        }
        int max = a[x];
        int b = maxOfArray(a, x + 1);
        if (b > max) {
            return b;
        } else {
            return max;
        }

    }
}