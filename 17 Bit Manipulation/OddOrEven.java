import java.util.Scanner;
public class OddOrEven{
    public static void bitOddOrEven(int n){
        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number = ");
        int n = sc.nextInt();
        bitOddOrEven(n);
        bitOddOrEven(4);
        bitOddOrEven(100);
        bitOddOrEven(11);
    }
}