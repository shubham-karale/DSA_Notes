//Note: HashSet is a collection of items where every item is unique, and it is found in the java.util package:

// HashSet Operations
// 1. add() - adds an item to the set
// 2. remove() - removes an item from the set
// 3. clear() - removes all items from the set
// 4. contains() - returns true if an item exists in the set
// 5. size() - returns the number of elements in the set
// 6. isEmpty() - returns true if the set is empty, and false if the set is not empty

// HashSet Operation
/*
  1) add = O(1)
    2) remove = O(1)
    3) contains = O(1)
 */

import java.util.HashSet;
import java.util.Iterator;

public class HashSetBasics {
    public static void main(String[] args) {
        System.out.println("HashSet Concept");
        HashSet<Integer> set = new HashSet<>();
//        Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        System.out.println(set);

//        Remove
        set.remove(2);
        System.out.println(set);

//        Contains

        System.out.println(set.contains(3));

//        Size
        System.out.println(set.size());

//        Iterator

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
