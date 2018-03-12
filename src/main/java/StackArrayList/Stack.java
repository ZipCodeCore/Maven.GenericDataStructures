package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList elements;

    public Stack(){
        this.elements = new ArrayList<E>();
    }

    public E push(E item) {
        this.elements.add(item);
        return item;
    }

    public E pop() {
        return (E) this.elements.remove(elements.size() - 1);
    }

    public boolean isEmpty() {
        if (this.elements.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
