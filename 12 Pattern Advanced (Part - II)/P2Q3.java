import java.util.Scanner;
// Inverted Half Pyramid Pattern with Numbers(IHPPWN)
public class P2Q3{

    static void IHPPWN(int a){
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a-i+1; j++) {
                System.out.print(j);                
            }
            System.out.println(" ");
        }
    }

    public static void main(String [] args){
        IHPPWN(5);
    }
}