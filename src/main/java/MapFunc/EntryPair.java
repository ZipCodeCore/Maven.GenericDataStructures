package MapFunc;

public class EntryPair<K,V> {
    private K key;
    private V value;

    public EntryPair(K key, V value) {
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
