package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Entry> entries;

    public TableNested() {
        this.entries = new ArrayList();

    }

    public V get(K key) {
        for (Entry entry : entries) {
            if (entry.getKey().equals(key)) {
                return (V) entry.getValue();
            }
        }
        return null;
    }

    public V put(K key, V value) {
        int keyIndex = -1;
        int counter = 0;
        for(Entry entry: entries) {
            counter++;
            if (entry.getKey().equals(key)) {
                keyIndex = counter;
            }
        }
        if(keyIndex != -1) {
            this.entries.set(keyIndex -1, new Entry(key, value));
        } else {
            this.entries.add(new Entry(key, value));
        }
        return value;
    }


    public void remove(K key) {
        int keyIndex = -1;
        int counter = 0;
        for(Entry entry: entries) {
            counter++;
            if (entry.getKey().equals(key)) {
                keyIndex = counter;
            }
        }

        if(keyIndex != -1) {
            this.entries.remove(keyIndex -1);
        }
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


