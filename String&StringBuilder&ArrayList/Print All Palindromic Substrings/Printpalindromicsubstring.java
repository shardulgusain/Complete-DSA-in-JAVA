import java.util.Scanner;

/**
 * Printpalindromicsubstring
 */
public class Printpalindromicsubstring {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String s = S.next();
        //Substring
        for(int i =0;i<s.length();i++)
        {
            for(int j = i+1;j<=s.length();j++)
            {
                String sub = s.substring(i, j);
                palindrome(sub);
            }
        }
    }
    public static void palindrome(String str)
    {
        int i =0;
        int count =0;
        int j = str.length()-1;
        while(i<=j)
        {
            char c = str.charAt(i);
            char c2 = str.charAt(j);
            if(c!=c2)
            {
                count =1;
                break;
            }
            i++;
            j--;
        }
        if(count ==0)
        {
            System.out.println(str);
        }
        
    }
}