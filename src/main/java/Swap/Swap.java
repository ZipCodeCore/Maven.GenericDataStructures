package Swap;

/**
 * Keep this.  Just make it so the tests pass.
 */
public class Swap {
    public static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }
}

//Explanation
//Stating Generic T is equal to the indexes i of values
//those indexes are also equal to the indexes j of values
//and index j of values equals temp
//now return values