public class GcdAndLcm {
    public static void main(String[] args) {
        int n  =6;
        int n1= 32;
        int c = n;
        int c1=n1;
        int temp=0;
        while(n1%n!=0)
        {
            temp =n;
            n=n1%n;
            n1=temp;

        }
        System.out.println("gcd is: "+n );
        System.out.println("Lcm is "+(c*c1)/n);
    }
}
