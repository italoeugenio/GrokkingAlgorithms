package main.book.DataStructure.LinkedLists;

import java.util.LinkedList;

public class LinkedLists {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class MyLinkedList {
        Node head;

        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }

        public void remove(int value) {
            if (head == null) {
                System.out.println("The list is empty.");
                return;
            }

            if (head.data == value) {
                head = head.next;
                return;
            }

            Node current = head;
            while (current.next != null && current.next.data != value) {
                current = current.next;
            }

            if (current.next != null) {
                current.next = current.next.next;
            } else {
                System.out.println("Element not found in the list.");
            }
        }
    }

    public static void main(String[] args) {
        LinkedLists linkedLists = new LinkedLists();
        MyLinkedList customList = linkedLists.new MyLinkedList();

        // Using the custom linked list implementation
        customList.add(10);
        customList.add(20);
        customList.add(30);
        customList.add(40);

        System.out.print("Custom Linked List: ");
        customList.printList();

        customList.remove(20);
        System.out.print("Custom Linked List after removing element 20: ");
        customList.printList();

        // Using Java's built-in LinkedList
        LinkedList<String> collectionList = new LinkedList<>();
        collectionList.add("Ítalo");
        collectionList.add("Sarah");
        collectionList.add("Akio");

        collectionList.addFirst("First");
        collectionList.remove(2);

        System.out.println("Java's LinkedList: " + collectionList);
    }
}
