import java.util.*;;

public class LinkedList2{
    public static boolean isCycle(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast= fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void printLL( Node head){
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

    public static void removeCycle(Node head){
        Node slow = head;
        Node fast = head;
        boolean cycle = true;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast= fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast= fast.next;
        }
        prev.next = null;
    }
        
    // 10 Zig Zag Linked List 
        public static void zigZagLL(Node head){
            Node mid = midOfLL(head);
            Node rightHead = mid.next;
            Node leftHead = head;
            mid.next = null;
            rightHead = reverseLL(rightHead);

            // zig zag
            Node nextL, nextR;
            while (rightHead != null && leftHead != null) {
                nextL = leftHead.next;
                leftHead.next = rightHead;
                nextR = rightHead.next;
                rightHead.next = nextL;

                // updating
                rightHead = nextR;
                leftHead = nextL;
            }
        }
        public static Node midOfLL(Node head){
            Node slow = head;
            Node fast = head.next;
            Node mid;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            mid = slow;
            return mid;
        }

        public static Node reverseLL(Node head){
            Node prev = null;
            Node curr = head;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
            return head;
        }

    // public static Node head;

    // single linked list
    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static void main(String[] args) {
        // Node head = new Node(3);
        // head.next = new Node(4);
        // Node temp = new Node(5);
        // head.next.next = temp;
        // head.next.next.next = new Node(6);        
        // head.next.next.next.next = new Node(7);
        // head.next.next.next.next.next = temp;
        // // printLL(head);
        // System.out.println(isCycle(head));
        // removeCycle(head);
        // printLL(head);

        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);        
        head1.next.next.next.next = new Node(5);
        // head1.next.next.next.next.next = new Node(6);
        printLL(head1);
        System.out.println("");
        zigZagLL(head1);
        printLL(head1);
    }
}