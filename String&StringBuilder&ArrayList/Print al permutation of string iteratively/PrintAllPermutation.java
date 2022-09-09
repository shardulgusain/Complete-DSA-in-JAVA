import java.util.Scanner;

/**
 * PrintAllPermutation
 */
public class PrintAllPermutation {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String str = new String();
        str = S.next();
        int l = str.length();
        int f = fact(l);
        permutations(f, str);
    }

    public static int fact(int x) {
        int factorial = 1;
        for (int i = x; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void permutations(int x, String s) {
        System.out.println(s);
        System.out.println(x);
        for (int i = 0; i < x; i++) {
            int j = i;
            StringBuilder sb = new StringBuilder(s);
            String result = "";
            int k = s.length();
            while (k != 0) {
                int val = j % k;
                j = j / k;
                result = result + sb.charAt(val);
                sb.deleteCharAt(val);
                k--;
            }
            System.out.println(i);
            System.out.println(result);

        }
    }
}