package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */

public class TableNested<K, V> {

    class Entry {  //would not need to define type parameters here caiuse defined in TableNested class declaration
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

    private ArrayList<Table.Entry<K, V>> entries;

    public TableNested() {
        this.entries = new ArrayList<>();
    }

    public V get(K key) {
        for (int i=0; i<entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                return entries.get(i).getValue();
            }
        }
        return null;
    }

    public void put(K key, V value) {
        for (int i=0; i<entries.size(); i++) {
            if(entries.get(i).getKey().equals(key)) {
                entries.remove(entries.get(i));
                entries.add(new Table.Entry(key, value));
            }
        }
        entries.add(new Table.Entry(key, value));
    }

    public void remove(K key) {
        for (int i=0; i<entries.size(); i++) {
            if(entries.get(i).getKey().equals(key)) {
                entries.remove(entries.get(i));
            }
        }
    }
}
