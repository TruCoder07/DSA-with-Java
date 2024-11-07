import java.util.Scanner;
public class BinarySearch{

    public static int BinarySearchx(int[]num, int key){
        int start = 0, end=num.length-1;

        while (start<=end) {
            int mid = (start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            else if(num[mid]<key){
                mid=mid+1;
            }
            else{
                mid=mid-1;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        
        int nums [] ={2,4,5,6,7,9,12,67};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Key = ");
        int key = sc.nextInt();

        int result = BinarySearchx(nums,key);

        if (result==-1) {
            System.out.println(" Your Index Key NOT FOUND");
        } else {
            System.out.println("Your key index ;"+result);
        }

    }

}