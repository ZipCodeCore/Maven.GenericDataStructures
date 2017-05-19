package StackArray;

import java.util.Arrays;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;
    private int arrayIndexCounter;

    public GenericStack() {
        elements = (E[]) new Object[10];
        arrayIndexCounter = 0;
    }

    public GenericStack(int n) {
        elements = (E[]) new Object[n];
        arrayIndexCounter = 0;
    }

    public int sizeCounter(){
        return arrayIndexCounter;
    }

    public int length(){
        return elements.length;
    }

    void arrayLengthResize(){
        if(arrayIndexCounter == elements.length){
            elements = Arrays.copyOf(elements,arrayIndexCounter + 10 );
        } else if (length() - arrayIndexCounter > 25){
            elements = Arrays.copyOf(elements,length() - 15 );
        }
    }

    public void push(E e){
        arrayLengthResize();
        elements[arrayIndexCounter] = e;
        arrayIndexCounter++;


    }

    public E pop(){
        if (isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        E temp = elements[arrayIndexCounter - 1];
        elements[arrayIndexCounter - 1] = null;
        arrayLengthResize();
        arrayIndexCounter--;
        return temp;

    }

    public boolean isNotEmpty(){
        return !isEmpty();
    }

    public boolean isEmpty(){
       return arrayIndexCounter == 0;
    }
}
