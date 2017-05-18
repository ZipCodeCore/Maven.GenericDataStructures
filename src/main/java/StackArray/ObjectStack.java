package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;
    private int endPlusOne;

    public ObjectStack() {
        elements = new Object[10];
        endPlusOne = 0;
    }

    public void push (Object o){
        if(endPlusOne == elements.length){
            elements = Arrays.copyOf(elements, elements.length);
        }
        elements[endPlusOne] = o;
        endPlusOne++;
    }

    public Object pop(){
        endPlusOne--;
        return elements[endPlusOne];
    }

    public boolean isEmpty(){
        return endPlusOne == 0;
    }
}
