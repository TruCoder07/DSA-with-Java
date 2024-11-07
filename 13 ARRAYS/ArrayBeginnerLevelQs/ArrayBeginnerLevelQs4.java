import java.util.*;
public class ArrayBeginnerLevelQs4{

    // Calculate and print the average of elements in an array.

    public static float AverageOfArray(int arr[]){
        float sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        float avg = sum / arr.length;
        return avg;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int marks[] ={83,79,73,74,95};
        System.out.print("The Average Of Array = "+AverageOfArray(marks));
        
    }
}
// Calculate and print the average of elements in an array.right?