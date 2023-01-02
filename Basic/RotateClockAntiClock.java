public class RotateClockAntiClock {
    public static void main(String[] args) {
        int n =12345;
        int cr=3;//clockwise
        int acr=-3;//anticlockwise this is also equals to clockwise n-3,where n is the length
        //Roatating clockwise
        int k = (int)Math.pow(10,3);
        int result = n%k;
        int nLength = 5;
        int mul = (int)Math.pow(10,nLength-cr);
        result = (result*mul)+(n/k);
        System.out.println(result);
        //Rotating clockwise
        int modAcr = -1*acr;
        int mul2= (int)Math.pow(10,nLength-modAcr);
        int result2= n%mul2;
        int j = n/mul2;
        result2 = result2*(int)Math.pow(10,modAcr)+j;
        System.out.println(result2);



    }
}
