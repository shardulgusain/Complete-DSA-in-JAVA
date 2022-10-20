import java.util.Scanner;

/**
 * FibonacciRecursion
 */
public class FibonacciRecursion {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Which fibonacci you want");
        int n = S.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int x)
    {
        if(x<=1)
        {
            return x;
        }
        else
        {
            int y = fib(x-1)+fib(x-2);
            return y;
        }
    }
}