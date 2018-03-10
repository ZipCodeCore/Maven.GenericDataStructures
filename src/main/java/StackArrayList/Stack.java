package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements;
    // private Object the;

    public Stack() {
        elements = new ArrayList();
    }

    // pushes the object to top of stack. works like add method but to the front instead of end
    public void push(E item) {
        int index = 0;
        elements.add(index, item);
    }

    public boolean isEmpty() {
        return elements.size() == 0;
    }

    public E pop()throws IndexOutOfBoundsException {
       if(elements.isEmpty()) throw new IndexOutOfBoundsException("this list is empty");
        int index = 0;
        E removedObject = elements.get(0);
        elements.remove(index);
        return removedObject;
    }




}
