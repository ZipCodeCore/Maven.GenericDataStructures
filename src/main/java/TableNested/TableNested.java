package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    private ArrayList<Entry> entries;

    public TableNested() {
        entries= new ArrayList<>();
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

    }


    public V get(K key){

        V ourLocalVariable = null;


        for (Entry element: entries){
            if (element.getKey().equals(key)){
                ourLocalVariable =(V) element.getValue();
            }
        }

        return ourLocalVariable;

    }

    public void put(K foo, V i){
        Entry ourEntry = new Entry(foo, i);
        for (Entry element: entries){
            if (element.getKey().equals(ourEntry.getKey())){
                entries.set(entries.indexOf(element),ourEntry);
            }
        }

        entries.add(ourEntry);

    }

    public void remove(K foo){
        for (Entry element: entries){
            if (element.getKey().equals(foo)){
                entries.remove(element);
                break;
            }
        }
    }


}
