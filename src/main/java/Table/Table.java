package Table;

import java.util.ArrayList;

/**
 * This class needs to manage an ArrayList of Entry objects.
 * <p>
 * It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.
 * <p>
 * It needs a put method that takes a key and value and makes an entry with key, value.
 * <p>
 * NOTE: There cannot be two entries with the same key.
 * <p>
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList<Entry> entries;

    public Table() {
        entries = new ArrayList<>();
    }

    public Object get(K key) {
        for (Entry entry : entries) {
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
        }
        return null;
    }


    public void put(K key, V value) {
        int count = 0;
        for (Entry entry : entries) {
            if (entry.getKey().equals(key)) {
                entries.set(count, new Entry(key, value));
                count++;
            }
        }
        entries.add(new Entry(key, value));
    }

    public void remove(K key) {
        for (int i = 0; i < entries.size(); i++) {
            if (entries.get(i).getKey().equals(key)) {
                entries.remove(i);
            }
        }
    }
}


//Table -- Implemented for you is Entry<K, V>.
//        Implement Table<K,V> so that it manages an ArrayList of Entry<K,V>.

//         You must implement get which takes a key and returns either the entry
//        from the ArrayList with that key, or null if none is found.

//        put which takes a key and value and sets the value in the ArrayList to Entry(key, value);

//        Remember, a key point to exactly one value
//        remove which takes a key and removes it from the ArrayList if it's in there.

//        It's a void method; no return type.