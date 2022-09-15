
/**
 * DisplayanArray
 */
import java.util.*;

public class DisplayanArray {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[] ar = { 5, 4, 7, 8, 3 };
        displayArray(ar, 0);

    }

    public static void displayArray(int[] arr, int idx) {
        int l = arr.length;
        if (idx >= l) {
            return;
        }
        System.out.println(arr[idx]);
        displayArray(arr, idx + 1);
    }
}