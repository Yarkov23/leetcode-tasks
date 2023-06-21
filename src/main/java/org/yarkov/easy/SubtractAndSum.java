package org.yarkov.easy;

public class SubtractAndSum {


    public static int subtractProductAndSum(int n) {

        int product = 1;
        int sum = 0;

        String nS = String.valueOf(n);

        for (int i = 0; i < nS.length(); i++) {
            var el = nS.charAt(i);
            sum += el - '0';
            product *= el - '0';
        }

        return product - sum;

    }

}
