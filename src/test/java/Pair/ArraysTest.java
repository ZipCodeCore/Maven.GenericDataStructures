package Pair;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ArraysTest {

//    List<Integer> al = java.util.Arrays.asList(1, 5, 3, 4, 2, 0, 1000);

    ArrayList<Integer> al = new ArrayList<>();
    Arrays arrays = new Arrays(al);

    @Test
    public void firstLast() throws Exception {
        // Given an ArrayList of Integers
        al.add(1);
        al.add(5);
        al.add(3);
        al.add(4);
        al.add(2);
        al.add(0);
        al.add(1000);
        // When firstLast is called
        Pair<Integer> result = arrays.firstLast(al);
        // Then it should return the first and last items
        Assert.assertEquals(new Integer(1), result.getFirst());
        Assert.assertEquals(new Integer(1000), result.getSecond());
    }

    @Test
    public void testMin() throws Exception {
        // Given an ArrayList of Integers
        al.add(1);
        al.add(5);
        al.add(3);
        al.add(4);
        al.add(2);
        al.add(0);
        al.add(1000);
        // When min is called assert that it gets the smallest item
        Assert.assertEquals(new Integer(0), arrays.min(al));
    }

    @Test
    public void testMax() throws Exception {
        // Given an ArrayList of Integers

        al.add(1);
        al.add(5);
        al.add(3);
        al.add(4);
        al.add(2);
        al.add(0);
        al.add(1000);
        // When min is called assert that it gets the largest item
        Assert.assertEquals(new Integer(1000), arrays.max());
    }

    @Test
    public void testMinMax() throws Exception {
        // Given an ArrayList of Integers

        al.add(1);
        al.add(5);
        al.add(3);
        al.add(4);
        al.add(2);
        al.add(0);
        al.add(1000);
        // When minMax is called
        Pair<Integer> result = arrays.minMax();
        // Then it should return the first and last items
        Assert.assertEquals(new Integer(0), result.min());
        Assert.assertEquals(new Integer(1000), result.max());
    }
}
