public class PatternQ1{
    public static void main(String[] args) {
        int l = 4;
        int c = 5;
        for (int i = 1; i <=l; i++) {
            for (int j = 1; j <=c; j++) {
                if (i==1 || i==l || j==1 || j==c) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}