package StackArray;

import StackArrayList.Stack;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements = (E[])new Object[0];


    public GenericStack(E[] elements) {
        this.elements = elements;
    }

    public GenericStack(){
        this(null);
    }

    public void push(E e) {
        if (isEmpty())

            elements = (E[])new Object[0];


        ArrayList<E> arrayList = new ArrayList<>();
        for (E eachElement : elements)
            arrayList.add(eachElement);

        arrayList.add(e);

        elements = (E[]) arrayList.toArray();
    }



    public E pop  () {
        if (isEmpty())
            throw new IndexOutOfBoundsException();
        E e= elements[elements.length-1] ;
        ArrayList<E> arrayList = new ArrayList<E>(Arrays.asList(elements));
        arrayList.remove(arrayList.size()-1);
        elements= (E[])arrayList.toArray();

        return e;
    }

    public boolean isEmpty(){
        return (elements==null);
    }

    public E[] getElements() {
        return elements;
    }
}
