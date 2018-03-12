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

    @SuppressWarnings("unchecked")
    public Table() {
        this.entries = new ArrayList();
    }

    @SuppressWarnings("unchecked")
    public V get(K foo) {
        for (Entry submission : entries) { //for each submission in my entries array
            if (submission.getKey().equals(foo)) { //if key of my submission object is equal to the key passed in
                return (V)submission.getValue(); //return that value mapped to that key
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
        for (int i = 0; i < entries.size(); i++){ //iterate through arrayList
            if (entries.get(i).getKey().equals(foo)) //if the key of the current index of entries is equal to foo
                entries.remove(i);//if the above is true then remove it
        }
    }
}
