package StackArray;

import StackArrayList.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;
    private Stack<E> aStack;

    public GenericStack() {
        aStack = new Stack<>();
        elements = (E[]) aStack.getElements().toArray();
    }

    public void push(E element) {
        aStack.push(element);
        elements = (E[]) aStack.getElements().toArray();
    }

    public E pop() {
        int lastIndex = aStack.getElements().size()-1;
        E lastElement = aStack.getElements().get(lastIndex);
        aStack.getElements().remove(lastIndex);
        return lastElement;
    }

    public boolean isEmpty() {
        if (elements.length == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
