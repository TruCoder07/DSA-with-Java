import java.util.Scanner;
public class CsQs2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp = 103.3;
        if (temp>100) {            
            System.out.println("You have a fever");
        }
        else{
            System.out.println("You don't have a fever");
        }
    }
} 