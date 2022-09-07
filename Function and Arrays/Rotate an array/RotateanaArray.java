import java.util.Scanner;

/**
 * RotateanaArray
 */
public class RotateanaArray {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int size = S.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = S.nextInt();
        }
        int r = S.nextInt();
        int[] newarray = new int[size];
        for (int i = 0; i < arr.length; i++) {
            if (r > size) {
                r = r % size;
            }
            int k = (i + r) % size;
            newarray[k] = arr[i];
        }
        for (int val : newarray) {
            System.out.println(val);
        }
    }
}