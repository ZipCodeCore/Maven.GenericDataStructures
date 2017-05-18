package TableNested;

import Table.Entry;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V>
{
    private ArrayList <TableNested.Entry> entries;
    private static int counter;

    public TableNested()
    {
        entries = new ArrayList<Entry>();
        counter = 0;
    }

    public V get(K key)
    {
        if(isEmpty())
        {
            return null;
        }
        else
        {
            for(Entry e: entries)
            {
                if(e.getKey().equals(key))
                {
                    return (V)e.getValue();
                }
            }
            return null;
        }
    }

    public void put(K key, V value)
    {
        for(Entry e: entries)
        {
            if(e.getKey().equals(key))
            {
                e.setValue(value);
                break;
            }
        }
        entries.add(new Entry<K, V>(key, value));
        counter++;

    }

    public void remove(K key)
    {
        for(int i = 0; i < entries.size(); i++)
        {
            if(entries.get(i).getKey().equals(key))
            {
                entries.remove(i);
                counter--;

            }
        }

    }

    public boolean isEmpty()
    {
        return counter == 0;
    }

    public class Entry<K, V>
    {
        private K key;
        private V value;

        public Entry(K key, V value)
        {
            this.key = key;
            this.value = value;
        }

        public K getKey()
        {
            return key;
        }

        public V getValue()
        {
            return value;
        }

        public void setValue(V value)
        {
            this.value = value;
        }

    }

}
