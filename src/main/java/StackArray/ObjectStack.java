package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements;

    public ObjectStack(int n) {
        this.elements = new Object[n];
    }

    public ObjectStack() {
        this(0);
    }

    public void push(Object jawn){
        this.elements = Arrays.copyOf(this.elements, this.elements.length + 1);
        this.elements[elements.length-1] = jawn;
    }

    public Object pop() throws IndexOutOfBoundsException{
        Object temp = this.elements[this.elements.length-1];
        this.elements = Arrays.copyOf(this.elements, this.elements.length - 1);
        return temp;
    }

    public boolean isEmpty(){
        if (this.elements.length == 0) return true;
        return false;
    }
}
