import java.util.Scanner;

/**
 * DifferenceofTwoArrays
 */
public class DifferenceofTwoArrays {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int s = S.nextInt();
        int s2 = S.nextInt();
        int[] arr = new int[s];
        int[] arr2 = new int[s2];
        int[] big;
        int[] small;
        int borrow = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = S.nextInt();
        }
        // Finding the big ans small number
        if (s > s2) {
            big = arr;
            small = arr2;
        } else if (s == s2) {
            if (arr[0] > arr2[0]) {
                big = arr;
                small = arr2;
            } else {
                big = arr2;
                small = arr;
            }
        } else {
            big = arr2;
            small = arr;
        }
        int[] result = new int[big.length];
        int i = big.length - 1;
        int j = small.length - 1;
        int k = result.length - 1;
        while (k >= 0) {

            if (j >= 0) {
                if (big[i] - small[j] >= 0) {
                    result[k] = big[i] - small[j] - borrow;
                    borrow = 0;
                } else {
                    result[k] = 10 + big[i] - small[j] - borrow;
                    borrow = 1;
                }
                i--;
                j--;
                k--;
            }
            if (j < 0 && i >= 0) {
                result[k] = big[i] - borrow;
                borrow = 0;
                j--;
                k--;
            }

        }
        for (int val : result) {
            System.out.print(val);
        }
    }
}