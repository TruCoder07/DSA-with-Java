public class PatternQ3{
    // INVERTED HALF-PYRAMID with Numbers pattern
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <=n; i++) {
            // Star 
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
        
    }
}
