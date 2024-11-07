// 8 Solid Rhombus Pattern
public class P2Q8{
    
    public static void HollowRhombusPattern(int r){
        // Outter Loop
        for (int i = 1; i <= r; i++) {
        // Space 
        for (int j = 0; j <= (r-i); j++) {
            System.out.print(" ");
        }
        // Star
        for (int j = 1; j <=r; j++) {
            if (j == 1 || j == r || i == 1 || i == r) {
                System.out.print("*");                
            }      
            else{
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
 public static void main(String [] args){
        HollowRhombusPattern(5);
    }

}