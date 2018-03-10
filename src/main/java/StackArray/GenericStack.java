package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements = (E[]) new Object[0];
    private int size = 0;

    public GenericStack() {

    }

    public boolean isEmpty() {
        return this.elements.length == 0;
    }

    public void push(E element) {
        this.elements = Arrays.copyOf(this.elements, this.elements.length + 1);
        this.elements[elements.length - 1] = element;
        size++;

    }

    public E pop() {
        E object = this.elements[size - 1];
        this.elements[size - 1] = null;
        size--;
        return object;
    }

}
