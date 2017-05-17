package StackArrayList;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> extends ArrayList<E> {
    private ArrayList elements;

    public void push(E o) {
        add(o);
    }

    public E pop() throws IndexOutOfBoundsException {
        try {
            return remove(size() -1 );
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }

    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Stack(){
        elements = new <E>ArrayList();

    }
}
