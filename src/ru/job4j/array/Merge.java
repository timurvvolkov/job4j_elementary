package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRight = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (left.length == 0 || indexLeft == left.length) {
                rsl[i] = right[indexRight];
                indexRight++;
                continue;
            }

            if (right.length == 0 || indexRight == right.length) {
                rsl[i] = left[indexLeft];
                indexLeft++;
                continue;
            }

            if (left[indexLeft] < right[indexRight]) {
                rsl[i] = left[indexLeft];
                indexLeft++;
            } else {
                rsl[i] = right[indexRight];
                indexRight++;
            }
        }
        return rsl;
    }
}
