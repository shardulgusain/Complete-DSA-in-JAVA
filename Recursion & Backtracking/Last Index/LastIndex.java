
/**
 * LastIndex
 */
import java.util.*;

public class LastIndex {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[] a = { 9, 4, 5, 6, 5, 8, 9, 7 };
        int num = 5;
        System.out.println(LastIndex(a, num, 0));
    }

    public static int LastIndex(int[] arr, int x, int idx) {
        if (idx == arr.length - 1 && arr[idx] == x) {
            return idx;
        }
        if (idx == arr.length - 1 && arr[idx] != x) {
            return -1;
        }
        int k = -1;
        if (arr[idx] == x) {
            k = idx;
        }
        int Lindex = k;
        Lindex = LastIndex(arr, x, idx + 1);
        if (Lindex == -1) {
            return k;
        } else {
            return Lindex;
        }
    }
}