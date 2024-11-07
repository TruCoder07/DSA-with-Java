import java.util.*;
public class ReverseArray{
    public static int[] reverseTheArray(int arr[]){
        int n = arr.length;
        int si = 0, ei = n-1;
        for (int i = si , j = ei; i < n/2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    } 

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print("Array = {"+arr[i]+", ");
            }else if (i == arr.length-1) {
                System.out.print(arr[i]+"}");
            }else{
                System.out.print(arr[i]+", ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,3,46,75,98};
        printArray(arr);
        arr = reverseTheArray(arr);
        System.out.println("");
        printArray(arr);
    }
}