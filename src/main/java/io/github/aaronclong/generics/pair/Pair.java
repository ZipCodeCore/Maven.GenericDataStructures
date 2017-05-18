package io.github.aaronclong.generics.pair;

/**
 * You need to store two values of type `E`, set them in a constructor,
 * and have the following methods,
 * getFirst
 * getSecond.
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable> {
  private E first;
  private E second;

  Pair() {}

  Pair(E one, E two) {
    this.first = one;
    this.second = two;
  }

  private E findOrderInPair(E one, E two) {
    return one.compareTo(two) > 0 ? one : two;
  }

  public E getFirst() {
    return first;
  }

  public E getSecond() {
    return second;
  }

  public E min() {
    return first.compareTo(second) < 1 ? first : second;
  }

  public E max() {
    return first.compareTo(second) > 0 ? first : second;
  }
}
