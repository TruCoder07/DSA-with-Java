import java.util.Scanner;
/*  Q1.Print star pattern.
    1
    12
    123
    1234
    Sol;
*/
public class PQ3{
    public static void main(String[] args) {
        int l = 4;
        for (int i = 1; i <= l; i++) {
            for(int n = 1; n <= i; n++){
                System.out.print(n);
            }
            System.out.println("");
        }
    }
}