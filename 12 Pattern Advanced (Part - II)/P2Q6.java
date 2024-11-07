// Butterfly Pattern
public class P2Q6{

    public static void ButterflyPattern(int r){
        // Outter Lines
        for (int i = 1; i <= r; i++) {
            // First Star
            for (int j = 1; j <=i; j++) {
                System.out.print("*");                
            } 
            // Space 2*(r-i)
            for (int j = 1; j <= 2*(r-i); j++) {
                System.out.print(" ");
            }
            // 2nd Star 
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");   
        }
        for (int i = r; i >= 1; i--) {
            // First Star
            for (int j = 1; j <=i; j++) {
                System.out.print("*");                
            } 
            // Space 2*(r-i)
            for (int j = 1; j <= 2*(r-i); j++) {
                System.out.print(" ");
            }
            // 2nd Star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(""); 

            
        }

    }
    
    public static void main(String[] args) {

        ButterflyPattern(4);
        
    }
}