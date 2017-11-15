package StackArray;

import StackArrayList.Stack;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;
    private Stack<E> stack;

    public ObjectStack() {
        stack = new Stack<>();
        elements = stack.getElements().toArray();
    }

    public void push (E elementToAdd) {
        stack.push(elementToAdd);
        elements = stack.getElements().toArray();
    }

    public Object pop() {
        E element = stack.pop();
        elements = stack.getElements().toArray();
        return element;
    }

    public boolean isEmpty() {
        if (elements.length == 0) {
            return true;
        }
        return false;
    }
}
