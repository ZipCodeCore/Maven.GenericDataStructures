package StackArrayList;


import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> extends ArrayList {

    private ArrayList<E> stack = new ArrayList<>();


    public Stack(){
        ArrayList<E> stack = new ArrayList<>();
    }

    public E push(E e){
        stack.add(e);
        return e;
    }

    public boolean isEmpty(){
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public E pop()  {

        if (!isEmpty()) {
            E value = (E) stack.remove(stack.size() - 1);
            return value;
        } else {
            throw new IndexOutOfBoundsException();
        }



    }

}
