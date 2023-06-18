package org.yarkov;

import org.yarkov.medium.PeoplesGroups;

public class App {
    public static void main(String[] args) {

        var peoplesInGroups = PeoplesGroups.groupThePeople(new int[]{2, 1, 3, 3, 3, 2});

        System.out.println(peoplesInGroups);

    }
}
