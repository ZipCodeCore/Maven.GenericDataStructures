package StackArray;


import java.util.Arrays;
import java.lang.*;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack() {
        this.elements = (E[]) new Object[0];
    }

    public void push(E object){
        elements = Arrays.copyOf(elements, elements.length+1);
        elements[elements.length-1] = object;
    }

    public E pop(){
        E object = elements[elements.length-1];
        elements = Arrays.copyOf(elements, elements.length-1);
        return object;
    }

    public boolean isEmpty(){
        if(elements.length == 0) return true;
        else return false;
    }
}
