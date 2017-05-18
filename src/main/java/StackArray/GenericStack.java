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

        elements = (E[]) new Object[0];

    }


    public void push(E unit) {

        E[] newArray = Arrays.copyOf(elements, elements.length+1);

        newArray[newArray.length-1] = unit;

        elements = newArray;

    }

    @SuppressWarnings("unchecked")
    public E pop () throws IndexOutOfBoundsException{


        if (elements.length == 0){
            throw new IndexOutOfBoundsException();
        }

        E[] newArray = Arrays.copyOf(elements, elements.length-1);
        elements = newArray;

        return (E) elements;

    }

    public boolean isEmpty(){
        
        return this.elements.length == 0;
    }

}
