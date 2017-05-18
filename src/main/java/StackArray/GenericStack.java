package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 *
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;
    private int topOfStack;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        elements = (E[]) new Object[10];
        topOfStack = 0;
    }

    public void push(E e) {
        if (topOfStack == elements.length)
            elements = Arrays.copyOf(elements, elements.length + 10);
        elements[topOfStack++] = e;
    }

    public E pop() {
        if (topOfStack < elements.length / 2)
            elements = Arrays.copyOfRange(elements, 0, topOfStack);
        return elements[--topOfStack];
    }

    public boolean isEmpty() {
        return topOfStack == 0;
    }

}
