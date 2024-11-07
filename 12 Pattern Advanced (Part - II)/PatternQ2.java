public class PatternQ2{
    // INVERTED & ROTATED HALF-PYRAMID pattern
    public static void main(String[] args) {
        int n = 4;
        for (int index = 1; index <=n; index++) {
            // Space
            for (int i = 1; i <=n-index; i++) {
                System.out.print(" ");
            }
            // Star 
            for (int j = 1; j <=index; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
