package TableNested;

import Table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList <Entry<K, V>> entries;

    public TableNested() {
        entries = new ArrayList <>();
    }

    public V get(K key) {
        for (Entry <K, V> e : entries) {
            if (key.equals(e.getKey())) {
                return e.getValue();
            }
        }
        return null;
    }

    public Entry getEntry(K key) {
        for (Entry <K, V> e : entries) {
            if (key.equals(e.getKey())) {
                return e;
            }
        }
        return null;
    }

    public void put(K key, V value) {
        if (getEntry(key) != null) {
            remove(key);
        }
        entries.add(new Entry <>(key, value));
    }

    public void remove(K key) {
        Entry <K, V> entry = getEntry(key);
        entries.remove(entry);
    }
    public class Entry<K, V> {
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

}

