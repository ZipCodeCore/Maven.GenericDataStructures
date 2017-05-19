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

    public Table() {
        entries = new ArrayList<Entry>();
    }

    public V get(K key) {

        for (Entry entry : entries) {
            if (entry.getKey().equals(key)) {
                return (V) entry.getValue();
            }
        }
        return null;
    }

    void put(K key, V value) {
        Entry newEntry = new Entry(key, value);
        if (entries.size() > 0) {
            for (int i = 0; i < entries.size(); i++) {
                if (entries.get(i).getKey().equals(key)) {
                    entries.set(i, newEntry);
                }
            }
        } else {
            entries.add(newEntry);
        }
    }

    void remove(K key) {
        int removedEntry = 0;
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                removedEntry = i;
            }
        }
        entries.remove(removedEntry);
    }

}
