package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {

    private Object[] elements = new Object[10];
    int size = 0;

    public ObjectStack() {

    }

    public void push(E item) {

        if (elements.length == size) {
            elements = Arrays.copyOf(elements, elements.length + 5);
        } else {
            elements[size] = item;
            size++;
        }
    }

    public E pop() {

        E last = (E) elements[size-1];
        elements[size -1] = null;
        size --;
        return last;
    }

    public boolean isEmpty(){

        if(size == 0) {
            return true;
        }else
            return false;
    }
}
