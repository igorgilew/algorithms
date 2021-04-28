package ru.algorithms.recursion;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

public class RecursionTest {
    private final Stack<Integer> list = new Stack<>();

    @Before
    public void init() {
        list.clear();
    }

    @Test
    public void sum15Test() {

        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        int result = Recursion.reqSum(list);
        Assert.assertEquals(15, result);
    }

    @Test
    public void sumOneElemTest() {
        list.push(23);
        Assert.assertEquals(1, list.size());
        Assert.assertEquals(23, Recursion.reqSum(list));
    }

    @Test
    public void sumZeroElemTest() {
        Assert.assertEquals(0, list.size());
        Assert.assertEquals(0, Recursion.reqSum(list));
    }

    @Test
    public void size5ElemTest() {
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        Assert.assertEquals(5, list.size());
        Assert.assertEquals(5, Recursion.reqSize(list));
    }

}
