package nyc.c4q.abassawo;
/**
 * Created by c4q-Abass on 4/3/15.
 * Linear Search;
 */

import java.util.ArrayList;
import java.util.Iterator;

public class LinearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(1);
        aList.add(4);
        aList.add(12);
        aList.add(7);
        System.out.println(search(aList, 4));  //Should output 1.
    }

    public static int search(ArrayList<Integer> aList, int x) {
        int searchNum;
        for (int i = 0; i < aList.size(); i++) {  //index

            int currentNum = aList.get(i);
            if (x == currentNum) {
                return i;
            }
        }
        return -1;
    }

}


