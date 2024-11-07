import java.util.*;
public class ArrayIntermediateLevelQs1{

    // Given two arrays, write a Java program to find their intersection.

    public static void ArrayInterSection(int arr1[], int arr2[]){
        int c=3;
        int intersection[]= new int [c];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    c=0;
                    intersection[c]=arr1[i];
                    c++;
                }
            }
        }

        if (intersection.length>0) {
            System.out.print("Intersection of two array = ");
            for (int i = 0; i < intersection.length; i++) {
            System.err.print(intersection[i]+" ");
            }
        } else {
            System.out.print("NO Intersection in given arrays");
        }

        

    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int marks[] ={83,79,73,79,49};
        int marks2[] ={92,61,79,73,83}; 
        ArrayInterSection(marks, marks2);
    }
}
// Write a function to check if an array is a palindrome..right?