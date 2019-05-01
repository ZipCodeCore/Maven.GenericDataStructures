package StackArray;


import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;
    private int size = 0;

    public ObjectStack() {
        elements = new Object[0];
    }
    public void push(E element){
        if(size == elements.length){
            ensureCapacity();
        }
        elements[size++] = element;
    }
    public Object pop(){
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        Object e = elements[--size];
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
