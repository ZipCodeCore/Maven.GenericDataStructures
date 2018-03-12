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

    public void push(E value){
        //pushes adds an element
        this.elements.add(value);
    }

    public E pop(){
        //removes an element
        return (E) elements.remove(this.elements.size()-1);
    }

    public boolean isEmpty(){
        //Checks to see is the elements array is empty, if its equal to 0 its empty.
        return (elements.size()==0);
    }

    public E pop() {
        return (E) this.elements;
    }
}
