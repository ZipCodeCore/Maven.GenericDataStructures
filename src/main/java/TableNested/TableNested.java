package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private ArrayList<NestedEntry<K,V>> entries = new ArrayList<NestedEntry<K,V>>();
    public TableNested() {
    }

    public V get(K foo) {
        for (int i = 0; i <entries.size() ; i++) {
            if(entries.get(i).getKey().equals(foo)){
                return entries.get(i).getValue();
            }

        }
        return null;

    }

    public void put(K foo, V i) {
        for (int j = 0; j < entries.size() ; j++) {
            if(entries.get(j).getKey().equals(foo)){
                entries.remove(j);
                entries.add(new NestedEntry<K, V>(foo, i));
                break;
            }
        }
        entries.add(new NestedEntry<K, V>(foo, i));
    }

    public void remove(K foo) {
        for (int j = 0; j < entries.size() ; j++) {
            if(entries.get(j).getKey().equals(foo)){
                entries.remove(j);
                break;
            }
        }
    }

    private class NestedEntry<K, V> {
        private K key;
        private V value;

        public NestedEntry(K key, V value) {
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
