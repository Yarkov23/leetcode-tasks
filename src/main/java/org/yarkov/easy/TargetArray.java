package org.yarkov.easy;

import java.util.ArrayList;
import java.util.List;

public class TargetArray {

    public int[] createTargetArray(int[] nums, int[] index) {
        int size = nums.length;
        List<Integer> list = new ArrayList<>();
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            list.add(index[i], nums[i]);
        }

        for (int i = 0; i < size; i++) {
            result[i] = list.get(i);
        }

        return result;
    }


}
