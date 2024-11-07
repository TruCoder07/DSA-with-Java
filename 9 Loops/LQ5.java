import java.util.Scanner;
// Q5. What is wrong in the following program?
public class LQ5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i );      
        }
        System.out.println("i after the running loop = " + i );
    }
}