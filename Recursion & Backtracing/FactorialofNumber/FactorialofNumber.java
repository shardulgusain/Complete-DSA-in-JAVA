
/**
 * FactorialofNumber
 */
import java.util.*;

public class FactorialofNumber {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int num = S.nextInt();
        System.out.println(printFact(num));
    }

    public static int printFact(int x) {
        if (x == 0) {
            return 1;
        }
        int fact1 = printFact(x - 1);
        int fact = x * fact1;
        return fact;
    }

}