import java.util.*;
public class FirstOccurrence{
    // waf to find the first occurrence of an element in an array
    public static int FirstOccurrenceOfAnArray(int arr[], int key, int i){
        if (i==arr.length) {
            return -1;
        }
        if (arr[i]==key) {
            return i;
        }
        return FirstOccurrenceOfAnArray(arr,key,i+1);
    }

    public static int LastOccurrenceOfAnArray(int arr[], int key, int i){
        
        if (arr[i]==key) {
            return i;
        }
        if (i==0) {
            return -1;
        }
        return LastOccurrenceOfAnArray(arr,key,i-1);
    }
    
    public static void main(String[] args) {
        int n[]={8,3,6,9,5,10,2,5,3};
        int n1[]={5,5,5,5};
        int key = 5;
        System.out.println(FirstOccurrenceOfAnArray(n1, key, 0));
        System.out.println(LastOccurrenceOfAnArray(n1, key, n1.length-1));
        
    }
}