package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */

/*E is a placeholder for the type we want to use when we create an instance of this class!!!
    b/c we have element equal an arraylist in the constructor of Stack. Stack will
    automatically have the functionality of an arraylist.
 */

public class Stack<E> {
    private ArrayList<E> elements; //once we create a Stack instance, this arraylist is also instacnietate and ready for us to use!

    public Stack() {
        this.elements = new ArrayList<>();
    }

    public void push(E item) {
        elements.add(item);
    }

    public E pop() {
        if (!isEmpty()) {
            //removes the last element of the ArrayList
            return elements.remove(elements.size() - 1);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public boolean isEmpty() {
        if (elements.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
