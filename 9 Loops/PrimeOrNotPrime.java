import java.util.Scanner;
public class PrimeOrNotPrime{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Number n = ");
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int index = 1; index <=n; index++) {
            if(index==1){
                    isPrime = false;
                    System.out.print("your given number "+index+" is NOT PRIME");
                    System.out.println(" ");
                    continue;
                }
            for (int i = 2; i<=(index-1); i++) {
                if(index%i==0){
                    isPrime = false;
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