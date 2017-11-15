package StackArray;
import java.util.ArrayList;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {

    private E[] elements;

    public GenericStack(E[] elements) {
        this.elements = elements;
    }

    public GenericStack() {
        this.elements = null;
    }


    public void push(E element){
        if(elements == null) {
            ArrayList<E> arrayToCast = new ArrayList<>();
            arrayToCast.add(element);
            elements = (E[]) arrayToCast.toArray();

        }else{
            ArrayList<E> holdingArray = new ArrayList<>();
            for(E eachElement: elements){
                holdingArray.add(eachElement);
            }holdingArray.add(element);
            elements = (E[]) holdingArray.toArray();
        }


    }

    public E pop(){
        if(elements == null){
            throw new IndexOutOfBoundsException();
        }
        ArrayList<E> holdingArray = new ArrayList<>();
        for(E eachElement: elements){
            holdingArray.add(eachElement);
        }
        E poppedObject = holdingArray.get(holdingArray.size()-1);
        holdingArray.remove(holdingArray.size()-1);
        elements = (E[]) holdingArray.toArray();

        return poppedObject;

    }

    public boolean isEmpty(){
        if(elements == null){
            return true;
        }
        return false;
    }


}

