import java.util.*;
public class ArrayBeginnerLevelQs2{

    // Find and print the largest element in an array
    
    public static void largestElement(int [] array){
        int largest = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (largest<array[i]) {
                largest=array[i];
                index = i;
            }
        }
        System.out.println("The largest element in array = "+largest+" , at index = "+index);
    }
    public static void main(String [] args){
        int [] arr={83,79,73,74,95};
        largestElement(arr);

    }
}
// Find and print the largest element in an array.right?