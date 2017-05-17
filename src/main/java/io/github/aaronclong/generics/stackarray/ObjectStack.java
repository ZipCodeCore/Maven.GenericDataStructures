package io.github.aaronclong.generics.stackarray;

/**
 * Expand the ArrayList implementation of stack here to use an Object[] array.
 * Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E> generic
 */
public class ObjectStack<E> {
  private Object[] elements;
  private int currentElement;

  public ObjectStack() {
    elements = 
  }

  public boolean isEmpty() {
    return currentElement == 0;
  }


}
