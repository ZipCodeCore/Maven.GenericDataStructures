package Table;

import java.util.ArrayList;
import java.security.Key;

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
        this.entries = new ArrayList<>();
    }

    public void put(K key, V value) {
        for (Entry entry : this.entries) {
            if (entry.getKey().equals(key)) {
                entries.set(entries.indexOf(entry), new Entry<>(key, value));
                return;
            }
        }
        entries.add(new Entry<>(key, value));
    }

    public Object get(K key) {
        for (Entry entry : this.entries) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void remove(K key) {
//        for (Entry entry : this.entries) {
//            if (entry.getKey().equals(key)) {
//                this.entries.remove(entry);
//            }
//        }
        for (int i = 0; i < this.entries.size(); i++) {
            if (this.entries.get(i).getKey().equals(key)) {
                this.entries.remove(i);
            }
        }
    }

}
