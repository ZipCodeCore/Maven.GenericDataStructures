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

        elements = new Object[0];
    }


    public void push(E unit) {

        elements = Arrays.copyOf(elements, elements.length +1);
        elements[elements.length -1] = unit;

    }

    @SuppressWarnings("unchecked")
    public E pop () throws IndexOutOfBoundsException{

        if (elements.length == 0){
            throw new IndexOutOfBoundsException();
        }

        Object lastElement = elements[elements.length-1];

        elements = Arrays.copyOf(elements, elements.length -1);

        return (E)lastElement;

    }

    public boolean isEmpty(){

        return this.elements.length == 0;
    }

}
