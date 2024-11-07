// Divide&ConquerQuestions
public class DivideAndConquerQuestions{
    
    public static void displyArray(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i==0) {
                System.out.print("{"+arr[i]+",");
            }
            else if (i==arr.length-1) {
                    System.out.print(arr[i]+"}");
            }else{
                System.out.print(arr[i]+",");
            }
            
        }
    }
    // Question 1
    public static void mergeSort(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
    }
    public static void merge(String arr[], int si, int mid, int ei) {
        String temp [] = new String[arr.length];
        int i = si;
        int j = mid+1;
        int k = 0;

        // while (i<=mid && j<=ei) {
        //     if (arr[i] < arr[j]) {
                
        //     }
        // }
    }

    public static void main(String[] args) {
        String arr [] = {"sun", "earth", "mars", "mercury"};

    }
}
