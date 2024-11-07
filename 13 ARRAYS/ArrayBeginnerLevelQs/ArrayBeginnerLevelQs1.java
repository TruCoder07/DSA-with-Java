import java.util.*;
public class ArrayBeginnerLevelQs1{

    // Write a Java program to find the sum of all elements in an array.
    
    public static int sumOfAllElement(int [] array){
        int totalSum = 0;
        for (int i = 0; i < array.length; i++) {
            totalSum+=array[i];
        }
        return totalSum;
    }
    public static void main(String [] args){
        int [] arr={83,79,73,74,59};
        System.out.println("The sum of all elements in array = "+sumOfAllElement(arr));

    }
}