package StackArray;

import StackArrayList.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 *
 * @param <E>
 */
public class ObjectStack<E> extends Stack<E> {
    private Object[] elements;

    public ObjectStack() {
    }
}
