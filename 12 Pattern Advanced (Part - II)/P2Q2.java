import java.util.Scanner;
/*  Q1.Print star pattern.
    Inverted And Rotated Half Pyramid(IRHP)
       *
      **
     ***
    ****
*/

public class P2Q2{
    public static void IRHP(int r , int s){
        // Lines
        for(int i = 1; i <= r; i++){
            // Space
            for(int j = 1; j <= r-i; j++){
                System.out.print(" ");
                 } 
                // Star
                for(int k = 1; k<=i; k++){
                System.out.print("*");
                }
            System.out.println();      
        } 
    }
        public static void main(String[] args) {
            IRHP(4,4);         
        }
}