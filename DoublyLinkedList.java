package LinkedList;

import java.util.Scanner;// Node for Doubly Linked List
class DNode {
    int data;
    DNode prev, next;
    DNode(int data) { this.data = data; }
}

// Doubly Linked List implementation
class DoublyLinkedList {
    DNode head;

    void insertAtBeginning(int data) {
        DNode newNode = new DNode(data);
        if (head != null) head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = newNode;
            return;
        }
        DNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
    }

    void deleteByValue(int key) {
        if (head == null) return;
        if (head.data == key) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }
        DNode temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }
        if (temp != null) {
            if (temp.next != null) temp.next.prev = temp.prev;
            if (temp.prev != null) temp.prev.next = temp.next;
        }
    }

    void traverseForward() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}



// Submenu for Doubly Linked List
//static void doublyMenu(Scanner sc, DoublyLinkedList dll) {
//    while (true) {
//        System.out.println("\n--- Doubly Linked List Menu ---");
//        System.out.println("1. Insert at Beginning");
//        System.out.println("2. Insert at End");
//        System.out.println("3. Delete by Value");
//        System.out.println("4. Traverse Forward");
//        System.out.println("5. Back to Main Menu");
//        System.out.print("Enter choice: ");
//        int ch = sc.nextInt();
//
//        switch (ch) {
//            case 1:
//                System.out.print("Enter value: ");
//                dll.insertAtBeginning(sc.nextInt());
//                break;
//            case 2:
//                System.out.print("Enter value: ");
//                dll.insertAtEnd(sc.nextInt());
//                break;
//            case 3:
//                System.out.print("Enter value to delete: ");
//                dll.deleteByValue(sc.nextInt());
//                break;
//            case 4:
//                dll.traverseForward();
//                break;
//            case 5:
//                return;
//            default:
//                System.out.println("Invalid choice!");
//        }
//    }
//}
