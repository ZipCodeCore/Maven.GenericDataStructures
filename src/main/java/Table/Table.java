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
    private ArrayList<Entry<K,V>> entries = new ArrayList<Entry<K,V>>();


    public Table() {
    }

    public V get(K foo) {
        for (int i = 0; i <entries.size() ; i++) {
            if(entries.get(i).getKey().equals(foo)){
               return entries.get(i).getValue();
            }

        }
        return null;

    }

    public void put(K foo, V i) {
        for (int j = 0; j < entries.size() ; j++) {
            if(entries.get(j).getKey().equals(foo)){
                 entries.remove(j);
                 entries.add(new Entry<K, V>(foo, i));
                 break;
            }
        }
        entries.add(new Entry<K, V>(foo, i));
    }

    public void remove(K foo) {
        for (int j = 0; j < entries.size() ; j++) {
            if(entries.get(j).getKey().equals(foo)){
                entries.remove(j);
                break;
            }
        }
    }
}
