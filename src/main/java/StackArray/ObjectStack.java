package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;
    private int size;

    public ObjectStack() {
        this.elements = new Object[0];
    }

    public boolean isEmpty() {
        return size==0;
    }

    public Object push(Object foobar) { //push onto to the top of the stack which is the end
        this.elements = Arrays.copyOf(this.elements,this.elements.length + 1);
        this.elements[this.elements.length - 1] = foobar; //capacity of array not size
        size++;
        return foobar;
    }

    public Object pop() { //remove object at the top of the stack
        Object thingy = this.elements[elements.length - 1]; //capacity of array not size
        this.elements = Arrays.copyOf(this.elements,this.elements.length - 1);
        size--; //
        return thingy;
    }
}
