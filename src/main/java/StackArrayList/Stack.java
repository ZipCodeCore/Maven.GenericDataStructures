package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements;

    public Stack(){
        elements = new ArrayList<>();
    }

    public void push(E e){
        elements.add(0, e);
    }

    public E pop(){
        return elements.remove(0);
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }

}
