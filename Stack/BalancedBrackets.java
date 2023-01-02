import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String st = S.nextLine();
        int count =0;
        Stack<Character> stk= new Stack<>();
        for(int i =0;i<st.length();i++)
        {
            if(st.charAt(i)=='('||st.charAt(i)=='{'||st.charAt(i)=='[')
            {
                stk.push(st.charAt(i));
            }
            else if(st.charAt(i)==')')
            {
                if(stk.size()!=0)
                {
                    if(stk.peek()=='(')
                    {
                        stk.pop();
                    }
                    else{
                        count=1;
                        break;
                    }
                }
                else{
                    count=1;
                break;
                }
            }
            else if(st.charAt(i)=='}')
            {
                if(stk.size()!=0)
                {
                    if(stk.peek()=='{')
                    {
                        stk.pop();
                    }
                    else{
                        count=1;
                        break;
                    }
                }
                else{
                    count=1;
                break;
                }
            }
            else if(st.charAt(i)==']')
            {
                if(stk.size()!=0)
                {
                    if(stk.peek()=='[')
                    {
                        stk.pop();
                    }
                    else{
                        count=1;
                        break;
                    }
                }
                else{
                    count=1;
                break;
                }
            }
        }
        if(count==1)
        {
            System.out.println("false");
        }
        else
        {
            System.out.println("true");
        }
    }
}
