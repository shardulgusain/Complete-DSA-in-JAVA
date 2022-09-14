
/**
 * FirstIndex
 */
import java.util.*;

public class FirstIndex {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[] arr = { 4, 5, 8, 7, 4, 10 };
        int num = 9;
        System.out.println(firstIndex(arr, 0, num));
    }

    public static int firstIndex(int[] a, int idx, int n) {
        if (idx == a.length - 1 && a[idx] != n) {
            return -1;
        }
        if (idx == a.length - 1 && a[idx] == n) {
            return idx;
        }
        if (a[idx] == n) {
            return idx;
        }
        int index = firstIndex(a, idx + 1, n);
        return index;
    }
}