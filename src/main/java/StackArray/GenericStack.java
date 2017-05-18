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

    @SuppressWarnings("unchecked")
    public GenericStack() {
        elements = (E[]) new Object[0];
    }

    public void push(E e) {
        E[] tempArray = Arrays.copyOf(elements, elements.length+1);
        tempArray[tempArray.length -1] = e;
        elements = tempArray;
    }

    public E pop() throws IndexOutOfBoundsException{
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        E temp =  elements[elements.length -1];
        elements = Arrays.copyOfRange(elements, 0, elements.length -1);
        return temp;
    }

    public boolean isEmpty() {
        return (elements.length < 1);
    }

    /*
    // try using reflection
    public <E> E[] getArray(Class<E> clazz, int size) {
        return (E[]) Array.newInstance(clazz, size);
    }*/
}
