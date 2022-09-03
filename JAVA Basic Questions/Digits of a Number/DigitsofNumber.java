import java.util.Scanner;

/**
 * DigitsofNumber
 */
public class DigitsofNumber {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int x = n;
        //calculating length of a number
        int len = 1;
        while(x/10!=0)
        {
            x = x/10;
            len++;
        }
        int k = (int)Math.pow(10, (len-1));
        while(k!=0)
        {
            int num = n/k;
         System.out.println(num);
         n = n%k;
         k=k/10;
        }
    }
}