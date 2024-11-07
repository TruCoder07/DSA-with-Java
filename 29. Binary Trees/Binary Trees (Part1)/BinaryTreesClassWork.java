import java.util.*;
import java.util.LinkedList;
public class BinaryTreesClassWork{
    
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildBinaryTree(int node[]){
            idx++;
            if (node[idx] == -1) {
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = buildBinaryTree(node);
            newNode.right = buildBinaryTree(node);
            return newNode;
        }
    }

    // PreOrder
    public static void preOrder(Node root){
        if (root ==  null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    // InOrder
    public static void inOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    // postOrder
    public static void postOrder(Node root){
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    // level Order
    public static void levelOrder(Node root){
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node newNode = q.remove();

            if (newNode == null) {
                System.out.println("");
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(newNode.data+" ");
                if (newNode.left != null) {
                    q.add(newNode.left);
                }
                if (newNode.right != null) {
                    q.add(newNode.right);
                }
            }
        }
    }

    // Height of Tree
    public static int heightOfTree(Node root){
        if (root == null) {
            return 0;
        }

        int lh = heightOfTree(root.left);
        int rh = heightOfTree(root.right);

        return (Math.max(lh, rh)+1);
    }
    // Count of Nodes
    public static int countOfNodes(Node root){
        if (root == null) {
            return 0;
        }
        int lc = countOfNodes(root.left);
        int rc = countOfNodes(root.right);

        return (lc+rc+1);
    }

    // Sum of Tree
    public static int sumOfNodes(Node root){
        if (root == null) {
            return 0;
        }
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return (leftSum+rightSum+root.data);
    }
    // Diameter of a Tree O(n^2)
    public static int diameterOfTree(Node root){
        if (root == null) {
            return 0;
        }
        int leftDiam = diameterOfTree(root.left);
        int leftHT = heightOfTree(root.left);
        int rightDiam = diameterOfTree(root.right);
        int rightHT = heightOfTree(root.right);
        int selfDiam = leftHT+rightHT+1;

        return Math.max(selfDiam,Math.max(rightDiam, leftDiam));
    }
    // Diameter of a Tree O(n)

    static class Info{
        int diameter;
        int height;

       public Info(int diameter, int height){
            this.diameter = diameter;
            this.height = height;
        }
    }

    public static Info diameterOfTree2(Node root){
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftDiam = diameterOfTree2(root.left);
        Info rightDiam = diameterOfTree2(root.right);

        int finalDiam = Math.max(leftDiam.height+rightDiam.height+1, Math.max(leftDiam.diameter, rightDiam.diameter));
        int finalHt = Math.max(leftDiam.height, rightDiam.height)+1;

        return new Info(finalDiam, finalHt);
    }

    //  Subtree of Another Tree

    public static Boolean isSubtree(Node root, Node subRoot){
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static boolean isIdentical(Node root, Node subRoot){
        if (root == null && subRoot == null) {
            return true;
        }else if (root == null || subRoot == null) {
            return false;
        }else if (root.data != subRoot.data) {
            return false;
        }

        if (!isIdentical(root.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(root.right, subRoot.right)) {
            return false;
        }
        return true;
    }
    
    // Top View of a Tree     
    static class Information{ // Horizontal Distance
        Node node;
        int horDist;
        Information(Node root, int n){
            this.node = root;
            this.horDist = n;
        }
    }    
        
        public static void topViewOfTree(Node root){

            Queue<Information> q = new LinkedList<>();
            q.add(new Information(root, 0));
            q.add(null);

            HashMap<Integer , Node> map = new HashMap<>();
            int min = 0, max = 0;
            while (!q.isEmpty()) {
                Information newNode = q.remove();
                if (newNode == null) {
                    if (q.isEmpty()) {
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    if (!map.containsKey(newNode.horDist)) {
                        map.put(newNode.horDist , newNode.node);
                    }

                    if (newNode.node.left != null) {
                        q.add(new Information(newNode.node.left, newNode.horDist - 1));
                        min = Math.min(min, newNode.horDist - 1);
                    }

                    if (newNode.node.right != null) {
                        q.add(new Information(newNode.node.right, newNode.horDist +1));
                        max = Math.max(max, newNode.horDist+1);
                    }

                }
            }

            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data+" ");
            }
        }
    // lowest common ancestor of a binary search tree
    // helper
    public static boolean getPath(Node root, ArrayList<Node> path, int n){
        if (root == null) {
            return false;
        }
        path.add(root);
        if (root.data == n) {
            return true;
        }
        boolean foundLeft = getPath(root.left, path, n);
        boolean foundRight = getPath(root.right, path, n);

        if (foundLeft|| foundRight) {
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }
    // main
    public static Node lca (Node root, int n1, int n2){
        ArrayList<Node> p1 = new ArrayList<>();
        ArrayList<Node> p2 = new ArrayList<>();

        getPath(root, p1, n1);
        getPath(root, p2, n2);
        
        int i = 0;
        for (i = 0; i < p1.size() && i < p2.size(); i++) {
            if (p1.get(i) != p2.get(i)) {
                break;
            }
        }
        Node lca = p1.get(i-1);
        return lca;
    }

    // Approach 2 ( lowest common ancestor of a binary search tree)
    public static Node lca2(Node root, int n1, int n2){
        if (root == null) {
            return null;
        }
        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if (rightLca == null) {
            return leftLca;
        }
        if (leftLca == null) {
            return rightLca;
        }

        return root;
    }

    // Minimum Distance between 2 Nodes
    public static int minDist(Node root, int n1, int n2){
        Node lca = lca2(root, n1, n2);

        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca,n2);
        return dist1+dist2;
    }
    // helper
    public static int lcaDist(Node root, int n){
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }

        return (rightDist == -1)? leftDist+1: rightDist+1;
    }

    // Kth ancestor of Node
    public static int KthAncestor(Node root, int n, int k){
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }
        int leftDiam = KthAncestor(root.left, n, k);
        int rightDiam = KthAncestor(root.right, n, k);

        if (leftDiam == -1 && rightDiam == -1) {
            return -1;
        }
        int max = Math.max(leftDiam, rightDiam);
        if (max+1 == k) {
            System.out.println("Kth ancestor of Node = "+ root.data);
        }
        return max+1;
    }
    // Transform to Sum Tree
    public static int sumTree(Node root){
        if (root == null) {
            return 0;
        }
        int rootData = root.data;

        root.data = sumTree(root.left)+sumTree(root.right);
        
        return rootData+root.data;
    }
    public static void main (String[] args) {
        
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildBinaryTree(nodes);
        // System.out.println("Tree Root = "+ root.data);

        preOrder(root);
        System.out.println("");
        inOrder(root);
        System.out.println("");
        postOrder(root);
        System.out.println("\nLevelOrder");
        levelOrder(root);
        System.out.println("Height of Tree = "+heightOfTree(root));
        System.out.println("Total no of Nodes of Tree = "+countOfNodes(root));
        System.out.println("The total sum of nodes of tree = "+sumOfNodes(root));
        System.out.println("Diameter of Tree = "+ diameterOfTree(root));

        Node firstNode = new Node(2);
        Node secondNode = new Node(3);
        Node thirdNode = new Node(4);
        Node fourthNode = new Node(5);
        Node fifthNode = new Node(6);
        Node sixthNode = new Node(7);
        Node seventhNode = new Node(8);
        Node eighthNode =new Node(9);

        // Connect binary tree nodes
        firstNode.left = secondNode;
        firstNode.right = thirdNode;
        secondNode.left = fourthNode;
        secondNode.right = fifthNode;
        fifthNode.right = seventhNode;
        fourthNode.left = sixthNode;
        seventhNode.right = eighthNode;

        // System.out.println("Diameter of Tree = "+ diameterOfTree(firstNode));
        // levelOrder(firstNode);

        // Diameter Apporach 2
        Node root1 = new Node(1);
        root1.left =new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.right = new Node(6);
        root1.right.left = new Node(7);

        System.out.println("Diameter = "+diameterOfTree2(root).diameter+", Height = "+diameterOfTree2(root).height);

        Node SubRoot = new Node(2);
        SubRoot.left =new Node(4);
        SubRoot.right = new Node(6);
        System.out.println(isSubtree(root1, SubRoot));
        
        topViewOfTree(root1);
        System.out.println("");
        // lowest common ancestor of a binary search tree
        System.out.println("lowest common ancestor of 4 & 6 is : "+lca(root1, 4, 6).data);
        System.out.println("lowest common ancestor of 4 & 6 is : "+lca2(root1, 4, 6).data);
        System.out.println("lowest common ancestor of 6 & 7 is : "+lca2(root1, 7, 6).data);

        System.out.println("Minimum Distance between Node 4 & Node 6 is: "+minDist(root1, 4, 6));
        System.out.println("Minimum Distance between Node 6 & Node 7 is: "+minDist(root1, 7, 6));

        KthAncestor(root1, 4, 1);

        sumTree(root1);
        levelOrder(root1);
    }
}