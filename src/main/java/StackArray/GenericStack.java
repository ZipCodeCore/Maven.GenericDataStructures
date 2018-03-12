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

    public GenericStack() {
        this.elements = (E[]) new Object[0];
    }


    public void push(E value) {
        E[] newArray = Arrays.copyOf(elements, elements.length + 1);
        newArray[newArray.length - 1] = value;
        this.elements = newArray;
    }


    public E pop() {
        E value = elements[elements.length - 1];
        E[] newArray = Arrays.copyOf(elements, elements.length - 1);
        this.elements = newArray;
        return value;

    }


    public boolean isEmpty() {
        if (elements.length == 0) {
            return true;
        }
        return false;
    }
}
