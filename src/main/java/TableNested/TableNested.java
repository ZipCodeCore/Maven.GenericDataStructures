package TableNested;


import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {


    private ArrayList<Entry<K, V>> entries = new ArrayList<>();

    public TableNested() {

    }


    public V get(K k) {
        for (Entry<K, V> entry : entries)
            if (entry.getKey().equals(k)) {
                return entry.getValue();
            }

        return null;


    }

    public void put(K k, V v) {
        for (Entry<K, V> entry : entries)
            if (entry.getKey().equals(k)) {
                entry.setValue(v);
            }

        entries.add(new Entry<>(k, v));

    }

    public void remove(K k) {
        Entry<K, V> toRemove = null;
        for (Entry<K, V> entry : entries)
            if (entry.getKey().equals(k))
                toRemove = entry;

        entries.remove(toRemove);

    }

    public static void main(String[] args) {
        TableNested<String, Integer> table = new TableNested<String, Integer>();
        table.put("Abrar", 1);
        System.out.println(1);
        System.out.println(table.get("Abrar"));
    }


    public class Entry<K, V> {
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

        public void setValue(V value) {
            this.value = value;
        }
    }

}
