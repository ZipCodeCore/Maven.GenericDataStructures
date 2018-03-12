package TableNested;

import Table.Entry; //imported the entire table entry class
import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Entry> entries;

    @SuppressWarnings("unchecked")
    public TableNested() {
        this.entries = new ArrayList();
    }

    @SuppressWarnings("unchecked")
    public V get(K foo) {
        for (Entry submission : entries) { //for each submission in my entries array
            if (submission.getKey().equals(foo)) { //if key of my submission object is equal to the key passed in
                return (V) submission.getValue(); //return that value mapped to that key
            }
        }
        return null;
    }

    public void put(K foo, V i) {
        remove(foo); //remove foo from the key
        Entry<K, V> entry = new Entry<>(foo, i); //create empty entry object for table
        entries.add(entry); //add foo back into the empty entry within entries
    }

    public void remove(K foo) {
        for (int i = 0; i < entries.size(); i++) { //iterate through arrayList
            if (entries.get(i).getKey().equals(foo)) //if the key of the current index of entries is equal to foo
                entries.remove(i);//if the above is true then remove it
        }
    }
}
