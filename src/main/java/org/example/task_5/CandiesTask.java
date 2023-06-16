package org.example.task_5;

import java.util.Arrays;
import java.util.List;

public class CandiesTask {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean[] result = new Boolean[candies.length];

        int greatest = Arrays.stream(candies).max().getAsInt();

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= greatest)
                result[i] = true;
            else
                result[i] = false;
        }

        return Arrays.asList(result);
    }
}
