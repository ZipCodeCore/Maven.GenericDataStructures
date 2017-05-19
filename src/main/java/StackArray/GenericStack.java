package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E>
{
    private E[] elements;
    private int count;

    public GenericStack()
    {
        elements = (E[])new Object[10];
        count = 0;
    }

    public void push(E element)
    {
        add(element);
    }

    private void add(E element)
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

    public E pop()
    {
        E element;
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
