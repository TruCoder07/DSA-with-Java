import java.util.Scanner;
// Q2.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.

public class LQ2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Set Of intergers");
        System.out.println("Enter interger");
        int n = sc.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(i);      
        }
        int sum = 0;
        if (n%2==0) {
            System.out.println("");
        }
        System.out.println("i after the running loop = " + i );
    }
}