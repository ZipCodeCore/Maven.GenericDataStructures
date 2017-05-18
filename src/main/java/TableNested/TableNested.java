package TableNested;

import Table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Entry> entries;

    public Entry getEntry(K key) {

        for (Entry entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry;
            }
        }
        return null;
    }

    public V get(K key) {
        try {
            return (V)getEntry(key).getValue();
        } catch (NullPointerException e) {
            return null;
        }

    }

    public void put(K key, V value) {
        Entry newEntry = new Entry(key, value);
        Entry existingEntry = getEntry(key);

        if (existingEntry == null) {
            entries.add(newEntry);
        } else {
            entries.set(entries.indexOf(existingEntry), newEntry);
        }


    }

    public void remove(K key) {

        entries.remove(getEntry(key));
    }

    public TableNested() {
        entries = new <Entry>ArrayList();
    }

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
}
