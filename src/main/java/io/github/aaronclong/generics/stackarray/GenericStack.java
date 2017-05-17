package io.github.aaronclong.generics.stackarray;

import java.lang.reflect.Array;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.
 * Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E> the generic
 */
public class GenericStack<E> {
  private E[] elements;
  private int length;
  private int currentIndex;

  public GenericStack() {
    elements = sizeArray(20);
  }

  @SuppressWarnings("unchecked")
  private E[] sizeArray(int arrayLength) {
    length = arrayLength;
    return (E[]) new Object[arrayLength];
  }

  public void push(E e) {
    elements[currentIndex] = e;
    incrementCurrentIndex();
  }

  private void incrementCurrentIndex() {
    currentIndex++;
  }

  private void decrementCurrentIndex() {
    currentIndex--;
  }

  public boolean isEmpty() {
    return currentIndex == 0;
  }

  public E pop() {
    E element = elements[currentIndex - 1];
    decrementCurrentIndex();
    return element;
  }
}
