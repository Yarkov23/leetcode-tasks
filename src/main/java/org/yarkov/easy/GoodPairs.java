package org.yarkov.easy;

public class GoodPairs {

    public static int numIdenticalPairs(int[] nums) {
        int pairsCount = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }

}
