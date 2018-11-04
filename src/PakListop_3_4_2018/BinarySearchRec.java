package PakListop_3_4_2018;

import java.util.List;

//import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class BinarySearchRec implements SearchAlgorithm {
    @Override
    public Integer search(Integer value, List<Integer> input) {
        return null;
    }

    @Override
    public Integer search(Integer value, Integer[] input) {
        return searchRec(value, input, 0,input.length-1);
    }
    public Integer searchRec(Integer value, Integer[] input,int low,int high ) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (input[mid] > value) {
            return searchRec(value, input, low, mid - 1);
        } else if (input[mid] < value) {
            return searchRec(value, input, mid + 1, high);
        } else {
            return mid;
        }
    }
}

