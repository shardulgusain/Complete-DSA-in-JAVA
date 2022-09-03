import java.util.Scanner;

/**
 * GCD&LCM
 */
public class GCDandLCM {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n1 = S.nextInt();
        int duplicate1 = n1;
        int n2 = S.nextInt();
        int duplicate2=n2;
        while(n1 % n2 != 0)
        {
            int rem = n1%n2;
            n1=n2;
            n2=rem;
        }
        int gcd = n2;
        int lcm = (duplicate1*duplicate2)/gcd;
        System.out.println("gcd is"+gcd+"lcm is"+lcm);


    }
}