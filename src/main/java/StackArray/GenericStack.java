package StackArray;


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
    elements = (E[]) new Object [0];
    }

    public boolean isEmpty(){
        return elements.length == 0;
    }

    public void push(E e){
        elements = Arrays.copyOf(elements, elements.length + 1);
        elements[elements.length-1] = e;
    }
    @SuppressWarnings("unchecked")
    public E pop() {
        E value = (E) elements[elements.length - 1];
        elements = Arrays.copyOf(elements, elements.length-1);
        return value;

    }
}
