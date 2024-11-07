import java.util.Scanner;
public class SWAP{
    public static void swaping(int a, int b, int c){
        int temp = a;
        a=b;
        b=c;
        c=temp;
        System.out.println("After swap the value of a , b & c = "+a+" , "+b+" , "+c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b = ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c = ");
        int c = sc.nextInt();
        System.out.println("Before swap the value of a , b & c = "+a+" , "+b+" , "+c);
        swaping(a, b, c);
    }

}