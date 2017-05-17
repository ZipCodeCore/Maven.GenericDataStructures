package Table;

import java.util.ArrayList;
import java.util.Map;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {

    private ArrayList<Entry<K,V>> entries;

    public Table() {entries = new ArrayList<Entry<K,V>>();}

    public V get(K key) {
        for (int index = 0; index < entries.size(); index++) {
            if (entries.get(index).getKey().equals(key)) {
                return entries.get(index).getValue();
            }
        }
        return null;
    }

    public int getIndexOfEntryKey (K key) {
        for (int index = 0; index < entries.size(); index++) {
            if (entries.get(index).getKey().equals(key)) {
                return index;
            }
        }
        return entries.size();
    }

    public void put(K key, V value) {
        if (getIndexOfEntryKey(key) == entries.size()) {
            addNewEntry(key,value);
        } else {
            replaceExistingEntry(key, value, getIndexOfEntryKey(key));
        }
    }

    public void addNewEntry(K key, V value) {
        Entry<K,V> newEntry = new Entry<K, V>(key, value);
        entries.add(newEntry);
    }

    public void replaceExistingEntry(K key, V value, int index) {
        Entry<K,V> newEntry = new Entry<K, V>(key, value);
        entries.add(index, newEntry);
        entries.remove(index + 1);
    }

    public void remove (K key) {
        for (int index = 0; index < entries.size(); index++) {
            if (entries.get(index).getKey().equals(key)) {
                entries.remove(index);
            }
        }
    }

}
