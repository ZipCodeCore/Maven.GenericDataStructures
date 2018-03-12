package StackArrayList;

import jdk.nashorn.internal.runtime.regexp.joni.constants.StackType;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements;


    public Stack(){
        this.elements = new ArrayList<>();
    }

    public void push(E element){
       elements.add(element);
    }

    public E pop() throws IndexOutOfBoundsException{
        E result = elements.get(elements.size()-1);
        elements.remove(result);
        return result;
    }

    public boolean isEmpty(){
        if (elements.size() == 0){
            return true;
        }
        return false;
    }
}
