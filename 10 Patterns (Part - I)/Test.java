public class Test {
    public static void main(String[] args) {
        int n = 4;  // Defines the number of lines in the pattern
        
        // Outer loop: controls the number of lines
        for (int line = 1; line <= n; line++) {
            
            // Inner loop: prints the stars in each line
            for (int star = 1; star <= n - line + 1; star++) {
                System.out.print("*");
            }
            
            // Move to the next line after printing stars
            System.out.println();
        }
    }
}
