package io.github.aaronclong.generics.stackarray;

import java.lang.reflect.Array;
import java.util.Arrays;

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
    setArray(20);
  }

  @SuppressWarnings("unchecked")
  private void setArray(int arrayLength) {
    length = arrayLength;
    elements = (E[]) new Object[arrayLength];
  }

  private void resizeArray() {
    elements = Arrays.copyOf(elements, length * 2);
    length *= 2;
  }

  public void push(E e) {
    if (length <= currentIndex) {
      resizeArray();
    }
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
