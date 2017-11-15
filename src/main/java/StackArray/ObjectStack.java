package StackArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 *
 * @param <E>
 */
public class ObjectStack<E> {
    private Object[] elements = new Object[0];


    public void push(Object o) {
        if (isEmpty())

            elements = new Object[0];


        ArrayList<Object> arrayList = new ArrayList<>();
        for (Object eachElement : elements)
            arrayList.add(eachElement);

        arrayList.add(o);

        elements = (Object[]) arrayList.toArray();
    }


    public Object pop() {
        if (isEmpty())
            throw new IndexOutOfBoundsException();
        Object o = elements[elements.length - 1];
        ArrayList<Object> arrayList = new ArrayList<Object>(Arrays.asList(elements));
        arrayList.remove(arrayList.size() - 1);
        elements = arrayList.toArray();

        return o;
    }

    public boolean isEmpty() {
        return (elements == null);
    }

    public Object[] getElements() {
        return elements;
    }

}

