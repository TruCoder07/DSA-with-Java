public class TrieClassWork {

    static class Node {
        Node children[] = new Node[26];
        boolean wordEnd = false;

        public Node() {
            // for (int i = 0; i < children.length; i++) {
            // children[i] = null;
            // }
            for (Node i : children) {
                i = null;
            }
        }
    }

    public static Node root = new Node();

    // insertion
    public static void insert(String str) {
        Node curr = root; // Step 1: Start from the root node

        for (char ch : str.toCharArray()) { // Step 2: Loop through each character of the string
            int idx = ch - 'a'; // Calculate index (0 to 25 for 'a' to 'z')

            // Step 3: Create node if it's null at this index
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            // Step 4: Move to the child node
            curr = curr.children[idx];
        }

        // Step 5: Mark the end of the word
        curr.wordEnd = true;
    }

    // searching
    public static boolean search(String key) {
        Node curr = root; // Step 1: Start from the root node

        for (char ch : key.toCharArray()) { // Step 2: Loop through each character
            int idx = ch - 'a'; // Find index of character

            // Step 3: If node at that index is null, return false
            if (curr.children[idx] == null) {
                return false;
            }

            // Step 4: Move to the next child node
            curr = curr.children[idx];
        }

        // Step 5: Check if the current node marks the end of the word
        return curr.wordEnd == true;
    }

    // Word Break
    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }

        return false;
    }

    /*
     * 
     * // for prefix problem <start>
     * static class Node {
     * Node children[] = new Node[26];
     * boolean EndWord = false;
     * int freq;
     * 
     * Node() {
     * for (int i = 0; i < children.length; i++) {
     * children[i] = null;
     * }
     * freq = 1;
     * }
     * }
     * 
     * // insertion
     * public static void insertion(String str) {
     * Node curr = root;
     * for (int i = 0; i < str.length(); i++) {
     * int idx = str.charAt(i) - 'a';
     * if (curr.children[idx] == null) {
     * curr.children[idx] = new Node();
     * } else {
     * curr.children[idx].freq++;
     * }
     * curr = curr.children[idx];
     * }
     * curr.EndWord = true;
     * }
     * 
     * // Searching for prefix
     * public static void findPrefix(Node root, String ans) {
     * if (root == null) {
     * return;
     * }
     * 
     * // If frequency of current node is 1, print the prefix
     * if (root.freq == 1) {
     * System.out.println(ans);
     * return;
     * }
     * 
     * // Check for children nodes and recursively find prefixes
     * for (int i = 0; i < root.children.length; i++) {
     * if (root.children[i] != null) {
     * findPrefix(root.children[i], ans + (char) (i + 'a'));
     * }
     * }
     * }
     * 
     * // <end>
     * 
     */
    // startsWith Problem
    public static boolean startsWithProblem(String str) {
        Node curr = root;
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    // Count Unique Substring
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }

        return count + 1;
    }

    public static void main(String[] args) {
        /*
         * String words[] = {"the","a","there","any","thee"};
         * for (int i = 0; i < words.length; i++) {
         * insert(words[i]);
         * }
         * System.out.println(search("any"));
         * System.out.println(search("thees"));
         */

        /*
         * String disc[] = { "i", "like", "sam", "sung", "samsung", "mobile", "ice",
         * "cream", "icecream", "man", "go"};
         * 
         * for(String s : disc){
         * insert(s);
         * }
         * String key = "ilikesam";
         * System.out.println(wordBreak(key));
         */

        // prefix problem
        /*
         * String arr[] = {"zebra","dog","duck", "dove"};
         * for (int i = 0; i < arr.length; i++) {
         * insertion(arr[i]);
         * }
         * 
         * root.freq = -1;
         * 
         * findPrefix(root, "");
         */

        // startsWith Problem
        /*
         * String swp[] = {"apple","app","mango", "man", "woman"};
         * for (int i = 0; i < swp.length; i++) {
         * insert(swp[i]);
         * }
         * String sw = "app";
         * String prefix = "moon";
         * System.out.println(startsWithProblem(prefix));
         */
        // Count Unique Substring
        String str = "ababa"; // ans =15

        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
        }
        System.out.println("The total no of Distinct Substring is: " + countNodes(root));
    }
}

// public static String ans ="";

//     public static void longestword(Node root, StringBuilder temp) {
//         if (root == null) {
//             return;
//         }
//         for (int i = 0; i < 26; i++) {
//             if (root.children[i] != null && root.children[i].eow == true) {
//                 char ch = (char) (i + 'a');
//                 temp.append(ch);
//                 if (temp.length() > ans.length()) {
//                     ans = temp.toString();
//                 }
//                 longestWord(root.children[i], temp);
//                 temp.deleteCharAt(temp.length() - 1);// backtrack
//             }
//         }
//     }

// public static void main(String args[]) {
// String words [] = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
// for(int i=0; i<words.length; i++)
// insert (words [i]);
// longestWord(root, new StringBuilder(str: ""));
// System.out.println(ans);
// }




