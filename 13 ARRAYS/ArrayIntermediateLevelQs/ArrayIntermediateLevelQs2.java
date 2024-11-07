import java.util.*;
public class ArrayIntermediateLevelQs2 {

// Find the second largest element in an array.

    public static void ArraySecondLargestElement(int n[]){
        int largest=n[0];
        int secLargest=Integer.MIN_VALUE;
        for (int i = 1; i < n.length; i++) {
        
            if(n[i] > largest){
                secLargest=largest;
                largest=n[i];
            }

            else if (largest!=secLargest && secLargest<n[i]) {
                    secLargest=n[i];
            }
        }
        System.out.println("The second largest element of an array = "+secLargest);
    }
    public static void main(String[] args) {
        int marks[] ={83,79,73,78,49};
        ArraySecondLargestElement(marks);
    }
}

// Find the second largest element in an array.right?
