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
    //the way stacks work, its just like generics accept you are using Objects
    public Object push(Object value){
        Object[] newArray = Arrays.copyOf(this.elements, this.elements.length + 1);
        newArray[newArray.length-1] = value;
        this.elements = newArray;
        return value;
    }

    public Object pop(){
        Object value = this.elements[elements.length-1];
        Object[] newArray = Arrays.copyOf(elements, elements.length - 1);
        //newArray[newArray.length-1] = value;
        this.elements = newArray;
        return value;
    }

    public boolean isEmpty(){
        return(elements.length==0);
    }
}
