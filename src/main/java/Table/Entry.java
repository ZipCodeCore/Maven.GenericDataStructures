package Table;

public class Entry<K, V> {
    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
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