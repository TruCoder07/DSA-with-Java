import java.util.Scanner;

public class BinarySearch01 {

    public static int binarySearch(int[] num, int key) {
        int start = 0, end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == key) {
                return mid;
            } else if (num[mid] < key) {
                start = mid + 1; // Update the start pointer
            } else {
                end = mid - 1; // Update the end pointer
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int nums[] = {2, 4, 5, 6, 7, 9, 12, 67};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Key = ");
        int key = sc.nextInt();

        int result = binarySearch(nums, key);

        if (result == -1) {
            System.out.println("Your Key NOT FOUND");
        } else {
            System.out.println("Your key index: " + result);
        }

    }
}
