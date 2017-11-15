package Table;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 * Implement Table<K,V> so that it manages an ArrayList of Entry<K,V>. You must implement
 * <p>
 * get which takes a key and returns either the entry from the ArrayList with that key, or null if none is found.
 * put which takes a key and value and sets the value in the ArrayList to Entry(key, value);
 * Remember, a key point to exactly one value
 * remove which takes a key and removes it from the ArrayList if it's in there. It's a void method; no return type.
 */
public class Table<K, V> {
    private ArrayList<Entry<K, V>> entries = new ArrayList<>();

    Table() {

    }


    public V get(K k) {
        for (Entry<K, V> entry : entries)
            if (entry.getKey().equals(k)) {
                return entry.getValue();
            }

        return null;


    }

    public void put(K k, V v) {
        for (Entry<K, V> entry : entries)
            if (entry.getKey().equals(k)) {
                entry.setValue(v);
            }

        entries.add(new Entry<>(k, v));

    }

    public void remove(K k) {
        Entry<K, V> toRemove = null;
        for (Entry<K, V> entry : entries)
            if (entry.getKey().equals(k))
                toRemove = entry;

        entries.remove(toRemove);

    }


}

