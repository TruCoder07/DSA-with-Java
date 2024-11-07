import java.util.*;
public class SortedArray{
    
    public static boolean isSortedArray(int arr[], int i){
        if (i==arr.length-1) {
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
        return isSortedArray(arr, i+1);
    }
    
    public static void main(String[] args) {
        int n[]={1,2,3,4};
        System.out.println(isSortedArray(n, 0));
        isSortedArray(n, 0);
    }
}