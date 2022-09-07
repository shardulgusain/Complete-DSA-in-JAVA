import java.util.Scanner;
/**
 * InverseofArray
 */
public class InverseofArray {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int size  = S.nextInt();
        int [] arr = new int[size];
        int [] arr1 = new int[size];

        for(int i =0; i < size; i++) {
            arr[i] = S.nextInt(); 
        }
        for(int i =0; i < size; i++) {
            // arr1[arr[i]] = i;
            
        }
        for(int val:arr1)
        {
            System.out.print(val);
        }
    }
}