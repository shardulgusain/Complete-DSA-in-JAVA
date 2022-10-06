import java.util.ArrayList;

/**
 * 2DArrayList
 */
public class TwoDArrayList {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        //ArrayList<Integer> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());
        for(int i =0;i<2;i++)
        {
            for(int j =0;j<2;j++)
            {
                list.get(i).add(2*j);

            }
        }


        System.out.println(list);

    }
}