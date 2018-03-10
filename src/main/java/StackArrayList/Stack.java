package StackArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements = new ArrayList();


    public Stack() {

    }

    public boolean isEmpty() {
        return elements.size() == 0;
    }

    public void push(E foobar) {
        elements.add(foobar);
    }

    public E pop() {
        E obj = elements.get(elements.size()-1);
        elements.remove(elements.size()-1);
        return obj;

    }


}
