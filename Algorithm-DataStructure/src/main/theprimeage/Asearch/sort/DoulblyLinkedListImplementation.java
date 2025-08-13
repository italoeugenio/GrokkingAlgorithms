package main.theprimeage.Asearch.sort;

import java.util.Optional;

public class DoulblyLinkedListImplementation {
    // Métodos que deveria ter:
    //        get length (): number;✅
    //        insertAt (item: T, index: number): void (Doing);✅
    //        remove (item: T): T | undefined;
    //        removeAt (index: number): T | undefined;
    //        append (item: T): void;✅
    //        prepend (item: T): void;✅
    //        get (index: number): T | undefined✅;
    //    }
    static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private int length;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        length++;
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        length++;
    }

    public void insertAt(int data, int index) {
        if (index < 0 || index > length) throw new IndexOutOfBoundsException();

        if (index == 0) {
            prepend(data);
            return;
        }
        if (index == length) {
            append(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
            if(current.next == null){
                append(data);
            }
        }

        current.prev.next = newNode;
        newNode.prev = current.prev;
        newNode.next = current;
        current.prev = newNode;
        length++;
    }

    public int getLength() {
        return length;
    }


    public int get(int index) {
        if (index < 0 || index >= length) throw new IndexOutOfBoundsException();

        Node current = head;
        if (index == 0) return current.data;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.data;
    }

    public void remove(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            head.prev = null;
            length--;
            return;
        }
        Node current = head;
        while (current.next != null) {
            if(current.next.data == data){
                current.next = current.next.next;
                current.next.next.prev = current;
                return;
            }
        }
    }


    public void display() {
        Node current = head;
        if (current != null) {
            System.out.print("null <- ");
        }
        while (current != null) {
            if (current.next == null) {
                System.out.print(current.data);
                System.out.print(" -> null");
                System.out.println();
                return;
            }

            System.out.print(current.data + " <-> ");
            current = current.next;
        }

    }

    public static void main(String[] args) {
        DoulblyLinkedListImplementation linkedListImplementation = new DoulblyLinkedListImplementation();
        linkedListImplementation.append(1);
        linkedListImplementation.append(2);
        linkedListImplementation.append(3);
        linkedListImplementation.append(4);

        linkedListImplementation.remove(0);
        linkedListImplementation.display();

    }
}
