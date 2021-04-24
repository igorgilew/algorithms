package ru.algorithms.search;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

public class BinarySearchTest {

    private final int len = 20;

    private int [] arr = new int[len];

    private int pos; //позиция искомого эл-а
    private int value; //искомый эл-т

    /**
     * Заполняем массив случайными данными и сортируем его
     */
    @Before
    public void init() {
        Random random = new Random();
        for (int i = 0; i < len; i++) {
            arr[i] = random.nextInt(1000);
        }
        Arrays.sort(arr);


    }

    /**
     * Случайным образом выбираем значение для поиска
     */
    @Before
    public void generateValueToFind() {
        Random random = new Random();
        pos = random.nextInt(len);
        value = arr[pos];
    }


    public void print() {
        System.out.println("Исходный массив для поиска:");
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        System.out.println("\nИскомый элемент: " + value + " pos=" + pos + "\n");
    }

    @Test
    public void randomTest() {
        print();
        Optional<Integer> result = BinarySearch.search(arr, value);
        Assert.assertTrue(result.isPresent());
        int index = result.get();
        System.out.println("Найденная позиция: " + index);
        Assert.assertEquals(pos, index);
    }

    @Test
    public void oneElementTest() {
        arr = new int[1];
        arr[0] = 5;
        Optional<Integer> result = BinarySearch.search(arr, 5);
        Assert.assertTrue(result.isPresent());
        int index = result.get();
        Assert.assertEquals(0, index);
    }

    @Test
    public void twoElementTest() {
        arr = new int[2];
        arr[0] = 5;
        arr[1] = 7;
        Optional<Integer> result = BinarySearch.search(arr, 7);
        Assert.assertTrue(result.isPresent());
        int index = result.get();
        Assert.assertEquals(1, index);
    }

    @Test
    public void noElementTest() {
        arr = new int[2];
        arr[0] = 5;
        arr[1] = 7;
        Optional<Integer> result = BinarySearch.search(arr, 13);
        Assert.assertFalse(result.isPresent());
    }




}
