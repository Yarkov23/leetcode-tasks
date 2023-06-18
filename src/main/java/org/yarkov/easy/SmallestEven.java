package org.yarkov.easy;

public class SmallestEven {

    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }

}
