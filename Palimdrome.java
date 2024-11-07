public class Palimdrome{
    
public static boolean palimdromeCheck(String name){
    int n = name.length();
    for (int i = 0; i < n/2; i++) {
         if (name.charAt(i)!=name.charAt(n-1-i)) {
            return false;
        }
    }
    return true;
}
    public static void main(String[] args) {
        String check = "raxccar";
        System.out.println(palimdromeCheck(check));
    }
}