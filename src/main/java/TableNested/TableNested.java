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

        for (Entry aEntry:entries) {
            if (aEntry.getKey().equals(key)) {
                return (V) aEntry.getValue();
            }
        }
        return null;
    }

    public Entry getEntry(K key) {

        for (Entry aEntry:entries) {
            if (aEntry.getKey().equals(key)) {
                return aEntry;
            }
        }
        return null;
    }

    public void put(K key, V value) {
        Entry aEntry = getEntry(key);
        try {
            aEntry = getEntry(key);
            entries.remove(aEntry);
            aEntry.setValue(value);
        }catch (NullPointerException e) {
            aEntry = new Entry(key,value);
        }


        entries.add(aEntry);
    }

    public void remove(K key) {
        Entry aEntry = getEntry(key);
        entries.remove(aEntry);
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

        public void setValue(V value) {
            this.value = value;
        }
    }

}
