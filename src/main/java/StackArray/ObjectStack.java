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
        this.elements = new Object[0];
    }
    public Object push(Object item) {
        Object[] newArray = Arrays.copyOf(this.elements, this.elements.length + 1);
        newArray[newArray.length - 1] = item;
        this.elements = newArray;
        return item;
    }

    public Object pop() {
        Object item = this.elements[this.elements.length - 1];
        Object[] newArray = Arrays.copyOf(this.elements, this.elements.length - 1);
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
