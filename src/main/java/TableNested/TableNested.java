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
        Entry currentEntry;
        for (int i = 0; i < entries.size(); i++) {
            currentEntry = entries.get(i);
            if (currentEntry.getKey().equals(key))
                return currentEntry.getValue();
        }
        return null;
    }

    public boolean put(K key, V value) {
        K currentKey;
        for (int i = 0; i < entries.size(); i++) {
            currentKey = entries.get(i).getKey();
            if (currentKey.equals(key)) {
                entries.set(i, new Entry(key, value));
                return true;
            }
        }
        entries.add(new Entry(key, value));
        return true;
    }

    public void remove(K key) {
        K currentKey;
        for (int i = 0; i < entries.size(); i++) {
            currentKey = entries.get(i).getKey();
            if (currentKey.equals(key))
                entries.remove(i);
        }
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

    }

}
