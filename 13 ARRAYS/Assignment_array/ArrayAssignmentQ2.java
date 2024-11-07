import java.util.*;
public class ArrayAssignmentQ2{

    public static int SearchInRotatedSortedArray(int num[], int key){
        for (int i = 0; i < num.length; i++) {
            if (num[i]==key) {
                return i;
            }
        }
        return -1;
    }

    public static int[] rotateArray(int n[], int indexs){
            int[] temp= new int [indexs] ;
        for (int i = 0; i < indexs; i++) {
            temp[i]=n[i];
        }
        for (int k = indexs; k < n.length; k++) {
            n[k-indexs]=n[k];
        }
        for (int j = 0; j < indexs; j++) {
            n[n.length-indexs+j] = temp[j];
        }
        int newArray[]= new int[n.length];

        for (int index = 0; index < n.length; index++) {
            newArray[index]=n[index];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int num[]={0,1,2,4,5,6,7};
        int movingIndex=3;
        int key = 0;
        int finalArr[]=rotateArray(num, movingIndex);
        System.out.println(SearchInRotatedSortedArray(finalArr, key));
    }
}