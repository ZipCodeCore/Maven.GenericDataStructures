package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements = new Object[0];
    private int size = 0;

    public ObjectStack() {

    }


    public boolean isEmpty() {
        return size == 0;
    }

    public void push(Object element) {
        this.elements = Arrays.copyOf(this.elements, this.elements.length + 1);
        this.elements[elements.length - 1] = element;
        size++;
    }

    public Object pop() {
        Object object = this.elements[size - 1];
        this.elements[size - 1] = null;
        size--;
        return object;
    }
}
