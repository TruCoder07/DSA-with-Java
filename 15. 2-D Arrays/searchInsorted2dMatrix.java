public class searchInsorted2dMatrix{

    public static int brutalSearchInsorted2dArray(int n[][],int key){

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                if (n[i][j]==key) {
                    return 1;
                }
            }
        }
        return -1;
    }
    public static boolean staircaseSearch(int n[][],int key){

        int row = 0, col = n[0].length-1;
        while (col < n[0].length && row >= 0 && col >=0 && row < n.length) {
            if (n[row][col]==key) {
                System.out.print("The key has founded at index = ( "+row+","+col+" )");
                return true;
            }
            else if (key > n[row][col]) {
                row--;
            }
            else{
                col--;
            }
        }
        System.out.print("The key not found.");
        return false;
    }

    public static void main(String[] args) {
        int nums[][]={{10,20,30,40},
                      {15,25,35,45},
                      {27,29,37,48},
                      {32,33,39,50}};

        staircaseSearch(nums, 30);

        // int key = 39;
        // brutalSearchInsorted2dArraysearchInsorted2dArray(nums, key);
        // if (brutalSearchInsorted2dArraysearchInsorted2dArray(nums, key)==-1) {
        //     System.out.print("The key  is not found");
        // } else {
        //     System.out.print("The key  is not found at index = "+brutalSearchInsorted2dArraysearchInsorted2dArray(nums, key));
        // }
    }
}