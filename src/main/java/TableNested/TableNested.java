package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

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

    }

    private ArrayList<Entry> entries;

    public TableNested() {
        entries = new ArrayList<Entry>();
    }

    public V get(K key) {
        for(Entry entry: entries) {
            if(entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public boolean put(K key, V value) {
        if(get(key) != null) {
            remove(key);
        }
        Entry entry = new Entry(key, value);
        return entries.add(entry);
    }

    public void remove(K key) {
        for(Entry entry : entries) {
            if(entry.getKey().equals(key)) {
                entries.remove(entry);
                return;
            }
        }
    }

}
