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
        this.elements = (E[]) new Object[0];
    }

    public E push(E value){
        //needs to remove an element from E[] and resize
        //now I just need to push the value onto the end of the array
        E[] newArray = Arrays.copyOf(this.elements, this.elements.length + 1);
        newArray[newArray.length-1] = value;
        this.elements = newArray;
        return value;

    }

    public E pop(){
        //according to the api, pop should return a value
        //didn't need to assign the value
        E value = this.elements[elements.length-1];
        E[] newArray = Arrays.copyOf(elements, elements.length - 1);
        //newArray[newArray.length-1] = value;
        this.elements = newArray;
        return value;
    }

    public boolean isEmpty(){
        return (elements.length==0);

    }
}
