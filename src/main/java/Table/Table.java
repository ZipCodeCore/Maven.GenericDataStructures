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

    public ArrayList<Entry<K, V>> getEntries() {
        return entries;
    }

    public V get(K key) {
        V value = null;
        for (int i = 0; i < entries.size(); i++) {
            K entryKey = entries.get(i).getKey();
            if (entryKey.equals(key)) {
                value = entries.get(i).getValue();
            }
        }
        return value;
    }
    public int size(){
        return entries.size();
    }

    public void put(K key, V value) {
        entries.add(new Entry<>(key,value));
    //not sure why the for loop won't work but I'll come back to that later
/*       for (int i = 0; i < entries.size(); i++) {
            K entryKey = entries.get(i).getKey();
            if ((entries.get(i).getKey()).equals(key)) {
                entries.set(i, new Entry<>(key,value));
            } else {
                entries.add(i, new Entry<>(key,value));
            }
        }
*/
    }

    public void remove(K key) {
        for (int i = 0; i < entries.size(); i++) {
            K entryKey = entries.get(i).getKey();
            if (entryKey.equals(key)) {
                entries.remove(i);
            }
        }
    }

}
