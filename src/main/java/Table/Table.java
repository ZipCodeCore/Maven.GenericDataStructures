package Table;

import java.security.KeyStore;
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

    public Entry getEntry(K key) {
        Entry<K, V> entry = null;
        for(Entry<K, V> entryName: entries){
            if (key.equals(entryName.getKey())){
                entry = entryName;
            }
        }
        return entry;
    }

    public V get(K key){
       Entry<K, V> entry = getEntry(key);
       V value = null;
       if (entry == null) {
            return null;
       }
       value = entry.getValue();
        return value;
    }

    public void put(K key, V value){
        Entry<K, V> entry = new Entry<>(key, value);
        entries.add(entry);
    }

    public void remove(K key){
        Entry<K, V> entryRemoved = getEntry(key);
        entries.remove(entryRemoved);
    }
}
