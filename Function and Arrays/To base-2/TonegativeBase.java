import java.util.Scanner;

/**
 * TonegativeBase
 */
public class TonegativeBase {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String result = "";
        int number = S.nextInt();
        while (number != 0) {
            int i = number % -2;
            number /= -2;
            if (i < 0) {
                i += Math.abs(-2);
                number++;
            }
            result = i + result;
        }
        System.out.println(result);
    }
}

// class Solution {
// public String baseNeg2(int n) {
// if(n==0)
// {
// return "0";
// }
// String result = "";
// int number = n;
// while (number != 0) {
// int i = number % -2;
// number /= -2;
// if (i < 0) {
// i += Math.abs(-2);
// number++;
// }
// result = i + result;
// }
// return result;
// }
// }
