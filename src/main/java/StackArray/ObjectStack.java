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

    public E push(E valueToPush) {
        E[] newArray = (E[]) Arrays.copyOf(elements, elements.length + 1);
        newArray[newArray.length - 1] = valueToPush;
        this.elements = newArray;

        return valueToPush;
    }

    public Object pop() {
        Object value = elements[elements.length -1];

        E[] newArray = (E[]) Arrays.copyOf(elements, elements.length - 1);
        this.elements = newArray;
        return value;
    }

    public boolean isEmpty() {
        if(elements.length == 0) {
            return true;
        }
        return false;
    }
}
