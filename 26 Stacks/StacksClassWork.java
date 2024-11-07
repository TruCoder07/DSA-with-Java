// 26 Stacks
import java.util.*;

public class StacksClassWork{

    // Stack on LinkedList

    /*static class  Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class StacksOnLL{
        static Node head = null;

        public static boolean isEmpty(){
            // if (head == null) {
            //     return true;
            // }
            // return false;
            return head == null;
        }
        // push
        public static void push(int data){
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                return;
            }
            temp.next = head;
            head = temp;
        }
        // pop
        public static int pop(){
            if (isEmpty()) {
                return -1;
            }
            // Node temp = head;
            int top = head.data;
            head = head.next;
            // temp.next = null;
            // temp = null;
            return top;
        }

        // peek
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
        */
    public static void pushAtBottom(Stack <Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (str.length() != idx) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder newStr = new StringBuilder("");
        while (!s.isEmpty()) {
            newStr.append(s.pop());
        }
        return newStr.toString();
    }

    public static void reverseStack(Stack <Integer> s){
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    // stock span problem
    public static void stockSpan(int stock[], int span[]){
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);
        for (int i = 1; i < stock.length; i++) {
            int curr = stock[i];
            while (!s.isEmpty() && stock[s.peek()] <= curr) {
                s.pop();
            }

            if (s.isEmpty()) {
                span[i] = i+1;
            }else{
                span[i] = i - s.peek();
            }
            s.push(i);

        }
        
    }

    static void nextGreaterEle(int[] arr, int[] nextGreater){
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length-1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    public static boolean validParenthese(String p){
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < p.length(); i++) {
        // opening parentheses
            if ((p.charAt(i) == '(') || (p.charAt(i) == '[') || (p.charAt(i) == '{')) {
                s.push(p.charAt(i));
            }else{
                // closing parenthese
                if (s.isEmpty()) {
                    return false;
                }
                if ((p.charAt(i) == ')' && (s.peek() == '(')) || 
                    (p.charAt(i) == ']') && (s.peek() == '[') ||
                    (p.charAt(i) == '}') && (s.peek() == '{')) {
                    s.pop();
                }else{
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

    public static boolean isDuplicateParentheses(String p){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i<p.length(); i++){
            // closing barcets
            if (p.charAt(i) == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count<1) {
                    return true;
                }else{
                    s.pop();
                }
            }else{ // opening barcket
                s.push(p.charAt(i));
            }
        }
        return false;
    } 

    public static void nextSmallerLeft(int arr[], int nextSmallerL[]){
        Stack <Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextSmallerL[i] = -1;
            }else{
                nextSmallerL[i] = s.peek();
            }
            s.push(i);
        }
    }

    public static void nextSmallerRight(int arr[], int nextSmallerR[]){
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length-1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextSmallerR[i] = arr.length;
            }else{
                nextSmallerR[i] =  s.peek();
            }
            s.push(i);
        }
    }

    public static int maxAreaInHistogram(int height[],int nextSmallerRit[],int nextSmallerLft[]){
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < height.length; i++) {
            int length = height[i];
            int width = nextSmallerRit[i]-nextSmallerLft[i]-1;
            int area = length*width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        // StacksOnLL s = new StacksOnLL();
        // Stack<Integer> s = new Stack();
        // s.push(1); 
        // s.push(2);
        // s.push(3);

        // // pushAtBottom(s, 4);
        // reverseStack(s);

        // while (!s.isEmpty()) {
        //     System.out.println(s.pop());
        //     // s.pop();
        // }

        // Question No 2
        // String name = "Tufail";
        // name = reverseString(name);
        // System.out.println(name);

        // question 4
        // int stock[] = {100, 80, 60, 70, 60, 85, 100};
        // int span[] = new int[stock.length];
        // stockSpan(stock, span);
        // for (int i = 0; i < span.length; i++) {
        //     System.out.print(span[i]+" ");
        // }

        // Question 5
        // int arr[] = {6,8,0,1,3};
        // int nextGreater[] = new int[arr.length];

        // nextGreaterEle(arr, nextGreater);
        // for (int i = 0; i < nextGreater.length; i++) {
        //     System.out.println(nextGreater[i]);
        // }

        // Q5 Valid Parentheses
        // String parentheses = "{}";
        // System.out.println(validParenthese(parentheses));

        // Q6 Dublicate Parentheses
        // String Q6 = "((c+d))";
        // System.out.println(isDuplicateParentheses(Q6));

        // Q7 
        int height [] = {2,1,5,6,2,3};
        int nextSmallerLft[] = new int[height.length];
        int nextSmallerRit[] = new int[height.length];
        nextSmallerLeft(height, nextSmallerLft);
        nextSmallerRight(height, nextSmallerRit);
        
        System.out.println(maxAreaInHistogram(height,nextSmallerRit,nextSmallerLft));
    }
}