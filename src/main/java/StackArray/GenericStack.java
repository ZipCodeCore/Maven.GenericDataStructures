package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;
    private int size = 0;

    public GenericStack() {
        elements = (E[]) new Object[0];
    }
    public void push(E element){
        if(size == elements.length){
           ensureCapacity();
       }
        elements[size++] = element;
    }
    public E pop(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        E e = elements[--size];
        elements[size] = null;
        return e;
    }
    public boolean isEmpty(){
        if(elements.length == 0){
            return true;
        }
        return false;
    }

    private void ensureCapacity(){
        int newSize = elements.length + 1;
        elements = Arrays.copyOf(elements, newSize);
    }
}
