package StackArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {

    private E[] elements = (E[]) new Object[10];
    int size = 0;


    public GenericStack() {
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

        E last = elements[size-1];
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
