package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Entry<K, V>> entries = new ArrayList<>();

    public Entry getEntry(K key) {
        Entry<K, V> entry = null;
        for(Entry<K, V> entryName: entries){
            if (key.equals(entryName.getKey())){
                entry = entryName;
            }
        }
        return entry;
    }

    public V get(K key){
        Entry<K, V> entry = getEntry(key);
        V value;
        if (entry == null) {
            return null;
        }
        value = entry.getValue();
        return value;
    }

    public void put(K key, V value){
        Entry<K, V> entry = new Entry<>(key, value);
        entries.add(entry);
    }

    public void remove(K key){
        Entry<K, V> entryRemoved = getEntry(key);
        entries.remove(entryRemoved);
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
