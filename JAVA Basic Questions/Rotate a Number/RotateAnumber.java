import java.util.Scanner;

/**
 * RotateAnumber
 */
public class RotateAnumber {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int duplicate = n;
        int count = 0;
        while (duplicate != 0) {
            count++;
            duplicate = duplicate / 10;
        }
        // ask for rotation
        int r = S.nextInt();
        // Removing cycles
        if (r > 0) {
            if (r > count) {
                r = r % count;
            }
            int tenspower = (int) Math.pow(10, r);
            int rotatedDigits = n % tenspower;
            int leftNum = rotatedDigits * (int) Math.pow(10, (count - r));
            int result = leftNum + (n / tenspower);
            System.out.println(result);
        } else {
            r = r * (-1);
            if (r > count) {
                r = r % count;
            }
            int tenspower = (int) Math.pow(10, count - r);
            int rotatedDigits = n / tenspower;
            int leftdigits = n % (int) Math.pow(10, (count - r));
            int leftNum = leftdigits * (int) Math.pow(10, r);
            int result = leftNum + rotatedDigits;
            System.out.println(result);
        }

    }
}