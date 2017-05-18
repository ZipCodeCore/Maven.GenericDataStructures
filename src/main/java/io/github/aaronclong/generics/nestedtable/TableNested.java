package io.github.aaronclong.generics.nestedtable;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry
 *  from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K,V> {
  private ArrayList<Entry> entries;

  public TableNested() {
    entries = new ArrayList<>();
  }

  public V get(K key) {
    Entry theEntry = locateEntry(key);
    if (theEntry == null) {
      return null;
    }
    return theEntry.getValue();
  }

  public void put(K key, V value) {
    Entry entryAlreadyExist = locateEntry(key);
    if (entryAlreadyExist != null) {
      remove(key);
    }
    entries.add(new Entry(key, value));
  }

  private Entry locateEntry(K key) {
    for (Entry entry : entries) {
      if (entry.getKey().equals(key)) {
        return entry;
      }
    }
    return null;
  }

  public boolean remove(K key) {
    Entry currentEntry = locateEntry(key);
    if (currentEntry == null) {
      return false;
    }
    int index = entries.indexOf(currentEntry);
    entries.remove(index);
    return true;
  }

  private class Entry {
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
