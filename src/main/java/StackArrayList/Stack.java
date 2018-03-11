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

    public E push(E aThing) {
        ArrayList temp = new ArrayList();
        temp.add(aThing);
        temp.addAll(elements);
        elements = temp;
        return (E)elements.get(0);
    }

    public E pop() throws IndexOutOfBoundsException {

        return (E)elements.remove(0);

    }

    public boolean isEmpty() {
        if (elements.size() > 0) {
            return false;
        } else {
            return true;
        }
    }


}
