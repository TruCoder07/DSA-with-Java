public class PatternQ6{
    public static void main(String[] args) {
        int l = 4;
        int c = 4;
        for (int i = 1; i <=l; i++) {
            // Stars 
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            // Spaces 
            for (int index = 1; index <=2*(l-i) ; index++) {
                System.out.print(" ");
            }
            // Stars 
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
        for (int i = ; i <=l; i++) {
            // Stars 
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            // Spaces 
            for (int index = 1; index <=2*(l-i) ; index++) {
                System.out.print(" ");
            }
            // Stars 
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}