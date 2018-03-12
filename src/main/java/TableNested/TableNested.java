package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Table.Entry> entries;

    public TableNested() {
        this.entries = new ArrayList<>();
    }

    public Object get(K key) {
        for (Table.Entry e : entries) {
            if (e.getKey().equals(key)) {
                return e.getValue();
            }
        }
        return null;
    }

    public void put(K key, V value) {
        //need to enter value and key into entry
        int counter = 0;
        for (Table.Entry e : entries) {
            if (e.getKey().equals(key)) {
                entries.set(counter, new Table.Entry<>(key, value));
                return;
            }
        }
        entries.add(new Table.Entry<>(key, value));
    }

    public void remove(K key) {
        //needs to take a key, and if that key exists in the arraylist, remove the item
        for (Table.Entry e : entries) {
            if (e.getKey().equals(key)) {
                entries.remove(e);
                return;
            }
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
