package TableNested;

import Table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList <Entry<K,V>> arrayList;

    public TableNested() {
        arrayList = new ArrayList<Entry<K, V>>();
    }
    public void put(K key,V value){
        arrayList.add(new Entry<>(key,value));

    }
    public V get(K k){
        V temp = null;
        for (Entry<K,V> entry:arrayList) {
            if(entry.getKey().equals(k))
                temp = entry.getValue();
        }

        return temp;
    }
    public void remove(K key){
        Entry temp= null;
        for (Entry<K,V> entry: arrayList) {
            if(entry.getKey().equals(key))
                temp = entry;
        }
        arrayList.remove(temp);
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
