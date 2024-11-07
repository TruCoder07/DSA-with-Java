import java.util.Scanner;
/*  Q1.Print star pattern.
    *
    **
    ***
    ****
    Sol;
    1. Lines = 4
    OuterLoop - 4
    2. Number of times  (i)
    inner Loop-i times
*/

public class PQ1{
    public static void main(String[] args) {

        for(int line = 1; line <= 4; line++){
            for (int star = 1; star <= line; star++) {
            System.out.print("*");
            }
            System.out.println();
            }
    }
}