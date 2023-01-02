/**
 * DigitsOfNumbers
 */
public class DigitsOfNumbers {

    public static void main(String[] args) {
        int n = 578901;
        int n1 = 123450;
        int copy =n1;
        int count =0;
        //counting the digits in  n
        while(n1!=0)
        {
            n1= n1/10;
            count++;
        }
        System.out.println(count);
        int k = (int)Math.pow(10, count-1);
        while(k!=0)
        {
            int  c = copy/k;
            System.out.println(c);
            copy = copy%k; 
            k= k/10;
        }
        
    }
}