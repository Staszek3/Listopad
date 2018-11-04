package PakListop_3_4_2018;

import java.util.List;

public class BinarySearchIter implements SearchAlgorithm {
    @Override
    public Integer search(Integer value, List<Integer> input) {
        return null;
    }

    @Override
    public Integer search(Integer value, Integer[] input) {
        int low = 0;
        int high = input.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (input[mid] > value) {
                high = mid - 1;
            } else if (input[mid] < value) {
                low = mid + 1;
            } else return mid;

        }return -1;

    }
}

