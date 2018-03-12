package Table;

import java.lang.annotation.ElementType;
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
        entries= new ArrayList<>();
    }

//    public V get(K key){
//
//        for (Entry element: entries){
//            if (element.getKey().equals(key)){
//                return (V) element.getValue();
//            }
//        }
//
//        return null;
//
//    }

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
