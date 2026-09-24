public class doublylinkedlist {

    // Node structure
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // Create nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Connect nodes
        first.next = second;

        second.prev = first;
        second.next = third;

        third.prev = second;

        // Forward Traversal
        Node temp = first;

        System.out.println("Forward:");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        // Backward Traversal
        temp = third;

        System.out.println("\nBackward:");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}

