package StackArrayList;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private List<E> elements;


    public Stack() {
        elements = new ArrayList<>();
    }

    public void push(E e) {
        elements.add(e);
    }

    public E pop() {
        return elements.remove(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.size() == 0;
    }
}
