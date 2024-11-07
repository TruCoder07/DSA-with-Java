import java.util.*;
import java.util.LinkedList;
public class BinaryTreesAssignment{
    
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void inOrder(Node root){
        if (root == null ) {
            return;
        }

        inOrder(root.left);

        System.out.print(root.data+" ");

        inOrder(root.right);
    }


    public static boolean isUnivalTree(Node root){
        if(root == null){
            return true;
        }

        if(root.left != null && root.data != root.left.data ){
            return false;
        }

        if(root.right != null && root.data != root.right.data){
            return false;
        }
        boolean lc = isUnivalTree(root.left);
        boolean rc = isUnivalTree(root.right);

        return (lc && rc);
    }

    public static Node invertBT(Node root){
        if (root == null) {
            return null;
        }

        invertBT(root.left);
        invertBT(root.right);

        Node newLeft = root.right;
        Node newRight = root.left;

        root.left = newLeft;
        root.right = newRight;

        return root;
    }

    //Delete leaf nodes with value as x

    // Given a binary tree and a target integer x, delete all the leaf nodes having value as x. Also, delete the newly formed leaves with the target value as x.

    public static Node delNodeWithXvalue(Node root, int data){
        if (root == null) {
            return null;
        }

        
        root.left = delNodeWithXvalue(root.left, data);
        root.right = delNodeWithXvalue(root.right, data);
        if (root.data == data) {
            if (root.left == null && root.right == null) {
                return null;
            }
        }
        return root;
    }
    
    public static void main (String args[]){
        // Check if a Binary Tree is univalued or not
        //Given a binary tree, the task is to check if the binary tree is univalued or not. If found to be true, then print “YES”. Otherwise, print “NO”.

        // A binary tree is univalued if every node in the tree has the same value.


        /*
                1
              /   \
             1     1
           /  \     \
          1    1     1
    */
    /*
    Node root = new Node(1);
    root.left = new Node(1);
    root.right = new Node(1);
    root.left.left = new Node(1);
    root.left.right = new Node(1);
    root.right.right = new Node(2);
 
    if (isUnivalTree(root))
    {
        System.out.print("YES");
    }
    else
    {
        System.out.print("NO");
    }
 */

    //  Q2 Invert Binary Tree – Change to Mirror Tree
        /*
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);

    inOrder(root);
    root = invertBT(root);
    
    System.out.println("");

    inOrder(root);
         */

    
    // Q3 Delete leaf nodes with value as x

    /*Input : x = 5  
            6
         /     \
        5       4
      /   \       \
     1     2       5 
    Output : 
                6
            /     \
            5       4
        /   \  
        1     2 
    Inorder Traversal is 1 5 2 6 4 */
    Node root = new Node(10);
    root.left = new Node(3); 
    root.right = new Node(10); 
    root.left.left = new Node(3); 
    root.left.right = new Node(1); 
    root.right.right = new Node(3); 
    root.right.right.left = new Node(3); 
    root.right.right.right = new Node(3); 
    root = delNodeWithXvalue(root, 3); 

    inOrder(root);
    }
}