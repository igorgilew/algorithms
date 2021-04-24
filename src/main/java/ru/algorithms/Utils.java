package ru.algorithms;

public class Utils {
    public static int findSmallestIndex(int[] arr) {
        int min = arr[0];
        int minIndx = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<min) {
                min = arr[i];
                minIndx = i;
            }
        }
        return minIndx;
    }
}
