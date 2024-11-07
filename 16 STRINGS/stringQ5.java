import java.util.*;
public class stringQ5{
    public static String compressTheString(String s){
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 1;
            while (i<s.length()-1 && ch == s.charAt(i+1)) {
                count++;
                i++;
            }
            sb.append(ch);
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String path = "aaabbcccdd";

        System.out.println("Largest String = "+ compressTheString(path));
    }
}


