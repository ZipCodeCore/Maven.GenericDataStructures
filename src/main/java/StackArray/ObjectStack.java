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
        this.elements = new Object[0];
    }

    public Object push(Object item) {
        this.elements = Arrays.copyOf(this.elements, this.size()+ 1);
        this.elements[this.size() - 1] = item;
        return item;
    }

    public Object pop() {
        Object oldValue = this.elements[this.size() -1];
        int numMoved = size() - this.size() - 1;
        if (numMoved > 0)
            System.arraycopy(this.elements, this.size() + 1, this.elements, this.size(),
                    numMoved);
        this.elements = Arrays.copyOf(this.elements, this.size() -1);

        return oldValue;
    }

    public boolean isEmpty() {
        for(Object element: this.elements) {
            if (element != null) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        return this.elements.length;
    }
}
