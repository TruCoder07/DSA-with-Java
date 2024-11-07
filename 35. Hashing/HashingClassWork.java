import java.util.*;

public class HashingClassWork{

    public static void majorityEle(int arr[], int k){
        HashMap<Integer, Integer> ele= new HashMap<>(); 
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            
            // My appoach that think first time O(n)
            // int count = 0;
            // if (!ele.containsKey(curr)) {
            //     for (int j = 0; j < arr.length; j++) {
            //         if (curr == arr[j]) {
            //             count++;
            //         }
            //     }
            //     ele.put(curr, count);
            // }

            // if (ele.containsKey(curr)) {
            //     ele.put(curr, ele.get(curr)+1);
            // }else{
            //     ele.put(curr, 1);
            // }
            ele.put(curr, ele.getOrDefault(ele, 0)+1);

        } 

        for (Map.Entry<Integer, Integer> val: ele.entrySet()) {
            if (val.getValue() > n/k) {
                System.out.println(val.getKey());
            }
        }
    }

    public static boolean validAnagram(String s1, String s2){

        if (s1.length() != s2.length()) {
            return false;
        }
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0)+1);
        }

        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);

            if (hm.get(ch) != null) {
                
                if (hm.get(ch) == 1) {
                    hm.remove(ch);
                }else{
                    hm.put(ch, hm.get(ch)-1);
                }
            }else{
                return false;
            }
        }
        return hm.isEmpty();
    }
    // Count Distinct ( Unique ) elements in an array
    public static int countDistinctEle(int arr[]){
        HashSet <Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set.size();
    }

    // Find Union and Intersection of two unsorted arrays
    public static void findUnionAndIntersection(int arr[], int arr1[]){
        HashSet<Integer> set = new HashSet();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        System.out.println("Union = "+set.size()+"\nElements : "+set);

        set.clear();
        int count = 0;
            for (int i = 0; i < arr.length; i++) {
                set.add(arr[i]);
            }
            System.out.print("Elements : ");
            for (int i = 0; i < arr1.length; i++) {
                int curr = arr1[i];
                if (set.contains(curr)) {
                    count++;
                    System.out.print(curr+" ");
                    set.remove(curr);
                }
            }

        System.out.println("\nIntersection = "+count);
    }

    //  Find itinerary from tickets
    public static void findItinerary(HashMap<String, String> hm){

        String Start = new String();
        for(Map.Entry<String, String> val : hm.entrySet()){
            if (!hm.containsValue(val.getKey())) {
                Start = val.getKey();
                break;
            }
        }
        System.out.print("Itinerary:- "+Start);
        // my first thinking
        // for(Map.Entry<String, String> val : hm.entrySet()){
             
        //     if (hm.containsKey(str)) {
        //         System.out.print("-->"+hm.get(str));
        //         str = hm.get(str);
        //         hm.remove(str);
        //     }
        // }

        // while (!hm.isEmpty()) {
        //     if (hm.containsKey(str)) {
        //         String val = str;
                
        //         hm.remove(val);
        //     }
        // }

        for (String key : hm.keySet()) {
            System.out.print("-->"+hm.get(Start));
                Start = hm.get(Start);
        }
    }
    public static void main(String[] args) {
        /*
        HashMap<String, Integer> c = new HashMap<>();
        c.put("india", 150);
        c.put("china", 140);
        c.put("south korea", 3);
        c.put("usa", 15);

        System.out.println(c);
        int population = c.get("india");
        System.out.println(population);

        System.out.println(c.get("Germany"));

        System.out.println(c.containsKey("usa"));
        System.out.println(c.containsKey("butan"));

        System.out.println(c.remove("usa"));
        System.out.println(c);

        System.out.println(c.size());
        // c.clear();
        System.out.println(c.isEmpty());

        // EnteSet<String, Integer> key =  c.entrySet();

        // Iterate
        Set<String> key = c.keySet();
        // System.out.println(key);

        for (String s : key) {
            System.out.println("Key = "+s+", value = "+c.get(s));
        }

        for (Map.Entry<String, Integer> val: c.entrySet()) {
            System.out.println(val);
        }

        System.out.println(c);
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("india", 150);
        lhm.put("china", 140);
        lhm.put("south korea", 3);
        lhm.put("usa", 15);

        System.out.println(lhm);

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("india", 150);
        tm.put("china", 140);
        tm.put("south korea", 3);
        tm.put("usa", 15);

        System.out.println(tm);
 */
        // Q1
        int arr[]  = {1,3,2,5,1,3,1,5,1};
        int k = 3;
        // majorityEle(arr, k);

        //  Q2 Valid Anagram
        String s1 = "race";
        String s2 = "care";
        System.out.println(validAnagram(s1, s2));

        // Count Distinct ( Unique ) elements in an array
        int arr2[] = {2,3,4,5,6,7,3,4,2,1};
        System.out.println("Total Distinct ( Unique ) elements in this array is:"+countDistinctEle(arr2));
        
        //  Find Union and Intersection of two unsorted arrays
        int arr1[] = {7, 1, 5, 2, 3, 6}, arr3[] = {3, 8, 6, 20, 7};
        findUnionAndIntersection(arr3, arr1);

        HashMap<String, String> hms = new HashMap<>();
        hms.put("Chennai", "Bengaluru");
        hms.put("Mumbai", "Delhi");
        hms.put("Goa", "Chennai");
        hms.put("Delhi", "Goa");

        findItinerary(hms);
    }
}


