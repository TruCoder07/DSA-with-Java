import java.util.Scanner;
/*  Q1.Print star pattern.
    1
    12
    123
    1234
    Sol;
    1. Lines = 4
    OuterLoop - 4
    2. Number of times  (i)
    inner Loop-i times
*/

public class PQ4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Lines = ");
        int n = sc.nextInt();
        char ch = 'A';        

        for(int line = 1; line <= n; line++){
            for (int star = 1; star <= line; star++) {
            System.out.print(ch);
            ch++;
            }
            System.out.println();
            }
    }
}