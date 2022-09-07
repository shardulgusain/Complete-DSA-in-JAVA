import java.util.Scanner;

/**
 * SpanofArray
 */
public class SpanofArray {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int size = S.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = S.nextInt();
        }
        int result = Spanarray(arr);
        System.out.println(result);
    }

    public static int Spanarray(int[] arrr) {
        int max = arrr[0];
        int min = arrr[0];
        for (int i = 0; i < arrr.length; i++) {
            if (arrr[i] > max) {
                max = arrr[i];
            }
            if (arrr[i] < min) {
                min = arrr[i];
            }
        }
        return max - min;
    }
}