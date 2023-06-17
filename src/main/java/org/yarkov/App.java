package org.yarkov;

import org.yarkov.easy.task_16.MajorityElement;

public class App {
    public static void main(String[] args) {

        var majorityElement = new MajorityElement();

        var res = majorityElement.majorityElement(new int[]{6, 6, 6, 7, 7});
        System.out.println(res);

    }
}
