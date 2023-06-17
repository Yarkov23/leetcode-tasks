package org.yarkov.easy.task_1;

import java.util.HashMap;
import java.util.Map;

public class ParkingSystem {

    enum CarType {

        SMALL(3),
        MEDIUM(2),
        BIG(1);

        private final int type;

        public int getType() {
            return type;
        }

        CarType(int type) {
            this.type = type;
        }
    }

    private final Map<CarType, Integer> parkingMap;

    public ParkingSystem(int big, int medium, int small) {
        parkingMap = new HashMap<>();
        parkingMap.put(CarType.BIG, big);
        parkingMap.put(CarType.MEDIUM, medium);
        parkingMap.put(CarType.SMALL, small);
    }

    public boolean addCar(int carType) {
        if (carType > 3 || carType <= 0) {
            return false;
        }

        if (carType == CarType.SMALL.getType()) {
            return parkIfFits(CarType.SMALL);
        } else if (carType == CarType.MEDIUM.getType()) {
            return parkIfFits(CarType.MEDIUM);
        } else {
            return parkIfFits(CarType.BIG);
        }
    }

    private boolean parkIfFits(CarType carType) {
        Integer value = parkingMap.get(carType);
        if (value != 0) {
            parkingMap.put(carType, value - 1);
            return true;
        } else {
            System.out.println("There is no free place");
        }
        return false;
    }

}
