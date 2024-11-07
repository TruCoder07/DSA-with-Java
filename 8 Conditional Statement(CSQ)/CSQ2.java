import java.util.Scanner;
// In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
public class CSQ2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number a = ");        
        int a = sc.nextInt();
        System.out.print("Enter Number b = ");
        int b = sc.nextInt();
        System.out.print("Enter Number c = ");
        int c = sc.nextInt();
        
        if(a>=b && a>=c){
            System.out.print("Largest of 3 = a");  
        }
        else if (b>=c) {            
            System.out.print("Largest of 3 = b");  
        }
        else{
            System.out.print("Largest of 3 = c");  
        }       
    }
}