package io.github.aaronclong.generics.pair;

/**
 * You need to store two values of type `E`, set them in a constructor,
 * and have the following methods,
 * getFirst
 * getSecond.
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E> {
  private E first;
  private E second;

  Pair() {}

  Pair(E first, E second) {
    this.first = first;
    this.second = second;
  }
}
