import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        // Find the first element from the right that is not in decreasing order
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        // If such an element is found, find the smallest element from the right that is greater than it
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            // Swap the two elements
            swap(nums, i, j);
        }
        // Reverse the elements from i+1 to the end to get the next permutation
        reverse(nums, i + 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2,4,1,7,5,0 };
        // int nums[] ={3,2,1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}