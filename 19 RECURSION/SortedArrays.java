import java.util.*;
public class SortedArrays{
    
    static boolean isSortedArray(int n[], int i){
        
        if ( i == n.length-1 ){
            return true;
        }
        if (n[i]>n[i+1]) {
            return false;
        }
        return  isSortedArray(n, i+1);
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The program print Sorted Arrays or Not :");
        int arr[]={1,2,3,4};
        System.out.println(isSortedArray(arr, 0););
         
    }
}