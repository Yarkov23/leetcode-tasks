package org.yarkov.easy;

public class DecodeXoredArray {

    public static int[] decode(int[] encoded, int first) {

        int enSize = encoded.length + 1;
        int[] decoded = new int[enSize];
        decoded[0] = first;

        for (int i = 0; i < enSize - 1; i++) {
            decoded[i + 1] = decoded[i] ^ encoded[i];
        }

        return decoded;
    }

}
