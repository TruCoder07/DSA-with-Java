// 32. Binary Search Trees
import java.lang.reflect.Array;
import java.util.*;
public class BST_Assignment{

    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left=this.right=null;
        }
    }
    public static Node insertInBST(Node root,int data) {
        if (root == null) {
            return new Node(data);
        }
        if (root.data > data) {
            root.left = insertInBST(root.left, data);
        }
        if (root.data < data) {
            root.right = insertInBST(root.right, data);
        }
        return root;
    }
    public static void inOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

//     //  Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].
// Example 1:   Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
// Output: 32
// Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.
static int sum = 0;
public static int Sum(Node root, int low, int high){
    if (root == null) {
        return sum+=0;
    }
    if (low <= root.data && root.data <= high) {
        Sum(root.left, low, high);
        System.out.println(root.data);
        sum+=root.data;
        Sum(root.right, low, high);
    }

    if (root.data > high) {
        Sum(root.left, low, high);
    }else if (root.data < low) {
        Sum(root.right, low, high);
    }
    return sum;
}

// Find the closest element in Binary Search Tree
// Given a binary search tree and a target node K. The task is to find the node with a minimum absolute difference with the given target value K.

static int ele = 0;
static int minDiff = 0;
static int diff = 0;

public static int closestElement(Node root, int key){
     ele = 0;
     minDiff = Integer.MAX_VALUE;
     diff = Integer.MAX_VALUE;
    findCloseEle(root, key);
    return ele;
} 

public static void findCloseEle(Node root, int key){
    if (root == null) {
        return;
    }
    if (key == root.data) {
        ele = root.data;
        return;
    }else if (key > root.data) {
            minDiff = key - root.data;
            if (minDiff < diff) {
                diff = minDiff;
                ele = root.data;
            }
    }else{
            minDiff = root.data - key;
            if (minDiff < diff) {
                diff = minDiff;
                ele = root.data;
            }    
    }
    findCloseEle(root.right, key);
    findCloseEle(root.left, key);
}

    // k-th Smallest in BST (Order Statistics in BST)
    public static int count = 0;
    public static void printKthSmallest(Node root, int k) {
        Node res = findKthSmallest(root, k);
        if (res == null)
            System.out.println("There are less than k nodes in the BST");
        else
            System.out.println("K-th Smallest Element is " + res.data);
    }

    public static Node findKthSmallest(Node root, int k){

        if (root == null) {
            return null;
        }

        Node left = findKthSmallest(root.left, k);
        
        if (left != null) {
            return left;
        }
        count++;
        if (count == k) {
            return root;
        }
        return findKthSmallest(root.left, k);
    }

    public static void main(String[] args) {
        Node root = null;
        // Q1 
        /*
        int arr[] = {10,5,15,3,7,13,18,1,6};
        
        for (int i = 0; i < arr.length; i++) {
            root = insertInBST(root, arr[i]);
        }

        inOrder(root);
        System.out.println("the sum = "+ Sum(root, 6, 10));
 */
        // Q2:
    int arr[] = {9,4,17,3,6,22,5,7,20};
    root = null;
        for (int i = 0; i < arr.length; i++) {
            root = insertInBST(root, arr[i]);
        }
        inOrder(root);
        System.out.println("");
        int key = 2;
        System.out.println("The closest element of "+key+" in this BST is: "+closestElement(root, key));

        System.out.println("The closest element of "+key+" in this BST is: "+closestElement(root, 4));

        System.out.println("The closest element of "+key+" in this BST is: "+closestElement(root, 18));

        System.out.println("The closest element of "+key+" in this BST is: "+closestElement(root, 12));


    }
}