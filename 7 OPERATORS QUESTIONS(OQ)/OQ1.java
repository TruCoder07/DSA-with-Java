import java.util.Scanner;
// In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
public class OQ1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2;
        int b = 5;
        int exp1 = (a*b/a);
        int exp2 = (a*(b/a));
        
        System.out.print(exp1 +" , "+ exp2);         
    }
}