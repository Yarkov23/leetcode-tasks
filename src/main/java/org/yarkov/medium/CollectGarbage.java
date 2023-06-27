package org.yarkov.medium;

import java.util.LinkedList;
import java.util.Queue;

public class CollectGarbage {

    enum CarType {
        P, G, M;
    }

    private final Queue<CarType> cars;

    public CollectGarbage() {
        cars = new LinkedList<>();
        cars.add(CarType.P);
        cars.add(CarType.M);
        cars.add(CarType.G);
    }

    public int garbageCollection(String[] garbage, int[] travel) {
        int result = 0;

        while (!cars.isEmpty()) {
            result += garbageCollectionHelper(cars.poll(), garbage, travel);
        }

        return result;
    }

    private int garbageCollectionHelper(CarType car, String[] garbage, int[] travel) {
        int summaryTime = 0, step = 0;
        char type = car.name().charAt(0);

        for (int i = 0; i < garbage.length; i++) {

            if (i != 0) step += travel[i - 1];

            for (int j = 0; j < garbage[i].length(); j++) {
                if (type == garbage[i].charAt(j)) {
                    summaryTime += step + 1;
                    step = 0;
                }
            }
        }

        return summaryTime;
    }

}
