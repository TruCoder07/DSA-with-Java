import java.util.Scanner;
public class MatrixAdd{
    public static void AddTwoMatrix(int m[][], int n[][]){
        
        int matrix3[][]=new int [m.length][n[0].length];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                matrix3[i][j]=m[i][j]+n[i][j];
            }
        }

        System.out.println("Sum of Two Matrix is =");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of rows1 = ");
        int r1 = sc.nextInt();
        System.out.print("Enter value of clumns1 = ");
        int c1 = sc.nextInt();
        int matrix1[][] = new int [r1][c1];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                matrix1[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.print("Enter value of rows2 = ");
        int r2 = sc.nextInt();
        System.out.print("Enter value of clumns2 = ");
        int c2 = sc.nextInt();
        int matrix2[][] = new int [r2][c2];

        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                matrix2[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(matrix2[i][j]+" ");
            }
            System.out.println("");
        }
        AddTwoMatrix(matrix1, matrix2);
    }
}