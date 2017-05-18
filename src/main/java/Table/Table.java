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
    private ArrayList<Entry> entries;

    public Entry getEntry(K key) {

        for (Entry entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry;
            }
        }
        return null;
    }

    public V get(K key) {
        try {
            return (V)getEntry(key).getValue();
        } catch (NullPointerException e) {
            return null;
        }

    }

    public void put(K key, V value) {
        Entry newEntry = new Entry(key, value);
        Entry existingEntry = getEntry(key);

        if (existingEntry == null) {
            entries.add(newEntry);
        } else {
            entries.set(entries.indexOf(existingEntry), newEntry);
        }


    }

    public void remove(K key) {

        entries.remove(getEntry(key));
    }

    public Table() {
        entries = new <Entry>ArrayList();
    }
}
