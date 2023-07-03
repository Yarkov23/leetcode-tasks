package org.yarkov.medium;

import java.util.Objects;

public class RearrangeArray {

    public int[] rearrangeArray(int[] nums) {
        Objects.requireNonNull(nums);

        int n = nums.length;
        int[] result = new int[n];
        int positive = 0, negative = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                result[positive] = nums[i];
                negative += 2;
            } else {
                result[negative] = nums[i];
                positive += 2;
            }
        }

        return result;
    }


}
