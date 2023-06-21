package org.yarkov.easy;

public class MinimumNumOfOperation {

    public static int[] minOperations(String boxes) {
        if (boxes == null)
            return null;

        int boxesSize = boxes.length();
        int[] result = new int[boxesSize];

        int j = 0;

        for (int i = 0; i < boxesSize; i++) {
            int count = 0;
            if (boxes.charAt(j) == '1') {
                count += Math.abs(i - j);
            }
            result[i] = count;
            j++;
        }
        return result;
    }


}
