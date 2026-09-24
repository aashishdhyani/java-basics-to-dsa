class node {
    int data;
    node next;
    node prev;

    node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

}

public class doublulinkedlist2 {
    public static void main(String[] args) {
        node first = new node(10);
        node second = new node(20);
        node third = new node(30);
        first.next = second;
        second.prev = first;
        second.next = third;
        third.prev = second;
        // forward trversing
        node temp = first;
        // value assign

        // connecting node

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;

        }

        temp = third;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.prev;

        }

    }

}
