import java.util.Scanner;
public class PrimeOrNotPrime2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number n = ");
        int n = sc.nextInt();
        boolean isPrime=true;
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j < (n-1); j++) {
                if (n%i==0||i==1){
                    isPrime=false;
                    break;
                } 
            }
            if(isPrime == false){
                System.out.print("your given number "+index+" is NOT PRIME");
                System.out.println(" ");
            }
            else{
                System.out.print("your given number "+index+" is PRIME");
                System.out.println(" ");
            }
            
        }
    }   
}