public class PatternQ4{
    // INVERTED HALF-PYRAMID with Numbers pattern
    public static void main(String[] args) {
        int n = 5;
        int n1 = 1;
        for (int i = 1; i <=n; i++) {
            // Star 
            for (int j = 1; j <=i; j++) {
                System.out.print(n1+" ");
                n1++;
            }
            System.out.println("");
        }
        
    }
}
