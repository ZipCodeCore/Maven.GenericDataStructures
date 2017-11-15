package StackArray;

import java.util.Arrays;
import java.util.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;
    private Stack<E> aStack;

    public ObjectStack() {
        aStack = new Stack<>();
        elements = aStack.toArray();
    }

    public void push(E element) {
        aStack.push(element);
        elements = aStack.toArray();
    }

    public E pop() {
        int lastIndex = aStack.size()-1;
        E lastElement = aStack.get(lastIndex);
        aStack.remove(lastElement);
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
