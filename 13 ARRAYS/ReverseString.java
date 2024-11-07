import java.util.*;
public class ReverseString{
    
    static void printReverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i <= s.length()/2; i++) {
            int first = i;
            int last = s.length()-1-i;
            char firstCh = sb.charAt(first);
            char lastCh = sb.charAt(last);

            sb.setCharAt(first, lastCh);
            sb.setCharAt(last, firstCh);
        }
        System.out.println(sb);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr a String = ");
        String s = sc.nextLine();
        // printReverseString(s);
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
        printReverseString(s);
    }
}