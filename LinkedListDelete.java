package Assignment3LinkedList;

public class LinkedListDelete {
    Node head;

    // initialize linked list
    public LinkedListDelete() {
        head = null;
    }

    // 1. Deleting a node at the beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        head = head.next;
    }

    // 2. Deleting a node at the end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // 3. Deleting a node with a specific value
    public void deleteNode(int value) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }

        // If the node to be deleted is the head
        if (head.data == value) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Node with value " + value + " not found.");
            return;
        }


        temp.next = temp.next.next;
    }

    // display the linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
