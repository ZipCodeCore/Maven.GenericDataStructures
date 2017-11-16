package StackArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack() {
        elements = new ArrayList<>().toArray();
    }

    public void push(Object e){
        elements  = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length - 1] = e;
    }

    public Object pop(){
        Object elementRemoved = elements[elements.length - 1];
        elements = Arrays.copyOf(elements, elements.length - 1);
        return elementRemoved;

    }

    public boolean isEmpty(){
        return this.elements.length == 0;
    }
}
