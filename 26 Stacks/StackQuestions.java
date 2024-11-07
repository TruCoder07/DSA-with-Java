import java.util.*;
public class StackQuestions{

    public static class Node{
        char data;
        Node next;
        public Node(char data){
            this.data = data;
            this.next = null;
        }
    }
    public static void printLL(Node head){
        Node newNode = head;
        if (head == null) {
            System.out.println("Linked List is EMPTY");
            return;
        }
        while (newNode != null) {
            System.out.print(newNode.data+"-->");
            newNode = newNode.next;
        }
        System.out.println("null");
    }
    public static boolean isPalindromeLL(Node head){
        Stack<Character> s = new Stack<>();
        Node temp = head;
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        } 

        while (!s.isEmpty()) {
            if (s.peek() != head.data) {
                return false;
            }
            s.pop();
            head = head.next;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head = new Node('a');
        head.next= new Node('b');
        head.next.next= new Node('c');
        head.next.next.next= new Node('b');
        head.next.next.next.next = new Node('a');

        printLL(head);
        System.out.println(isPalindromeLL(head));
    }
}
