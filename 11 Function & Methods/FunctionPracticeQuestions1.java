import java.util.Scanner;
public class FunctionPracticeQuestions1{
    /* 
    static int Product(int x, int y){
        int product = x * y;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of a = ");
        int a = sc.nextInt();
        System.out.println("Enter number of b = ");
        int b = sc.nextInt();
        int product = Product(a, b);
        System.out.println("Product of A&B = "+ product);
        }
        */
        public static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        swap(a, b);
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
}