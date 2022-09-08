import java.util.Scanner;

/**
 * Printsubstring
 */
public class Printsubstring {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String s = S.next();
        int l = s.length();
        for(int i =0;i<l;i++)
        {
            for(int j = i+1;j<= l;j++)
            {
                System.out.println(s.substring(i, j));
            }
        }
    }
}