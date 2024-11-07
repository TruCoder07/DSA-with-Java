import java.util.Scanner;
public class FunctionPracticeQuestions{
    static int calculateSum(int a, int b) {
        int sum = a + b;
    return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x = ");
        int x = sc.nextInt();
        System.out.println("Enter y = ");
        int y = sc.nextInt();
        int sum = calculateSum(x, y);  
        System.out.println("Sum = "+ sum);      
    }
} 