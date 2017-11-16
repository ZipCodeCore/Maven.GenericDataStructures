package StackArray;

import StackArrayList.Stack;

import java.lang.reflect.Array;
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
        elements = (E[]) new ArrayList<E>().toArray();
    }

    public void push(E element){
//        E[] elementsCopy = (E[]) new ArrayList<>(elements.length + 1).toArray();
//        System.arraycopy(elements, 0, elementsCopy, 0, elements.length);
//        elementsCopy[elementsCopy.length] = element;
//        System.arraycopy(elementsCopy, 0, elements, 0, elementsCopy.length);
        elements = Arrays.copyOf(elements, elements.length+1);
        elements[elements.length-1] = element;
    }

    public E pop() throws IndexOutOfBoundsException{
//        E elementToReturn = elements[elements.length-1];
//        E[] elementsCopy = (E[]) new ArrayList<>().toArray();
//        System.arraycopy(elements, 0, elementsCopy, 0, elements.length-2);
//        System.arraycopy(elementsCopy, 0, elements, 0, elementsCopy.length-1);
        E returnElement = elements[elements.length-1];
        elements = Arrays.copyOf(elements, elements.length-1);
        return returnElement;
    }

    public boolean isEmpty(){
        if(elements.length == 0){
            return true;
        }
        return false;
    }
}
