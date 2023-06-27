package org.yarkov.medium;

import java.util.Arrays;

public class StudentsByScore {

    // m - students, n - exams

    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (b, a) -> Integer.compare(a[k], b[k]));
        return score;
    }

}
