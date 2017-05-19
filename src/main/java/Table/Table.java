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
    private ArrayList<Entry> entries = new ArrayList<>();

    public Table() {

    }

    public void put(K key, V value) {
        boolean keyAlreadyThere = false;
        int indexOfKey = 0;
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey() == key) {
                keyAlreadyThere = true;
                indexOfKey = i;
            }
        }
        if (!keyAlreadyThere) {
            Entry entry = new Entry(key, value);
            entries.add(entry);
        }
        else {
            entries.get(indexOfKey).setValue(value);
        }
    }

    public <V> V get(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey() == key) {
                return (V) entries.get(i).getValue();
            }
        }
        return null;
    }

    public void remove(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                entries.remove(entries.get(i));
            }
        }
    }
}
