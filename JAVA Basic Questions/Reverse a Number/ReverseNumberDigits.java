import java.util.Scanner;

/**
 * ReverseNumberDigits
 */
public class ReverseNumberDigits {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        while(n!=0)
        {
            int ans = n%10;
            System.out.println(ans);
            n = n/10;
        }

    }
}