import java.util.Scanner;
public class ArraysReverse{

    public static void ArraysReverse(int nunber[]){
        
        int first=0, last=nunber.length-1;
        while (first<last) {
            int temp = nunber[last];
            nunber[last]=nunber[first];
            nunber[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        ArraysReverse(number);
        System.out.print("{ ");
        for (int i = 0; i < number.length; i++) {
            System.out.print(+number[i]+" ");
        }
        System.out.println("}");
    }
    
}