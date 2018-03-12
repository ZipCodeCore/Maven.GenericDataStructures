package TableNested;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {

    //field
    private ArrayList<Entry> entries;

    //contructor
    public TableNested()
    {
        this.entries = new ArrayList<>();
    }

    //PUT, GET, REMOVE methods

    public void put(K key, V value)
    {


        for (int i = 0; i < entries.size(); i++)
        {
            if (entries.get(i).getKey().equals(key))
            {
                entries.set(i, new Entry<>(key, value));
                return;
            }

        }

        entries.add(new Entry<>(key, value));

    }

    public Object get(Object key)
    {
        for (Entry entry : entries)
        {
            if (entry.getKey().equals(key)){
                return entry.getValue();
            }
        }
        return null;
    }

    public void remove(Object key)
    {
        for (int i = 0; i < entries.size(); i++)
        {
            entries.remove(i);
        }

    }



    //Nested Class
    private class Entry<K, V>
    {
        private K key;
        private V value;


        public Entry (K key, V value)
        {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue(){
            return value;
        }
    }



}
