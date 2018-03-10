package TableNested;

import Table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private ArrayList<Table.Entry<K,V>> entries;

    public TableNested() {
        entries = new ArrayList<>();
    }
    public V get(K key){
        Table.Entry<K,V> current = findEntry(key);
        if (current == null){
            return null;
        }
        return current.getValue();
    }
    public void put(K key, V value){
        Table.Entry<K,V> current = findEntry(key);
        if(current != null) {
            this.remove(key);
        }
        entries.add(new Table.Entry<>(key, value));
    }
    public boolean remove(K key){
        Table.Entry<K, V> currentEntry = findEntry(key);
        if (currentEntry == null) {
            return false;
        }
        int index = entries.indexOf(currentEntry);
        entries.remove(index);
        return true;
    }
    private Table.Entry<K, V> findEntry(K key){
        for (Table.Entry<K,V> entry : entries){
            if (entry.getKey().equals(key)){
                return entry;
            }
        }
        return null;
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