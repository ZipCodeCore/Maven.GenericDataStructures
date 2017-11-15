package TableNested;

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

    private ArrayList<Entry<K, V>> entries;

    public TableNested() {
        entries = new ArrayList();
    }

    public V get(K k) {
        V ret = null;

        for (Entry e : entries) {
            if (e.getKey() == k) {
                ret = (V) e.getValue();
            }
        }
        return ret;
    }

    public void put(K k, V v) {
        entries.add(new Entry<K, V>(k, v));
    }

    public void remove(K k) {
        Entry rem = null;
        for (Entry e : entries) {
            if (e.getKey() == k) {
                rem = e;
            }
        }
        entries.remove(rem);
    }

}
