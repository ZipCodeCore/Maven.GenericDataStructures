package StackArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack() {
        elements = (E[]) (new ArrayList<E>()).toArray();
    }

    public void push(E element) {
        List<E> temp = new ArrayList<E>();
        for(E e : elements) {
            temp.add(e);
        }
        temp.add(element);
        elements = (E[]) temp.toArray();
    }

    public E pop() {
        if(!isEmpty()) {
            List<E> temp = new ArrayList<E>();
            for(E e : elements) {
                temp.add(e);
            }
            E removed = (E) temp.remove(elements.length - 1);
            elements = (E[]) temp.toArray();
            return removed;
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean isEmpty() {
        return elements.length == 0;
    }
}
