import java.util.ArrayList;
import java.util.Scanner;

/**
 * RemovePrime
 */
public class RemovePrime {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int size = S.nextInt();
        int count =1;
        ArrayList<Integer> list = new ArrayList();
        for(int i =0;i<size;i++)
        {
            list.add(S.nextInt());
        }
        System.out.println(list);
        for(int i =0;i<size;i++)
        {
            
            int val = list.get(i);
            int k =2;
            count =0;
            if(val==1)
            {
                count++;
            }
            while(k*k<=val)
            {
                if(val%k==0)
                {
                    count++; 
                    break;
                }
                k++;
            }
            if(count==0)
            {
                list.remove(i);
                size--;
                i--;
            }
        }
        System.out.println(list);
    }
}