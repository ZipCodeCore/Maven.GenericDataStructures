package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 *
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack() {
        elements = new Object[0];
    }

    public boolean isEmpty() {
        return elements.length == 0;
    }

    public void push(E e) {
        expandElementsByOne();
        elements[elements.length - 1] = e;
    }

    private void expandElementsByOne() {
        Object[] elementsClone = elements.clone();
        elements = new Object[elements.length + 1];
        for (int i = 0; i < elementsClone.length; i++) {
            elements[i] = elementsClone[i];
        }
    }

    public Object pop() {
        Object o = elements[elements.length - 1];
        removeLastElement();
        return o;
    }

    @SuppressWarnings("unchecked")
    private void removeLastElement() {
        Object[] elementsClone = elements.clone();
        elements = new Object[elements.length - 1];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = elementsClone[i];
        }
    }

}
