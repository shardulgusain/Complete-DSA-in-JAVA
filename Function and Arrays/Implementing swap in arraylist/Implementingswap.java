import java.util.ArrayList;

/**
 * Implementingswap
 */
public class Implementingswap {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i<=5;i++)
        {
            list.add(2*i);
        }
        System.out.println(list);
        swap(list, 2,3);
        System.out.println(list);
        
    }
    public static void swap(ArrayList<Integer> arr, int x, int y)
    {
        int a = arr.get(x);
        int b = arr.get(y);
        arr.set(x, b);
        arr.set(y, a);
    }
}