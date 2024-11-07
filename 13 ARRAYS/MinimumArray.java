import java.util.Scanner;
public class MinimumArray{
    public static void MinimumElement(int num[]){
        int minElement = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (minElement>num[i]) {
                minElement=num[i];
            }
        }
        System.out.println("Smallest Element in this Arrays = "+ minElement);
    }
    public static void main(String[] args) {
        int n[]={23,24,2,1,24,-1};
        MinimumElement(n);
    }
}