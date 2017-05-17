# Generics MicroLabs
The microlabs for the Generics chapter are all grouped together.  So, you need to work through them package by package.
The following list is the package name followed by a quick description of the assignment.
1. StackArrayList -- Implement `Stack<E>` to use an ArrayList as a stack.  You need to make the `push`, `pop`, and
`isEmpty` functions.
2. StackArray -- Implement `Stack<E>` to use an array as a stack.  You'll need to potentially grow the array in the 
`push` method.  Do this first with an `E[]` array, and then again with an `Object[]` array.  Both should compile
without warnings and pass the tests.
3. Table -- Implemented for you is Entry<K, V>.  
Implement Table<K,V> so that it manages an ArrayList of Entry<K,V>.  You must implement
    * `get` which takes a key and returns either the entry from the ArrayList with that key, or null if none is found.
    * `put` which takes a key and value and sets the value in the ArrayList to Entry(key, value);
        * Remember, a key point to exactly one value
    * `remove` which takes a key and removes it from the ArrayList if it's in there.  It's a void method; no return type.
4. TableNested -- Take the previous microlab, and make Entry a nested class.  Think about if it'll need to be generic
or not.