package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private ArrayList<EntryNested> entries;

    public TableNested(){
        this.entries = new ArrayList<>();
    }

    public Object get(K key) {
        for(int i = 0; i < entries.size(); i++){
            if(entries.get(i).getKey().equals(key)){
                return entries.get(i).getValue();
            }
        }
        return null;
    }

    public void put(K key, V value) {
        for(int i = 0; i < entries.size(); i++){
            if(entries.get(i).getKey().equals(key)){
                entries.set(i, new EntryNested<>(key, value));
                break;
            }
        }
        entries.add(new EntryNested<>(key, value));
    }

    public void remove(K key) {
        for(int i = 0; i < entries.size(); i++){
            if(entries.get(i).equals(key)){
                entries.remove(i);
            }
        }
    }

    private class EntryNested<K, V> {
        private K key;
        private V value;

        public EntryNested(K key, V value) {
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
