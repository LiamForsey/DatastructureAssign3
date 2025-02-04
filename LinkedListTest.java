package Assignment3LinkedList;

public class LinkedListTest {

    public static void main(String[] args) {
        // Create an instance of the LinkedListDelete class
        LinkedListDelete list = new LinkedListDelete();



        // Add nodes to the list
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.next = new Node(50);


        // 1. Deleting node at the beginning
        System.out.println("Deleting at the beginning:");
        list.deleteAtBeginning();
        list.printList();

        // 2. Deleting node at the end
        System.out.println("Deleting at the end:");
        list.deleteAtEnd();
        list.printList();

        // 3. Deleting a specific node (value 30)
        System.out.println("Deleting node with value 30:");
        list.deleteNode(30);
        list.printList();
    }
}
