import java.util.Scanner;
public class FindOutInteger{
    public static void findTheKey(int nums[], int key){
        boolean isKey=false;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==key){
                isKey=true;
                break;
            }
        }
        if (isKey==true) {
            System.out.print("Key is Founded in Array");
        } else {
            System.out.print("Key is not Found in Array ");
        }
    }
    public static void main(String[] args) {
        int nums[]={83,79,72,73,59};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr Your Key = ");
        int n = sc.nextInt();
        findTheKey(nums, n);
    }
}