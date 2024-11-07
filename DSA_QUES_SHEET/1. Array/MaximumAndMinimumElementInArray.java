import java.util.*;
public class MaximumAndMinimumElementInArray{
    public static int MaximumEle(int arr[]){
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            curr = arr[i];
            max = Math.max(max, curr);
        }
        return max;
    } 

    public static int MinimumEle(int arr[]){
        int curr = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            curr = arr[i];
            min = Math.min(min, curr);
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,3,46,75,98};
        int max = MaximumEle(arr);
        int min = MinimumEle(arr);

        System.out.println("Maximum Element this Array = "+max+ "\nMinimum Elementin this Array = "+ min);
    }
}