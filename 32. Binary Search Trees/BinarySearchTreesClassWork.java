// 32. Binary Search Trees
import java.lang.reflect.Array;
import java.util.*;
public class BinarySearchTreesClassWork{

    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right =null;
        }
    }

    public static Node insertInToBST(Node root, int data){
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (root.data > data) {
            root.left = insertInToBST(root.left, data);
        }else{
            root.right = insertInToBST(root.right, data);
        }
        return root;
    }

    // inOreder
    public static void inOreder(Node root){
        if (root == null) {
            return;
        }
        inOreder(root.left);
        System.out.print(root.data+" ");
        inOreder(root.right);
    }
    // Searching in Binary Search Tree (BST)
    public static boolean searchInBST(Node root, int key){ // O(H)
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        return (key < root.data)? searchInBST(root.left, key): searchInBST(root.right, key);
    }

    // Delete a Node
    public static Node deleteNode(Node root , int key){

        if (root.data > key) {
            root.left = deleteNode(root.left, key);
        }else if (root.data < key) {
            root.right = deleteNode(root.right, key);
        }else{ // voila root.data == key
            // case 1 leaf chid
            if (root.left == null && root.right == null) {
                return null;
            }
            // case 2 single child
            if (root.left == null) {
                return root.right;
            }else if (root.right == null) {
                return root.left;   
            }
            // case 3 - both child
            Node IS = findInOrderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);
        }
        return root;
    }
    public static Node findInOrderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    //  Print BST keys in the given range
    public static void printInRange(Node root, int k1, int k2){
        if (root == null) {
            return;
        }
        if(k1<= root.data && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }else if (root.data < k1 ) {
            printInRange(root.right, k1, k2);
        }else{
            printInRange(root.left, k1, k2);
        }
    }

    // Root to leaf Paths
    // helper
    public static void printPath(ArrayList<Integer> path){
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i)+"->");
        }
        System.out.println("null");
    }
    public static void printRoot2leafPaths(Node root, ArrayList<Integer> list){
        if (root == null) {
            return;
        }
        list.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(list);
        }
        printRoot2leafPaths(root.left, list);
        printRoot2leafPaths(root.right, list);
        list.remove(list.size()-1);
    }

    // Valid Bst 
    public static boolean validBST(Node root, Node min, Node max){
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;
        }
        if (max != null && root.data >= max.data) {
            return  false;
        }
        return (validBST(root.left, min, root) && validBST(root.right, root, max));
    }

    // Mirror Of BST
    public static Node MirrorOfBST(Node root){
        if (root == null) {
            return null;
        }
        Node leftMirror = MirrorOfBST(root.left);
        Node rightMirror = MirrorOfBST(root.right);
        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }

    // 33. Binary Search Trees (Part2)
    // _33.1 Sorted Array to Balanced BST  
    public static Node createBST(int arr[], int si, int ei){
        if (si > ei) {
            return null;
        }
        int mid = (si+ei)/2;
        Node root = new Node(arr[mid]);

        root.left = createBST(arr, si, mid-1);
        root.right = createBST(arr, mid+1, ei);

        return root;
    } 
    // _33.2_Convert BST to Balanced BST
    // step 1 : extract sorted array from given bst
    public static void getInOreder(Node root, ArrayList<Integer> list){
        if (root == null) {
            return;
        }
        getInOreder(root.left,list);
        list.add(root.data);
        getInOreder(root.right,list);
    }
    // step 2 : Create Blance BST
    public static Node createBlanceBST(Node root){
        ArrayList <Integer> inOreder = new ArrayList<>();
        getInOreder(root, inOreder);
        return createBST(inOreder, 0, inOreder.size()-1);
    }
    // Create BST from ArrayList (in parameter)
    public static Node createBST(ArrayList <Integer> list, int si, int ei){
        if (si > ei) {
            return null;
        }
        int mid = (si+ei)/2;
        Node root = new Node(list.get(mid));
        root.left = createBST(list, si, mid-1);
        root.right = createBST(list, mid+1, ei);
        return root;
    }
    // preOrder for check 
    public static void preOrder(Node root){
        if (root == null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    // Largest BST in a Binary Tree 
    static int maxBST = 0; // for Tracking maximum no of node in valid BST
    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        Info(boolean isBST, int size, int min, int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static Info largestBST(Node root){
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);
        int size = leftInfo.size+rightInfo.size+1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        if (root.data <= leftInfo.max || root.data >= rightInfo.min) {
            return new Info(false, size, min, max);
        }
        if (leftInfo.isBST && rightInfo.isBST) {
            maxBST = Math.max(maxBST, size);
            return new Info(true, size, min, max);
        }
        return new Info(false, size, min, max);
    }

    // Merge 2 BSTs

    public static Node mergeBST(Node root1, Node root2){

        ArrayList<Integer> arr1 = new ArrayList<>();
        getInOreder(root1,arr1);

        ArrayList<Integer> arr2 = new ArrayList<>();
        getInOreder(root2, arr2);

        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) < arr2.get(j)) {
                arr.add(arr1.get(i));
                i++;
            }else{
                arr.add(arr2.get(j));
                j++;
            }
        }
        while ( i < arr1.size()) {
            arr.add(arr1.get(i++));
        }
        while (j < arr2.size()) {
            arr.add(arr2.get(j++));
        }
        return createBST(arr, 0, arr.size()-1);
    }
    public static void main(String[] args) {
        Node root =null;

        // int node[] = {6,4,2,1,3,5,8,7,9,10};
        // int node2[] = {5,1,3,4,2,7};\
        
        // for (int i = 0; i < node2.length; i++) {
        //     root = insertInToBST(root, node2[i]);
        // }
        // for (int i = 0; i < node.length; i++) {
        //     root = insertInToBST(root, node[i]);
        // }
        // inOreder(root);

        // Search in a BST
        // int node[] = {8,5,3,1,4,10,11,14};
        // for (int i = 0; i < node.length; i++) {
        //     root = insertInToBST(root, node[i]);
        // }
        // inOreder(root);

        // System.out.println(searchInBST(root, 11));

        // Delete a Node in BST
        /*
        int node[] = {8,5,3,1,4,6,10,11,14};
        for (int i = 0; i < node.length; i++) {
            root = insertInToBST(root, node[i]);
        }
        inOreder(root);
        System.out.println("");

        deleteNode(root, 4);
        inOreder(root);
        System.out.println("");

        deleteNode(root, 10);
        inOreder(root);
        System.out.println("");

        deleteNode(root, 5);
        inOreder(root);
        System.out.println("");
        */
        // Print BST keys in the given range
        /*int node[] = {8,5,3,1,4,6,10,11,14};
        for (int i = 0; i < node.length; i++) {
            root = insertInToBST(root, node[i]);
        }
        int k1 = 5, k2 = 12;
        printInRange(root, k1, k2);
        System.out.println("");
        printInRange(root, 3, 6);
        System.out.println("");
        printInRange(root, 10, 14);
        */
        // Root to leaf Paths
        /*
        int node[] = {8,5,3,1,4,6,10,11,14};
        for (int i = 0; i < node.length; i++) {
            root = insertInToBST(root, node[i]);
        }
        ArrayList<Integer> path = new ArrayList<>();
        printRoot2leafPaths(root, path);
         */
        // Validate BST
        /*
        int node[] = {8,5,3,1,4,6,10,11,14};
        for (int i = 0; i < node.length; i++) {
            root = insertInToBST(root, node[i]);
        }
        inOreder(root);
        if (validBST(root, null, null)) {
            System.out.println("Binary search Tree is VALID");
        }else{
            System.out.println("Binary search Tree is INVALID");
        }
        */
    /*s
        int node[] = {8,5,3,1,4,6,10,11,14};
        for (int i = 0; i < node.length; i++) {
            root = insertInToBST(root, node[i]);
        }
        inOreder(root);
        root = MirrorOfBST(root);
        System.out.println("");
        inOreder(root);
    */
        // 33. Binary Search Trees (Part2)
        // _33.1 Sorted Array to Balanced BST
        // int arr[] = {3,5,6,8,10,11,12};
        // root = createBST(arr, 0, arr.length-1);
        // inOreder(root);

        // _33.2_Convert BST to Balanced BST
        /*
                      8
                    /   \
                   6     10
                  /        \ 
                 5          11
                /             \
               3               12
                    given BST
                    */

        /*Answer => Balanced BST
                      8
                    /   \
                   5     11
                  / \   /  \ 
                 3   6 10  12
         */
    /*
        root = new Node (8);
        root.left = new Node ( 6);
        root.left.left = new Node (5);
        root.left.left.left = new Node (3);
        root.right = new Node(10);
        root.right.right = new Node (11);
        root.right.right.right = new Node(12);

        root = createBlanceBST(root);
        preOrder(root);
        */

        /* Let us construct the following Tree
         60
        /  \
       65  70
      /
     50 */

     final Node node1 = new Node(60);
     node1.left = new Node(65);
     node1.right = new Node(70);
     node1.left.left = new Node(50);
        largestBST(node1);
     System.out.print("Size of the largest BST is "+ maxBST+ "\n");

    //  Merge 2 BSTs
    Node node2 = new Node(2);
    node2.left = new Node(1);
    node2.right = new Node(4);
    
    Node node3 = new Node(9);
    node3.left = new Node(3);
    node3.right = new Node(12);

    Node node = mergeBST(node2, node3);
    // inOreder(node);
    preOrder(node);
    }
}