package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {
    private ArrayList<E> elements;


    public Stack() {
        this.elements = new ArrayList();
    }

    public boolean isEmpty() {//if the array is empty return true otherwise return false
        if (elements.size() == 0) return true;
        else return false;
    }

    //@SuppressWarnings("unchecked")
    public void push(E foobar) {
        elements.add(foobar);
    }

    //@SuppressWarnings("unchecked")
    public E pop() {
            return elements.remove(elements.size()-1);
        }
    }
