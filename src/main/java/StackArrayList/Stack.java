package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements = new ArrayList<>();


    public Stack() {

    }

    public void push(E e) {
        this.elements.add(e);
    }

    public E pop() {
        if (this.elements.isEmpty())
            throw new IndexOutOfBoundsException();
        return this.elements.remove(elements.size() - 1);
    }

    public boolean isEmpty() {
        return (this.elements.size() == 0);
    }

}
