package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;
    private int stackSize;
    private int topStack;

    public ObjectStack() {
        tempArray(10);
    }
    private void tempArray(Integer length){
        this.stackSize = length;
        elements = new Object[length];
    }
    public void push(Object element){
        if (topStack <= stackSize){
            elements[topStack] = element;
            topStack++;
        }
    }
    public Object pop(){
        Object element = elements[topStack - 1];
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
