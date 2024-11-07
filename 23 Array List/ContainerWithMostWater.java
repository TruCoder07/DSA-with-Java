import java.util.*;
public class ContainerWithMostWater{
 
    public static int storeWater(ArrayList<Integer> height){
        // Method 1 : 
        // int totalWater = Integer.MIN_VALUE;
        // int currWater ;
        // int h ;
        // int w ;
        // for (int i = 0; i < height.size(); i++) {
        //     for (int j = i+1; j < height.size(); j++) {
        //         h = Math.min(height.get(i), height.get(j));
        //         w = j - i;
        //         currWater = h * w;
        //     }
        //     totalWater = Math.max(currWater, totalWater);
        // }

        // Method 2 : 2 pointer Approch
        int totalWater = Integer.MIN_VALUE;
        int currWater;
        int lp = 0;
        int rp = height.size()-1;
        
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp -lp;
            currWater = ht * width;
            totalWater = Math.max(currWater, totalWater);
            if (height.get(lp) < height.get(rp)) {
                lp++;
            }else{
                rp--;
            }
        }
        return totalWater;
    }
    
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int lp = 0;
        int rp = list.size()-1;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int n = list.size();
        int bp = -1;
        
        for (int i = 0; i < n-1; i++) {
            if (list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        while (rp != lp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }else if (list.get(lp)+list.get(rp) < target) {
                lp = (lp+1) % n;
            }else{ // list.get(lp)+list.get(rp) > target
                rp = (rp+n-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        // Pair Sum 
        System.out.println(storeWater(height));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(pairSum(list, 16));

        // pairSum2

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        int key = 16;
        System.out.println(pairSum2(arr, key));
        
    }
}
