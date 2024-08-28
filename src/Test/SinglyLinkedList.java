package Test;
class SinglyLinkedList {
    // Node class representing each element in the list
    class Node {
        int data;
        Node next; // pointer to the next node

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null; // initially the next is set to null
        }
    }

    Node head = null; // head of the list (first node)

    // Method to add a node at the end of the list
    public void add(int data) {
        // Create a new node with given data
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse to the end of the list
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            // Link the last node to the new node
            current.next = newNode;
        }
    }

    // Method to display the list
    public void display() {
        // Traverse the list and print each node's data
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to delete the last node from the list
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        
        // If there's only one element in the list
        if (head.next == null) {
            head = null;
            return;
        }

        // Traverse to the second last node
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        // Set the second last node's next to null (removing last node)
        current.next = null;
    }

    // Method to add an element at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // Display the list
        System.out.println("Original list:");
        list.display();

        // Remove the last element
        list.removeLast();
        System.out.println("After removing last element:");
        list.display();

        // Add an element at the beginning
        list.addFirst(5);
        System.out.println("After adding element at the beginning:");
        list.display();
    }
}