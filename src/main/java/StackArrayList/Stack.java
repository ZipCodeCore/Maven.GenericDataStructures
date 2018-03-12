package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {

    private ArrayList<E> elements;

    public Stack(){
        this.elements = new ArrayList();
    }

    public boolean isEmpty() {
        return this.elements.size() == 0;
    }

    public E pop () throws IndexOutOfBoundsException{
        return this.elements.remove(this.elements.size() - 1);
    }

    public void push(E e) {
        this.elements.add(e);
    }
}