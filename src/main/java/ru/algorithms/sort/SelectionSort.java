package ru.algorithms.sort;

import ru.algorithms.Utils;

public class SelectionSort {
    public static int [] sort(int[] arr) {
        int[] sorted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int min = Utils.findSmallestIndex(arr);
            sorted[i] = arr[min];
            arr[min] = Integer.MAX_VALUE;
        }
        return sorted;
    }
}
