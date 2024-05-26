// question 1 

public class LinkedList {
    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverse(Node node) {
     Node prev = null;
     Node current = node;
     Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        node = prev;
        return node;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
    LinkedList list = new LinkedList();
    LinkedList.head = new Node(1);
      LinkedList.head.next = new Node(2);
    LinkedList.head.next.next = new Node(3);
     LinkedList.head.next.next.next = new Node(10);
      LinkedList.head.next.next.next.next = new Node(8);

    System.out.println("Given Linked list:");
        list.printList(head);
        head = list.reverse(head);

        System.out.println("\nReversed linked list:");
        list.printList(head);
    }
}
















