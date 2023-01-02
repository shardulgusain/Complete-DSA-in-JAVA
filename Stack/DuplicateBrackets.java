import java.util.Scanner;
import java.util.Stack;

/**
 * DuplicateBrackets
 */
public class DuplicateBrackets {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String str = S.nextLine();
        int count =0;
        Stack<Character> st = new Stack<>();
        for(int i =0;i<str.length();i++)
        {
            if(str.charAt(i)==')')
            {
                if(st.peek()=='(')
                {
                    count=1;
                    break;
                }
                while(st.peek()!='(')
                {
                    st.pop();
                }
                st.pop();
                
            }
            else{
                st.push(str.charAt(i));
            }
        }
        if(count==0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}