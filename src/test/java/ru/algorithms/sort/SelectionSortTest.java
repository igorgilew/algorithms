package ru.algorithms.sort;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class SelectionSortTest {

    private final int len = 20;

    private int [] arr = new int[len];

    @Before
    public void init() {
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(1000);
        }
    }

    public void print() {
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    @Test
    public void test() {
        print();
        arr = SelectionSort.sort(arr);
        System.out.println();
        print();
    }
}
