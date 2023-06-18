package org.yarkov.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        if (nums == null)
            return 0;

        if (nums.length == 1)
            return nums[0];

        Map<Integer, Integer> map = new HashMap<>();
        int max = nums[0];

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
                if (map.get(num) > map.get(max)) {
                    max = num;
                }
            } else {
                map.put(num, 1);
            }
        }
        return max;
    }

    // Sort method
    public int majorityElementWithSort(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

}
