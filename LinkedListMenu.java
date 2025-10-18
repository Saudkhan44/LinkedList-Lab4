package LinkedList;

import java.util.Scanner;

// Main menu driver
public class LinkedListMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList sll = new SinglyLinkedList();
        DoublyLinkedList dll = new DoublyLinkedList();
        CircularLinkedList cll = new CircularLinkedList();
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();

        while (true) {
            System.out.println("\n--- MAIN MENU ---");
            System.out.println("1. Singly Linked List");
            System.out.println("2. Doubly Linked List");
            System.out.println("3. Circular Linked List");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    singlyMenu(sc, sll);
                    break;
                case 2:
                    doublyMenu(sc, dll);
                    break;
                case 3:
                    circularMenu(sc, cll, cdll);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Submenu for Singly Linked List
    static void singlyMenu(Scanner sc, SinglyLinkedList sll) {
        while (true) {
            System.out.println("\n--- Singly Linked List Menu ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete by Value");
            System.out.println("5. Search");
            System.out.println("6. Traverse Iterative");
            System.out.println("7. Traverse Recursive");
            System.out.println("8. Back to Main Menu");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    sll.insertAtBeginning(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    sll.insertAtEnd(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter value and position: ");
                    int val = sc.nextInt();
                    int pos = sc.nextInt();
                    sll.insertAtPosition(val, pos);
                    break;
                case 4:
                    System.out.print("Enter value to delete: ");
                    sll.deleteByValue(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter value to search: ");
                    System.out.println(sll.search(sc.nextInt()) ? "Found" : "Not Found");
                    break;
                case 6:
                    sll.traverseIterative();
                    break;
                case 7:
                    sll.traverseRecursive(sll.head);
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Submenu for Doubly Linked List
    static void doublyMenu(Scanner sc, DoublyLinkedList dll) {
        while (true) {
            System.out.println("\n--- Doubly Linked List Menu ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete by Value");
            System.out.println("5. Delete at Position");
            System.out.println("6. Search");
            System.out.println("7. Traverse Forward");
            System.out.println("8. Traverse Backward");
            System.out.println("9. Back to Main Menu");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter value: ");
                    dll.insertAtBeginning(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    dll.insertAtEnd(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter value and position: ");
                    int val = sc.nextInt();
                    int pos = sc.nextInt();
                    dll.insertAtPosition(val, pos);
                    break;
                case 4:
                    System.out.print("Enter value to delete: ");
                    dll.deleteByValue(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter position to delete: ");
                    dll.deleteAtPosition(sc.nextInt());
                    break;
                case 6:
                    System.out.print("Enter value to search: ");
                    dll.search(sc.nextInt());
                    break;
                case 7:
                    dll.traverseForward();
                    break;
                case 8:
                    dll.traverseBackward();
                    break;
                case 9:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Submenu for Circular Linked List
    static void circularMenu(Scanner sc, CircularLinkedList cll, CircularDoublyLinkedList cdll) {
        while (true) {
            System.out.println("\n--- Circular Linked List Menu ---");
            System.out.println("1. Circular Singly: Insert at Beginning");
            System.out.println("2. Circular Singly: Insert at End");
            System.out.println("3. Circular Singly: Insert at Position");
            System.out.println("4. Circular Singly: Delete by Value");
            System.out.println("5. Circular Singly: Delete at Position");
            System.out.println("6. Circular Singly: Search");
            System.out.println("7. Circular Singly: Traverse");
            System.out.println("8. Circular Doubly: Insert at Beginning");
            System.out.println("9. Circular Doubly: Insert at End");
            System.out.println("10. Circular Doubly: Insert at Position");
            System.out.println("11. Circular Doubly: Delete by Value");
            System.out.println("12. Circular Doubly: Delete at Position");
            System.out.println("13. Circular Doubly: Search");
            System.out.println("14. Circular Doubly: Traverse Forward");
            System.out.println("15. Circular Doubly: Traverse Backward");
            System.out.println("16. Back to Main Menu");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                // Circular Singly operations
                case 1:
                    System.out.print("Enter value: ");
                    cll.insertAtBeginning(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Enter value: ");
                    cll.insertAtEnd(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter value and position: ");
                    int val = sc.nextInt();
                    int pos = sc.nextInt();
                    cll.insertAtPosition(val, pos);
                    break;
                case 4:
                    System.out.print("Enter value to delete: ");
                    cll.deleteByValue(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter position to delete: ");
                    cll.deleteAtPosition(sc.nextInt());
                    break;
                case 6:
                    System.out.print("Enter value to search: ");
                    cll.search(sc.nextInt());
                    break;
                case 7:
                    cll.traverse();
                    break;

                // Circular Doubly operations
                case 8:
                    System.out.print("Enter value: ");
                    cdll.insertAtBeginning(sc.nextInt());
                    break;
                case 9:
                    System.out.print("Enter value: ");
                    cdll.insertAtEnd(sc.nextInt());
                    break;
                case 10:
                    System.out.print("Enter value and position: ");
                    val = sc.nextInt();
                    pos = sc.nextInt();
                    cdll.insertAtPosition(val, pos);
                    break;
                case 11:
                    System.out.print("Enter value to delete: ");
                    cdll.deleteByValue(sc.nextInt());
                    break;
                case 12:
                    System.out.print("Enter position to delete: ");
                    cdll.deleteAtPosition(sc.nextInt());
                    break;
                case 13:
                    System.out.print("Enter value to search: ");
                    cdll.search(sc.nextInt());
                    break;
                case 14:
                    cdll.traverseForward();
                    break;
                case 15:
                    cdll.traverseBackward();
                    break;
                case 16:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

}

