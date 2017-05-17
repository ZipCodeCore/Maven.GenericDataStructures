package StackArray;

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

    public boolean isEmpty(){
        if(elements.length==0) return true;
        else return false;
    }

    public void push(E e){
        expandElementsByOne();
        elements[elements.length-1] = e;
    }

    private void expandElementsByOne(){
        E[] elementsClone = elements.clone();
        elements = (E[]) new Object[elements.length+1];
        for(int i = 0; i < elementsClone.length; i++){
            elements[i] = elementsClone[i];
        }
    }

    public E pop(){
        E e = elements[elements.length -1];
        removeLastElement();
        return e;
    }

    private void removeLastElement(){
        E[] elementsClone = elements.clone();
        elements = (E[]) new Object[elements.length-1];
        for(int i = 0; i < elements.length; i++){
            elements[i] = elementsClone[i];
        }
    }
}
