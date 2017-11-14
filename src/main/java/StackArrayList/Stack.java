package StackArrayList;
import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {

    private ArrayList<E> elements;


    public Stack(){

        this.elements = new ArrayList<E>();

    }

    public boolean isEmpty(){
        if (elements.size() == 0){
            return true;
        }
        return false;
    }

    public void push(E element){
        elements.add(element);
    }

    public E pop(){
        if (this.isEmpty()){
            throw new IndexOutOfBoundsException();
        }

        int lastObjectIndex = elements.size()-1;
        E poppedObject = elements.get(lastObjectIndex);
        elements.remove(lastObjectIndex);
        return poppedObject;
    }


}
