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
        elements= new Object[0];

    }

    public void push(Object item) {
        elements = Arrays.copyOf(elements, elements.length+1);
        elements[elements.length-1]=item;
        for(Object e : elements){
        }

    }

    public Object pop() throws IndexOutOfBoundsException{
        Object lastElement= elements[elements.length-1];


        if (elements.length==0) {
            throw new IndexOutOfBoundsException();
        }

        elements=Arrays.copyOf(elements, elements.length-1);
        return lastElement;
    }

    public boolean isEmpty(){
        return elements.length==0;
    }

}
