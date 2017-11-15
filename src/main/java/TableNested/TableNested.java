package TableNested;

import Table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
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

    private ArrayList<Entry<K, V>> entries;

    public TableNested() {
        entries = new ArrayList<>();
    }

    public void put(K key, V value) {
        if (getEntry(key) != null) {
            remove(key);
        }
        entries.add(new Entry<>(key, value));
    }

    public V get(K key) {
        Entry<K, V> returnEntry = getEntry(key);
        if (returnEntry != null) {
            return getEntry(key).getValue();
        }
        return null;
    }

    public void remove(K key) {
        Entry<K, V> deleteEntry = getEntry(key);
        if (deleteEntry != null) {
            entries.remove(getEntry(key));
        }
    }

    private Entry<K, V> getEntry(K key) {
        for (Entry<K, V> entry : entries) {
            if (key.equals(entry.getKey())) {
                return entry;
            }
        }
        return null;
    }

}
