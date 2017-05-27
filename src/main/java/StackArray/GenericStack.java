package StackArray;

import java.util.Arrays;
import java.util.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {

    private E[] elements;
    private int endOfArray;


    @SuppressWarnings("unchecked")

    public GenericStack() {

        elements =(E []) new Object[0]; //instantiates a generic array
        endOfArray=-1;
    }
    public void push(E item){
        E[] secondElementArray = (E[])new Object [elements.length + 1];

        for (int i=0; i <elements.length;i++){
            secondElementArray[i] =elements [i];
        }

        secondElementArray[secondElementArray.length-1]= item;
        elements = secondElementArray;
        endOfArray++;
    }

    public E pop(){
            if (endOfArray==-1){
                throw new IndexOutOfBoundsException();
            }
            E result = elements[endOfArray];
            endOfArray--;
            elements =Arrays.copyOfRange(elements,0,elements.length);
            return result;

    }

    public boolean isEmpty(){

        return elements.length==0;
    }


}
