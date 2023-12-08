//HashMap Implementation

//STEPS:
/*
       1) Create class of hashmap as Key and Value as params
       2) Create Node class and create cosnstructor of it with key and value as params
       3) Create two var n,N n = number of key-value pairs, N = hash table size
       4) Create arrays of LL of name buckets
       5)Create constructor of hashmap class intialize n and arrays of LL
       6) Run a Loop on the LL for initialzing the LL to 0
       
     ** Put Function **
    1. Find the bucket index
    2. Find the Data Index
    3. If the key is already present then update the value
    4. Else add the new node in the linked list
 */

import java.util.HashMap;
import java.util.LinkedList;

public class HashMapImplementation {

    static class HashMap<K, V> {  // K = Key, V = Value Create Objects of HashMap class that is why we have used static
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; //number of key-value pairs
        private int N; //hash table size

        private LinkedList<Node>[] buckets; //array of linked lists

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];

            //            Creating empty linked lists on each index of array

            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }
        //        Put function
        //        NOTE:
                /*
                1. Find the bucket index
                2. Find the Data Index
                3. If the key is already present then update the value
                4. Else add the new node in the linked list
                 */

        public void put(K key, V value) {
            //            1. Find the bucket index
            int bucketIndex = hashFunction(key);
            //            2. Check if the key is already present in the linked list
            int dataIndex = searchInLL(key, bucketIndex);

            if (dataIndex == -1) { //key doesn't exist

                buckets[bucketIndex].add(new Node(key, value));
                n++;

            }
            //            3. If the key is already present then update the value
            else {
                Node data = buckets[bucketIndex].get(dataIndex);
                data.value = value;
            }
//                    If the arrays becomes full increase the length of arrays
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }


        }

        //     Remove function

        public V remove(K key) {
            //            1. Find the bucket index
            int bucketIndex = hashFunction(key);
            //            2. Find the data index
            int dataIndex = searchInLL(key, bucketIndex);
            if (dataIndex == -1) {
                return null;
            } else {
                Node data = buckets[bucketIndex].remove(dataIndex);
                n--;
                return data.value;
            }
        }


        //    get function

        public V get(K key) {
            //            1. Find the bucket index
            int bucketIndex = hashFunction(key);
            //            2. Find the data index
            int dataIndex = searchInLL(key, bucketIndex);
            if (dataIndex == -1) {
                return null;
            } else {
                Node data = buckets[bucketIndex].get(dataIndex);
                return data.value;
            }
        }

        //        Contains Key function

        public boolean containsKey(K key) {
            //            1. Find the bucket index
            int bucketIndex = hashFunction(key);
            //            2. Find the data index
            int dataIndex = searchInLL(key, bucketIndex);
            if (dataIndex == -1) {
                return false;
            } else {
                return true;
            }
        }

        //        isEmpty function

        public boolean isEmpty() {
            return n == 0;
        }


        private int hashFunction(K key) {

            //            return the random bucketIndex
            //            key.hashCode() will return the hashcode of the key
            int bucketIndex = key.hashCode();
            //            Math.abs will return the absolute value of the bucketIndex
            bucketIndex = Math.abs(bucketIndex);
            return bucketIndex % N;
            //            Value of bucketIndex will be between 0 to N-1

        }

        private int searchInLL(K key, int bucketIndex) {
            //            1. Find the LL on the given bucketIndex
            LinkedList<Node> ll = buckets[bucketIndex];
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == (key)) {
                    return i; //data Index
                }
            }
            return -1;

        }

        private void rehash() {

            //            1. Create a new buckets array of size 2N
            //            Purane data ko old buckets me store kiya hai
            LinkedList<Node>[] oldBuckets = buckets;
            //N = 2*N; //doubling the size of the array
            buckets = new LinkedList[N * 2]; //creating a new array of size 2N
            //            2. Create empty linked lists on each index of the array

            //            NOTE: We have to create empty linked lists on each index of the array
            for (int i = 0; i < N * 2; i++) {
                buckets[i] = new LinkedList<>();
            }

            //            Ek ek old bucket ko nikalna hai aur use new bucket me store karna hai
            for (int i = 0; i < oldBuckets.length; i++) {
                //                Har buckets index par LL hogi so we have to iterate over the LL
                LinkedList<Node> oldLL = oldBuckets[i];

                for (int j = 0; j < oldLL.size(); j++) {
                    Node node = oldLL.get(j);
                    put(node.key, node.value);
                }

            }
            //n = 0;

        }


    }

    public static void main(String[] args) {

        System.out.println("HashMap Implementation");
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 91);
        map.put("USA", 1);
        map.put("UK", 44);
        map.put("Russia", 7);
        //map.put("China",86);

        System.out.println(map.get("India"));


    }

}
