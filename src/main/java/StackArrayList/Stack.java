package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList elements;


    public Stack(){
        elements = new ArrayList();
    }

    public E push(E valueToPush) {
        elements.add(valueToPush);
        return valueToPush;
    }

    public E pop() {
        E value = (E) elements.get(elements.size() - 1);
        elements.remove(elements.size() - 1);
        return value;
    }

    public boolean isEmpty() {
        if(elements.size() == 0) {
            return true;
        }
        return false;
    }
}
