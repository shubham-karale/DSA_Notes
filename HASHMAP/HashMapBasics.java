//Theory on HashMap
/*
    1)HashMap is a part of Java’s collection since Java 1.2.
    2)HashMap stores key-value pairs.
    3)HashMap is known as HashMap because it uses a technique called Hashing.
    4)Hashing is a technique of converting a large String to small String that represents the same String.
    5) HashMap is unordered and unsorted.
    6) HashMap contains duplicate values but not duplicate keys.
 */

import java.util.HashMap;

public class HashMapBasics {

    public static void main(String[] args) {

//        HashMap

        HashMap<String,Integer> map = new HashMap<>();

//       Key = Country Name and Value = Country Code
        map.put("India", 91);
        map.put("USA", 1);
        map.put("UK", 44);
        map.put("Russia", 7);
        map.put("China", 86);

//        Put = Add the Values

//        Search

        if(map.containsKey("India")) {
            System.out.println("India exists");
        } else {
            System.out.println("India doesn't exist");
        }

//        get = get the value of the key
        System.out.println(map.get("India"));
        System.out.println(map.get("USA"));
        System.out.println(map.get("UK"));
        System.out.println(map.get("Russia"));
        System.out.println(map.get("China"));

//        Remove
        System.out.println(map.remove("UK"));


//        Size
        System.out.println(map.size());

//        Iterator
        for(String key : map.keySet()) {
            System.out.print(key + " " + map.get(key));
        }

//        for loop for HashMap
        for(HashMap.Entry<String,Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " " + entry.getValue());
        }


    }

}
