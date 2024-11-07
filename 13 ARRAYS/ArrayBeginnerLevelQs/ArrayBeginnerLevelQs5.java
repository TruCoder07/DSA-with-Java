import java.util.*;
public class ArrayBeginnerLevelQs5{

    // Write a function to check if an array is a palindrome.

    public static boolean isPalindrome(int arr[]){
        for (int i = 0; i < arr.length/2; i++) {
            if(arr[i]!=arr[arr.length-1-i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int marks[] ={83,79,73,79,83};
        if (isPalindrome(marks) == true) {
            System.out.println("The given array is palimdrome.");
        } else {
             System.out.println("The given array is NOT palimdrome.");
        }
        
    }
}
// Write a function to check if an array is a palindrome..right?