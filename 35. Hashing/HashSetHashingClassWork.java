import java.util.*;
public class HashSetHashingClassWork{
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(null);
        hs.add(3);
        hs.add(4);
        hs.add(5);

        // System.out.println(hs);
        // System.out.println(hs.contains(null));
        

        // hs.remove(null);
        // System.out.println(hs.size());

        // Iterate
        Iterator itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        for(Integer i : hs){
            System.out.println(i);
        }
    }
}