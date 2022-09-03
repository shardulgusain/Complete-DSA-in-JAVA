import java.util.Scanner;

/**
 * Printfib
 */
public class Printfib {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int previous,next;
        previous =0;
        next = 1;
        System.out.println(next);
        for(int i =2;i<=n;i++)
        {
            int digit = next+previous;
            System.out.println(digit);
            previous = next;
            next = digit;
            
        }
    }
}