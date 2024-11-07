import java.util.*;
public class ArrayBeginnerLevelQs3a{

    // Rotate an array to the right by a given number of steps.

    
    public static void ArrayRightSideRotation(int [] arr,int step){
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

    public static void ArrayLeftSideRotation(int arr[],int step){
            int temp[]=new int[step];
            for (int i = 0; i < temp.length; i++) {
                temp[i]=arr[i];
            }
            for (int i = temp.length; i < arr.length; i++) {
                arr[i-temp.length]=arr[i];
            }
            for (int i = 0; i < temp.length; i++) {
                arr[arr.length-temp.length+i]=temp[i];
            }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int [] marks={83,79,73,74,95};
        System.out.print("Enter the number = ");
        int n = sc.nextInt();
        System.out.println("The original Array:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println("");
        ArrayRightSideRotation(marks, n);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println("");
        System.out.println("The original Array:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        System.out.println("");
        ArrayLeftSideRotation(marks, n);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }
        

    }
}
// Find and print the largest element in an array.right?