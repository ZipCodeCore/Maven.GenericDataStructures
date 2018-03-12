package StackArrayList;

import java.util.ArrayList;

/**
 * Implement Stack<E> by adding the push, pop, and isEmpty functions.  It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 */
public class Stack<E> {

    //DONT FORGET TO INITIALIZE TO AVOID NULL POINTER EXCEPTIONS!!!

    private ArrayList <E> elements = new ArrayList<>();

    public Stack(){
    }

    public Stack(ArrayList elements) {
        this.elements = elements;
    }

    public void push(E item){

        elements.add(item);

    }

    public E pop(){

        E last = elements.get(elements.size()-1);

        elements.remove(elements.size()-1);

        return last;
    }

    public boolean isEmpty(){

        if(elements.size() == 0) {
            return true;
        }else
            return false;
        }

    }
