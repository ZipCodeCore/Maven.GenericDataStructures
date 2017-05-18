package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack() {
        elements = new Object[0];
    }

    public void push(E o) {
        Object[] newArr = Arrays.copyOf(elements, elements.length + 1);
        newArr[elements.length] = o;
        elements = newArr;
    }

    public Object pop() throws IndexOutOfBoundsException {
        Object result = elements[elements.length - 1];
        elements = Arrays.copyOf(elements, elements.length-1);
        return result;
    }

    public boolean isEmpty() {
        return elements.length == 0;
    }
}
