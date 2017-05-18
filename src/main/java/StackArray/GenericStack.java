package StackArray;

import StackArrayList.Stack;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E>  {
    private E[] elements;
    @SuppressWarnings("unchecked")

    public GenericStack() {
        elements= (E[])new Object[0];
    }

    public void push(E item){
        E[] elements2= (E[])new Object[elements.length+1];

        for (int i=0; i< elements.length;i++){
            elements2[i]= elements[i];
        }

       elements2[elements2.length-1]=item;
        elements=elements2;
    }

    public E pop() throws IndexOutOfBoundsException{
        E item= elements[elements.length-1];
        E[] updatedArray= Arrays.copyOf(elements, elements.length-1);

        if(elements.length<1) {
            throw new IndexOutOfBoundsException();
        }

        elements=updatedArray;

        return item;
    }

    public boolean isEmpty(){
       return elements.length== 0;
    }





}
