import java.util.Scanner;
/*Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
 */
public class Q3Cost{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Pencil Cost = ");   
        float pencil = sc.nextFloat();
        System.out.print("Enter A Pen Cost = ");
        float pen = sc.nextFloat(); 
        System.out.print("Enter An Eraser Cost = ");
        float eraser = sc.nextFloat();
        float cost = pencil+pen+eraser;
        float gst = cost*0.18f;
        float totalCost = cost + gst;
        System.out.println("Total Cost(without GST) = "+cost );         
        System.out.print("Total Cost(GST included ) = "+totalCost );   
    }
}