package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private ArrayList<Entry> entries;

    public TableNested() {

        this.entries = new ArrayList<>();

    }

    public void put(K k, V v) {
        for (Entry entry : entries) {
            if (entry.getKey().equals(k)) {
                entry.setValue(v);
                return;
            }
        }
        entries.add(new Entry(k, v));
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
        for (Entry entry : entries) {
            if (entry.getKey().equals(k))
                entries.remove(entry);
            return;
        }
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

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

}