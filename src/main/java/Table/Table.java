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
    private ArrayList<Entry<K, V>> entries;

    public Table() {
        entries = new ArrayList<Entry<K, V>>();
    }


    public V get(K k) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(k)) {
                return entry.getValue();
            }

        }
        return null;
    }

    public void put(K k, V v) {
        Entry toRemove = null;
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(k)) {
                toRemove = entry;
            }
        }
        if (toRemove != null) {
            entries.remove(toRemove);
            entries.add(new Entry(k, v));
        } else {
            entries.add(new Entry(k, v));
        }


    }

    public void remove(K k) {
        Entry toRemove = null;
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(k)) {
                toRemove = entry;
            }
        }
        if (toRemove != null) {
            entries.remove(toRemove);
        }
    }

}
