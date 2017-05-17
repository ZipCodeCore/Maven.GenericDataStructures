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
    private ArrayList <Entry<K, V>> entries;

    public Table() {
        entries = new ArrayList<Entry<K, V>>();
    }

    public V get(K key){
        for (int i = 0; i < entries.size(); i++){
            if(entries.get(i).getKey().equals(key)){
                Entry<K, V> match = entries.get(i);
                return match.getValue();
            }
        }
        return null;
    }

    public void put(K key, V value){
        boolean keyAlreadyExists = false;
        for (int i = 0; i<entries.size(); i++){
            if (entries.get(i).getKey().equals(key)){
                entries.set(i, new Entry<K, V>(key, value));
                keyAlreadyExists = true;
            }
        }

        if(!keyAlreadyExists){
            Entry<K,V> newEntry = new Entry<K, V>(key, value);
            entries.add(newEntry);
        }
    }

    public void remove(K key){
        for (int i=0; i<entries.size(); i++){
            Entry<K,V> currentEntry = entries.get(i);
            if(currentEntry.getKey().equals(key)){
                entries.remove(i);
            }
        }
    }
}
