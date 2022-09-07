import java.util.Scanner;

/**
 * ReverseofanArray
 */
public class ReverseofanArray {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int size = S.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = S.nextInt();
        }
        int[] newarray = new int[size];
        for (int i = 0; i < arr.length; i++) {
            newarray[i] = arr[arr.length - 1 - i];
            System.out.println(newarray[i]);
        }
    }
}