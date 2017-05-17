package StackArray;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack() {
        elements = new E[32];
    }

    public boolean isEmpty(){
        if(elements.length==0) return true;
        else return false;
    }

    public void push(E e){
        elements[elements.length] = e;
    }
}
