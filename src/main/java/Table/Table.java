package Table;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and
 * value and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {

    class Entry{
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    private ArrayList<Entry> entries;

    public Table() {
        entries = new ArrayList<Entry>();
    }

    public V get(K k){
        for (Entry e: entries) {
            if(e.getKey().equals(k)){
                return (V) e.getValue();
            }
        }
        return null;
        //return entries.get(0).getValue();
    }

    public void put(K k, V v){
        Entry entry = new Entry(k, v);
        for(int i =0; i <entries.size(); i++){
            if(entries.get(i).getKey().equals(k)){
                entries.remove(i);
            }
        }
        entries.add(entry);
    }

    public void remove(K k){
        for(int i =0; i <entries.size(); i++){
            if(entries.get(i).getKey().equals(k)){
                entries.remove(i);
            }
        }
    }
}
