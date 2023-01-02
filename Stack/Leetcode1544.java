// 1544. Make The String Great
class Solution {
    public String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        for(int i= 1;i<s.length();i++)
        {
            if(st.isEmpty())
            {
                st.push(s.charAt(i));
                continue;
            }
            if(Character.isUpperCase(s.charAt(i)))
            {
               if(Character.isLowerCase(st.peek()))
               {
                    if(Character.toUpperCase(s.charAt(i))==Character.toUpperCase(st.peek()))
                    {
                        st.pop();
                    }
                    else
                    {
                        st.push(s.charAt(i));
                    }
               }
               else
               {
                   st.push(s.charAt(i));
               }
            }
            else
            {
                
                if(Character.isUpperCase(st.peek()))
                {
                    if(Character.toUpperCase(s.charAt(i))==Character.toUpperCase(st.peek()))
                    {
                        st.pop();
                    }
                    else
                    {
                        st.push(s.charAt(i));
                    }
               }
               else
               {
                    st.push(s.charAt(i));
               }
            }
            
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.peek());
            st.pop();
        }
        sb.reverse();
        return sb.toString();
    }
}