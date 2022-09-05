class Solution {
    public String convertToBase7(int num) {
        int count =0;
        int result= 0;
        while(num!=0)
        {
            int digit = num%7;
            result = result+digit*(int)Math.pow(10,count);
                count++;
            num = num/7;
            
            
        }
        String s=Integer.toString(result);
        return s;
    }
}