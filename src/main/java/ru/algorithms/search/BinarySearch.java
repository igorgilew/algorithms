package ru.algorithms.search;

import java.util.Optional;

public class BinarySearch {
    /**
     * Алгоритм бинарного поиска
     * @param array - отсортированный массив
     * @param value - искомое значение
     * @return - позиция элемента в массиве или null если
     */
    public static Optional<Integer> search(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high){
            int middle = (low + high) / 2;
            if (array[middle] == value) {
                return Optional.of(middle);
            }

            if (array[middle] < value) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return Optional.empty();
    }
}
