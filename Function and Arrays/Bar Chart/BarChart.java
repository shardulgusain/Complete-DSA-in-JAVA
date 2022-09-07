import java.util.Scanner;

/**
 * BarChart
 */
public class BarChart {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int size = S.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.nextInt();
        }
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println(max);
        for (int i = max; i >= 1; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (i - arr[j] > 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}