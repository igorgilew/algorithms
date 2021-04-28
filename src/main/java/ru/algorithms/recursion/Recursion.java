package ru.algorithms.recursion;

import java.util.Stack;

public class Recursion {

    /**
     * Рекурсивный метод, вычисляющий сумму элементов списка
     * @param list - список
     */
    public static int reqSum(Stack<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size() == 1) {
            return list.pop();
        }
        return list.pop() + reqSum(list);
    }

    /**
     * Кол-во элементов списка
     * @param list
     * @return
     */
    public static int reqSize(Stack<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        list.pop();
        return 1 + reqSize(list);
    }

    public static int reqMax(Stack<Integer> list) {
        if (list.size() == 0) {
            return 0;
        }
        if (list.size() == 1) {
            return list.pop();
        }
        int max = list.pop();
        int second = reqMax(list);
        return max > second ? max : second;
    }
}
