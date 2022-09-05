import java.util.Scanner;

/**
 * DecimaltoBase
 */
public class DecimaltoBase {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int num = S.nextInt();
        int base = S.nextInt();
        int newnum = 0;
        int count = 0;
        while (num != 0) {
            int remainder = num % base;
            num = num / base;
            newnum = newnum + remainder * (int) Math.pow(10, count);
            count++;
        }
        System.out.println(newnum);
    }
}