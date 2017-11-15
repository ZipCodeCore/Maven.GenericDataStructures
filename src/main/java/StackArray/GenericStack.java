package StackArray;

import StackArrayList.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;
    private Stack<E> stack;

    public GenericStack() {
        stack = new Stack<>();
        elements = (E[]) stack.getElements().toArray();
    }

    public void push(E elementToAdd) {
        stack.push(elementToAdd);
        elements = (E[]) stack.getElements().toArray();
    }

    public E pop() {
        E element = stack.pop();
        elements = (E[]) stack.getElements().toArray();
        return element;
    }

    public boolean isEmpty() {
        if (elements.length == 0) {
            return true;
        }
        return false;
    }
}
