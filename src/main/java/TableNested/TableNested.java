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

    private ArrayList<Entry> entries;

    public TableNested() {
        entries = new ArrayList<Entry>();
    }

    public V get(K k){
        for (Entry e: entries) {
            if(e.getKey().equals(k)){
                return (V) e.getValue();
            }
        }
        return null;
        //return entries.get(0).getValue();
    }

    public void put(K k, V v){
        Entry entry = new Entry(k, v);
        for(int i =0; i <entries.size(); i++){
            if(entries.get(i).getKey().equals(k)){
                entries.remove(i);
            }
        }
        entries.add(entry);
    }

    public void remove(K k){
        for(int i =0; i <entries.size(); i++){
            if(entries.get(i).getKey().equals(k)){
                entries.remove(i);
            }
        }
    }
}
