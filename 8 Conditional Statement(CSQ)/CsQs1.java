import java.util.Scanner;
public class CsQs1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your  Number = ");
        int num = sc.nextInt();

        if(num>=0){
            System.out.println("Your Number is POSITIVE");
        }
        else{
            System.out.println("Your Number is NEGATIVE");
        }
    }
} 