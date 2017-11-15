package StackArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    public void push(E element) {
        Object[] temp = new Object[elements.length + 1];
        for(int i = 0; i < elements.length; i++) {
            temp[i] = elements[i];
        }
        temp[elements.length] = element;
        elements = temp;
    }

    public E pop() {
        if(!isEmpty()) {
            E removed = (E) elements[elements.length - 1];
            Object[] temp = new Object[elements.length - 1];
            for(int i = 0; i < temp.length; i++) {
                temp[i] = elements[i];
            }
            elements = temp;
            return removed;
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean isEmpty() {
        return elements.length == 0;
    }
}
