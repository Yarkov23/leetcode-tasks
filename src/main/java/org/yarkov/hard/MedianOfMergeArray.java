package org.yarkov.hard;

import java.util.Arrays;

public class MedianOfMergeArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = concat(nums1, nums2);
        double median;

        Arrays.sort(merged);

        if (merged.length % 2 == 0)
            median = ((double) merged[merged.length / 2] + (double) merged[merged.length / 2 - 1]) / 2;
        else
            median = merged[merged.length / 2];

        return median;
    }

    public int[] concat(int[] first, int[] second) {
        int[] result = Arrays.copyOf(first, first.length + second.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

}
