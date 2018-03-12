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
    private ArrayList<Entry> entries;

    public Table() {
        this.entries = new ArrayList<>();
    }

    public Object get(K key){
        for(Entry e : entries){
            if(e.getKey().equals(key)){
                return e.getValue();
            }
        }
        return null;
    }

    public void put(K key, V value){
        //need to enter value and key into entry
        int counter = 0;
        for(Entry e : entries){
            if(e.getKey().equals(key)){
                entries.set(counter, new Entry<>(key, value));
                return;
            }
        }
        entries.add(new Entry<>(key, value));
    }

    public void remove(K key){
        //needs to take a key, and if that key exists in the arraylist, remove the item
        for(Entry e : entries){
            if(e.getKey().equals(key)){
                entries.remove(key);
                return;
            }
        }


    }


}


