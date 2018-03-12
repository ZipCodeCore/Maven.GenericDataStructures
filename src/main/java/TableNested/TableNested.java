package TableNested;
import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Entry> entries;

    public TableNested() {
        this.entries = new ArrayList<Entry>();
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

        public void setKey(K key){
            this.key = key;
        }

        public void setValue(V value){
            this.value = value;
        }

    }





    public V get(K key) {
        for (int i = 0; i < entries.size(); i++){
            if (entries.get(i).getKey().equals(key)){
                return (V)entries.get(i).getValue();
            }

        }
        return null;
    }

    public void put(K key, V value) {
        for (int i =0; i < entries.size(); i++){
            if (entries.get(i).getKey().equals(key)){
                System.out.println("Error, already exists");
            }
            entries.get(i).setKey(key);
            entries.get(i).setValue(value);
        }
        entries.add(new Entry(key, value));
    }

    public void remove(K key) {
        for (int i = 0; i < entries.size(); i++){
            if (entries.get(i).getKey().equals(key)){
                entries.remove(i);
            }
        }
    }
}
