package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;
    private int stackSize;
    private int topStack;

    public GenericStack() {
        tempArray(10);
    }
    private void tempArray(int length){
        this.stackSize = length;
        elements = (E[]) new Object[length];
    }

    public void push(E element){
        if (topStack <= stackSize){
            elements[topStack] = element;
            topStack++;
        }
    }
    public E pop(){
        E element = elements[topStack - 1];
        topStack--;
        return element;
    }
    public boolean isEmpty(){
        if (topStack == 0){
            return true;
        }
        return false;
    }
}
