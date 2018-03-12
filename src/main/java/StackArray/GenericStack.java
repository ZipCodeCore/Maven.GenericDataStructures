package StackArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack() {
        this.elements = (E[])new Object[0];
    }

    public void push(E element){
        this.elements = Arrays.copyOf(elements, elements.length+1);
        elements[elements.length-1] = element;
    }

    public E pop() throws IndexOutOfBoundsException{
        E result = elements[elements.length-1];
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
