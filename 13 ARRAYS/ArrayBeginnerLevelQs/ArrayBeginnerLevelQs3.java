import java.util.*;
public class ArrayBeginnerLevelQs3{

    // Rotate an array to the right by a given number of steps.

    
    public static void ArrayRotation(int [] arr,int step){
        for(int i = 0; i < step; i++){    
             int last;    
            //Stores the last element of array    
            last = arr[arr.length-1];    
            
            for(int j = arr.length-1; j > 0; j--){    
                //Shift element of array by one    
                arr[j] = arr[j-1];    
            }
            arr[0] = last;  
        } 
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] marks={83,79,73,74,95};
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        ArrayRotation(marks, n);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        

    }
}
// Find and print the largest element in an array.right?