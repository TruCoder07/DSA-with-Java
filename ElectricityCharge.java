import java.util.*;
public class ElectricityCharge{
    /* An electricity board charges the following rates for the use of electricity: for the first 200 units 80 paise per unit for the next 100 units 90 paise per unit: beyond 300 units Rs 1 per unit. All users are charged a minimum of Rs. 100 as meter charge. If the total amount is more than Rs 400, then an additional surcharge of 15% of total amount is charged. 
    Write a program to read the name of the user, number of units consumed and print out the charges.*/
    
    public static float TotalCharge(float n){
        
        float totCha= 0;
        float fCha= 0;
        float sCha= 0;
        float lCha= 0;

        if(n>300){

            fCha+= 200*80/100;
            n= n-200;
            sCha+= 100*90/100;
            n= n - 100;
            lCha+= n*1;
        }
        else if(n>200){
            fCha+= 200*80/100;
            n= n-200;
            sCha+= n*90/100;
        }
        else{
            fCha+= n*80/100;
        }
        totCha=fCha+sCha+lCha+100;
        if(totCha>400){
            totCha=totCha+totCha*15/100;
        }
        return totCha;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr your name = ");
        String name = sc.nextLine();
        System.out.print("Enter your's consumed units = ");
        float unit = sc.nextFloat();
        System.out.print("Your total charge = "+TotalCharge(unit));
    }
}