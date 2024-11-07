public class PQ5 {
    public static void HR(int l, int s) {
        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= s; j++) {
                if (i == 1 || i == l || j == 1 || j == s) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HR(4, 5);
    }
}
