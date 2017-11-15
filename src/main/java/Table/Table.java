package Table;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList<Entry<K,V>> entries;

    public Table() {
        entries = new ArrayList<>();
    }

    public V get(K key) {

        for (Entry aEntry:entries) {
            if (aEntry.getKey().equals(key)) {
                return (V) aEntry.getValue();
            }
        }
        return null;
    }

    public Entry getEntry(K key) {

        for (Entry aEntry:entries) {
            if (aEntry.getKey().equals(key)) {
                return aEntry;
            }
        }
        return null;
    }

    public void put(K key, V value) {
        Entry<K,V> aEntry = getEntry(key);
        try {
            aEntry = getEntry(key);
            entries.remove(aEntry);
            aEntry.setValue(value);
        }catch (NullPointerException e) {
            aEntry = new Entry<K, V>(key,value);
        }


        entries.add(aEntry);
    }

    public void remove(K key) {
        Entry<K,V> aEntry = getEntry(key);
        entries.remove(aEntry);
    }
}
