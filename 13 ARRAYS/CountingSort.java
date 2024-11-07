import java.util.*;
public class CountingSort{

    static void sortingBycounting(int arr []){
        int largest=0;
        for (int i = 0; i < arr.length; i++) {
            largest= Math.max(largest, arr[i]);
        }
    }
public static void main(String[] args) {
    int marks[]={24,23,35,16,17};
    Arrays.sort(marks);
    for (int i = 0; i < marks.length; i++) {
        System.out.print(marks[i]+" ");
    }
    System.out.println("");
    int arr[]={5,4,3,2,1};
    Arrays.sort(arr,0,3);
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}

}