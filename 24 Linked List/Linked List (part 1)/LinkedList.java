public class LinkedList{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.head = new Node(3);
        ll.head.next = new Node(5); 
        ll.addFirst(23);
        ll.addEnd(32);
        ll.addEnd(56);
        ll.addFirst(1);
        ll.addMiddle(33, 2);
        ll.addMiddle(76, 6);
        
        ll.removeFirst();
        ll.removeLast();
        ll.printLL();
        int mid = findMidOfLL();
        System.out.println("Mid value of LinkedList = "+ mid);

        // ll.reverseLL();
        // int val = ll.delNthFromEnd(3);
        // System.out.println("Deleted Node Vale = "+val);
        // ll.printLL();

        int pos = 0;
        
        // System.out.println("LinkedList Found at Idx = "+ll.recSearch(5));


    }


    public void addFirst(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addMiddle(int data, int pos){
        if (pos == 0) {
            addFirst(data);
            return;
        }
        Node newNode, curr;
        newNode = new Node(data);
        curr = head;
        while ((pos-1) >= 0) {
            curr = curr.next;
            pos--;
        }
        if (curr.next == null) {
            addEnd(data);
            return;
        }
        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void addEnd(int data){
        Node temp = head;
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void removeFirst(){
        if (head == null) {
            System.out.println("LinkedList is EMPTY");
            return;
        }else if(head.next == null){
            head = null;
            return;
        }
        Node temp = head;
        head = head.next;
        temp = null;
    }

    public void removeLast(){
        Node curr, temp;
        curr = head;
        temp = head.next;
        
        if (head == null) {
            System.out.println("LinkedList is EMPTY");
            return;
        }else if(head.next == null){
            head = null;
            return;
        }

        while (temp.next != null) {
            curr = curr.next;
            temp = temp.next;
        }
        curr.next = null;
        temp = null;
    }

    public int itrSearch(int key){
        Node temp = head;
        int idx = 0;
        while (temp != null) {
            if (temp.data == key) {
                return idx;
            }
            idx++;
            temp = temp.next;
        }
        return -1;
    }
    public int helper(Node head,int key){
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        Node temp = head;
        return helper(temp, key);
    }

    // reverse linked List
    public void reverseLL(){
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
    }

    public void printLL(){
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
    public static Node head;

    public static class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public int delNthFromEnd(int n){
        int size= 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        int idx = size-n+1;

        Node p = head;
        Node q = head.next;

        while ((idx-1) > 1) {
            p = p.next;
            q = q.next;
            idx--;
        }
        int nodeVal = q.data;
        p.next = q.next;
        q = null;
        return nodeVal;
    }


    // Check LinkedList is plimdrome or not
    public static int findMidOfLL(){
        Node slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}