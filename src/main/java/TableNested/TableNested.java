package TableNested;

import Table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList <Entry<K,V>> entries = new ArrayList<>();

    public TableNested() {
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

            public void setValue(V value) {
                this.value = value;
            }
        }

    }

    public void put(K key, V value) {

        for (Entry<K, V>  entry: entries){
            if (entry.getKey().equals(key))
                entry.setValue(value);
        }
        entries.add(new Entry<>(key, value));

    }


    public V get(K key) {
        for(Entry entry: entries){
            if(entry.getKey().equals(key)){
                V newValue = (V) entry.getValue();
                return newValue;
            }
        }
        return null;
    }

    public void remove(K key) {

        Entry<K,V> toRemove = null;
        for (Entry<K,V> entry:entries)
            if (entry.getKey().equals(key))
                toRemove = entry;

        entries.remove(toRemove);
    }


}
