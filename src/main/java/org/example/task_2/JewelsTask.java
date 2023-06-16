package org.example.task_2;

public class JewelsTask {

    public static int numJewelsInStones(String jewels, String stones) {

        if (jewels == null || jewels.equals("")) {
            return 0;
        }

        if (stones == null || stones.equals("")) {
            return 0;
        }

        int jewelsCount = 0;

        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                jewelsCount++;
            }
        }

        return jewelsCount;
    }

}
