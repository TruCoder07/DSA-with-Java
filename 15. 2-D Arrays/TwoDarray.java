import java.util.*;

public class TwoDarray {
    // Input
    public static boolean searchIn2Darry(int n[][], int key) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if (n[i][j] == key) {
                    System.out.println("Index = " + i + "," + j);
                    return true;
                }
            }
        }
        return false;
    }

    public static void largestAndsmallestIn2dArray(int n[][]) {
        int largest = Integer.MIN_VALUE;
        int currLar=n[0][0];
        int smalest = Integer.MAX_VALUE;
        int currSma=n[0][0];
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if (n[i][j] > currLar) {
                    currLar = n[i][j];
                }
                if (n[i][j] < currSma) {
                    currSma = n[i][j];
                }
            }
            if (largest<currLar) {
                largest=currLar;
            }
            if (smalest>currSma) {
                smalest=currSma;
            }
        }
        System.out.println("The Largest element of 2D Array = "+largest);
        System.out.println("The Smallest element of 2D Array = "+smalest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter [" + i + "][" + j + "] cell = ");
                num[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(num[i][j]+" ");
            }
            System.out.println("");
        }
        largestAndsmallestIn2dArray(num);
        
    }
}