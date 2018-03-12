package TableNested;

import java.util.ArrayList;
import java.util.Map.Entry;


/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Entry> entries;

    public TableNested() {
        this.entries = new ArrayList<>();
    }

    public void put(K key, V value) {
        for (Entry entry : this.entries) {
            if (entry.getKey().equals(key)) {
                entries.set(entries.indexOf(entry), new Entry<>(key, value));
                return;
            }
        }
        entries.add(new Entry<>(key, value));
    }

    public Object get(K key) {
        for (Entry entry : this.entries) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public void remove(K key) {
        for (int i = 0; i < this.entries.size(); i++) {
            if (this.entries.get(i).getKey().equals(key)) {
                this.entries.remove(i);
            }
        }
    }

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
}
