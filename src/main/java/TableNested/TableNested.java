package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Entry> entries;

    public TableNested() {
        entries = new ArrayList<>();
    }

    public V get(K key) {
        Entry entryToGet = getEntry(key);
        if (entryToGet == null) {
            return null;
        }
        return entryToGet.getValue();
    }

    public Entry getEntry(K key) {
        for (Entry aEntry : entries) {
            if (aEntry.getKey().equals(key)) {
                return aEntry;
            }
        }
        return null;
    }


    public void put(K key, V value) {
        Entry entry = getEntry(key);
        entries.remove(entry);
        if (entry == null) {
            entry = new Entry(key, value);
        }
        entry.setValue(value);
        entries.add(entry);
    }

    public void remove(K key) {
        Entry entry = getEntry(key);
        entries.remove(entry);
    }

    class Entry {
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
}


