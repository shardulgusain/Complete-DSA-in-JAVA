import java.net.NetworkInterface;
import java.util.Scanner;

/**
 * AllndicesofArray
 */
public class AllndicesofArray {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[] arr = { 4, 5, 6, 8, 2, 4, 6, 9, 7 };
        int num = 4;
        int[] result = AllIndices(arr, 0, num, 0);
        for (int val : result) {
            System.out.println(val);
        }
    }

    public static int[] AllIndices(int[] a, int idx, int n, int fsf) {
        if (idx == a.length) {
            return new int[fsf];
        }
        if (a[idx] == n) {
            int[] iArr = AllIndices(a, idx + 1, n, fsf + 1);
            iArr[fsf] = idx;
            return iArr;
        } else {
            int[] iArr = AllIndices(a, idx + 1, n, fsf);
            return iArr;
        }
    }
}