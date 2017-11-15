package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E>{


    private ArrayList<E> elements = new ArrayList<>();


    public Stack(){ }

    public void push(E e){
        elements.add(0,e);

    }

    public E pop  () {
        if (elements.isEmpty())
            throw new IndexOutOfBoundsException();

           E  e = elements.get(0);
            elements.remove(0);
            return e;
        }

        public boolean isEmpty(){

        return elements.isEmpty();
        }

    public ArrayList<E> getElements() {
        return elements;
    }
}


