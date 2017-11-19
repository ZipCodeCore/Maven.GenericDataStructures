package Table;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null if the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList<Entry<K, V>> entries; //ArrayList takes a type of Entry (in Entry class)

    public Table() {
        this.entries = new ArrayList<>();
    }

    public V get(K key) {
        for (int i=0; i<entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                //get the object with .get(i) and getValue or getKey to get K or V in the object
                return entries.get(i).getValue();
            }
        }
        return null;
    }

    public void put(K key, V value) {
        for (int i=0; i<entries.size(); i++) {
            if(entries.get(i).getKey().equals(key)) {
                entries.remove(entries.get(i));
                entries.add(new Entry(key, value));
            }
        }
            entries.add(new Entry(key, value)); //don't want to loop this
    }

    public void remove(K key) {
        for (int i=0; i<entries.size(); i++) {
            if(entries.get(i).getKey().equals(key)) {
                entries.remove(entries.get(i)); //need to remove the whole entry
            }
        }
    }
}