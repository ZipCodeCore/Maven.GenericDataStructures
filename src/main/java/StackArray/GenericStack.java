package StackArray;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public void push(E o) {


        Object[] newArr = new Object[elements.length+1];
        System.arraycopy(elements, 0, newArr, 0, elements.length);
        newArr[elements.length] = o;
        elements = (E[])newArr;
    }

    public E pop() throws IndexOutOfBoundsException {

            E result = elements[elements.length - 1];
            elements = Arrays.copyOf(elements, elements.length-1);
            return result;

    }

        public boolean isEmpty() {
            return elements.length == 0;
    }

    public GenericStack() {
        elements = (E[]) new Object[0];
    }
}
