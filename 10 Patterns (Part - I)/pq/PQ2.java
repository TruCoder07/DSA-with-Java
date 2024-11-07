import java.util.Scanner;
/*  Q1.Print star pattern.
    ****
    ***
    **
    *
    Sol;
    1. Lines = 4
    OuterLoop - 4
    2. Number of times  (i time in reverse)
    ( star = 1; star <= line)
    inner Loop-i times
*/

public class PQ2{
    public static void main(String[] args) {

    
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of First Star = ");
        int firstLineStar = sc.nextInt();
        // int firstLineStar = 4;

        for(int line = 1; line <= firstLineStar; line++){
            for (int star = 1; star <= (firstLineStar-line+1); star++) {
            System.out.print("*");
            }
            System.out.println();
            }
    }
}