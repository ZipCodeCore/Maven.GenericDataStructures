package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;
    private int top;
    private final static int DEFAULT_SIZE = 10;

    public ObjectStack() {
        this(DEFAULT_SIZE);
    }


    public ObjectStack(int initSize)
    {
        elements = (E[]) new Object [initSize];
        top = -1;
    }


    public E pop() throws IndexOutOfBoundsException{
        if (top == -1)
            throw new IndexOutOfBoundsException();
        return (E) elements[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(E e) {
        elements[++top] = e;
    }
}

