import java.util.Scanner;
// Write a program to find the factorial of any number entered by the user.
public class Factorial{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number = ");
        int n = sc.nextInt();
        int factorial = 1;

        for (int i = 1; i<=n; i++) {
            factorial = factorial * i;
        }
        System.out.println(n+"! = "+factorial);
    }
}
