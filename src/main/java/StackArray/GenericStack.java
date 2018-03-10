package StackArray;

import java.util.Arrays;
import java.util.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 *
 * @param <E>
 */
public class GenericStack<E> {
    private static int DEFAULT_SIZE = 10;
    private E[] elements;
    private int size;
    private int numberOfNulls;

    public GenericStack() {
        this.elements = (E[]) new Object[DEFAULT_SIZE];
        this.size = 0;
        this.numberOfNulls = 0;
    }

    public void push(E object) {
        add(object);
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public E pop() throws IndexOutOfBoundsException {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("this list is empty");
        }
        return remove();
    }


    public boolean add(E object) {
        ensureCapasity(size + 1);
        this.elements[size++] = object;
        //size++;
        return true;
    }

    public int indexOf(E theObject) {
        for (int i = 0; i < size; i++) {
            if (theObject.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    public void shift(int index) {
        E theObject = null;
        for (int i = index; i < size; i++) {
            theObject = elements[i];
            if (elements[i + 1] != null)
                elements[i + 1] = theObject;
        }
    }

    public void ensureCapasity(int size) {
        if (size - elements.length > 0) {
            grow();
        }
    }

    public void grow() {
        int newCapasity = elements.length + DEFAULT_SIZE;
        Arrays.copyOf(elements, newCapasity);
    }

    public E remove() {
        E removedObject = elements[size -1];
        elements[size -1] = null;
        //numberOfNulls++;
        //checkToResize(numberOfNulls);
        size--;
        return removedObject;
    }

    public void checkToResize(int theNumber) {
        int length = elements.length - DEFAULT_SIZE;
        if (length > 10 && theNumber == 10) {
            resize(length);
        }
    }

    public void resize(int minLength) {
        elements = Arrays.copyOf(elements, minLength);
    }


}
