package StackArray;

import java.util.Arrays;
import java.util.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack() {
        this.elements = (E[]) new Object[0];
    }

    public E push(E item) {
        this.elements = Arrays.copyOf(this.elements, this.size()+ 1);
        this.elements[this.size() - 1] = item;
        return item;
    }

    public E pop() {
        E oldValue = this.elements[this.size() -1];
        int numMoved = size() - this.size() - 1;
        if (numMoved > 0)
            System.arraycopy(this.elements, this.size() + 1, this.elements, this.size(),
                    numMoved);
        this.elements = Arrays.copyOf(this.elements, this.size() -1);

        return oldValue;
    }

    public boolean isEmpty() {
        for (E element: this.elements) {
            if (element != null){
                return false;
            }
        }
        return true;
    }

    public int size() {
        return this.elements.length;
    }
}
