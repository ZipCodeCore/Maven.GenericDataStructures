package TableNested;

import Table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Entry<K, V>> entries;

    public TableNested() {
        entries = new ArrayList<Entry<K, V>>();
    }


    public V get(K k) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(k)) {
                return entry.getValue();
            }

        }
        return null;
    }

    public void put(K k, V v) {
        Entry toRemove = null;
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(k)) {
                toRemove = entry;
            }
        }
        if (toRemove != null) {
            entries.remove(toRemove);
            entries.add(new Entry(k, v));
        } else {
            entries.add(new Entry(k, v));
        }


    }

    public void remove(K k) {
        Entry toRemove = null;
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(k)) {
                toRemove = entry;
            }
        }
        if (toRemove != null) {
            entries.remove(toRemove);
        }
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
