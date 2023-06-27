package org.yarkov.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        if (s == null || s.equals(""))
            return 0;

        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, result = 0;

        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                result = Math.max(result, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return result;
    }

}
