import java.util.Scanner;

/**
 * StringCompression
 */
public class StringCompression {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String str = S.next();
        compression(str);
        compression2(str);
    }

    public static void compression(String str1) {
        int i = 0;
        String result = "";
        result += str1.charAt(0);

        while (i < str1.length() - 1) {
            if (str1.charAt(i + 1) != str1.charAt(i)) {
                result += str1.charAt(i + 1);
            }
            i++;
        }
        System.out.println(result);
    }

    public static void compression2(String str1) {
        int i = 0;
        int count = 1;
        String result = "";
        result += str1.charAt(0);

        while (i < str1.length() - 1) {
            if (str1.charAt(i + 1) != str1.charAt(i)) {
                if (count > 1) {
                    result = result + count + str1.charAt(i + 1);
                    count = 1;
                } else {
                    result += str1.charAt(i + 1);
                    count = 1;
                }
            } else {
                count++;
            }
            i++;

        }
        if (count > 1) {
            System.out.println(result + count);
        } else {
            System.out.println(result);
        }
    }
}