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

    public V get(K key) {
        for (Entry entry: entries) {
            if (key.equals(entry.getKey()))
                return (V) entry.getValue();

        }

        return null;
    }


    public void put(K key, V value) {
        for (Entry entry: entries) {
            if(key.equals(entry.getKey())) {
                entry.setValue(value);
                return;
            }
        } entries.add(new Entry(key, value));

    }

    public void remove(K key) {
        for (Entry entry: entries) {
            if (key.equals(entry.getKey()))
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

