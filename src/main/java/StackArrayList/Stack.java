package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {


    private ArrayList<E> elements;


    public Stack(){
        this.elements = new ArrayList<E>();
    }

    public ArrayList getElements() {
        return elements;
    }

    public void push(E item){
        elements.add(item);
    }

    public E pop(){
        return elements.remove(elements.size()-1);
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }

}
