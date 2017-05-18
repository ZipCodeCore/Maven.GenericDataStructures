package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */


public class TableNested<K, V> {

    private ArrayList<Entry<K, V>> entries;

    public TableNested() {
        entries = new ArrayList();
    }

    public V get(K key) {
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void put(K key, V value) {
        remove(key);
        Entry<K, V> entry = new Entry(key, value);
        entries.add(entry);
        return;
    }

   public void remove(K key) {
        int arrayIdx = 0;
        boolean foundItem = false;
        for (Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)) {
                foundItem = true;
                break;
            }
            arrayIdx++;
        }
        if(foundItem) {
            entries.remove(arrayIdx);
        }
        return;
    }

    class Entry<K, V> {
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
