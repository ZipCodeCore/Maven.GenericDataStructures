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
        this.entries = new ArrayList<>();
    }

    public V get(K key) {
        for (Entry<K,V> eachEntry : entries) {
            if (eachEntry.getKey().equals(key)) {
                return eachEntry.getValue();
            }
        }
        return null;
    }

    public Entry getEntry(K key) {
        for (Entry entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry;
            }
        }
        return null;
    }

    public void put(K key, V value){
        for (Entry<K,V> eachEntry : entries) {
            if (eachEntry.getKey().equals(key)) {
                eachEntry.setValue(value);
                return;
            }
        }entries.add(new Entry<>(key, value));


    }

    public void remove(K key){
        Entry<K, V> entry = getEntry(key);
        entries.remove(entry);
//        for(Entry entry: entries){
//            if(entry.getKey().equals(key)){
//                entries.remove(entry);
//            }
//        }
    }
}
