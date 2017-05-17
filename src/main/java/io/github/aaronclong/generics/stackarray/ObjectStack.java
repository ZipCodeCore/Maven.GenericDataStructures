package io.github.aaronclong.generics.stackarray;

import java.util.Arrays;

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
    elements = new Object[20];
  }

  private void resizeArray() {
    elements = Arrays.copyOf(elements, elements.length * 2);
  }

  public boolean isEmpty() {
    return currentElement == 0;
  }

  private void incrementCurrentElement() {
    currentElement++;
  }

  private void decrementCurrentElement() {
    currentElement--;
  }

  @SuppressWarnings("unchecked")
  public E pop() {
    Object objectBuffer = elements[currentElement - 1];
    decrementCurrentElement();
    return (E) objectBuffer;
  }

  public void push(E element) {
    if (currentElement >= elements.length - 5) {
      resizeArray();
    }
    elements[currentElement] = element;
    incrementCurrentElement();
  }

}
