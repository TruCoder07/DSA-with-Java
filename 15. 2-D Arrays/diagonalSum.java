public class diagonalSum{

    static void printDiagonalSum(int n[][]){
        int sum = 0; 
        int l = n.length;
       /*  for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (i==j) {
                    sum+=n[i][j];
                }
                else if(i+j==l-1){
                    sum+=n[i][j];
                }
            }
        }
        */
        for (int i = 0; i < l; i++) {
            sum+=n[i][i];
            if(i!=n.length-1-i){
                sum+=n[i][l-1-i];
            }
        }
        System.out.print("The Diagonal Sum of this matix = "+sum);
    }
    public static void main(String[] args) {
        int nums[][]={{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};
        printDiagonalSum(nums);
    }
}