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

//    public Entry<K, V> getEntry(K key) {
//        for (Entry<K, V> aEntry : entries){
//            if(aEntry.getKey().equals(key)){
//                return aEntry;
//            }
//        }
//        return null;
//    }

    public V get(K key) {
//        Entry<K, V> entryToGet = getEntry(key);
//        if (entryToGet == null) {
//            return null;
//        }
//        return entryToGet.getValue();

        for (Entry<K, V> entry: entries)
            if(entry.getKey().equals(key)) {
                return entry.getValue();
            }
            return null;
    }

    public void put(K key, V value) {
//        Entry<K, V> entry = getEntry(key);
//        entries.remove(entry);
//        if (entry == null) {
//            entry = new Entry<>(key, value);
//        }
//        entry.setValue(value);
//        entries.add(entry);

        for (Entry<K, V> entry : entries)
            if (entry.getKey().equals(key)){
            entry.setValue(value);
            }
            entries.add(new Entry<>(key, value));
    }

    public void remove(K key) {
        Entry<K, V> removableEntry = null;
        for (Entry<K, V> entry : entries)
            if (entry.getKey().equals(key))
                removableEntry = entry;
                entries.remove(removableEntry);
    }
}
