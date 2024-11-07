import java.util.Scanner;
public class ArraysSum{
    public static void main(String[] args) {
        // float nums[]={83,79,72,73,59};
        Scanner sc = new Scanner(System.in);
        float number[]=new float[5];
        for (int j = 0; j < number.length; j++) {
            
            number[j]=sc.nextFloat();
        }
        float sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum+=number[i];
        }
        System.out.println("Sum of Array = "+sum);
    }
}