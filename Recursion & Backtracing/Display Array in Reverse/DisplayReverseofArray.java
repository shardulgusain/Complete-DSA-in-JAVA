
/**
 * DisplayReverseofArray
 */
import java.util.*;

public class DisplayReverseofArray {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int[] arr = { 5, 7, 9, 4, 2 };
        displayArr(arr, arr.length - 1);
    }

    public static void displayArr(int[] ar, int x) {
        if (x < 0) {
            return;
        }
        System.out.println(ar[x]);
        displayArr(ar, x - 1);
    }
}