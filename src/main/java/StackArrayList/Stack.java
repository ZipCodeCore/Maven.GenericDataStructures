package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements =new ArrayList<>();


    public Stack(){

    }
    public void push(E element){
        elements.add(element);
    }
    public E pop(){
        if(elements.size()!=0) return elements.remove(elements.size()-1);
        else throw new IndexOutOfBoundsException();
    }
    public boolean isEmpty(){
        return elements.isEmpty();
    }
}
