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
        this.entries = new ArrayList();
    }

    public void put(K key, V value){
        Entry newEntry = new Entry(key, value);
        entries.add(newEntry);
    }

    public V get(K key){
        V result = null;
        for(Entry entry : entries){
            if(entry.getKey().equals(key)){
                result = entry.getValue();
            }
        }
        return result;
    }

    public void remove(K key){
        for(int i = 0; i < entries.size(); i++){
            if(entries.get(i).getKey().equals(key)){
                entries.remove(i);
            }
        }
    }

}
