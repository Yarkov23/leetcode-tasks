package org.yarkov;

import org.yarkov.medium.CollectGarbage;

import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {

        String[] garbage = {"G", "P", "GP", "GG"};
        int[] travel = {2, 4, 3};

        System.out.println(new CollectGarbage().garbageCollection(garbage, travel));
        Stream
    }
}
