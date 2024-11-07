public class ContainsDuplicate{
    /*
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    */
    public static boolean containsDuplicate(int number[]){
        int c = number[0];
        for(int i=0; i<number.length-1; i++){
            for (int j = 1; j < number.length; j++) {
                if (number[i]==number[j]) {
                // System.out.println("Value appears at least twice");
                return true;
            }
            }
        }
        // System.out.println("Value not appears at least twice");
        return false;
    }
    public static void main(String args[]){
        int nums []= {1,2,3,1};

        boolean c =containsDuplicate(nums);
        System.out.println(c);
    }
}