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
        entries = new ArrayList();
    }

    public V get(K k) {
        V ret = null;

            for(Entry e : entries) {
                if(e.getKey() == k) {
                    ret = (V) e.getValue();
                }
            }
        return ret;
    }

    public void put(K k, V v) {
        entries.add(new Entry<K, V>(k, v));
    }

    public void remove(K k) {
        Entry rem = null;
        for(Entry e : entries) {
            if(e.getKey() == k) {
                rem = e;
            }
        }
        entries.remove(rem);
    }
}
