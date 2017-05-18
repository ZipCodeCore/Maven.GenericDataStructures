package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {

    private ArrayList<E> elements = new ArrayList<E>();

    public Stack() {}

    public ArrayList<E> getElements() {
        return elements;
    }

    public void push (E element) {
        getElements().add(element);
    }

    public E pop () throws IndexOutOfBoundsException {
        if (getElements().size() == 0) {
            throw new IndexOutOfBoundsException();
        }
        return getElements().remove(getElements().size() - 1);
    }

    public boolean isEmpty() {
        return getElements().size() == 0;
    }



}
