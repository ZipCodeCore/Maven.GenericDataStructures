package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList entries;

    public TableNested() {
        entries = new ArrayList<Entry>();
    }

    public V get(K key){

        for (int i=0; i<entries.size(); i++) {
            Entry e = (Entry) entries.get(i);
            if (e.getKey().equals(key)) {
                return (V)e.getValue();
            }
        }
        return null;
    }

    public void put(K key, V value){
        boolean containsKey=false;
        Entry e = new Entry(key, value);

        for (int i=0; i<entries.size(); i++) {
            Entry entry = (Entry) entries.get(i);
            if (entry.getKey().equals(key)) {
                containsKey=true;
                entries.remove(i);
                entries.add(e);
            }
        }
        if (!containsKey)
        {
            entries.add(e);
        }
    }

    public void remove(K key){

        for (int i=0; i<entries.size(); i++) {
            Entry entry = (Entry) entries.get(i);
            if (entry.getKey().equals(key)) {
                entries.remove(i);
                break;
            }
        }
    }


    public class Entry{
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
