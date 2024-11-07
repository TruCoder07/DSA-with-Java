import java.util.*;
public class StringAssignment{
    // Q1
    public static int totalLowercaseVowel(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count++;
            }
        }

        return count;
    }

    //  Check whether two Strings are anagram of each other
    public static boolean validAnagram(String s1, String s2){

        if (s1.length() != s2.length()) {
            return false;
        }
        int count[] = new int[26];
        for (char ch : s1.toCharArray()) {
            count[ch-'a']++;
        }

        for(char ch : s2.toCharArray()){
            count[ch-'a']--;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Q1
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Total lowercase vowels occured in this string is: "+ totalLowercaseVowel(str));

        String str1 = "listen",  str2 = "silentq";
        if(validAnagram(str1, str2)){
            System.out.println("Anagranm");
        }else{
            System.out.println("Not Anagram");
        }

        int arr[] = {5,2,2,0};
        int idx = 0;
        for(int i : arr){
            System.out.println(i+" "+idx);
            idx++;
        }

    }
}