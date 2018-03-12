package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;
    private int size; //actual number of things as opposed to length

    public GenericStack() {
        this.elements = (E[]) new Object[0];
    }

    public boolean isEmpty() {
        return size==0;
    }

    public E push(E foobar) { //push onto to the top of the stack which is the end
        this.elements = Arrays.copyOf(this.elements,this.elements.length + 1);
        this.elements[this.elements.length - 1] = foobar; //capacity of array not size
        size++;
        return foobar;
    }

    public E pop() { //remove object at the top of the stack
        E thingy = this.elements[elements.length - 1]; //capacity of array not size
        this.elements = Arrays.copyOf(this.elements,this.elements.length - 1);
        size--; //
        return thingy;
    }
}
