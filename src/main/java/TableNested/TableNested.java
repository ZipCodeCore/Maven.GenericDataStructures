package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
        private ArrayList<Table.Entry<K,V>> entries;

        public TableNested() {
            entries= new ArrayList<Table.Entry<K,V>>();

        }
        public V get(K key){
            V temp = null;
            for(Table.Entry<K,V> e: entries){
                if(e.getKey().equals(key)) temp= e.getValue();
            }
            return temp;
        }
        public void put(K key, V value){
            entries.add(new Table.Entry<>(key,value));
        }
        public void remove(K key){
            Table.Entry temp = null;
            for(Table.Entry<K,V> e: entries){
                if(e.getKey().equals(key)) temp=e;
            }
            entries.remove(temp);
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
