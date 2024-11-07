import java.util.*;
// Chocolate Distribution Problem
public class ChocolateDistribution{
    
    public static int minimumDifference(int arr[], int m){
        int minDiff = 0;
    
         
        return minDiff;
    }
    public static void main(String[] args) {
        // arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5 ans= 2 ; arr[] = {3, 4, 1, 9, 56, 7, 9, 12} , m = 5 ANS = 6 ;arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50} ,    m = 7  Minimum Difference is 10 

        int arr[] = {7, 3, 2, 4, 9, 12, 56};
        int m = 5;

        int minDiff = minimumDifference(arr, m);

        System.out.println("Min Difference = "+minDiff);
    }
}