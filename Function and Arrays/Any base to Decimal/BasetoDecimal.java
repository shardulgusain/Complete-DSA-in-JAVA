import java.util.Scanner;

/**
 * BasetoDecimal
 */
public class BasetoDecimal {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int num = S.nextInt();
        int base = S.nextInt();
        int newnum = 0;
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            newnum = newnum + digit * (int) Math.pow(base, count);
            num = num / 10;
            count++;
        }
        System.out.println(newnum);
    }
}