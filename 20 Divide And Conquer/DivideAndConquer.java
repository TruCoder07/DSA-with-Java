public class DivideAndConquer{
    // Merge Sort 
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
    public static void mergeSort(int [] arr, int si, int ei ) {
        if (si>=ei) {
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid+1, ei); // right part
        merge(arr, si, mid, ei);
    }

    public static void merge( int arr[], int si, int mid, int ei ){
        int temp [] = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid+1; // iterator for right part
        int k =0; // iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                // k++;  
            }else{
                temp[k] = arr[j];
                j++;
                // k++; 
            }
            k++;
        }
        // left part
        if (i <= mid) {
            while (i <= mid ) {
                temp[k] = arr[i];
                k++; i++;
            }
        }else{
            while (j <= ei ) {
                temp[k] = arr[j];
                k++; j++;
            }
        }
        // while (i <= mid ) {
        //     temp[k++] = arr[i++];
        // }
        // // right part
        // while (j <= ei ) {
        //     temp[k++] = arr[j++];
        // }

        //copy temp to original arr
        for(k=0, i=si; k<temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }


    //Quick Sort
    public static void quickSort(int arr[], int si, int ei){
        if (si >= ei) {
            return;            
        }
        // find pivot index
        int pidx = partition(arr, si, ei);
        quickSort(arr, si, pidx-1); // left part
        quickSort(arr, pidx+1, ei); // right part
    }
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si-1;
        for (int j = si; j <= ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
                i++;
                int temp = arr[ei];
                arr[ei] = arr[i];
                arr[i] = temp;
        return i;
    }
    // Search an element in a Sorted & Rotated Array

    public static int modifyBinarySearch(int arr[], int key, int si, int ei){
        if( si > ei){
            return -1;
        }
        // kaam
        int mid = si + ( ei -si)/2;
        if (arr[mid] == key) {
            return mid;
        }

        if(arr[si] < arr [mid]){
            if (arr[si] <= key && key < arr [mid]) {
                return modifyBinarySearch(arr, key, si, mid-1);
            }
            else{
                return modifyBinarySearch(arr, key, mid+1, ei);
            }
        }
        else{
            if (arr[mid] < key && key <= arr[ei]) {
                return modifyBinarySearch(arr, key, mid+1, ei);
            }
            else{
                return modifyBinarySearch(arr, key, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {6,3,9,5,2,8};
        int a2[] = {4,5,6,7,0,1,2,3};
        int a3[] = {20,30,40,50,60,5,10};
        int target = 6;
        int key = 0;
        // mergeSort(a, 0, a.length-1);
        // quickSort(a, 0, a.length-1);
        // displyArray(a);
        System.out.println(modifyBinarySearch(a2, key, 0, a2.length-1));
        System.out.println(modifyBinarySearch(a3, target, 0, a3.length-1));
    }
}