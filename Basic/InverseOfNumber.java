public class InverseOfNumber {
    public static void main(String[] args) {
        int n =426135;
        int count =1;
        int result =0;
        while(n!=0)
        {
            int c = n%10;
            result= result+(count*(int)Math.pow(10,c-1));
            n = n/10;
            count++;

        }
        System.out.println(result);
    }
}
