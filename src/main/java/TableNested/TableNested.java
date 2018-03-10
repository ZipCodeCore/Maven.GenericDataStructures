package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Table.Entry> entries;

    public TableNested() {
        entries = new ArrayList<>();

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


    public void put(K key, V value) {
        Table.Entry theEntry = new Table.Entry(key, value);
        if (contains(key)) {
            remove(key);
        }

        entries.add(theEntry);


    }

    public void remove(K theKey) {

        Table.Entry object = getEntry(theKey);
        if (object != null)
            entries.remove(object);
    }


    public boolean contains(K theKey) {
        if (get(theKey) != null) {
            return true;
        }
        return false;
    }

    public V get(K theKey) {
        for (Table.Entry object : entries) {
            if (object.getKey().equals(theKey)) {
                return (V) object.getValue();
            }
        }
        return null;
    }

    public Table.Entry getEntry(K theKey) {
        for (Table.Entry object : entries) {
            if (object.getKey().equals(theKey)) {
                return object;
            }
        }
        return null;
    }


}

