import java.util.Scanner;

/**
 * FindElementinArray
 */
public class FindElementinArray {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int size = S.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.nextInt();
        }
        int find = S.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (find == arr[i]) {
                System.out.println(i);
                count++;
                break;
            }

        }
        if (count == 0) {
            System.out.println("element not found");
        }
    }
}