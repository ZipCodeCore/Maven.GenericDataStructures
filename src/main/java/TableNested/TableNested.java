package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    public class Entry<K, V> {
        private K key;
        private V value;

        public Entry() { }

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

    public TableNested(){
        entries = new ArrayList<Entry>();
    }

    public V get(K key){
        for(Entry<K,V> e : entries){
            if(e.getKey().equals(key)){
                return e.getValue();
            }
        }
        return null;
    }

    public void put(K key, V value) {
        Entry oldEntry = null;
        for (Entry<K, V> e : entries) {
            if (e.getKey().equals(key)) {
                oldEntry = e;
            }
        }
        if(oldEntry != null){
            entries.remove(oldEntry);
            entries.add(new Entry<>(key, value));
        }
        else
            entries.add(new Entry<>(key, value));
    }

    public void remove(K key){
        Entry oldEntry = null;
        for(Entry<K, V> e : entries){
            if(e.getKey().equals(key)){
                oldEntry = e;
            }
        }
        if(oldEntry != null){
            entries.remove(oldEntry);
        }
    }
}
