import java.util.Stack;
import java.util.*;

/**
 * BalancedBrackets
 */
public class BalancedBrackets {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String str = new String();
        str = S.nextLine();
        char[] arr = new char[str.length() - 1];
        int count = -1;
        char ch,c,d;
        ch ='0';
        c='0';
        d ='0';
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            st.push(ch);

            if (ch == '(' || ch == '{' || ch == '[') {
                count++;
                arr[count] = ch;
            } else if (ch == ')' || ch == '}' || ch == ']') {
                 ch = st.pop();
                 if(ch==')')
                 {
                    d = '(';
                 }
                 if(ch=='}')
                 {
                    d = '{';
                 }
                 if(ch==']')
                 {
                    d = '[';
                 }
                 c = ch;
                 while(c!=arr[count])
                 {
                    
                    if(c=='('||c=='{'||c=='[')
                    {
                        System.out.println("false");
                        return ;
                    }
                    c= st.pop();
                 }
                if(c!=d)
                {
                    System.out.println(false);
                    return;
                }
                 
                //  while(ch!=arr[count])
                //  {
                //     ch = st.pop();
                //     if(ch!=arr[count])
                //     {
                //         if(ch=='('||ch=='{'||ch=='[')
                //         {
                //             System.out.println("false");
                //             return;
                //         }
                //     }
                //  }
                 count--;
                // while (ch == '(' || ch == '{' || ch == '[') {
                //     ch = st.pop();

                //     System.out.println(st);
                // }
            }

            
        }
        System.out.println("true");
    }
}