import java.util.*;
public class SortingAssignment{
    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array by Bubble Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void selectionSorting(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i+1; j < arr.length-1; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            if (max != i) {
                int temp = arr[max];
                arr[max] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.println("Sorted Array by Selection Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void insertionSort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while (prev >= 0 && curr > arr[prev]) {
                arr[prev+1] = arr[prev];
                prev = prev-1;
            }
            arr[prev+1] = curr;
        }
        System.out.println("Sorted Array by Insertion Sort:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr);
        selectionSorting(arr);
        insertionSort(arr);
    }
}