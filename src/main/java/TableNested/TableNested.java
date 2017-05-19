package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList entries;

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

    public TableNested() {
        entries = new ArrayList<Entry>();
    }

    public V get(K key) {
        for (int i = 0; i < entries.size(); i++) {
            Entry holder = (Entry) entries.get(i);
            if (key.equals(holder.getKey())) {
                return holder.getValue();
            }
        }
        return null;
    }

    public void put(K key, V value) {

        if (get(key) != null) {
            for (int i = 0; i < entries.size(); i++) {
                Entry holder = (Entry) entries.get(i);
                if (key.equals(holder.getKey())) {
                    entries.set(i, new Entry(key, value));
                }
            }
        } else {
            entries.add(new Entry(key, value));
        }
    }

    public void remove(K key) {
        for (int i = 0; i < entries.size(); i++) {
            Entry holder = (Entry) entries.get(i);
            if (key.equals(holder.getKey())) {
                entries.remove(i);
            }
        }
    }

}
