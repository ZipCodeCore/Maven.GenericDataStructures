package TableNested;

import Table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private ArrayList<Entry<K, V>> entries;

    public TableNested() {
        this.entries = new ArrayList<>();
    }

    public ArrayList<Entry<K, V>> getEntries() {
        return entries;
    }

    public V get(K key) {
        V value = null;
        for (int i = 0; i < entries.size(); i++) {
            K entryKey = entries.get(i).getKey();
            if (entryKey.equals(key)) {
                value = entries.get(i).getValue();
            }
        }
        return value;
    }
    public int size(){
        return entries.size();
    }

    public void put(K key, V value) {
        if(entries.size() == 0) {
            entries.add(new Entry<>(key, value));
        } else {
            for (int i = 0; i < entries.size(); i++) {
                if ((key.equals(entries.get(i).getKey()))) {
                    entries.set(i, new Entry<>(key, value));
                } else {
                    entries.add(i, new Entry<>(key, value));
                }
            }
        }

    }

    public void remove(K key) {
        for (int i = 0; i < entries.size(); i++) {
            K entryKey = entries.get(i).getKey();
            if (entryKey.equals(key)) {
                entries.remove(i);
            }
        }
    }

    private class Entry<H,R> {
        private H key;
        private R value;

        public Entry(H key, R value) {
            this.key = key;
            this.value = value;
        }

        public H getKey() {
            return key;
        }

        public R getValue() {
            return value;
        }

    }

}
