package StackArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private ArrayList<E> elementsList = new ArrayList<>();
    private Object[] elements;

    public ObjectStack() {
        elements = (E[]) elementsList.toArray();
    }

    public void push(E e) {
        elementsList.add(e);
        this.elements = (E[]) elementsList.toArray();
    }

    public E pop() {
        return elementsList.remove(elementsList.size()-1);
    }

    public boolean isEmpty() {
        return (this.elements.length == 0);

    }
}
