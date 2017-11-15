package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {

    private ArrayList<E> elements;

    public Stack(){
        elements = new ArrayList();
    }

    public void push(E element) {
//        elements.add(null);
//        int listLength = elements.size() - 1;
//        for (int i = listLength; i >= 0; i--) {
//            int toIndex = listLength;
//            E shifter = elements.get(listLength - 1);
//            if(toIndex == 0) {
//                elements.set(toIndex, element);
//            }
//            elements.set(toIndex, shifter);
//        }
        elements.add(element);
    }

    public E pop() {
        E element = elements.get(elements.size() - 1);
        elements.remove(element);
        return element;
    }

    public boolean isEmpty() {
        if(elements.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
