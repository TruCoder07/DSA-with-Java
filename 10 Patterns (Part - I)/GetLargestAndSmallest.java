import java.util.Scanner;
public class GetLargestAndSmallest{

    static int GetLargestAndSmalles(int [] number){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            if (largest<number[i]) {
                largest=number[i];
            }
            if (smallest>number[i]) {
                smallest =number[i];
            }
        }
        System.out.println("The smallest number = "+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int [] number = {24,54,56,6,87,2,22,34};
        System.out.println("The Largets Number ="+GetLargestAndSmalles(number));
    }

}