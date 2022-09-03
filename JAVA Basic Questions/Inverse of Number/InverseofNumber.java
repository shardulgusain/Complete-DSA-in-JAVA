import java.util.Scanner;

/**
 * InverseofNumber
 */
public class InverseofNumber {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int num;
        int NewNum = 0;
        int count = 0;
        while (n != 0) {
            count++;
            num = n % 10;
            int pos = count * (int) Math.pow(10, num - 1);
            NewNum = NewNum + pos;
            n = n / 10;
        }
        System.out.println(NewNum);
    }
}