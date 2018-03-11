package StackArray;


import java.util.ArrayList;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {

    private E[] elements = (E[]) new Object[0];

    GenericStack() {

    }

    public void push(E e) throws IndexOutOfBoundsException{
        int newLength = elements.length +1;
        E[] newArray = Arrays.copyOf(elements, newLength);
        newArray[newArray.length -1] = e;
        elements = newArray;

    }

    public E pop() {
        int last = elements.length-1;
        E  poppedElement= elements[last];
        E[] newArray = Arrays.copyOf(elements, last);
        elements = newArray;
        return poppedElement;
    }

    public boolean isEmpty() {
        return elements.length == 0;
    }


}
