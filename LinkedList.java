public class LinkedList {

    // initilizing node type data
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    // init head of linkelist
    static Node head = null;
    static int size = 0;

    // add firstNode to linkedList
    static void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // add lastNode to LinkedList
    static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        size++;
    }

    // Add node to mid of linkedList
    public static void addMid(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node slow = head;
            Node fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            newNode.next = slow.next;
            slow.next = newNode;
        }
    }

    // Add node to any specific position of linkedList
    public static void addSpecific(int data, int i) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            int count = 0;
            Node temp = head;
            while (count != i) {
                temp = temp.next;
                count++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

    }

    // remove first node
    public static void removeFirst() {
        if (head == null) {
            return;
        } else {

            head = head.next;
        }
    }

    // remove last node
    public static void removeLast() {
        if (head == null) {
            return;

        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;

        }
    }

    // remove mid node of linkedlist
    public static void removeMid() {
        if (head == null) {
            return;
        } else if (head.next == null) {
            head = null;
            return ;
        } else {
            Node slow = head;
            Node fast = head;
            Node temp = head;

            while (fast.next != null && fast.next.next != null) {
                temp = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            temp.next = slow.next;
        }
    }
    //remove Ith Node from linkedList
    public static void removeIth(int i){

        if(head == null){
            return;
        }else {
            int count = 0;
            Node temp = head;
            while (count != i-1) {
                temp =temp.next;
                count++;
            }
            temp.next = temp.next.next;
        }

    }
    //reverse the linkedList
    public static void reverseList(){
        Node prev = null;
        Node curr = head;
        Node Next = head;
        while (curr != null) {
            Next =curr.next;
            curr.next = prev;
            prev = curr;
            curr= Next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        addFirst(2);
        addFirst(6);
        addFirst(8);
        addLast(80);
        addMid(354);
        addSpecific(23, 2);
        reverseList();
        // removeFirst();
        // removeMid();
        // removeIth(1);
        // traversing through the all the nodes of linkedList
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
