package TableNested;

import Table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

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

    private ArrayList<Table.Entry<K,V>> entries;

    public TableNested() {
        entries = new ArrayList<>();
    }

    public Table.Entry<K,V> getEntry(K key){
        Table.Entry<K,V> entryToGet = null;
        for(Table.Entry<K,V> entry: entries){
            if(entry.getKey().equals(key)){
                entryToGet = entry;
            }
        }
        return entryToGet;
    }

    public V get(K key){
        if(getEntry(key) == null){
            return null;
        }
        return getEntry(key).getValue();
    }

    public void put(K key, V val){
        Table.Entry<K,V> entryToPut = new Table.Entry<>(key,val);
        entries.add(entryToPut);
//        entries.add(new Entry<K, V>(key, val));
    }

    public void remove(K key){
        entries.remove(getEntry(key));
    }
}
