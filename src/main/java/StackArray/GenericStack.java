package StackArray;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

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

    public E pop() {
        E popValue = elements[elements.length -1];
        elements = Arrays.copyOf(elements, elements.length-1);
        return popValue;
    }

    public void push( E obj) {
       elements =Arrays.copyOf(elements,elements.length +1);
            elements[elements.length-1] = obj;


    }

    public boolean isEmpty() {
        for (E obj: elements)
        { if (!obj.equals(null))
            return false;
        }
        return true;
    }

}
