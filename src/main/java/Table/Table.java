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
    private ArrayList entries;

    public Table() {
        entries = new ArrayList<Entry>();
    }

    public V get(K key){

        for (int i=0; i<entries.size(); i++) {
            Entry e = (Entry) entries.get(i);
            if (e.getKey().equals(key)) {
                return (V)e.getValue();
            }
        }
        return null;
    }

    public void put(K key, V value){
        boolean containsKey=false;
        Entry e = new Entry(key, value);

        for (int i=0; i<entries.size(); i++) {
            Entry entry = (Entry) entries.get(i);
            if (entry.getKey().equals(key)) {
                containsKey=true;
                entries.remove(i);
                entries.add(e);
            }
        }
        if (!containsKey)
        {
            entries.add(e);
        }
    }

    public void remove(K key){

        for (int i=0; i<entries.size(); i++) {
            Entry entry = (Entry) entries.get(i);
            if (entry.getKey().equals(key)) {
                entries.remove(i);
                break;
            }
        }
    }


}
