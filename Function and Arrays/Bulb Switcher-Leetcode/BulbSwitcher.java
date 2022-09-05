class Solution {
    public int bulbSwitch(int n) {
        //only perfect squares wi;l remain on
        int count =0;
        for(int i =1;i*i<=n;i++)
        {
            count++;
        }
        return count;
    }
}