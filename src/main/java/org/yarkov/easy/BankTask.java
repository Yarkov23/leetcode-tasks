package org.yarkov.easy;

public class BankTask {

    public static int maximumWealth(int[][] accounts) {
        int richest = 0;
        int sum = 0;

        for (int[] account : accounts) {
            for (int value : account) {
                sum += value;
            }
            if (sum > richest) {
                richest = sum;
            }
            sum = 0;
        }
        return richest;
    }

}
