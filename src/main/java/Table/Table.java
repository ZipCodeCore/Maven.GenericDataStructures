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
        entries = new ArrayList<>();
    }

    public Entry<K,V> getEntry(K key){
        Entry<K,V> entryToGet = null;
        for(Entry<K,V> entry: entries){
            if(entry.getKey().equals(key)){
                entryToGet = entry;
            }
        }
        return entryToGet;
    }

    public V get(K key){
        if(getEntry(key) == null){
            return null;
        }
        return getEntry(key).getValue();
    }

    public void put(K key, V val){
        Entry<K,V> entryToPut = new Entry<>(key,val);
        entries.add(entryToPut);
//        entries.add(new Entry<K, V>(key, val));
    }

    public void remove(K key){
        entries.remove(getEntry(key));
    }
}
