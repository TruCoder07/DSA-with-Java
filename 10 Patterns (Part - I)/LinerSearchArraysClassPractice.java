import java.util.Scanner;

public class LinerSearchArraysClassPractice{

    public static int SearchKey(int [] n , int key ){
    for (int i = 0; i < n.length; i++) {
        if (n[i]==key) {
           return i;
        } 
    }
    return -1;
    }
    public static void main(String[] args) {
        int marks [] = {95,96,97,98,99};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Search Key = ");
        int key = sc.nextInt();
        int index = SearchKey(marks, key);

        if (index==-1) {
            System.out.println("Your Search Key is NOT FOUND");
        } else {
            System.out.println("Your Search Key at index "+index);
        }
        
            
        }
}
