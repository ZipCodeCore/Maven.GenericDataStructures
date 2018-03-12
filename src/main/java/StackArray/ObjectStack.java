package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;
    Integer actualSize = 0;
    public ObjectStack() {
        this.elements =  new Object[2];
    }


    public void push(E element) {
        Object[] newArr = Arrays.copyOf(this.elements, this.elements.length + 1);
        newArr[actualSize++] = element;
        this.elements = newArr;

    }

    public boolean isEmpty() {
        return actualSize == 0;
    }

    public Object pop() {
        Object element = this.elements[actualSize - 1];
        this.elements[actualSize - 1] = null;
        actualSize--;
        return element;
    }
}
