package io.github.aaronclong.generics.stackarraylist;

import java.util.ArrayList;

/**
 * Implement Stack by adding the push, pop, and isEmpty functions.
 * It must pass the prewritten unit tests.
 * If you pop on an empty stack, throw an IndexOutOfBoundsException.
 * @param <E> generic
 */
public class Stack<E> {

  private ArrayList<E> elements;

  public Stack() {
    elements = new ArrayList<>();
  }

  public void push(E e) {
    elements.add(e);
  }

  public E pop() {
    int lastElement = elements.size() - 1;
    return elements.remove(lastElement);
  }

  public boolean isEmpty() {
    return elements.isEmpty();
  }
}
