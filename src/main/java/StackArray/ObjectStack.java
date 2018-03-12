package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {

    private Object[] elements = new Object[0];

    ObjectStack() {

    }

    public void push(Object o) throws IndexOutOfBoundsException{
        int newLength = elements.length +1;
        Object[] newArray = Arrays.copyOf(elements, newLength);
        newArray[newArray.length -1] = o;
        elements = newArray;
    }

    public E pop() throws IndexOutOfBoundsException{
        int last = elements.length-1;
        E poppedElement= (E) elements[last];
        Object[] newArray = Arrays.copyOf(elements, last);
        elements = newArray;
        return poppedElement;
    }

    public boolean isEmpty() throws IndexOutOfBoundsException{
        return this.elements.length == 0;
    }


}
