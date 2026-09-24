class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {

    // Insert node at given position
    static Node insertAtPosition(Node head, int pos, int value) {

        // Invalid position
        if (pos < 1) {
            return head;
        }

        // Insert at beginning
        if (pos == 1) {
            Node newNode = new Node(value);
            newNode.next = head;
            return newNode;
        }

        // Find the node before the required position
        Node curr = head;

        for (int i = 1; i < pos - 1 && curr != null; i++) {
            curr = curr.next;
        }

        // Position doesn't exist
        if (curr == null) {
            return head;
        }

        // Create new node
        Node newNode = new Node(value);

        // Connect new node
        newNode.next = curr.next;
        curr.next = newNode;

        return head;
    }

    public static void main(String[] args) {

        // Create linked list
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        // Insert 25 at position 3
        head = insertAtPosition(head, 3, 25);

        // Print linked list
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

