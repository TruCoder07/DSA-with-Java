import java.util.Scanner;
public class LoopsPracticeQuestions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q1.Print number from 1 to 10.
        /*
        int i = 1;
        while (i<=10) {
            System.out.print(i+" ");
            i++;
        }
         */
        // Q2.Print number from 1 to n.
        /*
        int i = 1;
        System.out.print("Enter your n = ");
        int n = sc.nextInt();
        while (i<=n) {
            System.out.print(i+" ");
            i++;
        }
         */
        
        // Q3.Print sum of first n nutural number.        
        /*
        int i = 1;
        System.out.print("Enter Your n = ");
        int n = sc.nextInt();
        int sum =0;
        while (i <= n ) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
         */

        /*
        Print Squre pattern
        ****
        ****
        ****
        ****
         */
        /*
         for(int i = 1; i<=4;i++){
            System.out.println("****");
         }
        */
        // Print reverse of the number. n=10899
        /*
        for(int i = 10899; i>=1; i--){
            System.out.println(i);
        }
         */
        /*
        int x =10899;
        while (x>0) {
            int lastDigit = x%10;
            System.out.print(lastDigit);

            x = x /10;
        }
        System.out.println("");
        */
        /*
        for(int t = 1; t<=5; t++){
            if(t == 3 ){
                break;
            }
            System.out.print(t);
        }
        System.out.print(" Your loop is end ");
        */

        // Keep entering number till user enters a multiple of 10
        /*
        do{
            int n = sc.nextInt();
            System.out.println(n);
                        if (n % 10 == 0) {
                break;                
            }   
        }
        while(true);
        System.out.println("Your loop is end");
        */

        // Disply all numbers entering by user except multiple of 10
        /*
        do{
            int j = sc.nextInt();
            System.out.println(j);
            if(j%10==0){
                System.out.println("Your this number is skip");
                continue;
            }
        }
        while (true);
         */


    }
}