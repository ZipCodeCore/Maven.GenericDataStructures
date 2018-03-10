package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private class Entry<K, V> {
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
        entries = new ArrayList<>();
    }

    public V get(K key) {
        for (Entry e : entries) {
            if (e.getKey().equals(key)) return (V) e.getValue();
        }
        return null;
    }

    public void put(K key, V value) {
        Entry e = new Entry(key, value);
        for (Entry en : entries) {
            if (en.getKey().equals(e.getKey())) {
                entries.set(entries.indexOf(en), e);
            }
        }
        entries.add(e);

    }

    public void remove(K key) {
        for (Entry e : entries) {
            if (e.getKey().equals(key)) {
                entries.remove(e);
                break;
            }
        }
    }

}
