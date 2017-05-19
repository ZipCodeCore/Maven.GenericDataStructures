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
        elements = new Object[0];
    }

    public void push(Object o){
        elements = Arrays.copyOf(elements, elements.length+1);
        elements[elements.length-1] = o;
    }

    public Object pop() throws IndexOutOfBoundsException{
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        Object o = elements[elements.length-1];
        elements = Arrays.copyOfRange(elements, 0, elements.length-1);
        return o;
    }

    public boolean isEmpty(){
        return elements.length < 1;
    }
}
