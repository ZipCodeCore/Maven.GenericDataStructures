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
    private ArrayList <Entry<K,V>> arrayList;

    public Table() {
        arrayList = new ArrayList<Entry<K, V>>();
    }
    public void put(K key,V value){
        arrayList.add(new Entry<>(key,value));

    }
    public V get(K k){
        V temp = null;
        for (Entry<K,V> entry:arrayList) {
           if(entry.getKey().equals(k))
               temp = entry.getValue();
        }

        return temp;
    }
    public void remove(K key){
        Entry temp= null;
        for (Entry<K,V> entry: arrayList) {
            if(entry.getKey().equals(key))
                temp = entry;
        }
        arrayList.remove(temp);
    }
}
