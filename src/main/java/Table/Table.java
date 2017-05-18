package Table;

import java.util.ArrayList;
import java.util.Map;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList <Entry> entries;
    private static int counter;

    public Table()
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
}
