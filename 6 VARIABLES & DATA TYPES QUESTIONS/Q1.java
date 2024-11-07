import java.util.Scanner;
// In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ave = (a+b+c)/3;
        System.out.print("Average of these 3 numbers = "+ ave);         
    }
}