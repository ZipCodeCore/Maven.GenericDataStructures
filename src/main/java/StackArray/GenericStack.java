package StackArray;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> {
    private E[] elements;

    @SuppressWarnings("unchecked")
    public GenericStack() {
        elements = (E[]) new Object[0];
    }

    public boolean isEmpty(){
        return elements.length == 0;
    }

    public void push(E e){
        expandElementsByOne();
        elements[elements.length-1] = e;
    }

    @SuppressWarnings("unchecked")
    private void expandElementsByOne(){
        E[] elementsClone = elements.clone();
        elements = (E[]) new Object[elements.length+1];
        for(int i = 0; i < elementsClone.length; i++){
            elements[i] = elementsClone[i];
        }
    }

    public E pop() {
        E e = elements[elements.length - 1];
        removeLastElement();
        return e;
    }

    @SuppressWarnings("unchecked")
    private void removeLastElement() {
        E[] elementsClone = elements.clone();
        elements = (E[]) new Object[elements.length - 1];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = elementsClone[i];
        }
    }
}
