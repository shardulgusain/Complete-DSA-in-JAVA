import java.util.Scanner;

/**
 * CountDigits
 */
public class CountDigits {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int count =1;
        while(n/10!=0)
        {
          count++;
          n = n/10;
        }
        System.out.println(count);
    }
}