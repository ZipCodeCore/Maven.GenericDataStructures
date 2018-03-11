package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList elements;


    public Stack() {
        this.elements = new ArrayList<E>();
    }

    public E pop() {
        E lastElement;
        lastElement = (E) elements.get(elements.size() - 1);
        elements.remove(lastElement);
        return lastElement;
    }

    public void push(E elementToAdd) {
        elements.add(elementToAdd);
    }

    public Boolean isEmpty() {
        return elements.size() == 0;
    }
}
