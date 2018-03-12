package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {

    private ArrayList<E> elements = new ArrayList<>();

    public Stack(){

    }

    public void push(E input) throws IndexOutOfBoundsException{
        elements.add(input);
    }

    public E pop() throws IndexOutOfBoundsException{
        int last = elements.size()-1;
        E  top= elements.get(elements.size()-1);
        elements.remove(last);
        return top;
    }

    public boolean isEmpty() {
        if (elements.size() == 0) return true;
        else return false;
    }

}
