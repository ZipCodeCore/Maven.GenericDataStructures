package TableNested;

import Table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    public TableNested() {
        this.entries = new ArrayList<>();
    }

    private ArrayList<Entry<K, V>> entries;

    public V get(K foo) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(foo)) {
                return entries.get(i).getValue();
            }
        }
        return null;
    }

    public void put (K foo, V i) {
        for (int j = 0; j < entries.size(); j++) {
            if (entries.get(j).getKey().equals(foo)) {
                entries.remove(j);
                entries.add(new Entry<>(foo, i));
                break;
            }
        }
        entries.add(new Entry<>(foo, i));
    }

    public void remove(K foo) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(foo)) {
                entries.remove(i);
                break;
            }
        }
    }

}
