public class DoublyLinkedList{

    // Doubly linked list
    public static class Node {
        Node prev;
        int data;
        Node next;
        public Node(int data){
            this.prev = null;
            this.data = data;
            this.next = null;
        }   
    }
    // add first
    public static Node addFirst(Node head, int data){
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return head;
        }
        temp.next = head;
        head.prev = temp;
        head = temp;
        return head;
    }

    // remove first 
    public static Node removeFirst(Node head){
        if (head == null) {
            System.out.println("LinkedList is already Empty..");
        }else{
            Node temp = head;
            head = head.next;
            temp.next = null;
            head.prev = null;
            temp = null;
        }
        return head;
    }

    public static void printLL(Node head){
        Node newNode = head;
        if (head == null) {
            System.out.println("Linked List is EMPTY");
            return;
        }
        System.out.print("null<--");
        while (newNode.next != null) {
            System.out.print(newNode.data+"<==>");
            newNode = newNode.next;
        }
        System.out.print(newNode.data+"-->");
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(6);
        head.next.next = new Node(8);
        head.next.next.next = new Node(9);
        head.next.next.next.next = new Node(3);
        System.out.println("Original Linkedlist:");
        printLL(head);
        head = addFirst(head, 1);
        System.out.println("Add node in first position Linkedlist:");
        printLL(head);
        head = removeFirst(head);
        System.out.println("Remove node in first position Linkedlist:");
        printLL(head);
    }
}