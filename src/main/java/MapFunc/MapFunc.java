package MapFunc;


import java.util.ArrayList;
import java.util.function.Function;

/**
 * Create a function called `map` that takes an ArrayList and a `Function<T,R>` object,
 * and returns an ArrayList with all of the elements of the first after the function is applied to them.
 */
public class MapFunc<T,R> {

    private EntryPair<T,R> entry;
    private Function<T,R> function;

    public EntryPair<T, R> getEntry() {
        return entry;
    }

    public Function<T, R> getFunction() {
        return function;
    }

    public static <T,R> ArrayList<EntryPair<T,R>> map(ArrayList<T> array, Function<T,R> function) {
        ArrayList<EntryPair<T,R>> arrayList = new ArrayList<>();
        for(int i = 0; i<arrayList.size(); i++) {
            R result = function.apply(array.get(i));
            T t = array.get(i);
            entry =
            arrayList.add(new EntryPair(t,result));
        }
        return arrayList;
    }


//
//    public R get(T key) {
//        R value = null;
//        for (int i = 0; i < arrayList.size(); i++) {
//            T entryKey = (T) arrayList.get(i).getKey();
//            if (entryKey.equals(key)) {
//                value = (R)arrayList.get(i).getValue();
//            }
//        }
//        return value;
//    }
//    public int size(){
//        return entries.size();
//    }
//
//    public void put(K key, V value) {
//        if(entries.size() == 0){
//            entries.add(new Entry<>(key,value));
//        }
//        else{
//            for (int i = 0; i < entries.size(); i++) {
//                K entryKey = entries.get(i).getKey();
//                if ((entries.get(i).getKey()).equals(key)) {
//                    entries.set(i, new Entry<>(key, value));
//                } else {
//                    entries.add(new Entry<>(key, value));
//                }
//            }
//        }
//
//    }
//
//    public void remove(K key) {
//        for (int i = 0; i < entries.size(); i++) {
//            K entryKey = entries.get(i).getKey();
//            if (entryKey.equals(key)) {
//                entries.remove(i);
//            }
//        }
//    }
}
