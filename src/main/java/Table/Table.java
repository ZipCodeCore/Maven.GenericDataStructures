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

    public V get(K key) {
        Entry<K, V> currentEntry;
        for (int i = 0; i < entries.size(); i++) {
            currentEntry = entries.get(i);
            if (currentEntry.getKey().equals(key))
                return currentEntry.getValue();
        }
        return null;
    }

    public boolean put(K key, V value) {
        K currentKey;
        for (int i = 0; i < entries.size(); i++) {
            currentKey = entries.get(i).getKey();
            if (currentKey.equals(key)) {
                entries.set(i, new Entry<K, V>(key, value));
                return true;
            }
        }
        entries.add(new Entry<K, V>(key, value));
        return true;
    }

    public void remove(K key) {
        K currentKey;
        for (int i = 0; i < entries.size(); i++) {
            currentKey = entries.get(i).getKey();
            if (currentKey.equals(key))
                entries.remove(i);
        }
    }
}
