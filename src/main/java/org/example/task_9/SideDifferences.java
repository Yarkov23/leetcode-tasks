package org.example.task_9;

import java.util.ArrayList;
import java.util.List;

public class SideDifferences {

    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0, rightSum = 0;
        int val;

        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            val = nums[i];
            rightSum -= val;
            nums[i] = Math.abs(leftSum - rightSum);
            leftSum += val;
        }

        return nums;
    }

}
