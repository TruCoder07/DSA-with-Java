// 23 Array List
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListClass{
    
    public static void swapArrayList(ArrayList<Integer>list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static int incMonotonic(ArrayList<Integer> list){
        for (int i = 0; i < list.size()-1; i++){
            if(list.get(i) > list.get(i+1) ){
                return 0;
            }
        }
        return 1;
    }
    public static int decMonotonic(ArrayList<Integer> list){
        for (int i = 0; i < list.size()-1; i++){
            if(list.get(i) < list.get(i+1) ){
                return 0;
            }
        }
        return 1;
    }

    // ARRAYLIST QUESTIONS
    public static boolean isMonotonic(ArrayList<Integer> list){
        int i = 0;
            boolean inc = false;
            boolean dec = false;
            if(list.get(i) >= list.get(i+1) ){
                i = decMonotonic(list);
            }else{
                i = incMonotonic(list);
            }
        if (i == 1) {
            return true;
        }
        return false;
    }
    
    // Question 2 :
    public static ArrayList<Integer> lonelyNumbers(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int alreadyP = -1;
            if (alreadyP == i) {
                continue;
            }
            int temp = list.get(i);
            if (!(isTwice(list, temp))) {
                if (isAdjacentNumber(list, temp) == -1) {
                    newList.add(list.get(i));
                }else{
                    alreadyP = isAdjacentNumber(list, temp);
                }
            }
        }
        return newList;
    }
    // no adjacent numbers (i.e. x + 1 and x - 1)
    public static int isAdjacentNumber(ArrayList<Integer> list, int Key){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == Key+1 || list.get(i) == Key-1) {
                return i;
            }
        }
        return -1;
    }
    public static boolean isTwice(ArrayList<Integer> list, int Key){
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == Key) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        }
        return false;
    } 

    public static void main(String[] args) {
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     arr.add(78);
    //     arr.add(76);
    //     arr.add(98);
    //     System.out.println(arr);

    //     // get operation
    //     System.out.println(arr.get(2));

    //     // remove element
    //     arr.remove(1);
    //     System.out.println(arr);


    // System.out.println(arr.size());

    // for (int i = 0; i < arr.size(); i++) {
    //     System.out.print(arr.get(i)+" ");
    // }
    // System.out.println("");
    // ArrayList<Integer> list = new ArrayList<>();
    // list.add(1);
    // list.add(2);
    // list.add(3);
    // list.add(4);
    // list.add(5);
    // System.out.println("");

    // // Reverse ArrayList 
    // for (int i = list.size()-1; i >=0; i--) {
    //     System.out.print(list.get(i)+", ");
    // }

    // list.add(3, 43);
    // list.add(1, -1);
    // list.add(5,32);

    // int max = Integer.MIN_VALUE;
    // System.out.println(list);
    // for (int i = 0; i < list.size(); i++) {
    //     if (list.get(i) > max) {
    //         max = list.get(i);
    //     }
    // }
    // System.err.println("Largest Element in the ArrayList = "+max);

    // System.out.println(list);
    // int idx1 = 1, idx2 = 3;
    // swapArrayList(list, idx1, idx2);
    // System.out.println("");
    // System.err.println(list);
    // Collections.sort(list);
    // System.out.println(list);
    // Collections.sort(list, Collections.reverseOrder());
    // System.out.println(list);

    // Multi-dimensional ArrayList

    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    ArrayList<Integer> List1 = new ArrayList<>();
    ArrayList<Integer> List2 = new ArrayList<>();
    ArrayList<Integer> List3 = new ArrayList<>();

    mainList.add(List1);
    mainList.add(List2);
    mainList.add(List3);
    List1.add(1);
    List1.add(2);
    List1.add(3);
    List1.add(4);
    List1.add(5);

    List2.add(2);
    List2.add(4);
    List2.add(6);
    List2.add(8);
    List2.add(10);

    List3.add(3);
    List3.add(6);
    List3.add(9);
    List3.add(12);
    List3.add(15);

    // System.out.println(mainList);
    ArrayList<Integer>arr1 = new ArrayList<>();
    arr1.add(1);
    arr1.add(2);
    arr1.add(5);
    arr1.add(4);

    // if (isMonotonic(arr1)) {
    //     System.out.println("Given ArrayList is 'Monotonic'");
    // }else{
    //     System.out.println("Given ArrayList is NOT 'Monotonic'");
    // }

    ArrayList<Integer>arr2 = new ArrayList<>();
    arr2.add(6);
    arr2.add(5);
    arr2.add(4);
    arr2.add(4);

    // if (isMonotonic(arr2)) {
    //     System.out.println("Given ArrayList is 'Monotonic'");
    // }else{
    //     System.out.println("Given ArrayList is NOT 'Monotonic'");
    // }

    // q2
    ArrayList<Integer> newList1 = new ArrayList<>();
    newList1.add(10);
    newList1.add(6);
    newList1.add(5);
    newList1.add(8);
    System.out.println(newList1);
    ArrayList<Integer> newList2 = new ArrayList<>();
    newList2.add(1);
    newList2.add(3);
    newList2.add(5);
    newList2.add(3);
    ArrayList<Integer> newList = new ArrayList<>();
    newList = lonelyNumbers(newList2);
    if (newList == null) {
        System.out.println("NOT Any Lonely Numbers Present in ArrayList");
    }else{
        System.out.println("ArrayList = "+ newList);
    }



}
    
}
