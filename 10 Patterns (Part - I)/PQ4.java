import java.util.Scanner;
/*  Q1.Print star pattern.
    1
    A
    BC
    DEF
    GHIJ
    Sol;
*/
public class PQ4{
    public static void main(String[] args) {
        char p = 'A';
        int l = 4;
        for (int i = 1; i <= l; i++) {
            for(int n = 1; n <= i; n++){
                System.out.print(p);
                p++;
            }
            System.out.println("");
        }
    }
}