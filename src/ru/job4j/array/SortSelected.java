package ru.job4j.array;

import java.util.Arrays;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int tmp = data[i];
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            data[i] = min;
            data[index] = tmp;
        }
        return data;
    }
}
