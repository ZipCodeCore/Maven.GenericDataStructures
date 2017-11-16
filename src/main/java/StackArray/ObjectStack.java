package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements = new Object[0];

    public ObjectStack() {

    }
    public void push(Object obj){
        elements = Arrays.copyOf(elements,elements.length+1);
        elements[elements.length-1] = obj;
    }
    public Object pop(){
        Object temp = elements[elements.length-1];
        elements = Arrays.copyOf(elements,elements.length-1);
        return temp;
    }
    public boolean isEmpty(){
        return elements.length == 0;
    }
}
