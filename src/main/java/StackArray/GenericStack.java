package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 *
 * @param <E>
 */
public class GenericStack<E> {

    private E[] elements;
    Integer actualSize = 0;

    public GenericStack() {
        this.elements = (E[]) new Object[2];
    }

    public boolean isEmpty() {
        return actualSize == 0;
    }

    public void push(E element) {

        if (this.actualSize >= this.elements.length - 1) {
            this.elements = Arrays.copyOf(this.elements, this.elements.length + this.elements.length);
        }

        this.elements[actualSize++] = element;

    }

    public E pop() throws IndexOutOfBoundsException {
        E element = this.elements[actualSize - 1];
        this.elements[actualSize - 1] = null;
        actualSize--;
        return element;
    }
}
