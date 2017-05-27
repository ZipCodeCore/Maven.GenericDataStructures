package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;
    private int endOfArray;

    public ObjectStack() {

        elements =new Object[10];
        endOfArray=0;

    }

    public void push(Object item){
        if(endOfArray==elements.length){
            elements =Arrays.copyOf(elements,elements.length);
        }
        elements[endOfArray]= item;
        endOfArray++;
    }

    public Object pop(){
        endOfArray--;
        return elements[endOfArray];
    }

    public boolean isEmpty(){

        return endOfArray==0;
    }
}
