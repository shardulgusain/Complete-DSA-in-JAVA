class Solution {
    public int sumBase(int n, int k) {
        //We need to convert to base k
        int p = 1;int p2 =1;
        int sum = 0;
        int result =0;
        while(n!=0)
        {
            int d = n%k;
            sum = sum + d*p;
            p =p*10;
            n = n/ k;
        }
        //Adding the digits of sum
        while(sum!=0)
        {
            int r = sum %10;
           result = result+r;
            sum = sum/10;
        }
        return result;
        
    }
}