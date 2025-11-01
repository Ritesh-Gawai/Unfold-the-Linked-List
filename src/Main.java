import java.util.*;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

public class Main {

    // Function to unfold the linked list
    public static Node unfold(Node head) {
        if (head == null || head.next == null) return head;

        Node firstHead = head;
        Node secondHead = head.next;

        Node first = firstHead;
        Node second = secondHead;

        // Separate alternate nodes
        while (second != null && second.next != null) {
            first.next = second.next;
            first = first.next;
            second.next = first.next;
            second = second.next;
        }

        // Reverse the second list
        Node reversedSecond = reverse(secondHead);

        // Join both lists
        first.next = reversedSecond;

        return firstHead;
    }

    // Function to reverse a linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // Utility function to print linked list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Node head = new Node(sc.nextInt());
        Node temp = head;

        for (int i = 1; i < n; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }

        head = unfold(head);
        printList(head);
    }
}
