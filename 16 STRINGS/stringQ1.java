public class stringQ1{
    public static boolean isPalindrome(String a){
        int n = a.length();
        for (int i = 0; i < n/2; i++) {
            if (a.charAt(i)!=a.charAt(n-1-i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name = "tufail";
        isPalindrome(name);
        if (isPalindrome(name)==true) {
            System.out.println(" This string is Plindrome.");
        }
        else{
            System.out.println(" This string is NOT Plindrome.");
        }
    }
}