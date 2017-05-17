package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private ArrayList<Entry<K,V>> entries;

    public TableNested() {entries = new ArrayList<Entry<K,V>>();}

    public V get(K key) {
        for (int index = 0; index < entries.size(); index++) {
            if (entries.get(index).getKey().equals(key)) {
                return entries.get(index).getValue();
            }
        }
        return null;
    }

    public int getIndexOfEntryKey (K key) {
        for (int index = 0; index < entries.size(); index++) {
            if (entries.get(index).getKey().equals(key)) {
                return index;
            }
        }
        return entries.size();
    }

    public void put(K key, V value) {
        if (getIndexOfEntryKey(key) == entries.size()) {
            addNewEntry(key,value);
        } else {
            replaceExistingEntry(key, value, getIndexOfEntryKey(key));
        }
    }

    public void addNewEntry(K key, V value) {
        Entry<K,V> newEntry = new Entry<K, V>(key, value);
        entries.add(newEntry);
    }

    public void replaceExistingEntry(K key, V value, int index) {
        Entry<K,V> newEntry = new Entry<K, V>(key, value);
        entries.add(index, newEntry);
        entries.remove(index + 1);
    }

    public void remove (K key) {
        for (int index = 0; index < entries.size(); index++) {
            if (entries.get(index).getKey().equals(key)) {
                entries.remove(index);
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
