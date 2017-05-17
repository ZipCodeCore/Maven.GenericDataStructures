package StackArray;

import java.util.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> extends Stack<E> {
    private Object[] elements;

    @SuppressWarnings("unchecked")
    public ObjectStack() {
    elements = (E[]) new Object[elements.length];
    }

    public boolean isEmpty(){
        return elements.length == 0;
    }
//
//    public void push(E e){
//
//    }
//
//    public void pop(E e){
//
//    }

}
