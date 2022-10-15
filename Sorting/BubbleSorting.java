import java.util.Arrays;

/**
 * BubbleSorting
 */
public class BubbleSorting {

    public static void main(String[] args) {
        int[] arr = {2,4,9,8,6};
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = 0;j+1<arr.length-i;j++)
            {
                if(arr[j+1]<arr[j])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        
    }
}