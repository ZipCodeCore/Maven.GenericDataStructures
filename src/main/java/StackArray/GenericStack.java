package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack(int n) {
        this.elements = (E[]) new Object[n];
    }

    public GenericStack() {
        this(0);
    }

    public void push(E jawn){
        this.elements = Arrays.copyOf(this.elements, this.elements.length + 1);
        this.elements[elements.length-1] = jawn;
    }

    public E pop() throws IndexOutOfBoundsException{
        E temp = this.elements[this.elements.length-1];
        this.elements = Arrays.copyOf(this.elements, this.elements.length - 1);
        return temp;
    }

    public boolean isEmpty(){
        if (this.elements.length == 0) return true;
        return false;
    }
}
