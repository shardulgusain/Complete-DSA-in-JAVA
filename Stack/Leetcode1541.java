// 1541. Minimum Insertions to Balance a Parentheses String
class Solution {
    public int minInsertions(String s) {
        int count =0;
        int c =0;
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='(' && count==1)
           {
               c++;
               if(st.isEmpty())
               {
                   c++;
                   count=0;
                   st.push(s.charAt(i));
               }
               else
               {
                    st.pop();
               count=0;
               st.push(s.charAt(i));
               }
           }
           else if(s.charAt(i)=='(' && count==0)
           {
               st.push(s.charAt(i));
           }
           else if(s.charAt(i)==')')
           {
               count++;
               if(count==2 && st.isEmpty()){
                   c++;
                   count=0;
               }
               else if(count==2 && st.peek()=='(')
               {
                   st.pop();
                   count=0;
               }
               else if(count==1 && i==s.length()-1 && st.isEmpty())
               {
                   c=c+2;
               }
               else if(count==1 && i==s.length()-1 )
               {
                   c++;
                   st.pop();
               }
              
           }
        }
        while(!st.isEmpty())
        {
            if(st.peek()=='(')
            {
                c=c+2;
            }
            st.pop();
        }
        return c;
    }
}