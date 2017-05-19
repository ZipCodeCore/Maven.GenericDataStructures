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
    public class Entry {
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

        public void setValue(V value) {
            this.value = value;
        }
    }
    private ArrayList<Entry> entries;

    public Table() {
        entries = new ArrayList<Entry>();
    }

    public Entry get(K k){
        for(Entry entry: entries){
            if(entry.getKey().equals(k)) return entry;
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    public void put(K k, V v){
        for(Entry entry: entries){
            if(entry.getKey().equals(k)){
                entry.setValue(v);
                return;
            }
        }
        entries.add(new Entry(k, v));
    }

    public void remove(K k){
        int i = 0;
        for(Entry entry: entries){
            if(entry.getKey().equals(k)){
                entries.remove(i);
                return;
            }
            i++;
        }
    }
}
