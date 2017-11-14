package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack() {
        this.elements = new Object[0];

    }

    public void push(E element){
        Object[] holdingArray = new Object[elements.length+1];

        for(int i=0; i< elements.length; i++){
            holdingArray[i] = elements[i];
        }
        holdingArray[elements.length] = element;
        elements = holdingArray;

    }

    public E pop(){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        E poppedOject = (E) elements[elements.length-1];
        Object[] holdingArray = new Object[elements.length-1];
        for(int i =0; i<elements.length-1;i++){
            holdingArray[i] = elements[i];
        }
        elements = holdingArray;
        return poppedOject;

    }

    public boolean isEmpty(){
        if(elements.length == 0){
            return true;
        }
        return false;
    }
}
