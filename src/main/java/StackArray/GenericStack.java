package StackArray;

import java.lang.reflect.Array;
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

    public void push(E element) {
        E[] newArr = Arrays.copyOf(this.elements, this.elements.length + 1);
        newArr[actualSize++] = element;
        this.elements = newArr;

    }

    public boolean isEmpty() {
        return actualSize == 0;
    }

    public E pop() {
        E element = this.elements[actualSize - 1];
        this.elements[actualSize - 1] = null;
        actualSize--;
        return element;
    }
}
