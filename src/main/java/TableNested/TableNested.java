package TableNested;


import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {


        private ArrayList<Entry> entries;

        public TableNested() {
            entries = new ArrayList<Entry>();
        }

        public V get(K key) {

            for (Entry entry : entries) {
                if (entry.getKey().equals(key)) {
                    return (V) entry.getValue();
                }
            }
            return null;
        }

        void put(K key, V value) {
            Entry newEntry = new Entry(key, value);
            if (entries.size() > 0) {
                for (int i = 0; i < entries.size(); i++) {
                    if (entries.get(i).getKey().equals(key)) {
                        entries.set(i, newEntry);
                    }
                }
            } else {
                entries.add(newEntry);
            }
        }

        void remove(K key) {
            int removedEntry = 0;
            for (int i = 0; i < entries.size(); i++) {
                if (entries.get(i).getKey().equals(key)) {
                    removedEntry = i;
                }
            }
            entries.remove(removedEntry);
        }




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



}
