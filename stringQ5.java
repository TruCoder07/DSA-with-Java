import java.util.*;
public class stringQ5{
    public static float sortestPath(String s){
        int x =0, y=0;
        for (int i = 0; i < s.length(); i++) {
            int dir = s.charAt(i);
            if (dir == 'N') {
                y++;
            }
            else if (dir=='S') {
                y--;
            } 
            else if (dir == 'E') {
                x++;
            }
            else if (dir == 'W') {
                y--;
            }
        }
        float x2= x*x;
        float y2=y*y;
        return (float) Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(sortestPath(path));

        // Quwstion 3
        String str[] = {"apple","mango","mango"};
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (largest.compareTo(str[i])<0) {
                largest = str[i];
            }
             
        }
        System.out.println("Largest String = "+ largest);
    }
}


