package StackArray;

import org.junit.Assert;
import org.junit.Test;

public class GenericStackTest {
    @Test
    public void testPushingGrowsTheStack() throws Exception {
        // Given an empty stack
        GenericStack<String> stack = new GenericStack<>();

        // Assert that it is empty.
        Assert.assertEquals(true, stack.isEmpty());
        // When we push something onto the stack
        stack.push("foobar");
        // Then it shouldn't be empty
        Assert.assertEquals(false, stack.isEmpty());
    }

    @Test
    public void testLengthMethod(){
        GenericStack<String> stack = new GenericStack<>();
        Assert.assertEquals("This should return 10", 10, stack.length());
    }

    @Test
    public void testArrayLengthResize(){
        //: Given
        GenericStack<String> stack = new GenericStack<>(1);
        Assert.assertEquals(1, stack.length());
        stack.push("mike");
        stack.push("tom");
        Assert.assertEquals(11, stack.length());
        Assert.assertEquals(2, stack.sizeCounter());
    }

    @Test
    public void testPushingAndPoppingOrder() throws Exception {
        // Given an empty stack
        GenericStack<String> stack = new GenericStack<>();
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
        GenericStack<String> stack = new GenericStack<>();
        // When it's popped
        Assert.assertEquals(new IndexOutOfBoundsException(),stack.pop());
        // Then we should get an exception

    }

    @Test
    public void testPopFirst_ExpectedApples() {
        // Given an empty stack
        GenericStack<String> stack = new GenericStack<>();
        stack.push("apples");
        // When it's popped
        Assert.assertEquals("apples", stack.pop());
        // Then we should get an exception
    }

    @Test
    public void testIsNotEmpty(){
        GenericStack<String> stack = new GenericStack<>();
        Assert.assertFalse(stack.isNotEmpty());
    }

}