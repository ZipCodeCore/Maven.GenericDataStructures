package TableNested;


import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Entry> entries;

    public TableNested() {
        entries = new ArrayList<Entry>();
    }

    public V get(K key) {
        for(Entry entry : entries) {
            if(entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void put(K key, V value) {
        Entry entryToUpdate = null;
        for(Entry entry : entries) {
            if(entry.getKey().equals(key)) {
                entryToUpdate = entry;
            }
        }
        Entry updatedEntry = new Entry(key, value);
        if(entryToUpdate != null) {
            remove(key);
        }
        entries.add(updatedEntry);
    }

    public void remove(K key) {
        Entry entryToRemove = null;
        for(Entry entry : entries) {
            if(entry.getKey().equals(key)) {
                entryToRemove = entry;
                break;
            }
        }
        entries.remove(entryToRemove);
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
