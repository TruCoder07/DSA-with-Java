public class PQ5b{
    public static void main(String[] args) {
        int n = 4;
        char ch = 'A';
        for (int i = 1; i <=n; i++) {
            for (int index = 1; index <=i; index++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}