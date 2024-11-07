import java.util.Scanner;
// Q4 Write a program to print the multiplication table of a number N, entered by the user.
public class LQ4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number for Multiplication Table = ");
        int n = sc.nextInt();
        int mul ;

        for (int i = 1; i <= 10; i++) {
            mul = n*i;
            System.out.println(mul);
            
        }
    }
}