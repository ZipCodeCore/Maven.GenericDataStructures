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
        entries = new ArrayList<>();

    }

    public void put(K key, V value) {
            Entry theEntry = new Entry(key, value);
            if(contains(key)){
                remove(key);
            }

                entries.add(theEntry);


    }

    public void remove(K theKey) {

        Entry object = getEntry(theKey);
        if (object != null)
            entries.remove(object);
    }


    public boolean contains(K theKey) {
        if (get(theKey) != null) {
            return true;
        }
        return false;
    }

    public V get(K theKey) {
        for (Entry object : entries) {
            if (object.getKey().equals(theKey)) {
                return (V) object.getValue();
            }
        }
        return null;
    }

    public Entry getEntry(K theKey) {
        for (Entry object : entries) {
            if (object.getKey().equals(theKey)) {
                return object;
            }
        }
        return null;
    }


}



