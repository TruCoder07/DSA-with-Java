import java.util.*;
// Maximum-Subarray using Kadane's Algorithm 
public class MaximumSubarray{
    public static int maxSubArray(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
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
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};// 6 ; 5,4,-1,7,8; 6 ;1 =1 
        int maxSubArray = maxSubArray(arr);

        System.out.println("Max Sub Array = "+maxSubArray);
    }
}