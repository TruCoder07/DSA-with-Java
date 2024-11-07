public class AssignmentOf2DArray{

    public static int printNumber(int arr[][], int key){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int sumOfParticularRow(int arr[][],int row){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[row-1][i];
        }

        return sum;
    }

    public static void transposeOfMatrix(int arr[][]){
        // int row = 0, col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr[0].length; j++) {
                if (i != j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [][]arr = {{4,7,8},{8,8,7}};
        int key = 7;
        System.out.println("The total "+key+" present in this 2D Array is: "+printNumber(arr, key));

        int [][]arr2 = {{1,4,9},
                        {11,4,3},
                        {2,2,3}};
        int rowNo = 2;
        System.out.println("Sum = "+sumOfParticularRow(arr2, rowNo));
        System.out.println("Normal Matrix:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println("");
        }
        transposeOfMatrix(arr2);
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println("");
        }
    }
}