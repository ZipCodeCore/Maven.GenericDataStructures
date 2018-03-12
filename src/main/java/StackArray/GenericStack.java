package StackArray;

import java.util.Arrays;
import java.util.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

   // GenericStack<String> myStack = new GenericStack<>();

    public GenericStack() {
        elements = (E[]) new Object[0];

        //casting to just an object: (not array)
        // element = (E) new Object;

    }

    public boolean isEmpty() {

        return elements.length==0;

    }

    public void push(E foobar) {
        elements= Arrays.copyOf(elements, elements.length+1);
        elements[elements.length-1] = foobar;
    }


    public E pop() {
        E lastElement = (E) elements[elements.length-1];
        elements=Arrays.copyOf(elements,elements.length-1);
        return lastElement;
    }
}
