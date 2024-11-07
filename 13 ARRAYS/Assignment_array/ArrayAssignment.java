import java.util.*;
public class ArrayAssignment{

    public static boolean containsDuplicate(int arr[]){
        int count;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            int curr = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (curr == arr[j]) {
                    count++;
                }
            }
            if (count >= 2) {
                return true;
            }
        }
        return false;
    }

    //  Q2 
    public static int searchInSortedAndRotatedArray(int arr[], int key){
        int si =0, ei = arr.length-1;
        while (si <= ei) {
            int mid = si+(ei-si)/2;
            // int mid = (si+ei)/2;

            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                if (arr[si] <= key && key < arr[mid]) {
                    ei = mid -1;
                }else{
                    si = mid +1;
                }
            }else{
                if (arr[mid] < key && key <= arr[ei]) {
                    si = mid+1;
                }else{
                    ei = mid - 1;
                }
            }
        }
        return -1;
    }

    //  Q 3
    public static int maximumProfit(int price[]){
        int maxProfit = 0;
        int myBuyPrice = Integer.MAX_VALUE;

        for (int i = 0; i < price.length; i++) {
            int todayPrice = price[i];
            if (myBuyPrice < todayPrice) {
                int profit = todayPrice - myBuyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }else{
                myBuyPrice = todayPrice;
            }
        }
        return maxProfit;
    }
    // Q4 Trap Water
    public static int maxTrapWater(int height[], int width){
        int n= height.length;
        int trapWater = 0;
        int leftMax[]= new int[n];  
        int righMax[] = new int[n];

        // calcute left max
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // calcute Right max
        righMax[n-1] = height[n-1];
        for (int i = n-1-1; i >= 0; i--) {
            righMax[i] = Math.max(height[i], righMax[i+1]);
        }

        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], righMax[i]);
            trapWater+=(waterLevel-height[i])*width; // width mean bar height width in maximum cases width= 1
        }
        return trapWater;
    }

    // Q5
    public static void printTriplets(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i+1; j < arr.length; j++) {
    
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k] == 0) {
                        System.out.print("["+arr[i]+","+arr[j]+","+arr[k]+"]");
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        // Q1
        int num1[]={1, 1, 3, 3, 2, 3, 1};
        containsDuplicate(num1);
        if (containsDuplicate(num1)) {
            System.out.println("Any value appears at least twice");
        } else {
            System.out.println("Every element is distinct");
        }
        // Q2
        int arr2[] = {4,5,6,7,0,1,2};
        int key = 0;
        System.out.println(searchInSortedAndRotatedArray(arr2, key));

        // Q3 
        // int price[] = {7,1,5,3,6,4};
        int price2[] = {7,6,5,4,3,2,1};
        System.out.println("Maximum profit = "+maximumProfit(price2));

        // Q4
        int arr4[]  = {0,1,0,2,1,0,1,3,2,1,2,1};
        int height[] = {4,2,0,3,2,5};
        int width = 1;
        System.out.println("Maximum Trap water = "+maxTrapWater(height,width));

        // Q5
        int arr5[] = {-1,0,1,2,-1,-4};
        printTriplets(arr5);
    }
}