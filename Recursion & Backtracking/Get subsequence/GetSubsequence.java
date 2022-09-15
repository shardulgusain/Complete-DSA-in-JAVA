import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

import javax.print.DocFlavor.STRING;

/**
 * GetSubsequence
 */
public class GetSubsequence {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String str = "abc";
        ArrayList<String> list = new ArrayList<>();
        list = gss(str);
        System.out.println(list);

    }

    public static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);

        ArrayList<String> mres = new ArrayList<>();
        for (String rstr : rres) {
            mres.add("" + rstr);
            mres.add(ch + rstr);

        }
        return mres;
    }
}