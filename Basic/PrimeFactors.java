public class PrimeFactors {
    public static void main(String[] args) {
        int n =45;
       // int copy = n;
        for(int i =2;i*i<=n;i++)
        {
           while(n%i==0)
           {
            n = n/i;
            System.out.println(i);
           }
        }
        if(n!=1)
        {
            System.out.println(n);
        }
    }
}
