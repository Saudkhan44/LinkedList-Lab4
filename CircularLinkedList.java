package LinkedList;

import java.util.Scanner;// Node for Circular Linked List
class CNode {
    int data;
    CNode next;
    CNode(int data) { this.data = data; }
}

// Circular Linked List implementation
class CircularLinkedList {
    CNode head;

    void insertAtEnd(int data) {
        CNode newNode = new CNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }
        CNode temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    void traverse() {
        if (head == null) return;
        CNode temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }
}



// Submenu for Circular Linked List
//static void circularMenu(Scanner sc, CircularLinkedList cll) {
//    while (true) {
//        System.out.println("\n--- Circular Linked List Menu ---");
//        System.out.println("1. Insert at End");
//        System.out.println("2. Traverse");
//        System.out.println("3. Back to Main Menu");
//        System.out.print("Enter choice: ");
//        int ch = sc.nextInt();
//
//        switch (ch) {
//            case 1:
//                System.out.print("Enter value: ");
//                cll.insertAtEnd(sc.nextInt());
//                break;
//            case 2:
//                cll.traverse();
//                break;
//            case 3:
//                return;
//            default:
//                System.out.println("Invalid choice!");
//        }
//    }
//}