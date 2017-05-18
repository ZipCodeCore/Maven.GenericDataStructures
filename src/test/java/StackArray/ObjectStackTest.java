package StackArray;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.*;


public class ObjectStackTest {
    @Test
    public void testPushingGrowsTheStack() throws Exception {
        // Given an empty stack
        ObjectStack<String> stack = new ObjectStack<>();
        // Assert that it is empty.
        Assert.assertEquals(true, stack.isEmpty());
        // When we push something onto the stack
        stack.push("foobar");
        // Then it shouldn't be empty
        Assert.assertEquals(false, stack.isEmpty());
    }

    @Test
    public void testPushingAndPoppingOrder() throws Exception {
        // Given an empty stack
        ObjectStack<String> stack = new ObjectStack<>();
        // When we push two elements on it
        stack.push("foo");
        stack.push("bar");
        // Then we should see them returned in the correct order
        Assert.assertEquals("bar", stack.pop());
        Assert.assertEquals("foo", stack.pop());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testPopFirst() throws Exception {
        // Given an empty stack
        ObjectStack<String> stack = new ObjectStack<>();
        // When it's popped
        stack.pop();
        // Then we should get an exception
    }
}