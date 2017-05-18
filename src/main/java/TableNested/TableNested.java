package TableNested;

import Table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private ArrayList<Table.Entry<K, V>> entries;


    public TableNested() {
        entries = new ArrayList<Table.Entry<K, V>>();
    }
    // takes key and returns value or null
    public V get(K key) {
        for (Table.Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)){
                return entry.getValue();
            }
        } return null;
    }
    // takes key and value and enters the key and value
    public boolean put(K key, V value) {
        Table.Entry<K,V> entry = new Table.Entry<K, V>(key, value);
        return entries.add(entry);
    }
    //
    public void remove(K key){
        for (Table.Entry<K, V> entry : entries) {
            if (entry.getKey().equals(key)){
                entries.remove(entry);
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
