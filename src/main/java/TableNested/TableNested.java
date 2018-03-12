package TableNested;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {


        private ArrayList<Table.Entry> entries;


        public TableNested() {
            this.entries = new ArrayList();

        }
        public V get(K key){
            for(Table.Entry e : entries){
                if(e.getKey().equals(key)){
                    return (V) e.getValue();
                }
            }
            return null;
        }

        public void put(K key, V value){
            int numberOfEntries = 0;
            for(Table.Entry e : entries){
                if(e.getKey().equals(key)){
                    entries.set(numberOfEntries, new Table.Entry(key, value));
                }
                numberOfEntries++;
            }
            entries.add(new Table.Entry(key, value));
        }



        public void remove(K key){
            for(int i = 0; i < entries.size(); i++){
                if(entries.get(i).getKey().equals(key)){
                    entries.remove(i);
                }
            }
        }
    }


