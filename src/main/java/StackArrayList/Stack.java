package StackArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {

    private ArrayList elements;

    public Stack() {
        this.elements = new ArrayList();
    }

    public E push(E element) {
        this.elements.add(element);
        return element;
    }

    public boolean isEmpty() {
        return this.elements.isEmpty();
    }

    public E pop() throws IndexOutOfBoundsException {
        Collections.reverse(this.elements);
        E element = (E) this.elements.remove(0);
        return element;
    }
}
