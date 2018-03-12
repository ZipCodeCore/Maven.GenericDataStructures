package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {

    private ArrayList elements;


    public Stack(){
        this.elements = new ArrayList();
    }

    public boolean isEmpty() {
        boolean answer = false;
        answer = elements.size()==0;

        return answer;
    }

    public void push(E foobar) {
        elements.add(foobar);

    }

    public E pop() {
        E lastElement = (E) elements.get(elements.size()-1);
        elements.remove(elements.size()-1);
        return lastElement;
    }
}
