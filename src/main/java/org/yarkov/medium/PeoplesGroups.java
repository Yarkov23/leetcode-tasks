package org.yarkov.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PeoplesGroups {
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {

        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        // [2,1,3,3,3,2]

        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];

            List<Integer> group = map.getOrDefault(size, new ArrayList<>());

            group.add(i);
            map.put(size, group);

            if (group.size() == size) {
                result.add(group);
                map.remove(size);
            }

        }

        return result;
    }

}
