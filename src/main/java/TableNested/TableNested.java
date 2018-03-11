package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private ArrayList<Entry<K,V>> entries;


    public TableNested() {
        entries = new ArrayList<>();
    }

    public V get(K k) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(k)) {
                return (V) entries.get(i).getValue();
            }
        }
        return null;
    }

    public void remove(K k) {
        if (findK(k)) {
            for (int i = 0; i < entries.size(); i++) {
                if (entries.get(i).getKey().equals(k)) {
                    entries.remove(i);
                }
            }
        }
    }

    public void put(K k, V v) {
        if (findK(k)) {
            for (int i = 0; i < entries.size(); i++) {
                if (entries.get(i).getKey().equals(k)) {
                    entries.remove(i);
                    entries.add(i, new Entry(k, v));
                }
            }
        } else {
            entries.add(new Entry(k, v));
        }
    }


    public boolean findK(K k) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(k)) {
                return true;
            }
        }
        return false;
    }
}


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

