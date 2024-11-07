import java.util.Scanner;
// In a program, input 3 numbers : A, B and C. You have to output the average of these 3 numbers.
public class CSQ{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Annul income = ");
        float income = sc.nextFloat();
        // tax = 0+(income)*(tax%);
        float tax = 0;
        // float tax = sc.nextFloat();
        
        if(income<=500000){
            tax=0+(income)*0;
        }
        else if (income<=1000000 && income>500000) {            
            tax=0+(income)*0.2f;
        }
        else{
            tax=0+(income)*0.3f;
        }

        System.out.print("Your income tax = "+ tax);         
    }
}