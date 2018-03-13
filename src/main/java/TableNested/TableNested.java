package TableNested;

import Table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private class EntryNested {
        private K key;
        private V value;

        private EntryNested(K key, V value) {
            this.key = key;
            this.value = value;
        }

        private K getKey() {
            return key;
        }

        private V getValue() {
            return value;
        }

        private void setValue(V anotherValue) {
            this.value = anotherValue;
        }
    }

    private ArrayList<EntryNested> entries;

    public TableNested() {
        this.entries = new ArrayList();
    }

    public V get(K key) {

        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                return entries.get(i).getValue();
            }
        }
        return null;
    }

    public void put(K key, V value) {
        if (containsKey(key)) {
            for (int i = 0; i < entries.size(); i++) {
                if (entries.get(i).getKey().equals(key)) {
                    entries.get(i).setValue(value);
                }
            }
        } else {
            entries.add(new EntryNested(key, value));
        }
    }

    public void remove(K key) {

        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)){
                entries.remove(i);
            }
        }
    }

    private boolean containsKey(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

}
