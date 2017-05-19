package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Table.Entry> entries = new ArrayList<>();

    public TableNested() {

    }

    public void put(K key, V value) {
        boolean keyAlreadyThere = false;
        int indexOfKey = 0;
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey() == key) {
                keyAlreadyThere = true;
                indexOfKey = i;
            }
        }
        if (!keyAlreadyThere) {
            Table.Entry entry = new Table.Entry(key, value);
            entries.add(entry);
        }
        else {
            entries.get(indexOfKey).setValue(value);
        }
    }

    public <V> V get(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey() == key) {
                return (V) entries.get(i).getValue();
            }
        }
        return null;
    }

    public void remove(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                entries.remove(entries.get(i));
            }
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

        public void setValue(V value) { this.value = value; }

    }
}

