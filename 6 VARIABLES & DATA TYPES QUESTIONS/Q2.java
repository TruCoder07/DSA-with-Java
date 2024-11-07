import java.util.Scanner;
// In a program, input the side of a square. You have to output the area of the square.

public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter square lenth = "); 
        int l = sc.nextInt();
        float area = l*l;
        System.out.print("Area of square = "+ area);         
    }
}