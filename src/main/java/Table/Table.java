package Table;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList<Entry> entries;
    Table table;
    public Table() {
        entries = new ArrayList<Entry>();
    }

    public boolean contains(K key){
        for (Entry entry:entries) {
            if(entry.getKey().equals(key)){
                return true;
            }
        }
        return false;
    }

    public V get(K key){
        for(int i=0;i<entries.size();i++) {
            if (entries.get(i).getKey().equals(key)) {
                return (V) entries.get(i).getValue();
            }
        }
        return null;
    }

    public void put(K key, V value){
        Entry myEntry;
        if(contains(key)){
              myEntry = getEntry(key);
              int index =entries.indexOf(myEntry);
              entries.remove(index);
              entries.add(index,new Entry(key,value));
        }else{
            entries.add(new Entry(key,value));
        }
    }

    public void remove(K key){
        if(contains(key)){
            for (int i=0;i<entries.size();i++) {
                if(entries.get(i).getKey().equals(key)){
                    entries.remove(i);
                }
            }
        }

    }
    public Entry getEntry(K key){
        for(int i=0;i<entries.size();i++) {
            if (entries.get(i).getKey().equals(key)) {
                return entries.get(i);
            }
        }
        return null;

    }






}
