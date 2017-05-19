package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class ObjectStack<E>
{
    static int count;
    private Object[] elements;

    public ObjectStack()
    {
        elements = new Object[10];
        count = 0;
    }

    public void push(Object element)
    {
        add(element);
    }

    private void add(Object element)
    {
        if(elements.length > count+1)
        {
            elements [count] = element;
        }
        count++;
    }

    public boolean isEmpty()
    {
        if(count <= 0)
            return true;
        else
            return false;
    }

    public Object pop()
    {
        Object element;
        if(isEmpty())
            throw new IndexOutOfBoundsException();
        else
        {
            element = elements [count-1];
        }
        count--;
        return element;
    }
}
