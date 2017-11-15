package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    public GenericStack() {
        elements = (E[]) new Object[0];
    }

    public void push(E element) throws IndexOutOfBoundsException{
        resize(1);
        elements[elements.length-1]=element;
    }

    public E pop() throws IndexOutOfBoundsException
    {
        try {
           // if (!isEmpty()) {
                E temp = (E)elements[elements.length - 1];
                resize(-1);

                return (temp);
          //  }
        }catch (IndexOutOfBoundsException e)
        {
            throw e;
        }
    }

    public boolean isEmpty()
    {
        return (elements.length==0);
    }

    private void resize(int i) throws IndexOutOfBoundsException{

        E[] temp = (E[])new Object[elements.length+i];

        int j=0;

        while (j < temp.length && j < elements.length) {
            temp[j] = (E)elements[j];
            j++;
        }

        elements=temp;
    }

}
