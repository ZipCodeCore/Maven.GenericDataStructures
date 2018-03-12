package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack() {
        this.elements = (E[]) new Object[0];
    }

    public E push(E item) {
        E[] newArray = Arrays.copyOf(this.elements, this.elements.length + 1);
        newArray[newArray.length - 1] = item;
        this.elements = newArray;
        return item;
    }

    public E pop() {
        E item = this.elements[this.elements.length - 1];
        E[] newArray = Arrays.copyOf(this.elements, this.elements.length - 1);
        this.elements = newArray;
        return item;
    }

    public boolean isEmpty() {
        if (this.elements.length == 0) {
            return true;
        } else {
            return false;
        }
    }
}
