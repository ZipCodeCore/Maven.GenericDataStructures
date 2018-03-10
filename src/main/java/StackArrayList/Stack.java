package StackArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements;


    public Stack(){
        this.elements = new ArrayList<E>();
    }

    public E pop(){
        return this.elements.remove(this.elements.size() - 1);
    }

    public void push(E item){
        this.elements.add(item);
    }

    public boolean isEmpty(){
        return (elements.size()==(0));
    }

}
