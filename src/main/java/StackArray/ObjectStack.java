package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements= new Object[0];

    public ObjectStack() {

    }
    public void push(Object element){
        elements= Arrays.copyOf(elements,elements.length+1);
        elements[elements.length-1]=element;
    }
    public Object pop(){
        if(elements.length != 0) {
            Object last = elements[elements.length-1];
            elements = Arrays.copyOf(elements, elements.length - 1);
            return last;
        } else throw new IndexOutOfBoundsException();
    }
    public boolean isEmpty(){
        return elements.length==0;
    }
}
