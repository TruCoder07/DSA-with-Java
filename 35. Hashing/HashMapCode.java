import java.util.*;

public class HashMapCode {
    
    static class HashMap<K,V> { // generic
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of elements
        private int N; // number of buckets
        private LinkedList<Node> buckets[]; 

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.n = 0; // start with 0 elements
            this.N = 4; // initial bucket size
            this.buckets = new LinkedList[4]; 
            for (int i = 0; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key.equals(key)) {
                    return i; // return index of the key in the linked list
                }
            }
            return -1; // key not found
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[N * 2]; // double the bucket size
            N = 2 * N; // update bucket count

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            // reinsert old elements
            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for (Node node : ll) {
                    put(node.key, node.value); // rehash and put nodes into new buckets
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key); // bucket index
            int di = searchInLL(key, bi); // data index in linked list

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value; // update value if key exists
            } else {
                buckets[bi].add(new Node(key, value)); // add new node
                n++; // increment size
            }

            // rehash if load factor exceeds 2.0
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            return di != -1;
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            }
            return null; // key not found
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].remove(di);
                n--; // decrement size
                return node.value;
            }
            return null; // key not found
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key); // add all keys to the list
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("india", 150);
        hm.put("china", 140);
        hm.put("south korea", 3);
        hm.put("usa", 15);

        ArrayList<String> keys = hm.keySet();

        for (String key : keys) {
            System.out.println(key + " -> " + hm.get(key));
        }

        System.out.println(hm.get("india"));
        System.out.println(hm.remove("india"));
        System.out.println(hm.get("india"));
    }
}
