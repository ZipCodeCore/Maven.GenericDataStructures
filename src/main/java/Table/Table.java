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
        entries = new ArrayList<>();
    }

    public V get(K k) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(k)) {
                return (V) entries.get(i).getValue();
            }
        }
        return null;
    }

    public void remove(K k) {
        if (findK(k)) {
            for (int i = 0; i < entries.size(); i++) {
                if (entries.get(i).getKey().equals(k)) {
                    entries.remove(i);
                }
            }
        }
    }

    public void put(K k, V v) {
        if (findK(k)) {
            for (int i = 0; i < entries.size(); i++) {
                if (entries.get(i).getKey().equals(k)) {
                    entries.remove(i);
                    entries.add(i, new Entry(k, v));
                }
            }
        } else {
            entries.add(new Entry(k, v));
        }
    }


    public boolean findK(K k) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(k)) {
                return true;
            }
        }
        return false;
    }
}
