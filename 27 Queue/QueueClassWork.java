import java.util.*;
import java.util.LinkedList;

public class QueueClassWork{
    // question 2
    // medhod 1 push O(n), (pop, peek =>o(1)
    static class Queue1{
        static Stack<Integer> s1 =new Stack<>();
        static Stack<Integer> s2 =new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        public static int remove(){
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }
        public static int peek(){
            if (s1.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    } 

    // question 2
    // medhod 2 pop,peek O(n), (pop =>o(1)
    static class Queues{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        public static void add(int data){
            s1.push(data);
        }

        public static int remove(){
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int result = s2.pop();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return result;
        }

        public static int peek(){
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int result = s2.peek();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return result;
        }
    }

    // Question 3 Stack using 2 Queue
    static class QueueForStack{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void add(int data){
            if (!q1.isEmpty()) {
                q1.add(data);
            }else{
                q1.add(data);
            }
        }

        public static int remove(){
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = -1;

            if (!q1.isEmpty()) {
                while (q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            }else{
                while (q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = -1;

            if (!q1.isEmpty()) {
                while (q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            }else{
                while (q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }

    }

    static class QueueForStacks{
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        } 

        public void push(int data){
            
            if (!q1.isEmpty()) {
                q2.add(data);
                while (!q1.isEmpty()) {
                    q2.add(q1.remove());
                }

            }else{
                q1.add(data);
            
                while (!q2.isEmpty()) {
                    q1.add(q2.remove());
                }
            }
        }

        public int pop(){
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }

            if (!q1.isEmpty()) {
                return q1.remove();
            }else{
                return q2.remove();
            }
        }

        public int peek(){
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            if (!q1.isEmpty()) {
                return q1.peek();
            }else{
                return q2.peek();
            }
        }
    }
    
{
        // static class Node{
    //     int data;
    //     Node next;
    //     Node(int data){
    //         this.data = data;
    //         this.next = null; 
    //     }

    // } 
    // static class Queue{
    //     // question 1
    //     // Liked List Implementation
    //     static Node head = null;
    //     static Node tail = null;

    //     public static boolean isEmpty(){
    //         return head == null && tail == null;
    //     }

    //     public static void add(int data){
    //         Node newNode = new Node(data);
    //         if (head==null) {
    //             head=tail=newNode;
    //             return;
    //         }
    //         tail.next=newNode;
    //         tail = newNode;
    //     }
    //     public static int remove(){
    //         if (isEmpty()) {
    //             System.out.println("Linked List is already EMPTY");
    //             return -1;
    //         }
    //         int result = head.data;
    //         if (head == tail) {
    //             head = tail = null;
    //         }else{
    //             Node temp = head;
    //             head = head.next;
               
    //         }
            
    //         return result;
    //     }

    //     public static int peek(){
    //         if (isEmpty()) {
    //             System.out.println("Linked List is EMPTY");
    //             return -1;
    //         }
    //         return head.data;
    //     }

        // Array Implementation
       /* static int arr[];
        static int size;
        static int rare;
        static int front;
        Queue(int n){
            arr = new int[n];
            size = n;
            rare = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rare == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rare+1)%size == front;
        }

        public static void add(int data){
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rare = (rare+1)%size;
            arr[rare] = data;
        }
        public static int remove(){
            if (isEmpty()) {
                System.out.println("Queue is already empty");
                return -1;
            }
            int result = arr[front];
            // last ele delete
            if (rare == front) {
                rare = front = -1;
            }else{
                front = (front+1)%size;
            }
            
            return result;
        }

        public static int peek(){
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
         */
    // }

    

}
    // Q4
    public static void printNonRepeading(String str){
        int freq [] = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            int idx = ch - 'a';
            freq[idx]++;
            while (!q.isEmpty() && freq[q.peek()-'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print("-1");
            }else{
                System.out.print(q.peek());
            }

        }
    }

    // Q5 Interleave 2 halves
    public static void interleave2halvesOfQueue(Queue<Integer> q){
        Queue<Integer> q1 = new LinkedList<>();
        int n = q.size();
        for (int i = 0; i < n/2; i++) {
            q1.add(q.remove());
        }
        
        while (!q1.isEmpty()) {
            q.add(q1.remove());
            q.add(q.remove());
        }

    }

    // Question 6 Queue Reversal(Method 1 after seeing question)
    public static void queueReversal (Queue<Integer> q){
        if (q.isEmpty()) {
            return;
        }
        int top = q.remove();
        queueReversal(q);
        queueReversalCall(q, top);
        q.add(top);
    }
    public static void queueReversalCall(Queue<Integer> q, int data){
        q.add(data);
    }

    // Question 6 Queue Reversal(Method 2 after some hint)
    public static void queueReversalM2(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    // Question 7 StacK using Deque
    static class  Stack4DQ {
        static Deque<Integer> d = new LinkedList<>();

        public static boolean isEmpty(){
            return d.isEmpty();
        }
        public static void push(int data){
            d.addLast(data);
        }

        public static int pop(){
            if (d.isEmpty()) {
                System.out.println("Deque is empty");
                return -1;
            }
            int top = d.removeLast();
            return top;
        }

        public static int peek(){
            if (d.isEmpty()) {
                System.out.println("Deque is empty");
                return -1;
            }
            return d.getLast();
        }
    }
    // Question 7 Queue using Deque
    static class Queue4Deque{
        static Deque<Integer> d = new LinkedList<>();

        public static boolean isEmpty(){
            return d.isEmpty();
        }
        public static void add(int data){
            d.addLast(data);
        }
        public static int remove(){
            if (d.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = d.removeFirst();
            return front;
        }
        public static int peek(){
            if (d.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return d.getFirst();
        }
    }
    public static void main(String[] args) {
        // Queue q = new Queue();
        
        // Queue<Integer> q = new LinkedList<>();
        // queue q = new queue(); // method 1
        
        /*queues q = new queues(); // method 2

        q.add(1);
        q.add(2);
        q.add(3);

        // System.out.println()
        while (!q.isEmpty()) {
            System.out.print(q.peek()+ " ");
            q.remove();
        } */
        // Q3
        
        QueueForStacks s =new QueueForStacks();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek()+" ");
            s.pop();
        } 

        // Q4
        // String str = "aabccxb";
        // printNonRepeading(str);

        // Question 5
        /*
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        
        interleave2halvesOfQueue(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        } 
        */
        // question 6
        /*
        Queue<Integer> q6 = new LinkedList<>();
        q6.add(1);
        q6.add(2);
        q6.add(3);
        q6.add(4);
        q6.add(5);

        // queueReversal(q6);
        queueReversalM2(q6);
        while (!q6.isEmpty()) {
            System.out.print(q6.peek()+" ");
            q6.remove();
        }
         */

        //  Question 7 a
        /*
        Stack4DQ sd = new Stack4DQ();
        sd.push(2); 
        sd.push(3);
        sd.push(7); 
        sd.push(9);

        while (!sd.isEmpty()) {
            System.out.print(sd.peek()+" ");
            sd.pop();
        }
        */
        //  Question 7 a
        /*
        Queue4Deque qd = new Queue4Deque();
        qd.add(1);
        qd.add(2);
        qd.add(3);
        qd.add(4);
        qd.add(5);

        while (!qd.isEmpty()) {
            System.out.print(qd.peek()+" ");
            qd.remove();
        }
             */

    }
}