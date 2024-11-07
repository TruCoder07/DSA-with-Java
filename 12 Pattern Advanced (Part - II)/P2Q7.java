// 8 Solid Rhombus Pattern
public class P2Q7{
    
    public static void SolidRhombusPattern(int r){
        // Outter Lines
        for (int i = 1; i <= r; i++) {
            // 1st Spaces 
            for (int j = 1; j <= (r-i); j++) {
                System.out.print(" ");                
            }
            // Star
            for (int j = 1; j <=r; j++) {
                System.out.print("*");
            }
            System.out.println("");
            
        }

    }
    
    public static void main(String[] args) {
        SolidRhombusPattern(5);
        
    }
    
}