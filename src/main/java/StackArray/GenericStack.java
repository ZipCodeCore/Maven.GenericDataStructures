package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements = (E[]) new Object[2];
    private int size = 0;

    public GenericStack() {
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(E foobar) {
        if(elements.length == size){
            elements = Arrays.copyOf(elements, size+5);
        }
        elements[size]= foobar;
        size++;
    }

    public E pop() {
        E obj = elements[size-1];
        elements[size-1]= null;
        size--;
        return obj;
    }
}
