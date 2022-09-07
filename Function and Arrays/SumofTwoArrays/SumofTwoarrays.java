import java.util.Scanner;

/**
 * SumofTwoarrays
 */
public class SumofTwoarrays {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int s = S.nextInt();
        int s2 = S.nextInt();
        int[] arr = new int[s];
        int[] arr2 = new int[s2];
        int carry = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = S.nextInt();
        }
        int[] result = new int[s > s2 ? s : s2];
        int i = arr.length - 1;
        int j = arr2.length - 1;
        int k = result.length - 1;
        while (k >= 0) {
            int d = carry;
            if (i >= 0) {
                d = d + arr[i];
            }
            if (j >= 0) {
                d = d + arr2[j];
            }
            carry = d / 10;
            d = d % 10;
            result[k] = d;
            i--;
            j--;
            k--;
        }
        if (carry != 0) {
            System.out.print(carry);
        }
        for (int val : result) {
            System.out.print(val);
        }
    }
}
