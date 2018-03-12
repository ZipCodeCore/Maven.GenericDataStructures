package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements;


    public Stack() {
        this.elements = new ArrayList();
    }


    public boolean isEmpty() {
        return this.elements.size() == 0;
    }


    public void push(E value) {
        this.elements.add(value);
    }


    public E pop() {
        E value = elements.get(elements.size() - 1);
        elements.remove(elements.size() - 1);
        return value;

    }
}


