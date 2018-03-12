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

    public Table() {
        this.entries = new ArrayList();
    }

    public V get(K foo) {
        for (Entry submission : entries){ //for each submission in my entries array
            if (submission.getKey().equals(foo)){ //if key of my submission object is equal to the key passed in
                return (V) submission.getValue(); //return that value mapped to that key
            }
        }
        return null;
    }
//        for (int i = 0; i < entries.size(); i++){
//            if (entries.get(i).equals(foo)){
//                Object key = entries.get(i);
//            }
//        }
//        return ;
//    }
    public V put(K foo, V i) {
        return null;
    }

    public void remove(K foo) {
    }
}
