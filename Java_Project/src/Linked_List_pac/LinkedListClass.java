package Linked_List_pac;

public class LinkedListClass {

    // head of the linked list
    Node head;

    // Node class
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at end
    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {   // empty list
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Display list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Delete by value
    void delete(int key) {
        if (head == null) return;

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public static void main(String[] args) {
        LinkedListClass list = new LinkedListClass();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();  
        list.delete(20);
        list.display(); 
    }
}

