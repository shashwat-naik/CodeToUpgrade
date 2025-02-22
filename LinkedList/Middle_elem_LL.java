class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Middle_elem_LL {
    public static Node middleEle(Node head) {
        Node Slow = head;
        Node Fast = head;

        while (Slow != null && Fast != null && Fast.next != null) {
            Fast = Fast.next.next;
            Slow = Slow.next;
        }
        return Slow;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node middleNode = middleEle(head);
        System.out.println("The middle element of the LinkedList: " + middleNode.data);
    }
}
