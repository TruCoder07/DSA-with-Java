import java.util.Scanner;
// Floyd's Triangle Pattern
public class P2Q4{

    public static void FloydsTrianglePattern(int r){
        int n = 1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n);                
                n++;
            }
            System.out.println(" ");
        }
        
    }
    public static void main(String[] args) {
        
        FloydsTrianglePattern(5);
        
    }
}