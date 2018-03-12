package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    class Entry{
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
    private ArrayList entries;

    public TableNested() {
        this.entries = new ArrayList();
    }

    public void put(K key, V value){
        Entry newEntry = new Entry(key, value);
        entries.add(newEntry);
    }

    public Object get(K key){
        Object result = new Object();
        for(Object entry : entries){
            if(entry.equals(key)){
                result = entry;
            }
        }
        return result;
    }

    public void remove(K key){
        this.entries.remove(get(key));
    }

}
