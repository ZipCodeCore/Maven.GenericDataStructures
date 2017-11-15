package StackArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {

    private ArrayList<E> elementsList = new ArrayList<>();
    private E[] elements;

    public GenericStack() {
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
