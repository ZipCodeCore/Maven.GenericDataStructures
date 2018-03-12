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
    private ArrayList<Entry> entries;

    public Table() {
        entries = new ArrayList<Entry>();
    }

    public V get(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                return (V) entries.get(i).getValue();
            }
        }
        return null;
    }

    public boolean containsKey(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public void put(K key, V value) {
        if (containsKey(key)) {
            for (int i = 0; i < entries.size(); i++) {
                if (entries.get(i).getKey().equals(key)) {
                    entries.remove(i);
                    entries.add(i, new Entry(key, value));
                }
            }
        } else {
            entries.add(new Entry(key, value));
        }
    }

    public void remove(K key) {
        if (containsKey(key)) {
            for (int i = 0; i < entries.size(); i++) {
                if (entries.get(i).getKey().equals(key)) {
                    entries.remove(i);
                }
            }
        }
    }

}