class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    Node(int data1) {
        data = data1;
        next = null;
    }
}

public class Nth_Node_remove {
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static Node delete_Node(Node head, int n) {
        Node fast = head;
        Node slow = head;

        for (int i = 0; i < n; i++)
            fast = fast.next;

        if (fast == null)
            return head.next;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        Node deleteNode = slow.next;
        slow.next = slow.next.next;
        deleteNode = null;

        return head;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = 3;

        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);

        head = delete_Node(head, n);
        printLL(head);
    }
}
