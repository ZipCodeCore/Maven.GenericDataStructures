package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack() {
        this.elements = new Object[0];
    }

    public void push(E element){
        this.elements = Arrays.copyOf(elements, elements.length+1);
        elements[elements.length-1] = element;
    }

    public Object pop() throws IndexOutOfBoundsException{
        Object result = elements[elements.length-1];
        this.elements = Arrays.copyOf(elements, elements.length-1);
        return result;
    }

    public boolean isEmpty(){
        if(elements.length == 0){
            return true;
        }
        return false;
    }
}
