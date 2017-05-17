package io.github.aaronclong.generics.table;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.
 * It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.
 * It needs a put method that takes a key and value
 * and makes an entry with key, value.
 * NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and,
 *  if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
  private ArrayList<Entry<K,V>> entries;

  public Table() {
    entries = new ArrayList<>();
  }

  public V get(K key) {
    Entry<K,V> theEntry = locateEntry(key);
    if (theEntry == null) {
      return null;
    }
    return theEntry.getValue();
  }

  public void put(K key, V value) {
    Entry<K,V> entryAlreadyExist = locateEntry(key);
    if (entryAlreadyExist != null) {
      remove(key);
    }
    entries.add(new Entry<K,V>(key, value));
  }

  private Entry<K, V> locateEntry(K key)  {
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
}
