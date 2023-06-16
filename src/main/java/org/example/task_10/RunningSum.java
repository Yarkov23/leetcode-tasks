package org.example.task_10;

public class RunningSum {

    public int[] runningSum(int[] nums) {
        int leftSum = 0;
        int val;

        for (int i = 0; i < nums.length; i++) {
            val = nums[i];
            nums[i] = leftSum += val;
        }

        return nums;
    }

}
