// 8 Solid Rhombus Pattern
public class P2Q9{

    public static void DiamondPatter(int r){
        // Outter Loop 
        for (int i = 1; i <= r; i++) {
            // Space 
            for (int j = 1; j <= (r-i); j++) {
                System.out.print(" ");
            }
            // Star 
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
         for (int i = r; i >= 1; i--) {
            // Space 
            for (int j = 1; j <= (r-i); j++) {
                System.out.print(" ");
            }
            // Star 
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {

        DiamondPatter(4);
        
    }
}