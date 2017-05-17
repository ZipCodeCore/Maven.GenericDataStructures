package io.github.aaronclong.generics.nestedtable;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry
 *  from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K,V> {
  private ArrayList<Entry<K, V>> entries;

  public TableNested() {
    entries = new ArrayList<>();
  }

  public V get(K key) {
    Entry<K, V> theEntry = locateEntry(key);
    if (theEntry == null) {
      return null;
    }
    return theEntry.getValue();
  }

  public void put(K key, V value) {
    Entry<K, V> entryAlreadyExist = locateEntry(key);
    if (entryAlreadyExist != null) {
      remove(key);
    }
    entries.add(new Entry<K, V>(key, value));
  }

  private Entry<K, V> locateEntry(K key) {
    for (Entry<K, V> entry : entries) {
      if (entry.getKey().equals(key)) {
        return entry;
      }
    }
    return null;
  }

  public boolean remove(K key) {
    Entry<K, V> currentEntry = locateEntry(key);
    if (currentEntry == null) {
      return false;
    }
    int index = entries.indexOf(currentEntry);
    entries.remove(index);
    return true;
  }

  private class Entry<K, V> {
    private K key;
    private V value;

    public Entry(K key, V value) {
      this.key = key;
      this.value = value;
    }

    public K getKey() {
      return key;
    }

    public V getValue() {
      return value;
    }

  }

}
